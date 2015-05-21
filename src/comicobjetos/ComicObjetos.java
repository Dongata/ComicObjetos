/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Gaston
 */
public class ComicObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleStat val1= new SimpleStat(1);
        SimpleStat val100= new SimpleStat(100);
        
        Character flash = new Character("flash");
        
        flash.addStat("peso", 90);
        flash.addStat("fuerza", 900);
        flash.addStat("velocidad", 800000);
        flash.addStat("inteligencia", 50);
        flash.addStat("resistencia al fuego", new GreaterStat(flash.getRealStat("velocidad"), val100, flash.getRealStat("velocidad"), val1));
        flash.addStat("masa corporal", new DivideStat(flash.getRealStat("altura"), flash.getRealStat("peso")));
        flash.addStat("felicidad", new GreaterStat(flash.getRealStat("masa corporal"), new SimpleStat(0.8f), flash.getRealStat("altura"), flash.getRealStat("peso")));
        
        Character capitanFrio = new Character("capitan frio");
        
        capitanFrio.addStat("altura", 1.88f);
        capitanFrio.addStat("fuerza", 600);
        capitanFrio.addStat("velocidad", 48);
        capitanFrio.addStat("maldad", 50);
        capitanFrio.addStat("resistencia al fuego", new GreaterStat(capitanFrio.getRealStat("velocidad"), val100, capitanFrio.getRealStat("velocidad"), val1));
        capitanFrio.addStat("masa corporal", new DivideStat(capitanFrio.getRealStat("altura"), capitanFrio.getRealStat("peso")));
        
        Character superman = new Character("superman");
        
        superman.addStat("altura", 1.92f);
        superman.addStat("peso", 107);
        superman.addStat("fuerza", 2600);
        superman.addStat("velocidad", 1200);
        superman.addStat("resistencia al fuego", new GreaterStat(superman.getRealStat("velocidad"), val100, superman.getRealStat("velocidad"), val1));
        superman.addStat("masa corporal", new DivideStat(superman.getRealStat("altura"), superman.getRealStat("peso")));
        
        Character batman = new Character("batman");
        
        batman.addStat("altura", 1.89f);
        batman.addStat("peso", 96);
        batman.addStat("fuerza", 950);
        batman.addStat("inteligencia", 150);
        batman.addStat("resistencia al fuego", new GreaterStat(batman.getRealStat("velocidad"), val100, batman.getRealStat("velocidad"), val1));
        batman.addStat("masa corporal", new DivideStat(batman.getRealStat("altura"), batman.getRealStat("peso")));
        
        Character robin = new Character("robin");
        
        robin.addStat("altura", 1.75f);
        robin.addStat("peso", 65);
        robin.addStat("fuerza", 710);
        robin.addStat("velocidad", 160);
        robin.addStat("inteligencia", 100);
        robin.addStat("resistencia al fuego", new GreaterStat(robin.getRealStat("velocidad"), val100, robin.getRealStat("velocidad"), val1));
        robin.addStat("masa corporal", new DivideStat(robin.getRealStat("altura"), robin.getRealStat("peso")));
        
        Character guason = new Character("guason");
        
        guason.addStat("altura", 1.85f);
        guason.addStat("peso", 72);
        guason.addStat("velocidad", 60);
        guason.addStat("inteligencia", 150);
        guason.addStat("maldad", 100);
        guason.addStat("resistencia al fuego", new GreaterStat(guason.getRealStat("velocidad"), val100, guason.getRealStat("velocidad"), val1));
        guason.addStat("masa corporal", new DivideStat(guason.getRealStat("altura"), guason.getRealStat("peso")));
        guason.addStat("felicidad", new DivideStat(guason.getRealStat("maldad"), guason.getRealStat("masa corporal")));
        
        Character lexLuthor = new Character("lex luthor");
        
        lexLuthor.addStat("altura", 1.88f);
        lexLuthor.addStat("peso", 95);
        lexLuthor.addStat("fuerza", 1000);
        lexLuthor.addStat("velocidad", 70);
        lexLuthor.addStat("maldad", 75);
        lexLuthor.addStat("resistencia al fuego", new GreaterStat(lexLuthor.getRealStat("velocidad"), val100, lexLuthor.getRealStat("velocidad"), val1));
        lexLuthor.addStat("masa corporal", new DivideStat(lexLuthor.getRealStat("altura"), lexLuthor.getRealStat("peso")));
        
        Character gatubela = new Character("gatubela");
        
        gatubela.addStat("altura", 1.69f);
        gatubela.addStat("fuerza", 720);
        gatubela.addStat("velocidad", 90);
        gatubela.addStat("inteligencia", 150);
        gatubela.addStat("maldad", 25);
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
        
        ligaJusticia.addStatCalculator("fuerza", new SumGroupStat());
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
        
        Arena ciudadCentral = new Arena(flash, capitanFrio);
        ciudadCentral.addCriteria(new GreaterBattleCriteria("fuerza"));
        ciudadCentral.addCriteria(new GreaterBattleCriteria("velocidad"));
        ciudadCentral.addCriteria(new GreaterBattleCriteria("maldad"));
        System.out.println(ciudadCentral.battle().getAlias());
        
        Arena ciudadGotica = new Arena(duoDinamico, guason);
        ciudadGotica.addCriteria(new GreaterBattleCriteria("inteligencia"));
        ciudadGotica.addCriteria(new MinorBattleCriteria("masa corporal"));
        System.out.println(ciudadGotica.battle().getAlias());
        
        Arena metropolis = new Arena(ligaJusticia, ligaInjusticia);
        metropolis.addCriteria(new GreaterBattleCriteria("inteligencia"));
        metropolis.addCriteria(new GreaterBattleCriteria("velocidad"));
        metropolis.addCriteria(new GreaterBattleCriteria("fuerza"));
        System.out.println(metropolis.battle().getAlias());
        
        
        Sorter sorter =  new Sorter();
        
        
                
    }
}
