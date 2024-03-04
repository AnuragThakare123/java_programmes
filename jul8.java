// public class jul8 {
//     public static void main(String args[]){

//         int n = 5;


//          for(int i=1; i<= n ; i++){

//              for (int j=1 ;j<=(n-i); j++){
//                 System.out.print(" ");
//             }

//           for (int j=1 ;j<= n; j++){
//              System.out.print("*" + " ");
//              }
     

//            System.out.println();

//          }

//          for(int i=n; i>= 1 ; i--){

//             for (int j=1 ;j<=(n-i); j++){
//                 System.out.print(" ");
//             }

//          for (int j=1 ;j<= n; j++){
//                 System.out.print("*" + " ");
//             }
     

//           System.out.println();

//         }
//     }
// }


// tilted rhombus
public class jul8{
    public static void Star(int n){
       //int n = 5;


        for(int i= 1; i<= n ;i++){
            for(int j=1; j<= n-i; j++){

         System.out.print(" ");
        }
        

        for(int j = 1;j<=n;j++){
            
            if( i == 1 || i == n || j ==1 || j ==n){
                System.out.print("*" + " ");
            }

            else{
                System.out.print(" " + " ");
            }
        }
     System.out.println();
    
    
    }
}


// diamond

public static void dia(int n){
    
    // 1 st half
    for(int i =1; i<=n; i++){
        for(int j=1; j<= n-i; j++){
            System.out.print(" " + " ");
        }


        for(int j =1; j<=(2*i)-1;j++){
            System.out.print("*" + " ");
        }

           System.out.println();

    }
     
    // 2n d half
    for(int i = n; i>=1; i--){
        for(int j=1; j<= n-i; j++){
            System.out.print(" " + " ");
        }


        for(int j =1; j<=(2*i)-1;j++){
            System.out.print("*" + " ");
        }

           System.out.println();

    }

}









 public static void main(String args[]){
    //Star(5);
    dia(3);
 }
}