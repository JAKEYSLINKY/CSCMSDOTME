import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int arr[] = new int[3];
      //ArrayList<Integer> al = new ArrayList<Integer>(); 
      // arr[0] = sc.nextInt();
        for ( int i = 0; i < 3; i++){ 
       		arr[i] = sc.nextInt();
          }
        Arrays.sort(arr);
        //System.out.print(Arrays.toString(arr));
      System.out.print( arr[1]);
    }
}
