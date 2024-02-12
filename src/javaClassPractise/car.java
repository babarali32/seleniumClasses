package javaClassPractise;

public class car {

    String carmake;
    String carmodel;
    String caryear;
    String mileage;
    void moveForward(){
        System.out.println("speed is very fast");
        applybreak();
    }
    void applybreak(){
        System.out.println("break apllied");
    }
    public static void main(String[] args) {
        car car1=new car();
        car1.carmake="toyota";
        car1.carmodel="SVT";
        car1.caryear="2020";
        car1.moveForward();

    }

    }

