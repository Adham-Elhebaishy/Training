package com.example.contorller;

import com.example.entity.Employee;
import com.example.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/say")
public class TrainController {
    private final IService service;

    @Autowired
    public TrainController(IService service) {
        this.service = service;
    }



     @GetMapping("/welcome")
    public String welcome(){
         System.out.println("welcome");
         return "Welcome to the training application ...dev tools is done from docker compose";
     }
     @GetMapping("/checkEnvironment")
    public String checkEnvironment(){
        return service.getTheEnvironment();
     }


     @GetMapping("/employee")
    public ResponseEntity<Employee> employee(@RequestParam int id){
        service.saveEmployee();
        return ResponseEntity.ok(service.getEmployee(id));
     }

}
