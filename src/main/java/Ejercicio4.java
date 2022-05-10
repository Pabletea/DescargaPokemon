public class Ejercicio4 {

    public Pokemon[] arrayPokemons = new Pokemon[0];

    public void iniciarEjercicio4() {
        System.out.println("Empezando el ej4");
        for (Pokemon pokemon : arrayPokemons) {
            System.out.println(pokemon);
        }
        Pokemon[] result = pokemonMasGordosQue(250);
        for(Pokemon pokemon : result){
            System.out.println(pokemon);
        }
    }

    public Pokemon[] pokemonMasGordosQue(Integer peso){
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i=0;
        for (Pokemon pokemon : arrayPokemons){
            if(pokemon.getWeight() > peso){
                out[i] = pokemon;
                i++;
            }
        }
        Pokemon[] out2 = new Pokemon[i];

        i=0;
        for(Pokemon pokemon:out){
            if(pokemon != null){
                out2[i]=pokemon;
                i++;

            }
        }
        System.out.println("Pokemons con mas peso:");
        return out2;
    }

    }
