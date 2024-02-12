package javaClassPractise;

public class middlenumber {
    public static void main(String[] args) {
        //Create a String and if the String is not empty perform the following:
        //if the String has an odd number of characters and has 3 or more characters,
        // print the character in the middle of the String.
        String value="lahore";
        if (value.length()%2!=0 && value.length()>3 ){
            int middle=value.length()/2;
            System.out.println(value.charAt(middle));
        }
       else {
            System.out.println("the word has even number of character");
        }


    }
}
