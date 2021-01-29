package com.atom.controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
//import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorld {

//    @NacosValue(value = "${useLocalCache:AMD YES!}", autoRefreshed = true)
//    private String useLocalCache;

    @NacosInjected
    private NamingService namingService;

    @GetMapping(value = "/hello")
    public String hello(String name){
        return "自动部署的网站，二次进化金佛喷气机我就可怜见;";
    }

//    @GetMapping(value = "/get")
//    public String get(){
//        return  useLocalCache;
//    }

    @GetMapping(value = "/value")
    @ResponseBody
    public List<Instance> value(@RequestParam String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }
}
