class Binary_Search{
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6};
    int target = 5;

    int start = 0;
    int end = arr.length-1;

    int ans = Search(arr, target, start, end);
    System.out.println(ans);

    }
    static int Search(int[] arr, int target, int start, int end){

        if(start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        
        if(arr[mid] == target) {
            return mid;
        
        }else if(arr[mid] > target) {    
            return Search(arr, target, start, mid - 1);
        
        }else{
            return Search(arr, target, mid + 1, end);
        }
        
    }
}