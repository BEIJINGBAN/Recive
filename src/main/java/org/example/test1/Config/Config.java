package org.example.test1.Config;

public class Config {
    // 对方提供的公钥（PKCS#8 或 X.509 格式 Base64）
    public static final String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCss+XwwMm8yQOQ0eHTJ3o3NvGt1Vns+vL8aVhA7dAPePun9cY2hiAo2QvWzv/HGpBS9vEi0Z6iKNh9Ot1BBDJIVyERRHomBanl1nLZrZhWde14a+T6p6UClSsXwj6DKmxpQ+X/u4CVbkJPv3ORDnBiSO6u80uXKdgOmCyYqyuAkQIDAQAB"; // 你的公钥
//    public static final String PUBLIC_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKyz5fDAybzJA5DR4dMnejc28a3VWez68vxpWEDt0A94+6f1xjaGICjZC9bO/8cakFL28SLRnqIo2H063UEEMkhXIRFEeiYFqeXWctmtmFZ17Xhr5PqnpQKVKxfCPoMqbGlD5f+7gJVuQk+/c5EOcGJI7q7zS5cp2A6YLJirK4CRAgMBAAECgYAZMJguWIBUV+F8QxC0MsLhwNLZbxARv7ynUlo8BjPdveC+69tAYqnYK2hNqZ2nFdnNMBWV5YtEzb5d7bMN46XNqAjhoWvd6MKtWVC5knlmkhZ6lgaQPC5DcB6KGF+X3EFlErn7colkW4VhuRsjBn3ebrRbd8DHBPMh8g/cFCiOfQJBANNqj5HGAwQ6fK9lNRKqC/0SazN1IUjWW7LLx6JmFmy681xIkYh8vaTRDnD5atjwScQ9d+0eqq/RTpCar3qriwcCQQDRH10G1hzvsMDqC0oNm6S2DI0/QxdLgvO8USq2r0GMFn8kFceiUkK51gaQCngCHEIRMPS2F/XUn2DKfNSYJvmnAkEAnzYejH78ApExGL007KtWf+0BAi1xNXMId2tzGd+bf6KCZrrXrluSTa6KG5YZWuoKA1jvGYkArYsIiWmUQOMyvQJBAK1hk39XhiY0Jb3mHj+qC6XkQjdxKJ8ys2Iu6XsNUwsSm9cPN7Uc/rWU/VvvUhBt3VjjfgB7XRYsDdPUK2764YECQCkQ5KEd/YvnJ+q/1tHRYyArjRyhvUdFpMupV1rRz1Kkggbj2Q87njesA+zm6B9h+ScTk1xiAZj+jQHn/PhRKcU=";
    public static final String SALT_KEY = "c9b576e12251f3a7f30c548672fcbd9a";          //盐值
    public static final String SIGN_ALGORITHM = "SHA256withRSA";             //签名算法
    public static final String CHARSET = "utf-8";
}
