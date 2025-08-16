package com.gulkalkan.service.Impl;

import com.gulkalkan.Exception.BaseException;
import com.gulkalkan.Exception.ErrorMessage;
import com.gulkalkan.Exception.MessageType;
import com.gulkalkan.dto.DtoDepartment;
import com.gulkalkan.dto.DtoEmployee;
import com.gulkalkan.model.Department;
import com.gulkalkan.model.Employee;
import com.gulkalkan.repository.EmployeeRepository;
import com.gulkalkan.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee findEmployeeById(Long id) {

        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();
        Optional<Employee> optional=employeeRepository.findById(id);
        if (optional.isEmpty()){
        throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,id.toString()));
        }
        Employee employee=optional.get();

        Department department=employee.getDepartment();

        BeanUtils.copyProperties(employee,dtoEmployee);
        BeanUtils.copyProperties(department,dtoDepartment);

        dtoEmployee.setDepartment(dtoDepartment);

        return dtoEmployee;
    }
}
