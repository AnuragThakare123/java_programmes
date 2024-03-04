public class dec23 {


    public static int max_sum(int numbers[]){

        int maxsum=0;
        int cursum=0;
        for (int i=0;i<numbers.length;i++){
            cursum = numbers[i]+cursum;
            if (cursum>maxsum) {
                maxsum = cursum;
            }

//            for negative value
            if (cursum < 0) {
                for (int j=0;j<numbers.length;j++){
                    maxsum = numbers[j];
                    if (cursum>maxsum){
                        maxsum=cursum;
                    }
                }
            }
        }
        return maxsum;
    }


    public static void main(String args[]){
        int numbers[] = {1,-2,-2};
       System.out.println(max_sum(numbers)); 
    }

    
}

