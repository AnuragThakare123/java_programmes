// public class dec15 {

    
//     public static int getLargest(int numbers[]) {
//         int largest = Integer.MIN_VALUE;

//         for(int i=0;i<numbers.length;i++){
//             if(largest< numbers[i]){
//                 largest = numbers[i];

//             }
//         }
        
//         return largest;
        
//     }
        
    
//     public static void main(String args[]){
//         int numbers[]= {1,2,3,13,5,6};
//         System.out.println("largest value is:"+getLargest(numbers));
//     }
    
// }


public class dec15 {

   
   
   public static int binarysearch(int numbers[],int key){
     int start = 0, end = numbers.length-1;

    while(start <= end){
     
        int mid= (start+end)/2;

        if(numbers[mid]==key){
            return mid;
        }

        if(numbers[mid] < key){
            start= mid+1;
        } else{
            end = mid-1;
        }
    }

  return -1;

   }  
   
   
    public static void main(String args[]){
     int numbers[]={1,3,4,5,6,7,8,9,10};
     int key=7;
     System.out.println("index for key is :" + binarysearch( numbers,key));
    }
}