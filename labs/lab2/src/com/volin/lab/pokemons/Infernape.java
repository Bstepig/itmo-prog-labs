package com.volin.lab.pokemons;

import com.volin.lab.attacks.*;
import ru.ifmo.se.pokemon.Type;

public class Infernape extends Monferno {
    public Infernape(String name, int level) {
        super(name, level);
        this.setStats(76, 104, 71, 104, 71, 108);
        this.setType(Type.FIRE, Type.FIGHTING);
        this.addMove(new StoneEdge());
    }
}