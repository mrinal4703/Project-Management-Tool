/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pmt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
    @RequestMapping("/welcomepage")
    public String welcomefunction(){
        System.out.println("This is welcome page");
        return "welcomepage";
    }
    @RequestMapping("/helloworld")
    public String hellowrold()
    {
        System.out.println("this is hello world");
        return "hell";
    }
}
