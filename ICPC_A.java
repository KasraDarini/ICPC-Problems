import java.util.Scanner;

public class ICPC_A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4] ;

        for(int j= 0 ; j< 4 ; j++){
            arr[j] = sc.nextInt() ;
        }
        int p = arr[0] + arr[2];
        int s = arr[1] + arr[3];
        if(p == s){
            System.out.println("penalty");
        }
        if( p > s){
            System.out.println("Persepolis");
        }
        if(s > p){
            System.out.println("Esteghlal");
        }
    }
}
