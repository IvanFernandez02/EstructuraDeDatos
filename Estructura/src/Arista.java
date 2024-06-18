public class Arista {
    protected NodoGrafo destino;
    protected int peso;

    public Arista(NodoGrafo destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }

    public NodoGrafo getDestino() {
        return destino;
    }

    public int getPeso() {
        return peso;
    }
}
