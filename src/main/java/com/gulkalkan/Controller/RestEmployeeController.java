package com.gulkalkan.Controller;

import com.gulkalkan.dto.DtoEmployee;
import com.gulkalkan.model.RootEntity;

public interface RestEmployeeController {

    public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
