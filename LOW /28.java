import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    String sym = sc.next();
    int b = sc.nextInt();
    
    switch (sym){
      	case "+": System.out.print( a + b );  break;
        case "-": System.out.print( a - b );  break;
        case "*": System.out.print( a * b );  break;
        case "/": 
        	if ( b == 0 ){ 
              System.out.print("error"); 
              break;
                         }  
            System.out.print( a / b );  break;
        case "%": 
        	if ( b == 0 ){ 
              System.out.print("error"); 
              break;
                         }  
            System.out.print( a % b ); break;
        default : System.out.print("error");
    }  
    
  }
}
