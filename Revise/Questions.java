public class Questions {
    public static void main(String[] args) {
        
        // Printing N to 1
        // print(5);


        //factorial :
        // System.out.println(fact(5));

        // sum of N numbers : 1+2+3+4+5 = 15
        // factorial of N numbers : 1*2*3*4*5 = 120


        //sum of digits : 123 -> 6
        //same : product of digits : 123 = 1*2*3 = 6
        


        // System.out.println(sum(123));


        // Reverse a Number 

        // int ans = reverse(123456);
        // System.out.println(ans);

        //palindrome : 
        // System.out.println(palindrome(123454321));

        // System.out.println(countZero(10202030));

        System.out.println(countStepsToMakeTheNumberZero(14));

    }
    // static int reverse(int n) {

    //     int digits = (int)Math.log10(n) + 1;

    //     return helper(n, digits);
        
    // }
    // static int helper(int n,int digits) {

    //     if(n % 10 == n) {
    //         return n;
    //     }
    //     return n % 10 * (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);  
    // }

    // static boolean palindrome(int n) {
        
    //     return reverse(n) == n;

    // }
    static void print(int n) {

        if(n == 1) {
            System.out.println(n);
            return;
        } 
        print(n - 1);
        System.out.println(n);
    }

    static int fact(int n) {

        if(n == 1) {
            return 1;
        }
        return n + fact(n-1);
    }
    static int sum(int n) {

        if(n == 0) {
            return 0;
        }
        int ld = n % 10;
        return ld + sum(n / 10);

        // return ld * sum(n / 10);
    }    

    // static int rev = 0;
    // static void reverse(int n) {

    //     if(n == 0) {
    //         return;
    //     }

    //     int ld = n % 10;
    //     rev = (rev * 10) + ld;

    //     reverse(n/10);
    // }

    static int countZero(int n) {

        int c = 0;
        return helper(n, c);
    }
    // static int helper(int n, int c) {


    //     if(n == 0) {
    //         return c;
    //     }
    //     int ld = n % 10;

    //     if(ld == 0) {
    //         return helper(n / 10 , c + 1);
    //     }else{
    //         return helper(n / 10, c);
    //     }
    // }

    static int countStepsToMakeTheNumberZero(int n) {

        int count = 0;
        return helper(n, count);

    }

    static int helper(int n,int count) {

        //base condition
        if(n == 0) {
            return count;
        }

        if(n % 2 == 0) {
            return helper(n / 2, count + 1);
        }else{
            return helper(n - 1, count + 1);
        }
    } 
}
