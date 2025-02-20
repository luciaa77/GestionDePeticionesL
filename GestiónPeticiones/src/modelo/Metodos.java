package modelo;

import java.util.Scanner;

/**
 * Metodos para realizar el programa
 *
 * @author Lucia Cuadrado
 */
public class Metodos {

    public static String[] peticiones = new String[100];
    public static String[] peticionesUser = new String[100];

    /**
     * Funcion login
     *
     * @param user
     * @return 0 si da fallo, 1 si es usuario, 2 si es administrador
     */
    public static int login(String user) {
        int rol = 0;
        Scanner sc = new Scanner(System.in);
        String usuario_administrador = "lucia@";
        String contraseña_administrador = "hola1";
        String usuarioInicial = "user1";
        String contraseñaInicial = "adios1";
        String u1 = "user2";
        String c1 = "adios1";
        String u2 = "user3";
        String c2 = "adios3";

        String usuario = user;
        if (usuario.equals(usuario_administrador)) {
            System.out.print("password: ");
            String password = sc.nextLine();
            if (password.equals(contraseña_administrador)) {
                rol = 2;
            }
        } else if (usuario.equals(usuarioInicial)) {
            System.out.print("password: ");
            String password = sc.nextLine();
            if (password.equals(contraseñaInicial)) {
                rol = 1;
            }
        } else if (usuario.equals(u1)) {
            System.out.print("password: ");
            String password = sc.nextLine();
            if (password.equals(c1)) {
                rol = 1;
            }
        } else if (usuario.equals(u2)) {
            System.out.print("password: ");
            String password = sc.nextLine();
            if (password.equals(c2)) {
                rol = 1;
            }
        }
        return rol;
    }

    /**
     * Para mostrar el menu del administrador
     *
     * @return
     */
    public static int menuAdministrador() {
        int opcion;
        do {
            System.out.println();
            System.out.println("");
            System.out.println("********MENU CARCONNECT ADMINISTRADOR******");
            System.out.println("");
            System.out.println("1. Ver todas las peticiones");
            System.out.println("2. Eliminar todas las peticiones");
            System.out.println("3. Eliminar una peticion");
            System.out.println("4. Cerrar Sesion");
            System.out.println("5. Cerrar Programa");
            System.out.print("Introduce una opcion: ");
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion > 5 || opcion < 1) {
                System.out.println("Opcion no encontrada.");
            }
        } while (opcion > 5 || opcion < 1);
        return opcion;

    }

    /**
     * menu para mostrar usuario
     *
     * @return
     */
    public static int menuUsuario() {
        int opcion;
        do {
            System.out.println();
            System.out.println("");
            System.out.println("********MENU CARCONNECT ADMINISTRADOR******");
            System.out.println("");
            System.out.println("1. Insertar una petición");
            System.out.println("2. Ver mis peticiones");
            System.out.println("3. Cerrar Sesion");
            System.out.println("4. Cerrar Programa");
            System.out.println("5. Eliminar una de mis peticiones");
            System.out.print("Introduce una opcion: ");
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion > 5 || opcion < 1) {
                System.out.println("Opcion no encontrada.");
            }
        } while (opcion > 5 || opcion < 1);
        return opcion;

    }

    /**
     * metodo para eliminar una peticion de un usuario
     */
    public static void eliminarPeticionPropia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que peticion quieres borrar?");
        int posicion = sc.nextInt();
        sc.nextLine();
        peticiones[posicion - 1] = null;
        peticionesUser[posicion - 1] = null;

    }

    /**
     * metodo para escribir una petición
     *
     * @param user
     * @return
     */
    public static boolean escribirPeticion(String user) {
        boolean correcto = false;
        Scanner teclado = new Scanner(System.in);
        String pet;
        System.out.print("Introduce la peticion que desea para CarConnect: ");
        pet = teclado.nextLine();
        int contador = 0;
        for (int i = 0; i < peticiones.length; i++) {
            if (contador == 0) {
                if (peticiones[i] == null) {
                    peticiones[i] = pet;
                    peticionesUser[i] = user;
                    correcto = true;
                    contador++;
                }
            }

        }
        return correcto;
    }

    /**
     * metodo para ver mis peticiones
     *
     * @param user
     */
    public static void verMisPeticiones(String user) {
        int c = 0;
        for (int i = 0; i < peticiones.length; i++) {
            if (peticionesUser[i] == user) {
                c++;
            }
        }
        if (c != 0) {
            System.out.println("Tus peticiones de CarConnect");
            for (int i = 0; i < peticiones.length; i++) {
                if (peticionesUser[i] == user) {
                    System.out.println((i + 1) + ". " + peticiones[i]);
                }
            }
        } else {
            System.out.println("No hay peticiones");
        }
    }

    /**
     * metodo para imprimir las peticiones
     */
    public static void imprimirPeticiones() {
        int contador = 1;
        for (int i = 0; i < peticiones.length; i++) {
            if (peticiones[i] != null) {
                System.out.println(contador + ". " + peticiones[i]);
                contador++;
            }
        }
        if (contador == 1) {
            System.out.println("No hay peticiones");
        }
    }

    /**
     * metodo para poder eliminar todas las peticiones
     */
    public static void eliminarTodasPeticiones() {
        int contador = 1;
        for (int i = 0; i < peticiones.length; i++) {
            if (peticiones[i] != null) {
                peticiones[i] = null;
                peticionesUser[i] = null;
                contador++;
            }
        }
        if (contador == 1) {
            System.out.println("No hay peticiones");
        }
    }

    /**
     * metodo poara poder eliminar una peticion
     */
    public static void eliminarPeticion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que peticion quieres borrar?");
        int posicion = sc.nextInt();
        sc.nextLine();
        peticiones[posicion - 1] = null;
        peticionesUser[posicion - 1] = null;

    }

}
