package com.volin.lab.pokemons;

import com.volin.lab.attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wooper extends Pokemon {
    public Wooper() {
        super("Wooper", 8);
        this.setStats(55, 45, 45, 25, 25, 15);
        this.setType(Type.WATER, Type.GROUND);
        this.setMove(new WaterGun(), new SludgeWave(), new MudShot());
    }
}