package com.volin.lab.attacks;

import ru.ifmo.se.pokemon.*;

public class SludgeWave extends SpecialMove {
    public SludgeWave() {
        super(Type.POISON, 95, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.1).condition(Status.POISON);
        pokemon.setCondition(effect);
    }

    @Override
    protected String describe() {
        return "использует Sludge Wave";
    }
}