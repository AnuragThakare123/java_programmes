public class aug5 {

public static int binarysearch(int numbers [], int key){
    int start = 0, end = numbers.length-1;

    while(start <= end){
        int mid = (start + end)/2;

        //comparisons
        if(numbers[mid] == key){
            return mid;
        }

        if(numbers[mid] < key){
            start = mid + 1;

        }
        else{
            end = mid-1;
        }
    }
  return -1;
}


public static void main(String args[]){
    int numbers[] = { 2,3,4,5,9,10,11};
    int key = 10;

     System.out.println("Index for key is:" + binarysearch(numbers, key) );

    }

}
