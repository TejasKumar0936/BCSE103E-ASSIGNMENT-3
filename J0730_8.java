import java.util.Scanner;
class J0730_8{
    public static void main(String[] args){
        int n;
        System.out.println("Enter the length of your array: ");
        Scanner myObj1 = new Scanner(System.in);
        n = myObj1.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.printf("Enter the element no. " + (i+1) + " : ");
            int temp;
            Scanner tempObj = new Scanner(System.in);
            temp = tempObj.nextInt();
            arr[i] = temp;
        }
        for (int i = 0; i < n - 1; i++) {
            int temp;
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false){
                break;
            }
        }
        System.out.printf("The 3rd element in the array is : " + arr[2]);
    }
}