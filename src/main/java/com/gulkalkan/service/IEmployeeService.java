package com.gulkalkan.service;

import com.gulkalkan.dto.DtoEmployee;
import com.gulkalkan.model.Employee;

public interface IEmployeeService {

    public DtoEmployee findEmployeeById(Long id);
}
