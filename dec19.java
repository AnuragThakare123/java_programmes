public class dec19 {
    
 public static void subarray(int numbers[]){

   int min_value =Integer.MAX_VALUE;
   int max_value = Integer.MIN_VALUE;
  
  
  for( int i=0; i<numbers.length; i++){
        int start = i;
       
        for(int j=i; j<numbers.length; j++){
            int end = j;
       
            int curr_sum = 0;
       
          for(int k=start; k<= end; k++){

           // System.out.print(numbers[k]+"  ");
            curr_sum = curr_sum + numbers[k];
          }

          
          System.out.print("curr_sum is:"+ curr_sum);


          min_value = Math.min(min_value,curr_sum);
          max_value = Math.max(max_value,curr_sum);

           System.out.println();
        }
        

        System.out.println();
      
    }
  

    System.out.println("min_value is:"+ min_value);
    System.out.println("max_value is:"+ max_value);

    
  }
 

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};

        subarray( numbers);
    }

}