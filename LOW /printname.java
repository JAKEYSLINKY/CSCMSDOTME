import java.util.Scanner;
class printname{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    
    String username = sc.nextLine();
    System.out.println("Hello," + ' ' + username + ".");
  }
}
