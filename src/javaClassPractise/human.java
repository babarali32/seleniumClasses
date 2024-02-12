package javaClassPractise;

public class human {

    String name;
    String age;
    String height;
    String weight;

    void eat() {
        System.out.println(name + " is eating food");
    }
        void sleep(){
            System.out.println(name+" is sleeping since morning");
    }
    void walk(){
        System.out.println("walking very fast");
    }
    public static void main(String[] args) {
        human one=new human();
        one.sleep();
        one.name="lahore";

    }

}
