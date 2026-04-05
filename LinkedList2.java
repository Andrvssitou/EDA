public class LinkedList2{
    TurnoNode head;

    public LinkedList2(){
        this.head=null;
    }

    public void llegadaCliente(int numero){
        TurnoNode nuevoNodo=new TurnoNode(numero);
        if(head==null){
            head=nuevoNodo;
            return;
        } 
        TurnoNode aux=head;
        while(aux.siguiente!=null){
            aux=aux.siguiente;
        }
        aux.siguiente=nuevoNodo;
    }
    
    public void mostrarFila(){
        TurnoNode aux=head;
        while(aux!=null){
            System.out.println(aux.n + "->");
            aux=aux.siguiente;
        }
        System.out.println("Fin de la fila");
    }
    public void atenderCliente(){
        if(head==null){
            System.out.println("Fila vacia");
            return;
        }
        head=head.siguiente;
    }

    public static void main(String[] args){
        LinkedList2 nuevaLista=new LinkedList2();
        nuevaLista.llegadaCliente(1);
        nuevaLista.llegadaCliente(2);
        nuevaLista.llegadaCliente(3);
        nuevaLista.mostrarFila();
        nuevaLista.atenderCliente();
        nuevaLista.llegadaCliente(4);
        nuevaLista.atenderCliente();
        nuevaLista.mostrarFila();
    }
}

class TurnoNode{
    int n;
    TurnoNode siguiente;

    public TurnoNode(int n){
        this.n=n;
        this.siguiente=null;
    }

}