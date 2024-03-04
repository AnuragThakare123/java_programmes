/* 
import java.util.Scanner;

public class jul4 {
    public static void main(String args []){
    int counter = 1;
    do{
       
        System.out.println("Hello world");
        counter ++ ;
     
    } while(counter <= 10 );

  }
}
*/

/* 

import java.util.Scanner;

public class jul4 {
    public static void main(String args []){
    int i ;

   for (i = 1; i<=5 ; i++){

       if(i==4){

        break;
       }
    System.out.println("hello Anu");
    }
  
   System.out.println("I am out of the loop");


  }
} */
/* 

import java.util.Scanner;

public class jul4 {
    public static void main(String args []){
    


  }
} */

/* 
import java.util.Scanner;

public class jul4 {
    public static void main(String args []){
    
      Scanner sc = new Scanner(System.in);
  
  

  do {
      System.out.println("Enter ur NUm:");
      int num = sc.nextInt();
    
      if (num % 10 == 0){
    
       System.out.println("sorry can't print");
       break;
    }
    
    System.out.println(num);


  
} while(true);

  }
} 
*/



/* 
import java.util.Scanner;

public class jul4 {
    public static void main(String args []){
    
    int i; 
    for(i= 0; i<=5; i++){

        if(i==3){
          continue;
        }
    
    System.out.println(i);

    }

  }
} */

/* 
import java.util.Scanner;

public class jul4 {
    public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    
    do{
       System.out.print("Enter ur num:");
       int num = sc.nextInt();


       if(num % 10 == 0){
          continue;
       }
     
    //   System.out.println("ur num was :" + num);
        System.out.println("ur num was :" , num);


    } while(true);
    
  }

} */

/* 
import java.util.Scanner;

public class jul4 {
    public static void main(String args []){
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n == 2){
        System.out.println("is prime");  
        }
        
       else{
        boolean isPrime = true;
        for(int i= 2; i <= Math.sqrt(n) ;i++){
         
            if(n % i == 0){

                isPrime = false;
            }
         }

        if(isPrime ==true){
          System.out.println("is prime");  
        }
        else{
         System.out.println("is not prime");  
        }
       
        }
    }
} */



import java.util.Scanner;

public class jul4 {
    public static void main(String args []){
    
   for(int i = 1; i<=4; i++){

      for(int j = 1; j<=i; j++){

        System.out.print("*");
      }
    
     System.out.println(" ");


   }

  }
} 

/* 
import java.util.Scanner;

public class jul4 {
    public static void main(String args []){
    
   for(int i = 1; i<=2; i++){

      
     System.out.print("*");


   }

  }
}
*/

