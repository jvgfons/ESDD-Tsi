//Tribonacci

public class atividade6
{

    public static void main(String[] args){
        

    System.out.println(calcTribonacci(7));
    }


    public static int calcTribonacci(int n){
        if (n ==0){
            return 0;
        } else if( n==1) {
            return 0;
        } else if (n==2){
            return 1;
        } else {
            return calcTribonacci(n-1)+calcTribonacci(n-2)+calcTribonacci(n-3);
        }
    }
}
