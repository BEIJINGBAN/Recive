package org.example.test1.controller;

import org.example.test1.Config.Config;
import org.example.test1.Domain.BizContent;
import org.example.test1.Domain.NoticeRequest;

import org.example.test1.Util.SignUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.TreeMap;


@RestController
public class NoticeController {

    private static final Logger log = LoggerFactory.getLogger(NoticeController.class);

    @PostMapping("/hello")
    public String hello(@RequestBody NoticeRequest request) {

        String sign = request.getSign();

        TreeMap<String, Object> params = new TreeMap<>();
        TreeMap<String, Object> bizParams = new TreeMap<>();
        log.info("收到对账结果通知: {}", request);
        bizParams.put("retailOrderNo", request.getBizContent().getRetailOrderNo());
        bizParams.put("mchOrderNo", request.getBizContent().getMchOrderNo());
        bizParams.put("code", request.getBizContent().getCode());
        bizParams.put("message", request.getBizContent().getMessage());

        params.put("signType", request.getSignType());
        params.put("uniqueNo", request.getUniqueNo());
        params.put("nonceStr", request.getNonceStr());
        params.put("sign", request.getSign());
        params.put("mchId", request.getMchId());
        params.put("version", request.getVersion());
        params.put("bizContent", bizParams);
        String content = SignUtil.genSignContentWithSalt(params, Config.SALT_KEY);

        boolean isValid = SignUtil.rsaVerify(content,sign,Config.PUBLIC_KEY,Config.SIGN_ALGORITHM,Config.CHARSET);
        log.info("待验签字符串为 : "+content);
        if (sign == null || sign.isEmpty()) {
            log.warn("缺少签名字段");
            return "无数字签名";
        }


        try {

            if (isValid) {
                log.info("验签成功，业务数据: {}", request.getBizContent());
                return "SUCCESS"; // 建议返回标准成功标识
            } else {
                log.warn("验签失败，请求数据: {}", request);
                return "验签失败";
            }
        } catch (Exception e) {
            log.error("处理通知失败", e);
            return "处理失败";
        }
    }
}