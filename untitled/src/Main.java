/**
 * Programa de acceso a base de datos
 *
 * Autor: Carlos Ruiz Montesinos
 *
 * Descripción:
 * Analiza un numero de nombres de usuario enlazado a su contraseña mediante scanner y verifica si esta dentro de los parametros de acceptación.
 *
 * Uso de try-catch:
 * El bloque try contiene el código que puede producir una excepción,
 * como errores de conexión o datos incorrectos.
 */
public class VerificacionAutomatizada {

    public static void main(String[] args) {

        // Base de datos simulada
        String[] usuarios = {"juan", "ana", "carlos"};
        int[] numeros = {101, 202, 303};
        String[] contraseñas = {"clave101", "clave202", "clave303"};

        Scanner sc = new Scanner(System.in);
        boolean acceso = false;

        // Bucle de intentos automatizado con for e i++
        for (int i = 1; i <= 3; i++) {
            try {
                System.out.println("\nIntento " + i + " de 3");

                System.out.print("Introduce nombre de usuario: ");
                String nombre = sc.nextLine();

                int posicion = -1;

                // Búsqueda automática del usuario
                for (int j = 0; j < usuarios.length; j++) {
                    if (usuarios[j].equals(nombre)) {
                        posicion = j;
                        break;
                    }
                }

                if (posicion == -1) {
                    System.out.println(" Usuario no encontrado");
                    continue;
                }

                System.out.print("Introduce número de usuario: ");
                int numero = Integer.parseInt(sc.nextLine());

                System.out.print("Introduce contraseña: ");
                String contraseña = sc.nextLine();

                if (numero == numeros[posicion] &&
                        contraseña.equals(contraseñas[posicion])) {

                    System.out.println("Acceso permitido");
                    acceso = true;
                    break;

                } else {
                    System.out.println(" Número o contraseña incorrectos");
                }

            } catch (Exception e) {
                System.out.println("Error en la introducción de datos");
            }
        }

        if (!acceso) {
            System.out.println(" Intentos agotados.");
        }

        sc.close();
    }
}

void main() {
}
