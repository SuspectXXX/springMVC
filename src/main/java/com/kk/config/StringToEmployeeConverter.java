package com.kk.config;

import com.kk.bean.Employee;
import com.kk.dao.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class StringToEmployeeConverter implements Converter<String, Employee> {

    @Autowired
    DepartmentDao departmentDao;

    @Override
    public Employee convert(String s) {
        Employee employee = new Employee();
        if(s.contains("-")) {
            String[] strs = s.split("-");
            employee.setLastName(strs[0]);
            employee.setEmail(strs[1]);
            employee.setGender(Integer.valueOf(strs[2]));
            employee.setDepartment(departmentDao.getDepartment(Integer.valueOf(strs[3])));
        }
        return employee;
    }
}
