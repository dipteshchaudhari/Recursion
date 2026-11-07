public class countSteps {
    public static void main(String[] args) {
        int n = 123;  
        System.out.println(countSteps(n));  
    }

    static int countSteps(int n) {
        int c = 0;
        return helper(n, c);
    }
    static int helper(int n, int c) {

        if(n == 0) {
            return c;
        }

        if(n % 2 == 0) {
            return helper(n / 2, c + 1);
        }else {
            return helper(n - 1, c + 1);
        }
    }
}
