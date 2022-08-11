package com.liuxy.design.liuxydesign.责任链;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName AuthService
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/11 11:02
 **/
public class AuthService {

    private static Map<String, Date> authMap = new ConcurrentHashMap<String, Date>();

    public static Date queryAuthInfo(String uId, String orderId) {
        return authMap.get(uId.concat(orderId));
    }

    public static void auth(String uId, String orderId) {
        authMap.put(uId.concat(orderId), new Date());
    }

}
