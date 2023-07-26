import java.util.Scanner;

public class twoDArrayindexFind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row number:");
        int row=sc.nextInt();
        System.out.print("Enter the column number:");
        int col=sc.nextInt();
        int[][]arr=new int[row][col];
        System.out.println("Enter the 2d array element:");
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the element to find index:");
        int x=sc.nextInt();
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == x)
                    System.out.print("The indx of 2d array is: ("+i+","+j+")");

            }
        }
    }
}
