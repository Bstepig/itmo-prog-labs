package com.volin.lab.attacks;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        Status status = pokemon.getCondition();
        if (status == Status.BURN || status == Status.POISON || status == Status.PARALYZE) {
            super.applyOppDamage(pokemon, v * 2);
        } else {
            super.applyOppDamage(pokemon, v);
        }
    }
}