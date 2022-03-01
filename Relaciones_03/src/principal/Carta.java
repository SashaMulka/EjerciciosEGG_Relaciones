/*
 */
package principal;

public class Carta {
    
    private byte numero;
    private PaloEnum palo;

    public Carta() {
    }

    public Carta(byte numero, PaloEnum palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public byte getNumero() {
        return numero;
    }

    public void setNumero(byte numero) {
        this.numero = numero;
    }

    public PaloEnum getPalo() {
        return palo;
    }

    public void setPalo(PaloEnum palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "["+ numero + " " + palo + ']';
    }
    
}
