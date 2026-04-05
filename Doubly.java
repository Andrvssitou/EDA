public class Doubly{
    Node head;

    public Doubly(){
        this.head=null;
    }
    //Insercion al inicio
    public void insertarInicio(int numero){
        Node nuevoNodo=new Node();
        if(head==null){
            head=nuevoNodo;
            return;
        }
        nuevoNodo.siguiente=head;
        head.anterior=nuevoNodo;
        head=nuevoNodo;
    }
    //Insercion al final
    public void insertarFinal(){
        Node nuevoNodo=new Node();
        if(head==null){
            head=nuevoNodo;
            return;
        }
        
        Node aux=head;
        while(aux.siguiente!=null){
            aux=aux.siguiente;
        }
        aux.siguiente=nuevoNodo;
        nuevoNodo.anterior=aux;
    }
    //recorrido hacia adelante
    public void recorrer(){
        Node aux=head;
        While(aux!=null){
            System.out.print(aux.dato + "<->");
            aux=aux.siguiente;
        }
        System.out.println("null");
    }
    //recorrido hacia atras
    public void recorrerAtras(){
        Node aux=head;
        if(head==null){
            System.out.println("Lista vacia.");
            return;
        }
        While(aux.siguiente!=null){
            aux=aux.siguiente;
        }

        While(aux!=null){
            System.out.println(aux.dato + "<->");
            aux=aux.anterior;
        }
        System.out.println("null");
    }
}
class Node{
    int dato;
    Node siguiente;
    Node anterior;
    public Node(int dato){
        this.dato=dato;
        this.siguiente=null;
        this.anterior=null;
    }
}