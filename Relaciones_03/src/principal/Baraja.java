/*

 */
package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Baraja {
    ArrayList<Carta> cartas;
    ArrayList<Carta> cartasRepartidas;
    

    public Baraja() {
        cartas = new ArrayList();
        cartasRepartidas = new ArrayList();
    }
    
    public void nuevaBaraja(){
        cartas.clear();
        cartasRepartidas.clear();
        crearCartas("Espada");
        crearCartas("Bastos");
        crearCartas("Oro");
        crearCartas("Copas");
    }
    
    public void crearCartas(String palo){
        byte i=1;
        while(i<13){
            if (i==8)
                i=10;
            cartas.add(new Carta(i, palo));
            i++;
        }
    }
    

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }
    
    public void barajar(){
        Collections.shuffle(cartas);
    }
    
    public void siguienteCarta(){
        if (cartas.isEmpty()){
            System.out.println("No hay mas cartas");
        } else {
        System.out.println(cartas.get(0));
        cartasRepartidas.add(cartas.get(0));
        cartas.remove(0);
        }
    }
    
    public void cartasDisponibles() {
        System.out.println("Cartas por repartir: " + cartas.size());
    }
    
    public void darCartas() {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Cuantas cartas quiere?");
        int pedido = entry.nextInt();
        if (cartas.size() > pedido){
            for (int i = 0; i < pedido; i++) {
                siguienteCarta();
            }
        } else {
            System.out.println("No quedan suficientes cartas");
        }
    }
    
    public void cartasMonton(){
        System.out.println("Cartas repartidas:\n" + cartasRepartidas);
    }
    
    public void mostrarBaraja(){
        System.out.println("Cartas en baraja:\n" + cartas);
    }
}


//    static ArrayList<Carta> crearBaraja (){
//        ArrayList<Carta> cartas = new ArrayList();
//        byte contador = 1;
//        String palo;
//        for (int i = 1; i <= 48; i++) {
//            if (contador == 8 || contador == 9)
//                continue;
//            if (i<13)
//                palo = "Espada";
//            else if (i<25)
//                palo = "Basto";
//            else if (i<37)
//                palo = "Oro";
//            else 
//                palo = "Copa";
//            cartas.add(new Carta(contador, palo));
//            contador++;
//            if (contador > 12)
//                contador = 1;
//        }
//        return cartas;
//    }