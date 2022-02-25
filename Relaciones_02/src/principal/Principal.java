/*Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
carga de agua, se dispara y se moja. Las clases a hacer del juego son las siguientes:*/

package principal;

import java.util.ArrayList;


public class Principal {

  
    public static void main(String[] args) {
        
        ArrayList<Jugador> jugadores = new ArrayList();
        for (int i = 1; i < 7; i++) {
            jugadores.add(new Jugador((byte) i));
        }
        Revolver revolver = new Revolver();
        revolver.llenarRevolver();
        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver);
        juego.ronda();
    }

}
