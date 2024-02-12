package javaClassPractise;

public class arryas {
    public static void main(String[] args) {

        int [] numbers=new int[4];
        numbers[0]=2;
        numbers[1]=4;
        numbers[2]=5;
        numbers[3]=6;
        for (int i = 0; i <numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("--------------");
        for (int num2:numbers) {
            System.out.println(num2);
        }
        //numbers[3]=9;
        System.out.println(numbers.length);

        double [] val={1,3,5,7,9};
        val[2]=34;
        //System.out.println(val[3]);
        String [] one={"one","tow","three","four"};
       // System.out.println(one[3]);
        long [] num;
        num=new long[3];

        char [] once={'a'};

    }
}
