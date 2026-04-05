public class Simply{
    Node head;

    public Simply(){
        this.head=null;
    }

    public void agregarProducto(String nombre, double precio){
        Node nuevoNodo=new Node(nombre,precio);
        if(head==null){
            head=nuevoNodo;
            return;
        }
        Node aux=head;
        while(aux.next!=null){
            aux=aux.next;
        }
        aux.next=nuevoNodo;
    }

    public void calcularTotal(){
        double total=0;
        if(head==null){
            System.out.println("No hay productos en el carrito");
            return;
        }
        Node aux=head;
        while(aux!=null){
            total=total+ aux.precio;
            aux=aux.next;
            
        }
        System.out.println("Precio total a pagar: " + total);
    }

    public static void main(String[] args){
        Simply nuevoCarrito=new Simply();
        nuevoCarrito.agregarProducto("camsia", 25.0);
        nuevoCarrito.agregarProducto("pantalon", 40.0);
        nuevoCarrito.agregarProducto("calcetines", 5.5);
        nuevoCarrito.calcularTotal();
    }
}

class Node{
    String nombre;
    Double precio;
    Node next;

    public Node(String nombre, Double precio){
        this.nombre=nombre;
        this.precio=precio;
        this.next=null;
    }
}