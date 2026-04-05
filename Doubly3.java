public class Doubly3{
    Node head;
    Node cancionActual;

    public Doubly3(){
        this.head=null;
    }
    public void agregar(String titulo){
        Node nuevoNodo=new Node(titulo);
        if(head==null){
            head=nuevoNodo;
            cancionActual=nuevoNodo;
            return;
        }

        Node aux=head;

        while(aux.next!=null){
            aux=aux.next;
        }
        aux.next=nuevoNodo;
        nuevoNodo.prev=aux;
    }

    public void reproducirSig(){
        if(cancionActual.next!=null){
            cancionActual=cancionActual.next;
            System.out.println("Reproduciendo: "+ cancionActual.titulo);
            return;
        }
        System.out.println("Fin de la playlist");
    }

    public void reproducirAnterior(){
        if(cancionActual.prev!=null){
            cancionActual=cancionActual.prev;
            System.out.println("Reproduciendo: "+ cancionActual.titulo);
            return;
        }
        System.out.println("Primera cancion");
    }

    public void mostrarPlaylist(){
        Node aux=head;
        if(head==null){
            System.out.println("No hay canciones en la playlist");
            return;
        }
        while(aux.next!=null){
            System.out.println(aux.titulo);
            aux=aux.next;
        }
        System.out.println("Fin de la playlist");
    }

    public static void main(String[] args){
        Doubly3 nuevaPlaylist=new Doubly3();
        nuevaPlaylist.agregar("LIKE ME");
        nuevaPlaylist.agregar("DOMINATION");
        nuevaPlaylist.agregar("Romantika");
        nuevaPlaylist.reproducirSig();
        nuevaPlaylist.reproducirSig();
        nuevaPlaylist.reproducirAnterior();
    }



}

class Node{
    String titulo;
    Node next;
    Node prev;

    public Node(String titulo){
        this.titulo=titulo;
        this.next=null;
        this.prev=null;
    }
}