package controller;
//import org.springframework.web.bind.annotation.restcontroller

import controller.EmployeProcess;
import org.springframework.stereotype.Service;

@Service
public class HRProcess implements EmployeProcess {
    @Override
    public void permanentEmp() {
        System.out.println("permanent process done");
    }
}
