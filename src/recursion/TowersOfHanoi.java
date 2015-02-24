/*
 Print all moves for solving ToH with n disks.
 Solving ToH requries to make 2^n - 1 moves. 
 */

class TowersOfHanoi {

    public static void main(String[] args) {
        solveToH(3, 'S', 'D', 'A');
    }

    // Print all moves of moving disks from A to C using B.
    public static void solveToH(int n, char source, char destination, char aux) {
        if (n == 1) {
            System.out.println("Move disk from " + source + " to " + destination);
            return;
        }
        solveToH(n - 1, source, aux, destination);
        System.out.println("Move disk from " + source + " to " + destination);
        solveToH(n - 1, aux, destination, source);
    }

}
