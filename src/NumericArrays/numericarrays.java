
package NumericArrays;


public class numericarrays {

    public static void main(String[] args) {

        int[] arr = {9,7,8,15,3,2};
        System.out.println("Numeric arrays that need to arrange:");

        printArray(arr);

        arrangeSort(arr);

        System.out.println("\nNumeric arrays in ascending oder:");

        printArray(arr);
    }

    static void arrangeSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                  
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr) {

        int n = arr.length;

        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}