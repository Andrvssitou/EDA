public class Doubly2{
    Node head;

    public Doubly2(){
        this.head=null;
    }

    public void llegarAFila(String nombre){
        Node nuevoNodo=new Node(nombre);
        if(head==null){
            head=nuevoNodo;
            return;
        }

        Node aux=head;

        while(aux.next!=null){
            aux=aux.next;
        }
        aux.next=nuevoNodo;
        nuevoNodo.prev=aux;
    }

    public void imprimirReversa(){
        Node aux=head;

        if(head==null){
            System.out.println("Fila vacia");
            return;
        }
        while(aux.next!=null){
            aux=aux.next;
        }
        while(aux!=null){
            System.out.println(aux.nombre + "<->");
            aux=aux.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        Doubly2 nuevaLista=new Doubly2();
        nuevaLista.llegarAFila("Ana");
        nuevaLista.llegarAFila("Beto");
        nuevaLista.llegarAFila("Carla");
        nuevaLista.imprimirReversa();
    }

}

class Node{
    String nombre;
    Node next;
    Node prev;

    public Node(String nombre){
        this.nombre=nombre;
        this.next=null;
        this.prev=null;
    }
}