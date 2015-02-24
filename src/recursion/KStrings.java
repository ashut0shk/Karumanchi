package recursion;

class KStrings {

    static int N;
    static int kStrings[];
    static int K;

    public static void main(String[] args) {
        N = 5;
        K = 3;
        kStrings = new int[N];
        kStrings(N, K);
    }

    static void kStrings(int n, int k) {
        if (n < 1) {
            printarr(kStrings);
        } else {
            for (int i = 0; i < k; i++) {
                kStrings[n - 1] = i;
                kStrings(n - 1, k);
            }
        }
    }
    
    static void printarr(int arr[]) {
        for (int i = 0; i < kStrings.length; i++) {
            System.out.print(kStrings[i]);
        }
        System.out.println("");
    }

}
