package com.macroyao.gmall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
* 整合mybatisplus
*    一 加入依赖
*      1.mybatisplus的stater
*      2.mysql驱动
*    二 配置数据源
*       1 数据库配置
*       2 mybatisplus配置(主键自增id)
* */
@SpringBootApplication
@EnableDiscoveryClient
public class GmallProductApplication {
    //https://esaydoc.xyz/#/s/78237135
    public static void main(String[] args) {
        SpringApplication.run(GmallProductApplication.class, args);
    }

}
