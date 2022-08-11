package com.liuxy.design.liuxydesign.责任链;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public abstract class AuthLink {


    protected SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    protected String levelUserId;
    protected String levelUserName;
    protected AuthLink next;

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink getNext() {
        return next;
    }

    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);

}
