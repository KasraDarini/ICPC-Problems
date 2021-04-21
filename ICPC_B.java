import java.util.Scanner;

public class ICPC_B {
    public static int d(int a , int b){
        int d= Math.abs(a-b);
        int score =0 ;
        if(d <=10){
            score = 10 ;
        }
        if(d > 10 && d<=30){
            score = 9;
        }
        if(d >30 && d <=50){
            score = 8 ;
        }
        if(d > 50 && d <=70){
            score= 7 ;
        }
        if(d > 70 && d <= 90){
            score =6 ;
        }
        if(d > 90 && d <=110){
            score = 5 ;
        }
        if(d > 110 && d <=130){
            score = 4 ;
        }
        if( d > 130 && d <= 150){
            score = 3 ;
        }
        if(d > 150 && d <= 170){
            score = 2;
        }
        if( d > 170 && d <=190){
            score =1 ;
        }
        return score;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt() ;
        int [] arr =new int[n] ;
        for (int i =0 ; i < n ; i++ ){
            int a = sc.nextInt() ;
            int b = sc.nextInt();
            arr[i] = d(a,b);
        }
        int sum =0 ;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum -1);
    }
}
