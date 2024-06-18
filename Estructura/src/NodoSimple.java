public class NodoSimple extends Nodo {
    protected Nodo siguiente;

    public NodoSimple(int valor) {
        super(valor);
        this.siguiente = null;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
