public class squareArray {

    public static void  main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        SquareArray(arr,5);
    }
    public static void SquareArray(int arr[], int n)
    {
        if (n == 1) {
            System.out.print("0");
            return;
        }

        int i,temp=1;
        int prod[] = new int[n];
        for (int j = 0; j < n; j++){
            prod[j] = arr[j];
        }
        int[] sum=new int[n];
        for (i = 0; i < n; i++) {
            prod[i] = temp;
            sum[i]=temp*arr[i];
        }
        for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            sum[i]=temp * arr[i];
        }
        for (i = 0; i < n; i++)
            System.out.println(sum[i]);
        return;
    }
}