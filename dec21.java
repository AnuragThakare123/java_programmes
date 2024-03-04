
public class dec21 {



public static int trappedwater(int height[]){


    int n = height.length;

  //left array
  int left_array[] = new int [n];
  left_array[0] = height[0];
  for(int i=1; i<n; i++){
    left_array[i] = Math.max(height[i], left_array[i-1]);

  }
  
int right_array[] = new int[n];
right_array[n-1] = height[n-1];
for(int i=n-2 ; i>=0; i--){
  right_array[i] = Math.max(height[i] , right_array[i+1]);
}

  int trappedwater = 0;

for(int i=0 ; i<n; i++){
  
  int waterlevel = Math.min(left_array[i],right_array[i]);
  trappedwater += waterlevel - height[i];
}
 
 return trappedwater;
}





public static void main(String args[]){

        int height[] = {4,2,0};
        System.out.println(trappedwater(height));
    }
}






