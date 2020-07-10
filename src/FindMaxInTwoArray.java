import java.util.Scanner;

public class FindMaxInTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter row a array : ");
        int row = sc.nextInt();
        System.out.println(" Enter cols a array : ");
        int cols = sc.nextInt();

        int[][] arr = new int[row][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(" Enter element : " + (i) + " , " + (j));
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.printf("%-20s%s", "Element in the array", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
        System.out.println();

        int max = arr[0][0];
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(" The largest element in the array is : " + max);
    }
}
