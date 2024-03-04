/* 

import java.util.Scanner;

public class jul3 {
   public static void main (String args[]){

    Scanner sc = new Scanner(System.in);
    int income = sc.nextInt();
    int tax;


    if(income < 500000 ){
        tax = 0;
    }

    else if (income >= 500000 && income <100000){
        tax = (int)(income * 0.2);
    }
    
    else{
        tax = (int)(income * 0.3);

    }
        
    System.out.println("you tax is :"+ tax);

   }
    
}
*/


// a = 90, b = 4, c = 9 
/* 
import java.util.Scanner;

public class jul3 {
   public static void main (String args[]){

    int a = 90;
    int b = 4;
    int c = 5;

    if (a >= b && a>=c){
        
        System.out.println(" a is greater");

    }
    else if (b>=c){
    
       System.out.println(" b is greater");
    }   

    else {
      System.out.println(" c is greater");

    }

   }
    
}
*/


/*
import java.util.Scanner;

public class jul3 {
   public static void main (String args[]){

    int larger = (4>30)? 4:30;
    System.out.println(larger);


   }
    
}
*/


/* 
import java.util.Scanner;

public class jul3 {
   public static void main (String args[]){
    int marks = 45;
    
    
    String Value = ( marks >= 33 ) ? "pass" : "Fail";
    System.out.println(Value);


   }
    
}
*/
/* 
import java.util.Scanner;

public class jul3 {
   public static void main (String args[]){
    int num = 8;

    switch(num){

    case 1: System.out.println("Add = ");
            break;


    case 2: System.out.println("Burger");
            break;

    case 3: System.out.println("Mango lassi");
            break;
 
    default: System.out.println("we wake up");

    }



   }
    
} */

/* 
import java.util.Scanner;

public class jul3 {
   public static void main (String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a :")
    switch(num){

    case 1: System.out.println("Add = ");
            break;


    case 2: System.out.println("Burger");
            break;

    case 3: System.out.println("Mango lassi");
            break;
 
    default: System.out.println("we wake up");

    }



   }
    
}
*/



// Calculator

/* import java.util.Scanner;

public class jul3 {
   public static void main (String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a :");
    int a = sc.nextInt();

    System.out.println("Enter b :");
    int b = sc.nextInt();

   System.out.println("Enter c :");
    int c = sc.nextInt();

   System.out.println("Enter operator :");
     char operator = sc.next().charAt(0);
   
   
   switch(operator){

    case '+': System.out.println(a+b+c);
            break;


    case '-': System.out.println(a-b-c);
            break;

    case '*': System.out.println(a*b*c);
            break;

   case '/': System.out.println((a/b)/c);
            break;
 
    default: System.out.println("Wrong operator");

      }

   }
    
}  */

/* 

import java.util.Scanner;

public class jul3 {
   public static void main (String args[]){
    
      int counter = 0;
      while(counter < 10){
        
         System.out.println("Hello world");
         counter ++ ;

      }

      System.out.println("Hello world printed 10 times");
   }
}
*/

/* 
import java.util.Scanner;

public class jul3 {
   public static void main (String args[]){
    
      int counter = 1;
      while(counter <= 10){
        
         System.out.print(counter + " "); // Use print instead of println to keep numbers in the same line
         counter++;

      }

      //System.out.println(); // Print a new line after the loop ends
   }
} */

/* 

import java.util.Scanner;

public class jul3 {
   public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      int sum = 0;
      int n = sc.nextInt();
      
      int i = 1;
      while(i <= n){
        
       sum = sum + n; // Use print instead of println to keep numbers in the same line
         i++;

      }

      System.out.println("your sum is:" + sum); // Print a new line after the loop ends
   }
}
*/
/* 
import java.util.Scanner;
public class jul3{

   public static void main(String args[]){
    
   
     int i;

      for (i= 0 ; i<10 ; i++){

         System.out.println("Hello world");
      }
   }
}
*/
/* 
import java.util.Scanner;
public class jul3{

   public static void main(String args[]){
    
   
     int n = 10893;

   while (n > 0 ) {

     int lastdigit = n % 10;
     System.out.print(lastdigit + " ");
     n = n/10;
      
       }

   }
} */

/* 
import java.util.Scanner;
public class jul3{

   public static void main(String args[]){
    
   
     int n = 10893;

   while (n > 0 ) {

     int lastdigit = n % 10;
     System.out.print(lastdigit + " ");
     n = n/10;
      
       }

   }
} */