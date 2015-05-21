package comicobjetos.entities;

import comicobjetos.entities.Stats.SimpleStat;
import comicobjetos.entities.Stats.Stat;
import java.util.HashMap;


public class Character extends ComicElement{
    private String name;
    private HashMap<String, Stat> stats;

    public final static float DEFAULT_VALUE=0;

    public Character(String alias){
        this.alias=alias;
    }
    
    public void addStat(String statName, Stat stat){
        stats.put(statName, stat);
    }
    
    public void addStat(String statName, float statValue){
        stats.put(statName, new SimpleStat(statValue));
    }
    
    @Override
    public float getStat(String name){
        if(stats.containsKey(name))
            return stats.get(name).getValue();
        return DEFAULT_VALUE;
    }

}

