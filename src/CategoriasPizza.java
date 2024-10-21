public enum CategoriasPizza {
    NORMAL(0.5),
    ESPECIAL(0.75),
    PREMIUM(1.0);

    @SuppressWarnings("unused")
    protected final double valor;

    CategoriasPizza(double valor) {
        this.valor = valor;
    }
}
