package stringMethods;

public class stringJavademo {
    public static void main(String[] args) {

        String str="Batch 11 is great.";
        System.out.println(str.indexOf('e'));
        str=str.toLowerCase();
        int sum=0;
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) == 'a') {
                sum++;  //sum=sum+1;
            }
        }
        System.out.println("the letter a has appeared in senetence number of times "+sum);
    }
}
