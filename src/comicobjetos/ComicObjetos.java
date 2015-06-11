package comicobjetos;

import comicobjetos.entities.Character;
import comicobjetos.entities.*;
import comicobjetos.entities.Stats.DivideStat;
import comicobjetos.entities.Stats.GreaterStat;
import comicobjetos.entities.Stats.SimpleStat;
import comicobjetos.entities.groupstats.AverageGroupStat;
import comicobjetos.entities.groupstats.GreaterGroupStat;
import comicobjetos.entities.groupstats.MinorGroupStat;
import comicobjetos.entities.groupstats.SumGroupStat;
import java.util.ArrayList;
import java.util.List;


public class ComicObjetos {


    public static void main(String[] args) {


        SimpleStat val1= new SimpleStat(1);
        SimpleStat val100= new SimpleStat(100);

        Character flash = new Character("flash");

        flash.addStat("peso", new SimpleStat(90));
        flash.addStat("fuerza", new SimpleStat(900));
        flash.addStat("velocidad", new SimpleStat(800000));
        flash.addStat("inteligencia", new SimpleStat(50));
        flash.addStat("resistencia al fuego", new GreaterStat(flash.getRealStat("velocidad"), val100, flash.getRealStat("velocidad"), val1));
        flash.addStat("masa corporal", new DivideStat(flash.getRealStat("altura"), flash.getRealStat("peso")));
        flash.addStat("felicidad", new GreaterStat(flash.getRealStat("masa corporal"), new SimpleStat(0.8f), flash.getRealStat("altura"), flash.getRealStat("peso")));

        Character capitanFrio = new Character("capitan frio");

        capitanFrio.addStat("altura", new SimpleStat(1.88f));
        capitanFrio.addStat("fuerza", new SimpleStat(600));
        capitanFrio.addStat("velocidad", new SimpleStat(48));
        capitanFrio.addStat("maldad", new SimpleStat(50));
        capitanFrio.addStat("resistencia al fuego", new GreaterStat(capitanFrio.getRealStat("velocidad"), val100, capitanFrio.getRealStat("velocidad"), val1));
        capitanFrio.addStat("masa corporal", new DivideStat(capitanFrio.getRealStat("altura"), capitanFrio.getRealStat("peso")));

        Character superman = new Character("superman");

        superman.addStat("altura", new SimpleStat(1.92f));
        superman.addStat("peso", new SimpleStat(107));
        superman.addStat("fuerza", new SimpleStat(2600));
        superman.addStat("velocidad", new SimpleStat(1200));
        superman.addStat("resistencia al fuego", new GreaterStat(superman.getRealStat("velocidad"), val100, superman.getRealStat("velocidad"), val1));
        superman.addStat("masa corporal", new DivideStat(superman.getRealStat("altura"), superman.getRealStat("peso")));

        Character batman = new Character("batman");

        batman.addStat("altura", new SimpleStat(1.89f));
        batman.addStat("peso", new SimpleStat(96));
        batman.addStat("fuerza", new SimpleStat(950));
        batman.addStat("inteligencia", new SimpleStat(150));
        batman.addStat("resistencia al fuego", new GreaterStat(batman.getRealStat("velocidad"), val100, batman.getRealStat("velocidad"), val1));
        batman.addStat("masa corporal", new DivideStat(batman.getRealStat("altura"), batman.getRealStat("peso")));

        Character robin = new Character("robin");

        robin.addStat("altura", new SimpleStat(1.75f));
        robin.addStat("peso", new SimpleStat(65));
        robin.addStat("fuerza", new SimpleStat(710));
        robin.addStat("velocidad", new SimpleStat(60));
        robin.addStat("inteligencia", new SimpleStat(100));
        robin.addStat("resistencia al fuego", new GreaterStat(robin.getRealStat("velocidad"), val100, robin.getRealStat("velocidad"), val1));
        robin.addStat("masa corporal", new DivideStat(robin.getRealStat("altura"), robin.getRealStat("peso")));

        Character guason = new Character("guason");

        guason.addStat("altura", new SimpleStat(1.85f));
        guason.addStat("peso", new SimpleStat(72));
        guason.addStat("velocidad", new SimpleStat(60));
        guason.addStat("inteligencia", new SimpleStat(150));
        guason.addStat("maldad", new SimpleStat(100));
        guason.addStat("resistencia al fuego", new GreaterStat(guason.getRealStat("velocidad"), val100, guason.getRealStat("velocidad"), val1));
        guason.addStat("masa corporal", new DivideStat(guason.getRealStat("altura"), guason.getRealStat("peso")));
        guason.addStat("felicidad", new DivideStat(guason.getRealStat("maldad"), guason.getRealStat("masa corporal")));

        Character lexLuthor = new Character("lex luthor");

        lexLuthor.addStat("altura", new SimpleStat(1.88f));
        lexLuthor.addStat("peso", new SimpleStat(95));
        lexLuthor.addStat("fuerza", new SimpleStat(1000));
        lexLuthor.addStat("velocidad", new SimpleStat(70));
        lexLuthor.addStat("maldad", new SimpleStat(75));
        lexLuthor.addStat("resistencia al fuego", new GreaterStat(lexLuthor.getRealStat("velocidad"), val100, lexLuthor.getRealStat("velocidad"), val1));
        lexLuthor.addStat("masa corporal", new DivideStat(lexLuthor.getRealStat("altura"), lexLuthor.getRealStat("peso")));

        Character gatubela = new Character("gatubela");

        gatubela.addStat("altura", new SimpleStat(1.69f));
        gatubela.addStat("fuerza", new SimpleStat(720));
        gatubela.addStat("velocidad", new SimpleStat(90));
        gatubela.addStat("inteligencia", new SimpleStat(150));
        gatubela.addStat("maldad", new SimpleStat(25));
        gatubela.addStat("resistencia al fuego", new GreaterStat(gatubela.getRealStat("velocidad"), val100, gatubela.getRealStat("velocidad"), val1));
        gatubela.addStat("masa corporal", new DivideStat(gatubela.getRealStat("altura"), gatubela.getRealStat("peso")));

        Group duoDinamico = new Group("duo dinamico");

        duoDinamico.addComicElement(robin);
        duoDinamico.addComicElement(batman);

        duoDinamico.addStatCalculator("fuerza", new SumGroupStat());
        duoDinamico.addStatCalculator("velocidad", new MinorGroupStat());
        duoDinamico.addStatCalculator("inteligencia", new GreaterGroupStat());
        duoDinamico.setDefaultCalculation(new AverageGroupStat());

        Group ligaJusticia = new Group("liga justicia");

        ligaJusticia.addComicElement(duoDinamico);
        ligaJusticia.addComicElement(superman);
        ligaJusticia.addComicElement(flash);

        ligaJusticia.addStatCalculator("fuerza", new AverageGroupStat());
        ligaJusticia.addStatCalculator("velocidad", new MinorGroupStat());
        ligaJusticia.addStatCalculator("inteligencia", new GreaterGroupStat());
        ligaJusticia.setDefaultCalculation(new SumGroupStat());

        Group ligaInjusticia = new Group("liga injusticia");

        ligaInjusticia.addComicElement(capitanFrio);
        ligaInjusticia.addComicElement(guason);
        ligaInjusticia.addComicElement(lexLuthor);
        ligaInjusticia.addComicElement(gatubela);

        ligaInjusticia.addStatCalculator("fuerza", new AverageGroupStat());
        ligaInjusticia.addStatCalculator("velocidad", new MinorGroupStat());
        ligaInjusticia.addStatCalculator("maldad", new SumGroupStat());
        ligaInjusticia.setDefaultCalculation(new GreaterGroupStat());

        Arena arena = new Arena();
        arena.addPlayer(flash);
        arena.addPlayer(capitanFrio);
        arena.addPlayer(superman);
        arena.addPlayer(batman);
        arena.addPlayer(robin);
        arena.addPlayer(guason);
        arena.addPlayer(lexLuthor);
        arena.addPlayer(gatubela);
        arena.addPlayer(duoDinamico);
        arena.addPlayer(ligaJusticia);
        arena.addPlayer(ligaInjusticia);

        ///////////////////////////////Batallas/////////////////////////////////

        BattleCriteria criteriosFlashCapitanFrio = new GreaterBattleCriteria("fuerza", new GreaterBattleCriteria("velocidad", new GreaterBattleCriteria("maldad")));
        System.out.println(arena.battle(flash, capitanFrio, criteriosFlashCapitanFrio).getAlias());

        BattleCriteria criteriosDuoDinamicoGuason = new GreaterBattleCriteria("inteligencia", new MinorBattleCriteria("masa corporal"));
        System.out.println(arena.battle(duoDinamico, guason, criteriosDuoDinamicoGuason).getAlias());

        BattleCriteria criteriosLigaJusticiaLigaInjusticia = new GreaterBattleCriteria("inteligencia", new GreaterBattleCriteria("velocidad", new GreaterBattleCriteria("fuerza")));
        System.out.println(arena.battle(ligaJusticia, ligaInjusticia, criteriosLigaJusticiaLigaInjusticia).getAlias());

        ///////////////////////Ordenamientos y Mejores//////////////////////////

        List<ComicElement> arenaOrdenada1 = new ArrayList<>();
        List<ComicElement> arenaOrdenada2 = new ArrayList<>();
        List<ComicElement> mejores1 = new ArrayList<>();
        List<ComicElement> mejores2 = new ArrayList<>();
        List<ComicElement> mejores3 = new ArrayList<>();
        List<ComicElement> mejores4 = new ArrayList<>();

        BattleCriteria criteriosOrdenamiento1 = new MinorBattleCriteria("velocidad");
        arenaOrdenada1 = arena.sort(criteriosOrdenamiento1);
        System.out.println("Lista ordenada por velocidad descendente:");
        imprimir(arenaOrdenada1);
        mejores1 = arena.battle(criteriosOrdenamiento1);

        BattleCriteria criteriosOrdenamiento2 = new MinorBattleCriteria("maldad", new GreaterBattleCriteria("fuerza"));
        arenaOrdenada2 = arena.sort(criteriosOrdenamiento2);  
        System.out.println("Lista ordenada por maldad descendente / fuerza ascendente:");
        imprimir(arenaOrdenada2);
        mejores2 = arena.battle(criteriosOrdenamiento2);

        BattleCriteria criteriosOrdenamiento3 = new MinorBattleCriteria("inteligencia");
        mejores3 = arena.battle(criteriosOrdenamiento3);

        BattleCriteria criteriosOrdenamiento4 = new MinorBattleCriteria("inteligencia", new GreaterBattleCriteria("velocidad"));
        mejores4 = arena.battle(criteriosOrdenamiento4);

        System.out.println("Mejores: ");
        imprimir(mejores1);
        imprimir(mejores2);
        imprimir(mejores3);
        imprimir(mejores4);
    }


    public static void imprimir(List<ComicElement> lista){
        if(!lista.isEmpty()){
            for (ComicElement ce : lista) {
                System.out.print(ce.getAlias() + " - ");
            }
            System.out.println("");
        }
    }

}