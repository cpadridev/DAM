package _03ejercicios._02reservaslibreria;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javi
 */
import java.util.*;

public class GestionReservas {
	static Scanner tec = new Scanner(System.in);
    public static void main(String[] args) {
        
        String opcionesMenu[] = {
        		"1.- Realizar reserva", 
        		"2.- Cancelar reserva", 
        		"3.- Pedido",
        		"4.- Recepcion",
        		"5.- Listado", 
        		"6.- Salir"};
        

        int opc;
        String nif, nombre, tel;
        int codigo, ejemplares;

        //Creamos un ListaReserva
        ListaReservas l = new ListaReservas();
        //Mostramos el menú y actuamos según lo que 
        //indique el usuario
        do{
            opc = menu(opcionesMenu);
            switch(opc){
                case 1:
                    System.out.println("---- RESERVAR ----");
                    
                    //Pedimos los datos de la reserva
                    System.out.println("NIF: ");
                    nif = tec.nextLine();
                    System.out.println("Nombre: ");
                    nombre = tec.nextLine();
                    System.out.println("Telefono: ");
                    tel = tec.nextLine();
                    System.out.println("Codigo libro: ");
                    codigo = tec.nextInt();
                    System.out.println("Ejemplares: ");
                    ejemplares = tec.nextInt();

                    try{
                        l.reservar(nif,nombre,tel,codigo,ejemplares);
                    } catch (IllegalArgumentException e){
                        System.out.println("La reserva ya existe");
                    } 
                    break;
                case 2:
                    System.out.println("---- CANCELAR RESERVA ----");
                    System.out.println("NIF: ");
                    nif = tec.nextLine();
                    System.out.println("Codigo libro: ");
                    codigo = tec.nextInt();

                    try{
                        l.cancelar(nif,codigo);
                    }catch(NoSuchElementException e ){
                        System.out.println("La reserva indicada no existe");
                    }
                    break;
                case 3:
                    System.out.println("--- PEDIDO ---");

                    System.out.println("Codigo libro: ");
                    codigo = tec.nextInt();
                    ejemplares = l.numEjemplaresReservadosLibro(codigo);
                    System.out.println("Se han reservado " + ejemplares + " ejemplares en total");

                    break;

                case 4:
                    System.out.println("--- RECEPCION ---");
                    System.out.println("Codigo libro: ");
                    codigo = tec.nextInt();

                    System.out.println("Estos son los clientes que han reservado el libro: ");
                    l.reservasLibro(codigo);
                    break;
                case 5:
                    System.out.println("--- LISTADO  ---");
                    System.out.println(l.toString());
                    break;
            }
        }while(opc != 6);
    }
    public static int menu(String opciones[]) {
        int opc;
        do {
            for (int i = 0; i < opciones.length; i++) {
                System.out.println("\t" + opciones[i]);
            }
            System.out.println("Elija una opción");
            opc = tec.nextInt();
            tec.nextLine(); //Limpiar buffer

        } while (opc < 0 || opc > opciones.length);
        return opc;
    }
}