
package test;


public class Auto {
    String modelo,marca;
    int precio,registro;
    Asiento[] asientos;
    Motor motor;
    static int cantidadCreados;
    
    int cantidadAsientos(){
        return asientos.length;
    }
    String verificarIntegridad(){
        for(Asiento a : asientos){
            if(a.registro != motor.registro || a.registro != registro){
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}
