import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

        System.out.println("Test ganador realizado");

    }

    @Test

    public void pokemonMenosPeso(){

        Pokemon pokemon1= ObtenerPokemonRequest.Companion.get(5);

        Pokemon pokemon2= ObtenerPokemonRequest.Companion.get(4);

        Pokemon ganador = MainKt.pelea(pokemon1,pokemon2);

        Assertions.assertEquals(ganador,pokemon1);

        System.out.println("Test ganador 2 realizado");




    }

    @Test

    public void Empate(){

        Pokemon pokemon1 = ObtenerPokemonRequest.Companion.get(10);
        Pokemon pokemon2 = ObtenerPokemonRequest.Companion.get(10);

        Pokemon ganador = MainKt.pelea(pokemon1,pokemon2);

        Assertions.assertNull(ganador);

        System.out.println("Test empate realizado");




    }

    @Test
    public void PokemonInvalido(){

        Pokemon pokemon1 = ObtenerPokemonRequest.Companion.get(-1);
        Pokemon pokemon2 = ObtenerPokemonRequest.Companion.get(100);



        Assertions.assertThrows(PokemonInvalido.class, () -> MainKt.pelea(pokemon1,pokemon2));

        System.out.println("Test inválido completado");

    }



}
