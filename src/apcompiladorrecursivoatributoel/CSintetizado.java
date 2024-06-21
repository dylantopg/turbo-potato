
package apcompiladorrecursivoatributoel;

public class CSintetizado {
    // Atributos

    private double valor;
    private boolean valorLogico;

    public CSintetizado(double val) {
        valor = val;
        if (val > 0)
            valorLogico = true;
        else
            valorLogico = false;
    }

    public double darValor() {
        return valor;
    }

    public void asignarValor(double val) {
        valor = val;
    }

    public boolean darValorLogico() {
        return valorLogico;
    }

    public void asignarValorLogico(boolean vallog) {
        valorLogico = vallog;
    }
}
