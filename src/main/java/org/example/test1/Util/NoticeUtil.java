//package org.example.test1.Util;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.example.test1.Config.Config;
//import org.example.test1.Domain.BizContent;
//import org.example.test1.Domain.NoticeRequest;
//
//import java.util.*;
//
//public class NoticeUtil {
//
//                      //字符集
//    private static final Logger log = LogManager.getLogger(NoticeUtil.class);
//
//    public static boolean verifySign(Map<String, String> params, String sign) {
//        try {
//            // 1. 拼接待签名字符串
//            List<String> keys = new ArrayList<>(params.keySet());
//            Collections.sort(keys); // 字典序升序
//
//            StringBuilder sb = new StringBuilder();
//            boolean first = true;
//            for (String key :  keys) {
//                if ("sign".equals(key)) {
//                    continue;
//                }
//                if (!first) {
//                    sb.append("_");
//                }
//                first = false;
//                sb.append(params.get(key));
//            }
//            sb.append("_").append(Config.SALT_KEY);
//
//            String content = sb.toString();
//            log.info("待验签字符串: " + content);
//            System.out.println("待验签字符串: " + content);
//
//            // 2. 验签
//            return SignUtil.rsaVerify(content, sign, Config.PUBLIC_KEY,"SHA256withRSA", "UTF-8");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//    public static Map<String, String> flattenRequest(NoticeRequest request) {
//        Map<String, String> map = new TreeMap<>();
//
//        // 添加顶层字段（除了 sign）
//        putIfNotNull(map, "signType", request.getSignType());
//        putIfNotNull(map, "uniqueNo", request.getUniqueNo());
//        putIfNotNull(map, "nonceStr", request.getNonceStr());
//        putIfNotNull(map, "mchId", request.getMchId());
//        putIfNotNull(map, "version", request.getVersion());
//
//        // 展开 bizContent 字段
//        if (request.getBizContent() != null) {
//            BizContent content = request.getBizContent();
//            putIfNotNull(map, "fgTransNo", content.getRetailOrderNo());
//            putIfNotNull(map, "mchOrderNo", content.getMchOrderNo());
//            putIfNotNull(map, "code", content.getCode());
//            putIfNotNull(map, "message", content.getMessage());
//        }
//
//        return map;
//    }
//
//    private static void putIfNotNull(Map<String, String> map, String key, String value) {
//        if (value != null && !value.trim().isEmpty()) {
//            map.put(key, value);
//        }
//    }
//}