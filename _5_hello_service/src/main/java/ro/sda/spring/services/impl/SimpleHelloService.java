package ro.sda.spring.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sda.spring.services.HelloService;


@Service
public class SimpleHelloService implements HelloService {

    @Autowired
    private SimpleNameService nameService;



    @Override
    public void sayHello() {

        String name = nameService.getName();
        System.out.println("Hello " + name + "!");


    }
}
