package com.minstone;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description:
 * @Author: HuangPeiDong
 * @Date: 2020/8/30 10:46
 **/
@SpringBootApplication
@MapperScan("com.minstone.dao")
public class DataInteractionCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataInteractionCenterApplication.class, args);
    }

}
