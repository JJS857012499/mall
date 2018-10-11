package com.zd.auth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * Created by 江俊升 on 2018/10/11.
 */
//@EnableAutoConfiguration
//@EnableAspectJAutoProxy(proxyTargetClass = true)
//@EnableTransactionManagement
//@EnableHystrixDashboard
@SpringCloudApplication
//@RefreshScope
//@Import(value = {
//
//
//})
public class AuthApplication {


    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

}
