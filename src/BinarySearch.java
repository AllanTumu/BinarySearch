public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,8,9};
        int n = arr.length;
        int x = 4; //Value we are searching for in our Array
        int result = binarySearch(arr,x,0,n-1);

        if (result==-1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index " + result);
        }
    }

    public static int binarySearch(int[] arr, int x, int low, int high) {

        while (low<=high) {
            int mid = low + (high -low)/2;

            if (arr[mid]==x) {
                return mid;
            }

            if (arr[mid]<x) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }

        return -1; //Means element was not found
    }
}
