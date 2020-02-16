package com.example.demo.controller;

import com.example.demo.domian.Operator;
import com.example.demo.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/operator")
public class LoginController {

    @Autowired
    OperatorService operatorService;

    @RequestMapping("/toIndex")
    public String show(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/login")
    public String login(Operator operator,HttpServletRequest request){
        String name=request.getParameter("name");
        String age=request.getParameter("age");
        Operator loginOperator=operatorService.login(name,age);
        if(loginOperator==null){
            return "用户名和密码错误";
        }else {
            request.getSession().setAttribute("session_operator",operator);
            return "登录成功";
        }
    }

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    @RequestMapping("/register")
    public String  register(Operator operator){
        int id=operatorService.addOperator(operator);
        if(0==id){
            System.out.println("-------");
        }
        return "welcome";
    }

    @RequestMapping("/welconme")
    public String welconme(){
        return "welcome";
    }

    @RequestMapping("/outOperator")
    public void outUser(HttpServletRequest request, HttpServletResponse response)throws IOException{
        request.getSession().removeAttribute("session_operator");
        response.sendRedirect("/operator/toIndex");
    }

}
