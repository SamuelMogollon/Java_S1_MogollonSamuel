
package fundacion;

import CONTROLADOR.registroControlador;
import VISTA.menuVista;


public class Fundacion {
    
    public static void main(String[] args) {

        registroControlador registro = new registroControlador();
        menuVista menu = new menuVista(registro);

        menu.iniciar();
    }
    
}
 