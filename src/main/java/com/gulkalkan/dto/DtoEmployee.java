package com.gulkalkan.dto;

import lombok.Data;
import org.apache.naming.StringManager;

@Data
public class DtoEmployee {

    private Long id;

    private String name;

    private DtoDepartment department;

}
