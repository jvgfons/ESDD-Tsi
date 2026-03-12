//Fibonnaci

public class atividade5
{

    public static void main(String[] args){
        

    System.out.println(palavraFibo(5));
    }



    public static String palavraFibo(int n){
        String palavra = "";
        String palavra2 = "";
        if (n==0){
            palavra += 'b';
            return palavra;
        } else if (n==1){
            palavra += 'a';
            return palavra;
        }else {
            
          palavra += palavraFibo(n-1);
          palavra2 += palavraFibo(n-2);
        return palavra+=palavra2;
        }


    }
}
