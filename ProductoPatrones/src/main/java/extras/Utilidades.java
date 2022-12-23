package extras;

public class Utilidades {

    public static boolean validarRango(int limiteInferior, int limiteSuperior, int numeroIncluido) {
        boolean estado = numeroIncluido >= limiteInferior && numeroIncluido <= limiteSuperior;
        
        if (!estado) System.out.println("La opción que ha digitado no se encuentra, intente nuevamente.");
        return estado;
    }
    
    public static Integer generarNumeroAleatorioConRango(Integer limiteInferior, Integer limiteSuperior) {
        return (int)(Math.random() * (limiteSuperior - limiteInferior + 1)) + limiteInferior;
    }
}
