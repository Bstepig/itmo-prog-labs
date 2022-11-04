package com.volin.lab.attacks;

import ru.ifmo.se.pokemon.*;

public class MudShot extends SpecialMove {
    public MudShot() {
        super(Type.GROUND, 55, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "использует Mud Shot";
    }
}