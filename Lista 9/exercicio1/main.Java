public class Main {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        pokedex.adicionarPokemon(new Pokemon("1", "Bulbasaur" , "Planta"));
        pokedex.adicionarPokemon(new Pokemon("4", "Charmander", "Fogo"));
        pokedex.adicionarPokemon(new Pokemon("8","Squirtle","Agua"));
    }
}
