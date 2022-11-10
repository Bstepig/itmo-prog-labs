package com.volin.lab.pokemons;

import com.volin.lab.attacks.*;
import ru.ifmo.se.pokemon.Type;

public class Quagsire extends Wooper {
    public Quagsire(String name, int level) {
        super(name, level);
        this.setStats(95, 85, 85, 65, 65, 35);
        this.setType(Type.WATER, Type.GROUND);
        this.addMove(new RockSlide());
    }
}