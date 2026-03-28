import java.util.Arrays;
public class Recursividad{
    public static int Escalar(int n, int[] memoria){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(memoria[n]!=-1){
            return memoria[n];
        }
        int resultado=Escalar(n-1, memoria) + Escalar(n-2, memoria);
        memoria[n]=resultado;
        return resultado; 
    }
    public static void main(String[] args){
        int escalones= 5;
        int[] memoria= new int[escalones + 1];
        Arrays.fill(memoria,-1);
        int totalformas= Escalar(escalones, memoria);
        System.out.println("Para "+ escalones + " escalones , hay " + 
            totalformas + " formas de llegar a la cima.");

    }
}