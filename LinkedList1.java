public class LinkedList1{
    Node head;
    
    public LinkedList1(){
        this.head=null;
    }

    public void registrarPuntajeReciente(int puntos){
        Node nuevoNodo=new Node(puntos);
        nuevoNodo.siguiente=head;
        head=nuevoNodo;
    }

    public void recuperarPuntajeAntiguo(int puntos){
        Node nuevoNodo=new Node(puntos);
        if(head==null){
            head=nuevoNodo;
            return;
        }

        Node aux=head;
        while(aux.siguiente!=null){
            aux=aux.siguiente;
        }
        aux.siguiente=nuevoNodo;
    }
    public void mostrarHistorial(){
        Node aux=head;
        while(aux!=null){
            System.out.print(aux.x + "->");
            aux=aux.siguiente;
        }
        System.out.println("Fin de la lista");
    }
    public static void main(String[] args){
        LinkedList1 nuevaLista=new LinkedList1();
        nuevaLista.registrarPuntajeReciente(100);
        nuevaLista.registrarPuntajeReciente(300);
        nuevaLista.recuperarPuntajeAntiguo(50);
        nuevaLista.registrarPuntajeReciente(500);
        nuevaLista.recuperarPuntajeAntiguo(10);
        nuevaLista.mostrarHistorial();
    }
}
class Node{
    int x;
    Node siguiente;

    public Node(int x){
        this.x=x;
        this.siguiente=null;
    }
}