package Questions;

public class reverseNumber {
    public static void main(String[] args) {
        rev(123);
    }

    // this is just printing method.
    static void rev(int n) {

        if(n == 0) {
            return;
        }
        System.out.print(n % 10);
        rev(n/10);
    }

    // storing it in variable.
    static void revv(int n) {

        
    }
}

