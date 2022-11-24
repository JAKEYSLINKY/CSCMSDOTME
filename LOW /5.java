import java.util.Scanner;

class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    
    int number = sc.nextInt();
    for ( int i = 2; i < number; i++){
    	if (number % i == 0 || number == 1){
    		System.out.print("No");
          	return;
   		 }
 	}
    	System.out.print("Yes");
  }
}
