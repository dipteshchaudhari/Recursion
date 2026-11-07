class countZeros {
    public static void main(String[] args) {
        
        System.out.println(count(1002030));
    }
    static int count(int n) {

        int c = 0;
        return helper(n, c);
    }
    static int helper(int n, int c) {

        if(n == 0) {
            return c;
        }

        int rem = n % 10;
        
        if(rem == 0) {
            return helper(n / 10, c + 1);
        }else{
            return  helper(n / 10, c);
        }

    }
}