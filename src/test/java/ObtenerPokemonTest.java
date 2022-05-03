import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObtenerPokemonTest {

    @Test
    public void ejemplo(){
        Pokemon bulbasaur = ObtenerPokemonRequest.Companion.get(1);
        System.out.println(bulbasaur);
        Pokemon ivysaur = ObtenerPokemonRequest.Companion.get("bulbasaur");
        System.out.println(ivysaur);
    }


    @Test
    public void probarPokemon3Nombre(){
        // TODO Comprueba que al preguntar por Pokémon con id 3 obtienes a venasaur.
        Pokemon bulbasaur = ObtenerPokemonRequest.Companion.get(1);
        System.out.println(bulbasaur);
        Pokemon ivysaur = ObtenerPokemonRequest.Companion.get("bulbasaur");
        System.out.println(ivysaur);
    }

    @Test
    public void probarPokemon3Id(){
        // TODO Comprueba que al preguntar por Pokémon con venasaur obtienes el id 2.
        Pokemon pokemon3 = ObtenerPokemonRequest.Companion.get("venusaur");
        Assertions.assertEquals(pokemon3.getId(),3);
        System.out.println("Test id completado");
    }

    @Test
    public void probarPokemon3Peso(){
        // TODO Comprueba que al preguntar por Pokémon con 3 obtienes el peso de 1000.
        Pokemon pokemon4 = ObtenerPokemonRequest.Companion.get(3);
        Assertions.assertEquals(pokemon4.getWeight(),1000);
        System.out.println("Test peso completado");
    }

    @Test
    public void probarPokemon3Altura(){
        // TODO Comprueba que al preguntar por Pokémon con 3 obtienes la altura de 20.
        Pokemon pokemon5 = ObtenerPokemonRequest.Companion.get(3);
        Assertions.assertEquals(pokemon5.getHeight(),20);
        System.out.println("Test altura realizado");
    }

    @Test
    public void probarPokemon4a6(){
        // TODO Comprueba que los Pokémon (id = 4, id = 5, id = 6) obtienes a charmander, charmeleon y charizard.
        Pokemon pokemon01 = ObtenerPokemonRequest.Companion.get(4);
        Pokemon pokemon02 = ObtenerPokemonRequest.Companion.get(5);
        Pokemon pokemon03 = ObtenerPokemonRequest.Companion.get(6);

        Assertions.assertEquals(pokemon01.getName(),"charmander");
        Assertions.assertEquals(pokemon02.getName(),"charmeleon");
        Assertions.assertEquals(pokemon03.getName(),"charizard");
    }

    @Test
    public void probarPokemon25NombreEId(){
        // TODO Comprueba que cuando descargas un Pokémon con el id 25 obtienes un nombre, si descargas ese Pokémon por nombre obtienes un id.
        //  Comprueba que ambos Pokémon coinciden (el que has obtenido mediante el nombre y el que has obtenido mediante el id).
    }

    @Test
    public void probarPokemon140A150NombreEId(){
        // TODO Realiza lo mismo que el ejercicio anterior pero para un rango de Pokémons que van desde el 140 al 150.
        //  Estos números deberían poder cambiar fácilmente
        int minId = 140;
        int maxId = 150;

    }

}
