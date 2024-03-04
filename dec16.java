public class dec16 {


    public static void Reverse(int numbers[]){

        int first = 0, last = numbers.length-1;
        
        while(first<last){

            int temp = numbers[last];
            numbers[last]= numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }

    }
    
    public static void main (String args[]){

      int numbers[]={1,2,34,5,7};

      Reverse(numbers);
      for(int i=0; i<numbers.length; i++){
        System.out.print(numbers[i]+ " ");
      }
      
      System.out.println();


    }
}