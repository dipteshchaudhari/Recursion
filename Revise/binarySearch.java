public class binarySearch {
    public static void main(String[] args) {
    
        int arr[] = {1,2,3,4,5};
        int target = 1;

        int start = 0;
        int end = arr.length - 1;

        int ans = Search(arr, target, start, end);
        System.out.println(ans);
    } 
    static int Search(int arr[], int target, int start, int end) {

        if(end < start) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        if(arr[mid] > target) {
            return Search(arr, target, start, mid - 1);
        }else{
            return Search(arr, target, mid + 1, end);
        }

    }

}
