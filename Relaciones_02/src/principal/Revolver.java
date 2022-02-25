/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual 
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la 
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán 
aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package principal;


public class Revolver {
    
    private byte posicionActual;
    private byte posicionAgua;

    public Revolver() {
    }

    public Revolver(byte posicionActual, byte posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(byte posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(byte posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    public void llenarRevolver(){
        this.posicionAgua = (byte)(Math.random()*6 + 1);
        this.posicionActual = (byte)(Math.random()*6 + 1);
    }
    
    public boolean mojar(){
        if (this.posicionActual == this.posicionAgua){
            return true;
        } else {
            return false;
        }
    }
    
    public void siguienteChorro(){
        if (this.posicionActual == 6)
            this.posicionActual = 1;
        else 
            this.posicionActual++;
    }

    @Override
    public String toString() {
        return "Revolver{" + "Posicion actual =" + posicionActual + ", Posicion cargada =" + posicionAgua + '}';
    }
    
}
