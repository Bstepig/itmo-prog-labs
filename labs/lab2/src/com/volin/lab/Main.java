package com.volin.lab;

import com.volin.lab.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
	public static void main(String[] args) {
		Battle b = new Battle();
		Pokemon ally1 = new Raikou("Рэйчэл", 1);
		Pokemon ally2 = new Wooper("Вупсень", 8);
		Pokemon ally3 = new Quagsire("Козырь", 1);
		Pokemon foe1 = new Chimchar("Чим Символ", 31);
		Pokemon foe2 = new Monferno("Монза Феррари", 49);
		Pokemon foe3 = new Infernape("Верный Эйп", 1);
		b.addAlly(ally1);
		b.addAlly(ally2);
		b.addAlly(ally3);
		b.addFoe(foe1);
		b.addFoe(foe2);
		b.addFoe(foe3);
		b.go();
	}
}