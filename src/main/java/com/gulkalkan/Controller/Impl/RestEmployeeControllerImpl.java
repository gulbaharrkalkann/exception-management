package com.gulkalkan.Controller.Impl;


import com.gulkalkan.Controller.RestEmployeeController;
import com.gulkalkan.dto.DtoEmployee;
import com.gulkalkan.model.RootEntity;
import com.gulkalkan.service.IEmployeeService;
import com.gulkalkan.service.Impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl  extends RestBaseController  implements RestEmployeeController {

    @Autowired
    private IEmployeeService employeeService;


    @GetMapping("/list/{id}")
    @Override
    public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value = "id") Long id) {
        return ok(employeeService.findEmployeeById(id));
    }
}
