package com.example.demo.controller;



import com.example.demo.domian.Operator;
import com.example.demo.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBoot")
public class OperatorController {

    @Autowired
    OperatorService operatorService;

    @RequestMapping("getOperator/{id}")
    public Operator getOperator(@PathVariable String id){
        return operatorService.selectOpweator(id);
    }

    @RequestMapping("addOperator/{id}/{name}/{age}")
    public String addOperator(@PathVariable String id,@PathVariable String name,@PathVariable String age){
        Operator operator=new Operator();
        //operatorService.addOperator(id,name,age);
        return "add success";
    }

}
