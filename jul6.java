

// import java.util.Scanner;
// public class jul6 {

//     public static boolean isprime(int n){
//     if(n == 2){
      
//         return true;
//     }
    
    

//     for (int i = 2; i<= Math.sqrt(n); i++){
//         if(n % i == 0){
//             return false;
//         }
//     }
//    return true;
// }


// public static void range(){
//     for(int i = 1; i<=20; i++){
    
//     if(isprime(i)){

//         System.out.print(i + " ");
//     }
//   }
  
 
// }

// public static void binTodec(int binnum){

//     int pow = 0;
//     int dec = 0;
//     int mynum = binnum;

//     while( binnum > 0){
  
//         int lastdigit =  binnum % 10 ;
//         dec = dec + (lastdigit * (int)Math.pow(2,pow));
//         pow++;

//         binnum = binnum / 10;
 
//     }

//    System.out.println("decimal of " + mynum + " = " + dec);


// }


// public static void dectobin(int n){

//     int mynum = n;
//     int pow = 0;
//     int bin = 0;


// while(n > 0){

//    int rem = n % 2;
//    bin = bin + ( rem * (int)(Math.pow(10,pow)));
//   pow++;
//   n = n/2;

// }

// System.out.println("decimal of " +  mynum + " = " + bin);

// }

// public static void main(String args []){
    
//      dectobin(11);

//      // binTodec(111);
// }
// }



// public  class jul6{

//     public static void main(String args[]){
       
//        int totrows = 4;
//        int totcols = 5;
       
       
//         for(int i= 1; i<= totrows; i++){

//             for(int j = 1; j<= totcols ; j++){

//                 if(i == 1 || i == totrows || j==1 || j== totcols){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();

//         }
//     }
// }


// public  class jul6{
//     // int n = 4;
//     public static void main(String args[]){
//         int n = 4;
//         for(int  i =  1; i<= n; i++){

           
//              for(int j= 1 ; j<= i ; j++){
              
//                 System.out.print(" * ");
//             }
            
//              for(int j= 1 ; j<= n - i ; j++){
              
//                 System.out.print("   ");
//             }

        
//            System.out.println();
//         }
//     }
// }



public class jul6{

    public static void main(String args []){


    int n = 5;
    for (int i=0 ; i<= n; i++){
     
        for (int j=1; j<=n-i;j++){
            System.out.print(j + " ");
        }
      System.out.println();
    }

    }

}