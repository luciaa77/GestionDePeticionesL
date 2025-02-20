package gestiónpeticiones;

import java.util.Scanner;

/**
 * Programa para pedir peticiones o hacer pregutnas a un concesionario de coches
 *
 * @author Lucia Cuadrado
 */
public class GestiónPeticiones {

    public static void main(String[] args) {
        int rol = -1;
        String user = null;
        boolean terminado = true;
        while (terminado) {
            do {

                if (user == null) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Introduce el nombre de usuario: ");
                    user = sc.nextLine();
                    rol = modelo.Metodos.login(user);
                }
                if (rol == 0) {
                    System.out.println("Usuario o contraseña invalido");
                } else if (rol == 1) {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Has accedido como usuario de CarConnect");
                    System.out.println();
                    System.out.println("___________________________");

                    int opu = modelo.Metodos.menuUsuario();

                    if (opu == 1) {
                        System.out.println();
                        boolean correcto = modelo.Metodos.escribirPeticion(user);
                        if (correcto) {
                            System.out.println("Peticion insertada correctamente");
                        } else {
                            System.out.println("Ha ocurrido un error.");
                        }
                    } else if (opu == 2) {
                        System.out.println();
                        modelo.Metodos.verMisPeticiones(user);
                    } else if (opu == 3) {
                        user = null;
                        rol = 0;
                        System.out.println("Has cerrado sesion...");
                        System.out.println();
                    } else if (opu == 4) {
                        terminado = false;
                    } else if (opu == 5) {
                        System.out.println();
                        modelo.Metodos.verMisPeticiones(user);
                        modelo.Metodos.eliminarPeticionPropia();
                    }

                } else if (rol == 2) {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Has accedido como administrador de CarConnect");
                    System.out.println();
                    System.out.println("___________________________");

                    int opa = modelo.Metodos.menuAdministrador();
                    if (opa == 1) {
                        System.out.println();
                        modelo.Metodos.imprimirPeticiones();
                    } else if (opa == 2) {
                        System.out.println();
                        modelo.Metodos.eliminarTodasPeticiones();
                    } else if (opa == 3) {
                        System.out.println();
                        modelo.Metodos.imprimirPeticiones();
                        modelo.Metodos.eliminarPeticion();
                    } else if (opa == 4) {
                        user = null;
                        rol = 0;
                        System.out.println("Has cerrado sesion...");
                        System.out.println();
                    } else if (opa == 5) {
                        terminado = false;
                    }

                }

            } while (rol == 0);
        }
    }

}
