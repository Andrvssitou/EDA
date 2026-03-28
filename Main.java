public class Main{
    public static int f(int x){
        if(x==0)
            return 0;   //metodo recursivo
        else
            return 2 * f(x-1)+ x*x; 
    }

    public static void printOut( int n){ //Imprime el numero n
        if(n>=10)            //Ej: Si quiero imprimir  76, pregunto 76
            printOut(n/10);; // es mayor a 10?,como es si, el programa se
        printDigit(n%10);//detiene y se llama de nuevo para imprimir 7
//como se llama de nuevo con 7, 7 es menor a 10?, como si es menor
    }// pasa al otro metodo y imprime 7.luego vuelve donde quedo y 
//pasa al metodo final imprimiendo 6.
    

}

//MEMOIZATION
public class Fibonacci{
    //Creamos nuestra libreta de apuntes
    static int[] memoria= new int[100]; //suficiente para guardar hasta
    //fib(99)
    public static int fibmemo(int n){
        //1. Caso base
        if(n<=1){
            return n;
        }
        //2. revisar la libreta. Ya calculamos esto antes?
        // si el valor no es 0, significa que ya lo tenemos guardado
        if(memoria[n]!=0){
            return memoria[n]; //Devolvemos el resultado inmediatamente
        }
        //3. Si no estaba en la libreta hacemos el calculo recursivo
        int resultado= fibmemo(n-1) + fibmemo(n-2);
        //4. y lo guardamos en la libreta antes de devolverlo
        memoria[n]=resultado;
        return resultado;
    }
}
