package app.model;

import org.springframework.stereotype.Component;

@Component("TheBigDog")
public class Dog extends Animal{

    @Override
    public String toString(){
        return "I'm a Dog";
    }

}
