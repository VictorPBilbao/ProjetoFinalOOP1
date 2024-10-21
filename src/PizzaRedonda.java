import java.util.ArrayList;

public class PizzaRedonda extends Pizza {
    final int raio;

    public PizzaRedonda(ArrayList<CategoriasPizza> categorias, ArrayList<String> sabores, int min, int max, int raio) {
        super((double) raio * raio * Math.PI, categorias, sabores, min, max);
        this.validaTamanho(raio);
        this.raio = raio;
    }

    @Override
    double calculaArea() {
        return (double) raio * raio;
    }
}
