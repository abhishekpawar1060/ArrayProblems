import java.util.Scanner;

public class ArrayindexFind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the array element:");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the search element from array:");
        int x=sc.nextInt();

        for (int i=0;i< arr.length;i++){
            if(x == arr[i]) {
                System.out.println("the index of array is:" + i);
            }
        }
    }
}
