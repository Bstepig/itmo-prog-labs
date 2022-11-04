package com.volin.lab;

import com.volin.lab.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
	public static void main(String[] args) {
		Battle b = new Battle();
		Pokemon ally1 = new Raikou();
		Pokemon ally2 = new Wooper();
		Pokemon ally3 = new Quagsire();
		Pokemon foe1 = new Chimchar();
		Pokemon foe2 = new Monferno();
		Pokemon foe3 = new Infernape();
		b.addAlly(ally1);
		b.addAlly(ally2);
		b.addAlly(ally3);
		b.addFoe(foe1);
		b.addFoe(foe2);
		b.addFoe(foe3);
		b.go();
	}
}