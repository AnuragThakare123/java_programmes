// linear search
// import java.util.*;
// public class aug3{
//     public static int linersearch(int numbers[], int key){
    
//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//         }
//       return -1;



//     }
//     public static void main(String args[]){

//         int  numbers[] = {2,4,6,8,10,12,14,16};
//         int key = 16;

//         int index = linersearch(numbers, key);

//         if(index == -1){
//             System.out.println("Element not found");
//         }
//         else{
//            System.out.println("key is at index:" + index);
//         }
//     }
// }


// import java.util.*;
// public class aug3{
//     public static int linersearch(String menu[], String key){
    
//         for(int i=0; i<menu.length; i++){
//             if(menu[i] == key){
//                 return i;
//             }
//         }
//       return -1;

//     }
//     public static void main(String args[]){

//         String menu[] = {"chai", "coffee", "milk", "tea"} ;
//         String key = "milk";

//         int index = linersearch(menu, key);

//         if(index == -1){
//             System.out.println("Element not found");
//         }
//         else{
//            System.out.println("key is at index:" + index);
//         }
//     }
// }
 
import java.util.*;
 public class aug3{
    public static int largestnum(int numbers[]){

        int largest = Integer.MIN_VALUE ;
        for( int i=0; i< numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
    
        return largest;
    }
        
       

    
    public static void main(String args[]){

        int numbers[] = {2,1,31,12,11};
        System.out.println("largest num is:" + largestnum(numbers));

       }
}



// import java.util.*;

// public class aug3 {
//     public static int largestNum(int numbers[]) {
//         int largest = Integer.MIN_VALUE;
//         for (int i = 0; i < numbers.length; i++) {
//             if (largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }

//     public static void main(String args[]) {
//         int numbers[] = {2, 1, 31, 12, 11};
//         System.out.println("largest num is: " + largestNum(numbers));
//     }
// }
