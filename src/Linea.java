public class Linea {

    private int llamadas=0;
    private int duracionLlamada;
    private int tipoLlamada;
    public Linea() {

    }

    public Linea(int llamadas, int duracionLlamada, int tipoLlamada) {
        this.llamadas = llamadas;
        this.duracionLlamada = duracionLlamada;
        this.tipoLlamada = tipoLlamada;
    }

    public int getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(int llamadas) {
        this.llamadas = llamadas;
    }

    public int getDuracionLlamada() {
        return duracionLlamada;
    }

    public void setDuracionLlamada(int duracionLlamada) {
        this.duracionLlamada = duracionLlamada;
    }

    public int getTipoLlamada() {
        return tipoLlamada;
    }

    public void setTipoLlamada(int tipoLlamada) {
        this.tipoLlamada = tipoLlamada;
    }

    @Override
    public String toString() {
        return "Linea{" +
                "llamadas=" + llamadas +
                ", duracionLlamada=" + duracionLlamada +
                ", tipoLlamada=" + tipoLlamada +
                '}';
    }

    public int LlamadaLocal(int Llamadas, int duracionLlamada, int tipoLlamada){
        int costo = 60*this.duracionLlamada;
        return costo;
    }
}
