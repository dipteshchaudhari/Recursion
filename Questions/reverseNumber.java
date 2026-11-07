package Questions;

public class reverseNumber {
    public static void main(String[] args) {
        // rev1(123);
        
        int n = 1234;

        //for rev3 : 

        // int digits = (int)Math.log10(n) + 1;
        // System.out.println(rev3(n, digits));

        // for rev2 : 
        // System.out.println(sum);

        // for rev4
        System.out.println(rev4(12345));

    }

    // this is just printing method.
    static void rev1(int n) {

        if(n == 0) {
            return;
        }
        System.out.print(n % 10);
        rev1(n/10);
    }

    // storing it in variable.

    static int sum = 0;
    static void rev2(int n) {

        if(n == 0) {
            return;
        }
        int rem = n % 10;
        sum = (sum * 10) + rem;
        rev2(n/10);
    }

    // here, we didn't use the helper function. 
    static int rev3(int n, int digits) {

        if(n % 10 == n) {
            return n;
        }

        int rem = n % 10;
        return (rem * (int)Math.pow(10, digits - 1)) + rev3(n/10, digits - 1);
    }

    // With Helper function : we can count digits into function and pass digits 
    // to helper function

    static int rev4(int n) {

        int digits = (int)Math.log10(n) + 1;

        return helper(n, digits);
    }

    static int helper(int n, int digits) {

        if(n % 10 == n) {
            return n;
        }

        int rem = n % 10;
        return rem * (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }
}

