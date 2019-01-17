package cn.lin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.lin.test.mapper")
public class Starter {

    public static void main(String[] args) {

        SpringApplication.run(Starter.class, args);
    }



}

