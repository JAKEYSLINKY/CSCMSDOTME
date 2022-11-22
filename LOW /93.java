/* 
  import java.util.Scanner;

class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    
   	int num = new sc.nextInt();
    int words = new sc.nextLine();
    
    System.out.print(s.substring(0, 1));  
  }
}
*/

import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int wd = sc.nextInt();
        String arr[] = new String[wd];
        for (int i = 0; i < wd; i++){
            arr[i] = sc.next();
        }
        for (int i = 0; i < wd; i++){
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                if(j == arr[i].length() - 1)
                    System.out.print(arr[i].toUpperCase().charAt(j));
                else
                    System.out.print(arr[i].toLowerCase().charAt(j));
            }
            System.out.print(" ");
        }
    }
}
