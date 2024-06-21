
package apcompiladorrecursivoatributoel;

public class NoTerminal {

    // Atributos
    private String nombre;
    private int direc;
    private double valor;
    private boolean vlogico;

    public NoTerminal(String nombre, int direc, double valor, boolean vlogico) {
        this.nombre = nombre;
        this.direc = direc;
        this.valor = valor;
        this.vlogico = vlogico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDirec() {
        return direc;
    }

    public void setDirec(int direc) {
        this.direc = direc;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isVlogico() {
        return vlogico;
    }

    public void setVlogico(boolean vlogico) {
        this.vlogico = vlogico;
    }

}
