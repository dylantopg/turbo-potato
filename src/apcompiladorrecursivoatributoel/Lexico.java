
package apcompiladorrecursivoatributoel;

import java.util.ArrayList;

/**
 *
 * @author SistemaInvestigacion
 */
public class Lexico {
    private ArrayList<Elemento> cadena;

    // Métodos
    public Lexico() {
        cadena = new ArrayList();
    }

    public void adicionarElemento(Elemento ele) {
        cadena.add(ele);
    }

    public Elemento darElemento(int ind) {
        return cadena.get(ind);
    }

    public int darTamañoCadena() {
        return cadena.size();
    }

    public void mostrarLexico() {
        Elemento ele;
        for (int i = 0; i < cadena.size(); i++) {
            ele = darElemento(i);
            System.out.println("Tipo " + (char) ele.darTipo() + " Valor " + (double) ele.darValor() + "  Indice "
                    + (int) ele.darIndice());

        }
    }

    public String cadenaLexico() {
        String cadena1 = "";
        Elemento ele1;
        for (int i = 0; i < cadena.size(); i++) {
            ele1 = darElemento(i);

            cadena1 = cadena1 + ele1.darTipo();
        }
        return cadena1;
    }
}
