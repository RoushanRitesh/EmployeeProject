package com.hdfc.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.hdfc.client.exception.EmployeeNotFoundException;
import com.hdfc.client.vo.EmployeeVo;
@RestController
@RequestMapping("/client")
public class ClientController {
	@Autowired
	private RestTemplate rest;
	String baseUrl="https://localhost:8086/emp/findEmp/";
	@GetMapping("/getdata/{employeeID}")
	
	public EmployeeVo getEmployeeById(@PathVariable int employeeID) throws Exception {
        EmployeeVo employeeVo = rest.getForObject(baseUrl  + employeeID, EmployeeVo.class);
        if (employeeVo == null) {
            throw new EmployeeNotFoundException("Employee not found with ID: " + employeeID);
        }
        employeeVo.setDateOfBirth(EmployeeVo.decrypt(employeeVo.getDateOfBirth()));
        return employeeVo;
    }
	

}
