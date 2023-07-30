public class ReverseArrayElement {
    public static void main(String[] args) {
        int[] arr = {21,20,24,7,42,32,45,78};
        int temp;
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for (int reverseArray:arr){
            System.out.print(reverseArray+ " ");
        }
    }
}
