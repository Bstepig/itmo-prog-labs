package com.volin.lab.pokemons;

import com.volin.lab.attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Raikou extends Pokemon {
    public Raikou(String name, int level) {
        super(name, level);
        this.setStats(90, 85, 75, 115, 100, 115);
        this.setType(Type.ELECTRIC);
        this.setMove(new ThunderWave(), new DoubleTeam(), new ChargeBeam(), new QuickAttack());
    }
}