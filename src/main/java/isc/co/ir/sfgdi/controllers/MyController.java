package isc.co.ir.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller("salehiController")
public class MyController {
    public String sayHello()
    {
        System.out.println("Hello World!!!");
        return "Hi Forks";
    }
}
