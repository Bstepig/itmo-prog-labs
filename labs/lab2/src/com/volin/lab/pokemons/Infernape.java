package com.volin.lab.pokemons;

import com.volin.lab.attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Infernape extends Pokemon {
    public Infernape() {
        super("Infernape", 1);
        this.setStats(76, 104, 71, 104, 71, 108);
        this.setType(Type.FIRE, Type.FIGHTING);
        this.setMove(new Swagger(), new Facade(), new SlackOff(), new StoneEdge());
    }
}