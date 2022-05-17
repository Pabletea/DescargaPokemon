public class Ejercicio4 {

    public Pokemon[] arrayPokemons = new Pokemon[0];

    public void iniciarEjercicio4() {
        System.out.println("Empezando el ej4");
        for (Pokemon pokemon : arrayPokemons) {
            System.out.println(pokemon);
        }
        Pokemon[] result = pokemonMasGordosQue(250);
        Pokemon[] result2 = getPokemonMenosGordo(250);
        System.out.println("Pokemons con mas peso:");
        for (Pokemon pokemon : result) {
            System.out.println(pokemon);
        }
        System.out.println("Pokemons con menos peso:");
        for (Pokemon pokemon : result2) {
            System.out.println(pokemon);
        }
        Pokemon [] result3 = getPokemonPesoEntre(500,200);
        System.out.println("Pokemons entre pesos");
        for (Pokemon pokemon : result3){
            System.out.println(pokemon);
        }
        Pokemon[] result4 = getPokemonNombreMasLargoQue(7);
        System.out.println("Pokemon con nombre mas largo que:");
        for (Pokemon pokemon : result4){
            System.out.println(pokemon);
        }
        Pokemon[] result5 = getPokemonNombreMasCortoQue(8);
        System.out.println("Pokemon mas corto que:");
        for(Pokemon pokemon : result5){
            System.out.println(pokemon);
        }
        Pokemon[] result6 = getPokemonQueContengaLasSiguientesLetras("iv");
        System.out.println("Pokemon que contiene las siguientes letras");
        for(Pokemon pokemon : result6){
            System.out.println(pokemon);
        }
    }

    public Pokemon[] pokemonMasGordosQue(Integer peso) {
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            if (pokemon.getWeight() > peso) {
                out[i] = pokemon;
                i++;
            }
        }
        Pokemon[] out2 = new Pokemon[i];

        i = 0;
        for (Pokemon pokemon : out) {
            if (pokemon != null) {
                out2[i] = pokemon;
                i++;

            }
        }

        return out2;
    }

    public Pokemon[] getPokemonMenosGordo(Integer peso) {
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            if (pokemon.getWeight() < peso) {
                out[i] = pokemon;
                i++;
            }
        }
        Pokemon[] out2 = new Pokemon[i];

        i = 0;
        for (Pokemon pokemon : out) {
            if (pokemon != null) {
                out2[i] = pokemon;
                i++;

            }
        }

        return out2;
    }

    public Pokemon[] getPokemonPesoEntre(Integer pesoMx, Integer pesoMn){
            Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            if (pokemon.getWeight() < pesoMx && pokemon.getWeight() > pesoMn) {
                out[i] = pokemon;
                i++;
            }
        }
        Pokemon[] out2 = new Pokemon[i];

        i = 0;
        for (Pokemon pokemon : out) {
            if (pokemon != null) {
                out2[i] = pokemon;
                i++;

            }
        }

        return out2;

    }
    public Pokemon[] getPokemonNombreMasLargoQue(int longitudDelTexto){

        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            String nombre = pokemon.getName();
            if (nombre.length() > longitudDelTexto) {
                out[i] = pokemon;
                i++;
            }
        }
        Pokemon[] out2 = new Pokemon[i];

        i = 0;
        for (Pokemon pokemon : out) {
            if (pokemon != null) {
                out2[i] = pokemon;
                i++;

            }
        }

        return out2;
    }
    public Pokemon[] getPokemonNombreMasCortoQue(int longitudDelTexto){

        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            String nombre = pokemon.getName();
            if (nombre.length() < longitudDelTexto) {
                out[i] = pokemon;
                i++;
            }
        }
        Pokemon[] out2 = new Pokemon[i];

        i = 0;
        for (Pokemon pokemon : out) {
            if (pokemon != null) {
                out2[i] = pokemon;
                i++;

            }
        }

        return out2;
    }
    public Pokemon[] getPokemonQueContengaLasSiguientesLetras(String letras){
        String[] letrasAr = letras.split("");
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i=0;
        for(Pokemon pokemon :arrayPokemons){
            for(i = 0;i <letras.length();i++){
                if(pokemon.getName().contains(letrasAr[i])){
                    out[i]=pokemon;
                }
            }

        }
        Pokemon[] out2= new Pokemon[i];
        i = 0;
        for (Pokemon pokemon : out) {
            if (pokemon != null) {
                out2[i] = pokemon;
                i++;

            }
        }

        return out2;


    }



}
