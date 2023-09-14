package com.boge.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "person")
@Component
@Data
@ToString
public class Person {

    private String userName;
    private String address;
    private Integer age;
    private Date birth;
    private Boolean boss;
    private List<String> hobbys;
    private Map<String, Object> map;
    private Dept dept;
    private Map<String, Dept> allDepts;

}
