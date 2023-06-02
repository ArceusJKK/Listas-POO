import java.util.HashMap;
import java.util.Map;

public class Pokedex {

 private Map<String, Pokemon> pokemons;
 public Pokedex(){
     this.pokemons = new HashMap<>();
 }
    public void adicionarPokemon(Pokemon pokemon) {
     String codigoIndetificador = pokemon.getCodigoIndetificador();
     this.pokemons.put(codigoIndetificador, pokemon);
    }
}
