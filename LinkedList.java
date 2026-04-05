public class Linkedlist{
    Node head;
    
    public Linkedlist{
        this.head==null;
    }

    public static void insertarIn(int dato){
        Node nuevoNodo=new Node(dato);
        nuevoNodo.siguiente=head;
        head=nuevoNodo;
    }

    public static void insertarFn(int dato){
        Node nuevoNodo=new Node(dato); //creamos el nodo
        if(head==null){ //Si la lista esta vacia, la cabeza es el neuvo nodo
            head=nuevoNodo;
            return;
        }
        Node aux=head; //Si no recorremos la lista buscando el ultimo;
        while(aux.siguiente!=null){
            aux=aux.siguiente;
        }
        aux.siguiente=nuevoNodo;
    }

    public static void ImprimirLista(){
        Node aux=head;
        System.out.println("Lista: ");
        
        while(aux!=null){
            System.out.println(aux.dato + " -> ");
            aux=aux.siguiente;
        }
        System.out.println("Fin de la lista");
    }
}

class Node{
    int dato;
    Node siguiente;

    public Nodo(int dato){
        this.dato=dato;
        this.siguiente=null;
    }
}

