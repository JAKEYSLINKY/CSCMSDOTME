import java.util.*; 

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int min = sc.nextInt();
    int year = min / 525600;
    int day = ( min % 525600 ) / 1440; 

 System.out.print( year + " " + day ); 
  }
}
