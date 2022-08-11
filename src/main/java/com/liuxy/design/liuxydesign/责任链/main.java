package com.liuxy.design.liuxydesign.责任链;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName main
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/11 11:04
 **/
@Slf4j
public class main {
    public static void main(String[] args) throws ParseException {
        AuthLink authLink = new Level3AuthLink("1000013", "王工")
                .appendNext(new Level2AuthLink("1000012", "张经理")
                        .appendNext(new Level1AuthLink("1000011", "段总")));

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = f.parse("2020-06-18 23:49:46");

        log.info("测试结果：{}", authLink.doAuth("小傅哥", "1000998004813441", currentDate));

        // 模拟三级负责人审批
        AuthService.auth("1000013", "1000998004813441");
        log.info("测试结果：{}", "模拟三级负责人审批，王工");
        log.info("测试结果：{}", authLink.doAuth("小傅哥", "1000998004813441", currentDate));

        // 模拟二级负责人审批
        AuthService.auth("1000012", "1000998004813441");
        log.info("测试结果：{}", "模拟二级负责人审批，张经理");
        log.info("测试结果：{}", authLink.doAuth("小傅哥", "1000998004813441", currentDate));

        // 模拟一级负责人审批
        AuthService.auth("1000011", "1000998004813441");
        log.info("测试结果：{}", "模拟一级负责人审批，段总");
        log.info("测试结果：{}", authLink.doAuth("小傅哥", "1000998004813441", currentDate));

    }
}
