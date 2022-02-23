/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona*/

package relaciones_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;


public class Principal {

  
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        ArrayList<Perro> perros = new ArrayList<>();
        HashMap<String, Persona> adoptantes = new HashMap<>();
        
         Persona persona1 = new Persona("Carlos", "Ferreira", 27, "38756985", null);
        Persona persona2 = new Persona("Julia", "Perez", 25, "39587234", null);
        Perro perro1 = new Perro("Tobi", "Mestizo", 3, "Grande");
        Perro perro2 = new Perro("Tota", "Pincher", 7, "pequeño");
        
        perros.add(perro1);
        perros.add(perro2);
        adoptantes.put("Carlos Ferreira", persona1);
        adoptantes.put("Julia Perez", persona2);
        
        boolean salir = false;
        while (!salir) {
        System.out.println("MENU");
        System.out.println("1) Registrar perro");
        System.out.println("2) Registrar adoptante");
        System.out.println("3) Registrar adopcion");
        System.out.println("4) Salir\n");
        int rtta = entry.nextInt();       
        switch (rtta){
            case 1:
                System.out.println("\nREGISTRAR PERRO");
                System.out.println("Raza:");
                String raza = entry.next();
                System.out.println("Tamaño:");
                String tamaño = entry.next();
                System.out.println("Edad:");
                int edadP = entry.nextInt();
                System.out.println("Nombre");
                String nombreP = entry.next();
                Perro perro = new Perro(nombreP, raza, edadP, tamaño);
                perros.add(perro);
                break;
            case 2:
                System.out.println("\nREGISTRAR ADOPTANTE");
                System.out.println("Nombre:");
                String nombreA = entry.next();
                System.out.println("Apellido:");
                String apellido = entry.next();
                System.out.println("Edad:");
                int edadA = entry.nextInt();
                System.out.println("DNI:");
                String dni = entry.next();
                Persona persona = new Persona(nombreA, apellido, edadA, dni, null);
                String key = nombreA + " " + apellido;
                adoptantes.put(key, persona);
                break;
            case 3:
                System.out.println("\nREGISTRAR ADOPCION");
                System.out.println("Nombre y apellido de la persona:");
                nombreA = entry.next();
                if (adoptantes.containsKey(nombreA)){
                    System.out.println("Perro a adoptar:");
                    nombreP = entry.next();
                    boolean esta = false; 
                    for (Perro perroI : perros) {
                        if (perroI.getNombre().equals(nombreP)) {
                            esta = true;
                            adoptantes.get(nombreA).setPerro(perroI);
                            System.out.println("Gracias por adoptar!");   
                        }
                        }
                    if (!esta){
                            System.out.println("El perro no se encuentra en el registro");
                    }
                }else{
                    System.out.println("La persona no se ha registrado como adoptante");
                }
                break;
            case 4:
                salir = true;
                break;
            default:
                System.out.println("Ingrese una opcion valida");
         }
    }
        
        System.out.println("\n-------------REGISTROS-------------");
        for (Map.Entry<String, Persona> aux : adoptantes.entrySet()) {
            String key = aux.getKey();
            System.out.println("\n" + adoptantes.get(key));
        }
        
       
        
            
        
    }

}
