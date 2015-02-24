/*
 Generate all binary strings of length n
 */
package recursion;

class BinaryStrings {

    static int N = 5;
    static int bitstring[];

    public static void main(String[] args) {
        N = 4;
        bitstring = new int[N];
        binarystring(N);
    }

    static void binarystring(int n) {
        if (n < 1) {
            printarr(bitstring);
        } else {
            bitstring[n - 1] = 0;
            binarystring(n - 1);
            bitstring[n - 1] = 1;
            binarystring(n - 1);
        }
    }

    static void printarr(int arr[]) {
        for (int i = 0; i < bitstring.length; i++) {
            System.out.print(bitstring[i]);
        }
        System.out.println("");
    }
}
