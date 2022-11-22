import java.util.Scanner;

class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in); 
    
    int score = sc.nextInt();
    
    /* switch (score) {
      case ( score >= 91 ) :
     	System.out.print("A");
     	break;
     case ( score >= 81 ) : 
     	System.out.print("B");
     	break;
     case ( score >= 61 ) : 
     	System.out.print("C");
     	break;
     case ( score >= 51) : 
     	System.out.print("D");
     	bes.out.print("A"); 
   }
   */ 
    if ( score >= 90 ) {
    	System.out.print("A");
    } 
    else if  ( score >= 80 ) {
    	System.out.print("B");
    } 
    else if ( score >= 60 ) {
    	System.out.print("C");
    } 
    else if ( score >= 50 ) {
    	System.out.print("D");
    } 
   else System.out.print("F");
  }
}

