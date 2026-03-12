//Pell  

public class atividade7
{
    public static void main(String[] args) {
        System.out.println(calcPell(9));
    }
    
    public static int calcPell (int n){
        if (n==0){
            return 0;
        } else if (n==1){
            return 1;
        } else {
            return 2*calcPell(n-1)+calcPell(n-2);
        }
    }
}
