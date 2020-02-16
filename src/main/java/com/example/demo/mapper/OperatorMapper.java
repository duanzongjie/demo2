package com.example.demo.mapper;


import com.example.demo.domian.Operator;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorMapper {

    Operator selectOpweator(Operator operator);

    int addOperator(Operator operator);

    Operator login(Operator operator);
}
