package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MixedVariableController {

    @RequestMapping("/add")
    public int addition(){
        int a=14;
        int b=15;
        int c=a+b;
        return c;
    }


    @RequestMapping("/minus")
    public String subtract(){
        int a=60;
        int b=30;
        int c=a-b;
        return "subtraction is: "+c;
    }

    @RequestMapping("/multiplication")
    public int multiply(){
        int a=25;
        int b=10;
        int c=a*b;
        return c;
    }

    @RequestMapping("/division")
    public String divide(){
        int a=14;
        int b=2;
        int c=a/b;
        return "division is: "+c;
    }

    @RequestMapping("/hello")
    public String msg(){
        return "Welcome to Spring boot.";
    }

    @RequestMapping("/number")
    public int num(){
        return 18;
    }

    @RequestMapping("/salary")
    public double yourSalary(){
        return 265348.520;
    }

    @RequestMapping("/your_age/{age}")
    public String checkAge(@PathVariable int age){
        if (age>=18){
            return "You are eligible for voting";
        }
        else{
            return "You are not eligible for voting";
        }
    }

    @RequestMapping("/Your_salary/{salary}")
    public String checkSalary(@PathVariable double salary){
        if (salary>100000.00){
            return "Your package is high";
        }
        else{
            return "Your package is low";
        }
    }

    @RequestMapping("/check_price/{price}")
   public String price(@PathVariable double price){
        if (price>1000){
          return "product is costly";
        }
        else{
            return "product is cheap";
        }
   }

   @RequestMapping("/plusify/{a}/{b}")
   public String addition5(@PathVariable int a,@PathVariable int b){
        int c=a+b;
        return "addition is: "+c;
   }

   @RequestMapping("/minusify/{a}/{b}")
   public float subtract(@PathVariable float a,@PathVariable float b){
        float c=a-b;
        return c;
   }

   @RequestMapping("/multify/{a}/{b}")
   public double multiply5(@PathVariable double a,@PathVariable double b){
        double c=a*b;
        return c;
   }

   @RequestMapping("/dividation/{a}/{b}")
   public String divide5(@PathVariable int a,@PathVariable int b){
        int c=a/b;
        return "division is: "+c;
   }

}


