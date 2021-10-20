
package test;


public class Motor {
    int numeroCilindros, registro;
    String tipo;
    
    void cambiarRegistro(int registro){
        this.registro = registro;
    }
    void asignarTipo(String tipo){
        switch(tipo){
            case "electrico":
                this.tipo = tipo;
                break;
            case "gasolina":
                this.tipo = tipo;
                break;
        }
    }
}
