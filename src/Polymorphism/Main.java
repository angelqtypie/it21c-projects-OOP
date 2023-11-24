package Polymorphism;

public class Main {
        public static void main(String[] args){
            Angel my_Angel = new Angel ("Angel");
            Kepz my_Kepz = new Kepz ("Kepz");
            
            my_Angel.likes1();
            my_Angel.likes2();
            my_Kepz.likes3();
            my_Kepz.likes4();
            
            System.out.println("---------------------------------------");
            
        }
    }

