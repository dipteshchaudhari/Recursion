package Questions;

public class concept {
    public static void main(String[] args) {
        
        fun(5);
    }
    static void fun(int n) {

        if(n == 0) {
            return;
        }
        System.out.println(n);
        
        // fun(n--); --> this will not work becuase of infinite loop, it will pass value first which is n every time before substracting it.

        fun(--n);

    }
}
