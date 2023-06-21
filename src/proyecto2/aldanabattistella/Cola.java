package proyecto2.aldanabattistella;

public class Cola {
    private Vehiculo head;
    private Vehiculo tail;
    private int size;
    
    public Cola(){
        this.head = this.tail = null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
    
    public void empty(){
        this.head = this.tail = null;
        this.size = 0;
    }
    
    public void agregar(Vehiculo nuevo){
        if(this.isEmpty()){
            head = tail = nuevo;
        }else{
            tail.setNext(nuevo);
            tail = nuevo;
        }
        size++;
    }
    
    public void sacar(){
        if(this.isEmpty()){
            System.out.println("no hay nada");
        }else if(size == 1){
            this.empty();
        }else{
            head = head.getNext();
            size--;
        }
    }

    public Vehiculo getHead() {
        return head;
    }

    public void setHead(Vehiculo head) {
        this.head = head;
    }

    public Vehiculo getTail() {
        return tail;
    }

    public void setTail(Vehiculo tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
