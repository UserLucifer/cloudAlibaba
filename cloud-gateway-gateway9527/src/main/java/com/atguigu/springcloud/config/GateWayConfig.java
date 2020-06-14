package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {


    /*
    *
    * 编码方式进行getWay网关
    * 配置一个ID为rote-name的路由规则
    * 当访问地址http://localhost:9527/guonei会自动转发到地址：http://news.baidu.com/guonei
    * */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {

        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_rote_atguigu",
                r -> r.path("/guonei").
                        uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }
}
