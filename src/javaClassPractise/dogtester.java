package javaClassPractise;

public class dogtester {

    public static void main(String[] args) {
        // creating one object from class
        dog dog1=new dog();

        dog1.color="black";
        dog1.name="nikki";
        System.out.println("color of dog is "+dog1.color+" age   we not give "+ dog1.age);
        // creating 2nd object from class
        dog dog2=new dog();
        dog2.name="red";
        System.out.println("2nd dog is "+dog2.name);



    }
}
