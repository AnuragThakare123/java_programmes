/* 
public class jul5 {
    public static void main(String args []){
    int n = 4;
      
      
        for( int i = 1; i<= n; i++ ){

            for (int j = 1; j<= n-i+1; j++ ){
                System.out.print("*");
            }
                    
            System.out.println();

        }
    }
   
}*/
/* 
public class jul5 {
    public static void main(String args []){
    int n = 4;
      
      
        for( int i = 1; i<= n; i++ ){

            for (int j = 1; j<= i; j++ ){
                System.out.print(j);
            }
                    
            System.out.println();

        }
    }
   
} */

/* 
public class jul5 {
    public static void main(String args []){
    int n = 4;
    char ch = 'A';
      
      
        for( int i = 1; i<= n; i++ ){

            for (int j = 1; j<= i; j++ ){
                System.out.print(ch);

                ch++;
            }
                    
            System.out.println();

        }
    }
   
} */

/* 
import java.util.Scanner;
public class jul5 {
    
     public static void printHelloworld(){

        System.out.println("Hello world ");
        System.out.println("Hello world ");
        System.out.println("Hello world ");
    }
    
    public static void calculatesum(){

       Scanner sc = new Scanner (System.in);
       
       System.out.println("Enter a:" );
       int a = sc.nextInt();
      
       System.out.println("Enter b:" );
       int b = sc.nextInt();

       int sum = a + b;
       System.out.println("your sum is:" + sum);

    }
    
    public static void main(String args []){
   // printHelloworld();
     calculatesum();

        }
    }  */
   
 

/* 

import java.util.Scanner;
public class jul5 {
    
     
    public static void calculatesum(int a, int b){
     
       int sum = a + b;
       System.out.println("your sum is:" + sum);

    }
    
    public static void main(String args []){
   // printHelloworld();
     
   Scanner sc = new Scanner (System.in);
      
   System.out.println("Enter a:" );
    int a = sc.nextInt();
      
    System.out.println("Enter b:" );
    int b = sc.nextInt();
   
    calculatesum( a, b);
    


        }
    }  */


  /* 
    import java.util.Scanner;
    public class jul5 {
    
     
    public static int calculatesum(int num1, int num2)
    {
     int sum = num1 + num2;
     return sum;

    }
    
    public static void swap(int a,int b){
     
     int temp = a;
     a = b;
     b = temp;


     System.out.println("a :" + a);
     System.out.println("b :" + b);


    }
  
    
    public static int pro(int a,int b){
     
     int pro = a * b;
     return pro;
    }





 public static void main(String args [])
    {
     int a =4;
     int b = 5;

    int mul = pro( a, b);
    System.out.println(mul);
     
     mul = pro( 5, 7);
    System.out.println(mul);

    }
     
}  
   */
 

/* 

   public class jul5 {
   
   
    public static int fact(int n){
     
        int fact = 1;
        for(int i = 1; i<= n; i++){
          
            fact = i * fact;

        }
   
        return fact;

   }
    
    public static int bio_coeff(int n,int r){


       int  n_fact = fact(n);
       int  r_fact = fact(r);
        int nmr_fact = fact(n-r);
        

    int bio_coeff = n_fact/ (r_fact * nmr_fact );
    return bio_coeff;

    }
   
   public static void main(String args []){

    int result = bio_coeff(10,3);
    System.out.println(result);

    }
}

*/


// import java.util.Scanner;
// public class jul5 {
    
        
//         // public static int sum(int a, int b){
        
//         // return a + b;
//         // }
        

//         // public static int sum(int a, int b, int c){
        
//         // return a + b + c;
//         // }
    
    
//     public static int sum(int a, int b){
//         return a+b;
//     }
    

//     public static float sum(float a , float b){
//         return a+b;
//     }
    
    
    
//         public static void main(String args []){
     
//       System.out.println(sum(2,3));
//       System.out.println(sum(2.3f, 4.5f));

//       }
//     }  


  public class jul5 {
   
   
    public static boolean isprime (int n){
     
      if (n == 2){
        return true;
      }

    for(int i =2 ; i<= n-1 ; i++){

        if(n%i == 0){
            return false;
        }
    }
    
    return true;
   }
    
    
   public static void main(String args []){

   System.out.println( isprime (4));
    }
}
