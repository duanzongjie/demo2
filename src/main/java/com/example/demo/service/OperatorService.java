package com.example.demo.service;



import com.example.demo.domian.Operator;
import com.example.demo.mapper.OperatorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperatorService {

    @Autowired
    OperatorMapper operatorMapper;

    public Operator selectOpweator(String id){
        Operator operator=new Operator();
        operator.setOpId(id);
        return operatorMapper.selectOpweator(operator);
    }

    public int addOperator(Operator operator){
       return operatorMapper.addOperator(operator);
    }

    public Operator login(String name,String age){
        Operator operator=new Operator();
        operator.setName(name);
        operator.setAge(age);
        return operatorMapper.login(operator);
    }

}
