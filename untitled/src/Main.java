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
public static int usuario(String[] user, String nom){
    Scanner sc = new Scanner(System.in);
    nom = sc.nextLine();
    for(int i = 0; i < user.length; i++){{
    if(user[i].equals(nom)){
    return i;

    }
    }
    return -1;
    }
    public class int password(String[]contrasenia, String verificarcontraseña,int posición)
    static void main(String[]args) {
        String [] user = ("JohnPork""JefreyEpstein""ClaraMente""DiegoSilva""JorDih""KikoRivera")
        String [] contraseña ("Sori""Mambo""Kilok""")
        posición = 0;
        String Main;
        while(IngresaUser);
        System.out.print("Ingresa el nombre del usuario: ");
        posición=usuario(user, nom);
        if (posicion =-1){
            System.out.println("No existe el usuario");

        }
    }
}

void main() {
}
