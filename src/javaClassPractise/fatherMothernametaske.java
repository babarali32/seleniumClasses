package javaClassPractise;

public class fatherMothernametaske {
    public static void main(String[] args) {
        //.    Write a program that reads two people's first
        //names and if they expecting boy or girl?
        //Based on the input suggests a name for a baby:
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? boy
        //Suggested baby name: DANRY
        //
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? girl
        //Suggested baby name: MAIEL
        String str="hy i am in lahore.i will be come back . i am driving";
        char [] val=str.toCharArray();
        for (char a:val
             ) {
            System.out.print(a);
        }
        System.out.println();
        System.out.println("-----------------------");
        String [] once=str.split("");
        System.out.println(once.length);
        System.out.println("-----------------------");
        System.out.println(once[9]);
    }
}
