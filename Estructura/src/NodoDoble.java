public class NodoDoble extends Nodo {
    protected Nodo siguiente;
    protected Nodo anterior;

    public NodoDoble(int valor) {
        super(valor);
        this.siguiente = null;
        this.anterior = null;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
