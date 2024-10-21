import java.util.ArrayList;

public class PizzaQuadrada extends Pizza {
    final int lado;

    public PizzaQuadrada(ArrayList<CategoriasPizza> categorias, ArrayList<String> sabores, int min, int max, int lado) {
        super((double) lado * lado, categorias, sabores, min, max);
        this.validaTamanho(lado);
        this.lado = lado;
    }

    @Override
    double calculaArea() {
        return (double) lado * lado;
    }

}