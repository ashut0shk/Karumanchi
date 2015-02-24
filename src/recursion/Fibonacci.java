/*
 Find nth number in the Fibonacci Series   
 */
package recursion;

class Fibonacci {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibonacci(0, 1, n - 2));
    }

    // Find nth fibonacci number (n > 1)
    static int fibonacci(int a, int b, int n) {
        if (n == 0) {
            return b;
        } else {
            return fibonacci(b, a + b, n - 1);
        }
    }

}
