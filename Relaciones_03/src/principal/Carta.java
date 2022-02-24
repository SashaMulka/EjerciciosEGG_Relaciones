/*
 */
package principal;

public class Carta {
    
    private byte numero;
    private String palo;

    public Carta() {
    }

    public Carta(byte numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public byte getNumero() {
        return numero;
    }

    public void setNumero(byte numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "["+ numero + " " + palo + ']';
    }
    
}
