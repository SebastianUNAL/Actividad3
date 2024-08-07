package work.parte2;

public class Cuadrado {
    int lado;
    public Cuadrado(int W) {
        lado = W;
    }
    double calcArea() {
        return lado * lado;
    }
    double calcPerimetro() {
        return (4 * lado);
}
}