package com.boge.boot.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Dept {

    private Integer deptId;
    private String deptName;

}
