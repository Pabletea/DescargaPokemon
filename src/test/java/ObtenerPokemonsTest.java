import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObtenerPokemonsTest {



    @Test
    public void probarPokemonExceptionRed(){
        // TODO que se lanza la exception correcta
        Assertions.assertThrows(ObtenerPokemonsRequest.ExceptionEnRed.class,() -> ObtenerPokemonsRequest.Companion.get(-1,1));

    }

    @Test
    public void probarPokemonExceptionID(){
        // TODO que se lanza la exception correcta
        Assertions.assertThrows(ObtenerPokemonsRequest.ExceptionEnId.class, () -> ObtenerPokemonsRequest.Companion.get(2,1));


    }

    @Test
    public void probarPokemon1A10Devuelve10Pokemon(){
        // TODO Realiza lo mismo que el ejercicio anterior pero para un rango de Pokémons que van desde el 140 al 150.
        //  Estos números deberían poder cambiar fácilmente
        int minId = 1;
        int maxId = 10;
        Pokemon[] array = ObtenerPokemonsRequest.Companion.get(1,10);

        for(Pokemon poke : array)
            System.out.println(poke.getName());





    }

    @Test
    public void probarPokemon140A150NombreEId(){
        // TODO Realiza lo mismo que el ejercicio anterior pero para un rango de Pokémons que van desde el 140 al 150.
        //  Estos números deberían poder cambiar fácilmente
        int minId = 140;
        int maxId = 150;


        Pokemon[] array = ObtenerPokemonsRequest.Companion.get(140,150);

        for(Pokemon poke : array){
            Pokemon pokemon = ObtenerPokemonRequest.Companion.get(minId);
            System.out.println(poke.getName());
            Assertions.assertEquals(poke.getName(),pokemon.getName());
            minId++;

        }
    }
}
