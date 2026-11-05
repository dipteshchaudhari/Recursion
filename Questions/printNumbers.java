package Questions;

public class printNumbers {
    public static void main(String[] args) {
        
        // print(5);
        // printNum(1);

        printRev(5);

    }

    static void printRev(int n) {

        if(n == 0) {
            return;
        }

        System.out.print(n + " ");
        printRev(n - 1);
        System.out.print(n + " ");
    }

    static void print(int n) {
        if (n == 0) { 
            return;
        }
        System.out.print(n +  " ");
        print(n - 1);
    }

    static void printNum(int n) {

        if(n == 5) {
            System.out.println("5");
            return;
        }
        System.out.print(n + " ");
        printNum(n + 1);
    }
}
