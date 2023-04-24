package com.fz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Testcontroller {


    @ResponseBody
    @RequestMapping("test")
    public String test(){
        return "tetsaaaaaaaast";
    }



}
