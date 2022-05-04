import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MainTest {

    // TODO realiza los test que consideres necesarios para comprobar que la función "pelea()" a la que le entran 2
    //  argumentos (pokemon1 y un pokemon2) ubicada en main funciona correctamente. El comportamiento esperado es que
    //  el pokémon más gordo ganará, es decir, la función devuelve al pokémon más gordo. En caso de empate (ambos pesan
    //  lo mismo) entonces la función devuelve null. En caso de que alguno de los pokémon sea null, entonces devolverá
    //  una "exception" de la clase "PokemonInvalido"
    @Test
    public void pokemonMasPeso(){

        Pokemon pokemon1 = ObtenerPokemonRequest.Companion.get(4);

        Pokemon pokemon2 = ObtenerPokemonRequest.Companion.get(5);


        Pokemon ganador = MainKt.pelea(pokemon1,pokemon2);

        Assertions.assertEquals(ganador,pokemon2);

    }

    @Test

    public

}
