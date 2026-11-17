import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,4,5};
        int target = 4;

        System.out.println(Search(arr, target, 0));

        System.out.println(SearchIndex(arr, target, 0));

        System.out.println(SearchIndexLast(arr, target, arr.length - 1));


        SearchForIndexes(arr, target, 0);
        System.out.println(list);
    }

    static boolean Search(int[] arr, int target, int index) {

        if(index == arr.length) {
            return false;
        }

        return arr[index] == target || Search(arr, target, index + 1);
    }

     static int SearchIndex(int[] arr, int target, int index) {

        if(index == arr.length) {
            return -1;
        }

        if(arr[index] == target) {
            return index;
        } else {
            return SearchIndex(arr, target, index + 1);
        }
    }

    static int SearchIndexLast(int[] arr, int target, int index) {

        if(index == -1) {
            return -1;
        }

        if(arr[index] == target) {
            return index;
        } else {
            return SearchIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void SearchForIndexes(int arr[], int target, int index) {

        if(index == arr.length) {
            return;
        }

        if(arr[index] == target) {
            list.add(index);
        }

        SearchForIndexes(arr, target, index + 1);
    }
}
