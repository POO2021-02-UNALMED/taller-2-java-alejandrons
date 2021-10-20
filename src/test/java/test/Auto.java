
package test;


public class Auto {
    String modelo,marca;
    int precio,registro;
    Asiento[] asientos;
    Motor motor;
    static int cantidadCreados;
    
    int cantidadAsientos(){
        int cantidad = 0;
        for(Asiento a : asientos){
            if(a != null){
                cantidad++;
            }
        }
        return cantidad;
    }
    String verificarIntegridad(){
        for(Asiento a : asientos){
            if (a!= null){
                if(a.registro != registro){
                    return "Las piezas no son originales";
                }
            }
        }
        if(motor.registro != registro){
            return "Las piezas no son originales";
        }
        return "Auto original";
    }
}
