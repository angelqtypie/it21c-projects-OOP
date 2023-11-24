package Polymorphism;

public class Angel extends Likes {

    Angel (String name){
        super(name);
    }
    void likes1(){
        System.out.println(name + " Likes Spaghetti");
    }
    void likes2(){
        System.out.println(name + " likes to watch BL series/movies");
    }
}

