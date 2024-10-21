import java.util.ArrayList;

abstract class Pizza {
    final double preco;
    final double area;
    final int minSize;
    final int maxSize;
    ArrayList<CategoriasPizza> categorias;
    ArrayList<String> sabores;

    protected Pizza(double area, ArrayList<CategoriasPizza> categorias, ArrayList<String> sabores, int min, int max) {
        this.minSize = min;
        this.maxSize = max;
        this.area = area;
        this.categorias = categorias;
        this.sabores = sabores;
        this.preco = calculaPreco();
    }

    abstract double calculaArea();

    protected void validaTamanho(int tamanho) {
        if (tamanho < this.minSize || tamanho > this.maxSize) {
            throw new IllegalArgumentException(
                    "O número informado deve ser maior que " + this.minSize + " e menor que " + this.maxSize);
        }
    }

    protected double calculaPreco() {
        double precoTotal = 0;
        double areaPorSabor = this.area / this.sabores.size();
        for (CategoriasPizza categoria : categorias) {
            precoTotal += areaPorSabor * categoria.valor;
        }
        return precoTotal;
    }
}