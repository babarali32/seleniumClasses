package javaClassPractise;

public class phone {

    String color;
    String company;
    String model;
    public void call(String country){
        System.out.println(company+" used to make and receive calls");
    }

}
  class phoneTester {
      public static void main(String[] args) {
          phone iphone=new phone();
          iphone.color="white";
          iphone.company="Apple";

          phone samsung=new phone();
          samsung.company="samsung";
          samsung.color="black";
          samsung.call("pak");
      }

}