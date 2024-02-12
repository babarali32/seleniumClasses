package javaClassPractise;
import org.testng.annotations.Test;
import static javaClassPractise.methods.num1;
@Test
public class testermethod {
    public static void method3(){

        int [] number=new int[9];
        number[2]=3;
        number[3]=7;
        number[2]=4;
        number[9]=35;

        System.out.println(number[9]);
        for (int vari:number
             ) {
            System.out.println(vari);
        }
    }
}
