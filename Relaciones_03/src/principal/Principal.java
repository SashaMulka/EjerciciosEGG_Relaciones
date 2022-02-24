/*Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número
entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta
clase debe contener un método toString() que retorne el número de carta y el palo. La
baraja estará compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya 
más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número 
de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos 
nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna 
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta 
y luego se llama al método, este no mostrara esa primera carta.*/

package principal;

import java.util.Locale;
import java.util.Scanner;


public class Principal {

  
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        Baraja baraja = new Baraja();
        baraja.nuevaBaraja();
        boolean continuar = true;
        
        while(continuar){
            System.out.println("------BARAJA ESPAÑOLA------");
            System.out.println("1) Barajar");
            System.out.println("2) Dar una carta");
            System.out.println("3) Dar varias carta");
            System.out.println("4) Mosatrar numero de cartas restantes");
            System.out.println("5) Ver cartas en el mazo");
            System.out.println("6) Ver cartas en la baraja");
            System.out.println("7) Terminar");
            System.out.println("");
            int rtta = entry.nextInt();

            switch(rtta){
                case 1:
                    baraja.barajar();
                    break;
                case 2:
                    baraja.siguienteCarta();
                    break;
                case 3:
                    baraja.darCartas();
                    break;
                case 4:
                    baraja.cartasDisponibles();
                    break;
                case 5:
                    baraja.mostrarBaraja();
                    break;
                case 6:
                    baraja.cartasMonton();
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }      
        }
    }

}
