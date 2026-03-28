import java.util.Arrays;
public class Recursividad1{
    public static int robar(int[] casas,int n, int[] memoria){
        if(n<0){
            return 0;
        }
        if(n==0){
            return casas[0];
        }
        if(memoria[n]!=-1){
            return memoria[n];
        }
        int opcionA= casas[n]+ robar(casas,n-2,memoria);
        int opcionB=robar(casas,n-1,memoria);
        int resultado=Math.max(opcionA,opcionB);
        memoria[n]=resultado;
        return resultado;
    }
    public static void main(String[] args){
        int[] casas={2,7,9,3,1};
        int ultimacasa=casas.length -1;
        int[] memoria=new int[casas.length];
        Arrays.fill(memoria,-1);
        int botinmax=robar(casas,ultimacasa,memoria);
        System.out.println("El botin maximo que puedes robar es: " + botinmax);
    }
}