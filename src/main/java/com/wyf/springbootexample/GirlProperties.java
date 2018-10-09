package com.wyf.springbootexample;

/*
把配置写入到此类中
 */

import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
注入多个属性的配置文件

@Component
@ConfigurationProperties
 */

@Component
@ConfigurationProperties(prefix = "girl")       //获取前缀girl配置
public class GirlProperties {

    private String cupSize;

    private Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
