package com.volin.lab.pokemons;

import com.volin.lab.attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Quagsire extends Pokemon {
    public Quagsire() {
        super("Quagsire", 1);
        this.setStats(95, 85, 85, 65, 65, 35);
        this.setType(Type.WATER, Type.GROUND);
        this.setMove(new WaterGun(), new SludgeWave(), new MudShot(), new RockSlide());
    }
}