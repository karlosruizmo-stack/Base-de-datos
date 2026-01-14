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
public class Main {}
public boolean loguearUsuario(String nombre, String pass) {
    this.nombreEnSistema = nombre;
    this.passEnSistema = pass;
    for (int i = 0; i < userAIngresar; i++) {
        if (listaUser[i].getNombre().equals(nombre) && listaUser[i].getContraseña().equals(pass)) {
            return true;
        }
    }
    return false;
}

public int cantidadUsuarios() {

    if (loguearUsuario(nombreEnSistema, passEnSistema) == true) {
        this.cantidadDeUsuariosLogueados++;
    }
    return cantidadDeUsuariosLogueados;
}