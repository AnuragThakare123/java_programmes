public class dec20 {

    
public static void Max_subarray(int numbers[]){

   // int curr_sum = 0;
    int max_sum = Integer.MIN_VALUE;
    
    for(int i = 0; i<numbers.length; i++){
      
        int start = i;

        for(int j=i; j<numbers.length; j++){

            int end = j;
           int  curr_sum = 0;

            for(int k= start; k<=end; k++){

             curr_sum = curr_sum + numbers[k];

            }
       
        System.out.println(curr_sum);
        
           
        if(max_sum < curr_sum){
           
            max_sum = curr_sum;
         }
       
        }

    }

    // System.out.println("max_sum :"+ max_sum);


}


public static void main(String args[]){

        int numbers[] = {2,4,6,8,10};
        Max_subarray(numbers);
    }
}






