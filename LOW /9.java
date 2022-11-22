import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        if (n < 4){
            System.out.print("DIE");
        }
        else{
            for(int i = 1; i < b - 1 ; ++i){
                System.out.print(i + " ");    
            }
            for(int i = b + 2; i <= n; i++){
                System.out.print(i + " ");
            }
        }
    }
}
