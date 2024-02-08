package com.example.registration.Service;



import com.example.registration.Dto.EmployeeDTO;
import com.example.registration.Dto.LoginDTO;
import com.example.registration.response.LoginResponse;

public interface EmployeeService {

    String addEmployee(EmployeeDTO employeeDTO);
    
    LoginResponse loginEmployee(LoginDTO loginDTO);
    
}