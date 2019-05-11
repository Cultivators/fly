package com.mpp.fly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/say")
    public Object sayHello(){
        System.out.println("Hello World");
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
