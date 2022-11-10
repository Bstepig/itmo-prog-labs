package com.volin.lab.pokemons;

import com.volin.lab.attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Chimchar extends Pokemon {
    public Chimchar(String name, int level) {
        super(name, level);
        this.setStats(44, 58, 44, 58, 44, 61);
        this.setType(Type.FIRE);
        this.setMove(new Swagger(), new Facade());
    }
}