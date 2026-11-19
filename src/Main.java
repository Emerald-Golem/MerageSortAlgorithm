import java.util.ArrayList;

public class Main {
    public static void mergeSort(ArrayList<String> arr, int min, int max){
        if(max==min+1){
            return;
        }
        int mid = (max+min)/2;
        mergeSort(arr, min, mid);
        mergeSort(arr, mid, max);
        merge(arr, min, mid, max);
    }

    public static void merge(String[] arr, int min, int mid, int max){
        int leftIndex =0;
        int rightIndex =0;
        int curr=min;
        String temp;
        String[] left = new String[max-min];
        String[] right = new String[max-min];
        for(int i = min; i<mid;i++){
            left[i]=arr[i];
        }
        for(int i = mid; i<max;i++){
            right[i]=arr[i];;
        }
        while(leftIndex<mid&&rightIndex<max){
            if(arr.[leftIndex].compareTo(arr.get(rightIndex))<0){
                arr.set(curr, left.get(leftIndex));
                leftIndex++;
                curr++;
            }else{
                arr.set(curr, right.get(rightIndex));
                rightIndex++;
                curr++;
            }
        }
        while(leftIndex<mid){
            arr.set(curr, left.get(leftIndex));
            leftIndex++;
            curr++;
        }
        while(rightIndex<max){
            arr.set(curr, right.get(rightIndex));
            rightIndex++;
            curr++;
        }
    }
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("yg");
        arr.add("eyg");
        arr.add("zyg");
        arr.add("yg");
        arr.add("aryg");
        arr.add("rayg");
        arr.add("ayg");
        mergeSort(arr,0, arr.size());
        for(String s:arr){
            System.out.println(s);
        }
    }
}