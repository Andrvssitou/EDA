class Doubly4{
    Node head;
    Node paginaActual;

    public Doubly4(){
        this.head=null; 
    }

    public void visitar(String url){
        Node nuevoNodo=new Node(url);
        if(head==null){
            head=nuevoNodo;
            paginaActual=nuevoNodo;
            return;
        }

        Node aux=head;

        while(aux.next!=null){
            aux=aux.next;
        }
        aux.next=nuevoNodo;
        nuevoNodo.prev=aux;
        paginaActual=nuevoNodo;
    }

    public void botonAtras(){
        if(paginaActual.prev!=null){
            paginaActual=paginaActual.prev;
            System.out.println("Retrocediendo a:" + paginaActual.url);
            return;
        }
        System.out.println("No hay pagina anterior");
    }
    
    public void mostrarTodo(){
        Node aux=head;
        if(head==null){
            System.out.println("No hay paginas que mostrar.");
            return;
        }
        while(aux!=null){
            System.out.println("pagina:" + aux.url);
            aux=aux.next;
        }
    }

    public static void main(String[] args){
        Doubly4 nuevoHistorial=new Doubly4();
        nuevoHistorial.visitar("www.google.com");
        nuevoHistorial.visitar("github.com");
        nuevoHistorial.visitar("Youtube.com");
        nuevoHistorial.botonAtras();
        nuevoHistorial.mostrarTodo();
    }
}

class Node{
    String url;
    Node next;
    Node prev;

    public Node(String url){
        this.url=url;
        this.next=null;
        this.prev=null;
    }
}