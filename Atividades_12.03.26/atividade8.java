//Padovan

public class atividade8
{
    public static void main(String[] args) {
        System.out.println(calcPadovan(13));
    }
    
    public static int calcPadovan (int n){
        if (n==0 || n==1 || n==2){
            return 1;
        } else {
            return calcPadovan(n -2)+calcPadovan(n-3);
        }
    }
}
