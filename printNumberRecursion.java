class printNumberRecursion{
    public static void main(String[] args) {
        // print 1 to 5 numbers Using Recursion;    
        
        print(1);
    }

    static void print(int n) {
        //base case
        if(n == 5) {
            System.out.println(5);
            return;
        }

        System.out.println(n);
        print(n + 1);
    }
}