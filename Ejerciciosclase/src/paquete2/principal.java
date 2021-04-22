
package paquete2;

import paquete1.InstitucionEducativa;

public class principal {
    public static void main(String[]args){
        InstitucionEducativa ie = new InstitucionEducativa();
        ie.establecerNombre("APC");
        ie.establecerTipoInstitucion("privada");
        ie.establecerNumAlumnos(1500);
        ie.establecerNumDocentes(50);
        ie.establecerNumSede(2);
        System.out.printf("%s - %s - %d - %d\n",ie.obtenerNombre(),
                ie.obtenerTipoInstitucion(),ie.obtenerNumAlumnos(),
                ie.obtenerNumDocentes(),ie.obtenerNumSede());
        
    }
    
    
}
