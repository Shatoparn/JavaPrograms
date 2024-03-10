import java.util.Scanner;

/*
 * Print box pattern
 *        * * * * * *  
 *      *             *
 *      *             *
 *      *             *
 *      * * * * * * * *
 *      *             *
 *      *             *
 *      *             *
 * n = 8
*/

public class Program4PrintACurveEdges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if((i == 0 && (j > 0 && j < n - 1)) || ((j == 0 || j == n - 1) && i > 0) || i == n / 2){
                // if((i == 0 && (j > n / 4 && j < n - 1 - n / 4)) || ((j == 0 || j == n - 1) && i > n / 4) || i == n / 2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
