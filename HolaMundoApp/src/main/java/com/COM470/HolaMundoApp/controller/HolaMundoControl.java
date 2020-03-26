
package com.COM470.HolaMundoApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HolaMundoControl 
{
    @RequestMapping(value="/")
    public String Hola()
    {
        return "Hola Mundo";
    }
}