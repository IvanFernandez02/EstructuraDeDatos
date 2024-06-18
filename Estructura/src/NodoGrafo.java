public class NodoGrafo extends Nodo {
    protected String aristas;

    public NodoGrafo(int valor) {
        super(valor);
        this.aristas = null;
    }

    public String getAristas() {
        return aristas;
    }
    public void setAristas(String aristas) {
        this.aristas = aristas;
    }

    public void agregarAristas() {

    }

    public void eliminarAristas() {

    }
}
