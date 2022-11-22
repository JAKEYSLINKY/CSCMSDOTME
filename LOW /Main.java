import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /* String[] cars = {"A", "B", "C", "D"};
        for(int i = cars.length-1; i >= 0; i--){
            System.out.println(cars[i]);
        } */
    Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        System.out.print(" ");
        int[][] arr = new int[column][row]; 
        for(int i = 0; i < column; i++){
            for(int j = 0; j < row; j++){
                arr[i][j] = sc.nextInt();
            }
        } 
        //System.out.println("BREAKKKKKK"); 
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println(""); 
        } 
    }

}