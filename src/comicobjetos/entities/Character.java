package comicobjetos.entities;

import comicobjetos.entities.Stats.SimpleStat;
import comicobjetos.entities.Stats.Stat;
import java.util.HashMap;
import java.util.Map;


public class Character extends ComicElement{
    private String name;
    private final Map<String, Stat> stats =  new HashMap<>();

    public final static float DEFAULT_VALUE=0;

    public Character(String alias){
        super(alias);
    }
    
    public Character(String alias, String name){
        super(alias);
        this.name = name;
    }
    
    public void addStat(String statName, Stat stat){
        stats.put(statName, stat);
    }
    
    public void addStat(String statName, float statValue){
        Stat aux =new SimpleStat(statValue);
        stats.put(statName, aux);
    }
    
    @Override
    public float getStat(String name){
        if(stats.containsKey(name))
            return stats.get(name).getValue();
        return DEFAULT_VALUE;
    }
    
    public Stat getRealStat(String name){
        if(stats.containsKey(name))
            return stats.get(name);
        return new SimpleStat(DEFAULT_VALUE);
    }

}

