import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        HashMap<String, CategoriasPizza> dicionarioCategorias = new HashMap<>();
        setaSabores(dicionarioCategorias);

        // * Cria uma pizzaQuadrada de 2 sabores
        ArrayList<CategoriasPizza> categorias = new ArrayList<>();
        categorias.add(dicionarioCategorias.get("Mussarela"));
        categorias.add(dicionarioCategorias.get("Portuguesa"));
        ArrayList<String> sabores = new ArrayList<>();
        sabores.add("Mussarela");
        sabores.add("Portuguesa");
        PizzaQuadrada pizzaQuadrada = new PizzaQuadrada(categorias, sabores, 10, 40, 20);

        System.out.println(pizzaQuadrada.preco);

        Scanner scanner = new Scanner(System.in);

        scanner.close();

    }

    public static void setaSabores(HashMap<String, CategoriasPizza> dicionarioCategorias) {
        dicionarioCategorias.put("Mussarela", CategoriasPizza.NORMAL);
        dicionarioCategorias.put("Calabresa", CategoriasPizza.NORMAL);
        dicionarioCategorias.put("Portuguesa", CategoriasPizza.ESPECIAL);
        dicionarioCategorias.put("Frango com Catupiry", CategoriasPizza.ESPECIAL);
        dicionarioCategorias.put("Camarao", CategoriasPizza.PREMIUM);
        dicionarioCategorias.put("File Mignon", CategoriasPizza.PREMIUM);
    }
}