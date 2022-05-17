import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio4Test {

    static Ejercicio4 ej;

    @BeforeAll
    static void firstInit() {
        System.out.println("firstInit");
        ej = new Ejercicio4();
        ej.arrayPokemons = ObtenerPokemonsRequest.Companion.get(1,9);
    }


    @BeforeEach
    void setUp() {
        System.out.println("setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }


    @Test
    void pokemonMasGordosQue() {
        Pokemon[] pokemonEsperados = {
                new Pokemon(20, 3, "venusaur", 1000),
                new Pokemon(17, 6, "charizard", 905),
                new Pokemon(16, 9, "blastoise", 855)
        };
        Pokemon[] pokemonActuales = ej.pokemonMasGordosQue(250);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }
    @Test
    void pokemonMasGordosQue02() {
        Pokemon[] pokemonEsperados = {};
        Pokemon[] pokemonActuales = ej.pokemonMasGordosQue(1000000000);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }

    @Test
    void pokemonsMasGordosQue03(){
        Pokemon[] pokemonEsperados = ej.arrayPokemons;
        Pokemon[] pokemonActuales = ej.pokemonMasGordosQue(0);
        Assertions.assertArrayEquals(pokemonEsperados,pokemonActuales);


    }

    @Test
    void pokemonsMenosGordosQue01(){
        Pokemon[] pokemonEsperados ={
                new Pokemon(7, 1, "bulbasaur", 69),
                new Pokemon(10, 2, "ivysaur", 130),
                new Pokemon(6, 4, "charmander", 85),
                new Pokemon(11, 5, "charmeleon", 190),
                new Pokemon(5, 7, "squirtle", 90),
                new Pokemon(10, 8, "wartortle", 225)
        };
        Pokemon[] pokemonActuales = ej.getPokemonMenosGordo(250);
        Assertions.assertArrayEquals(pokemonEsperados,pokemonActuales);


    }
    @Test
    void pokemonsMenosGordosQue02(){
        Pokemon[] pokemonEsperados ={};
        Pokemon[] pokemonActuales = ej.getPokemonMenosGordo(0);
        Assertions.assertArrayEquals(pokemonEsperados,pokemonActuales);


    }
    @Test
    void pokemonsMenosGordosQue03(){
        Pokemon[] pokemonEsperados = ej.arrayPokemons;
        Pokemon[] pokemonActuales = ej.getPokemonMenosGordo(100000);
        Assertions.assertArrayEquals(pokemonEsperados,pokemonActuales);


    }
    @Test
    void pokemonsEntrePeso(){
        Pokemon[] pokemonEsperados = {};
        Pokemon[] pokemonActuales = ej.getPokemonPesoEntre(0,0);
        Assertions.assertArrayEquals(pokemonEsperados,pokemonActuales);


    }
    @Test
    void pokemonsEntrePeso02(){
        Pokemon[] pokemonEsperados = ej.arrayPokemons;
        Pokemon[] pokemonActuales = ej.getPokemonPesoEntre(100000,0);
        Assertions.assertArrayEquals(pokemonEsperados,pokemonActuales);

    }
    @Test
    void pokemonsEntrePeso03(){
        Pokemon[] pokemonEsperados = null;
        Pokemon[] pokemonActuales = ej.getPokemonPesoEntre(0,-1);
        Assertions.assertArrayEquals(pokemonEsperados,pokemonActuales);
    }
    @Test
    void pokemonsNombreMasLargoQue(){
        Pokemon[] pokemonEsperados = null;
        Pokemon[] pokemonActuales = ej.getPokemonNombreMasLargoQue(-1);
        Assertions.assertArrayEquals(pokemonEsperados,pokemonActuales);
    }
    @Test
    void pokemonsNombreMasLargoQue02(){
        Pokemon[] pokemonEsperados = ej.arrayPokemons;
        Pokemon[] pokemonActuales = ej.getPokemonNombreMasLargoQue(0);
        Assertions.assertArrayEquals(pokemonEsperados,pokemonActuales);
    }
    @Test
    void pokemonsNombreMasLargoQue03(){
        Pokemon[] pokemonEsperados = {};
        Pokemon[] pokemonActuales = ej.getPokemonNombreMasLargoQue(10000000);
        Assertions.assertArrayEquals(pokemonEsperados,pokemonActuales);
    }



    @Test
    void getPokemonQueContengaLasSiguientesLetras() {
        Pokemon[] pokemonEsperados = {
                new Pokemon(7, 1, "bulbasaur", 69),
                new Pokemon(10, 2, "ivysaur", 130),
                new Pokemon(20, 3, "venusaur", 1000)
        };
        Pokemon[] pokemonActuales = ej.getPokemonQueContengaLasSiguientesLetras("saur");
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }
    @Test
    void getPokemonQueContengaLasSiguientesLetras02() {
        Pokemon[] pokemonEsperados = {};
        Pokemon[] pokemonActuales = ej.getPokemonQueContengaLasSiguientesLetras("");
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }


}