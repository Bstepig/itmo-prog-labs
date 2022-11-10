package com.volin.lab.pokemons;

import com.volin.lab.attacks.*;
import ru.ifmo.se.pokemon.Type;

public class Monferno extends Chimchar {
    public Monferno(String name, int level) {
        super(name, level);
        this.setStats(64, 78, 52, 78, 52, 81);
        this.setType(Type.FIRE, Type.FIGHTING);
        this.addMove(new SlackOff());
    }
}