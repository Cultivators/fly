package com.mpp.fly;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/say")
    public Object sayHello(){
        log.info("Hello World");
        return new Person("wuxinjie");
    }

    class Person{

        public Person(String name){
            this.name = name;
        }

        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

}
