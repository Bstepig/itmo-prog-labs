package com.volin.lab.attacks;

import ru.ifmo.se.pokemon.*;

public class SlackOff extends StatusMove {
    public SlackOff() {
        super(Type.NORMAL, 0.0, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        int halfHP = (int)(pokemon.getStat(Stat.HP) * 0.5);
        if (pokemon.getHP() < halfHP) {
            pokemon.setMod(Stat.HP, halfHP);
        }
    }

    @Override
    protected String describe() {
        return "использует Slack Off";
    }

}