package com.pancm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller1 {
   @Autowired
   DiscoveryClient discoveryClient;
   @RequestMapping("/value")
    public  String Hello(){
     List<String> list= discoveryClient.getServices();
     for(String s:list){
         System.out.println(s);
     }
     return null;
   }
}
