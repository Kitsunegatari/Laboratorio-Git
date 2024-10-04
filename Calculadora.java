public class Calculadora{
    public double x,y,resultado;

    public Calculadora(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double suma(double x, double y){
        resultado = x + y;
        return resultado;
    }
    public double division(double x, double y){
        resultado = x / y;
        return resultado;
    }
    public double resta(double x, double y){
        resultado = x - y;
        return resultado;
    }
    public double multiplicacion(double x, double y){
        resultado = x * y;
        return resultado;
    }
    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora(0, 0);
        System.out.println(miCalculadora.suma(1, 2));
        System.out.println(miCalculadora.resta(3, 4));
        System.out.println(miCalculadora.multiplicacion(5, 6));
        System.out.println(miCalculadora.division(7, 8));
    }
}