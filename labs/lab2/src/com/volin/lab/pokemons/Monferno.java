package com.volin.lab.pokemons;

import com.volin.lab.attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Monferno extends Pokemon {
    public Monferno() {
        super("Monferno", 49);
        this.setStats(64, 78, 52, 78, 52, 81);
        this.setType(Type.FIRE, Type.FIGHTING);
        this.setMove(new Swagger(), new Facade(), new SlackOff());
    }
}