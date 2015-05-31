package comicobjetos.entities;

import comicobjetos.entities.groupstats.GreaterGroupStat;
import comicobjetos.entities.groupstats.GroupStatCalculator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Group extends ComicElement
{
    private final List<ComicElement> elements = new ArrayList<>();
    private GroupStatCalculator defaultCalculation =  new GreaterGroupStat();
    private final Map<String,GroupStatCalculator> statsCalculator = new HashMap<>();
    
    public Group(String alias){
        super(alias);
    }
    
    public void addComicElement(ComicElement ce){
        elements.add(ce);
    }
    public void addStatCalculator(String stat, GroupStatCalculator gsc){
        statsCalculator.put(stat, gsc);
    }
    
    public ComicElement getComicElement(String alias){
        for(ComicElement c : elements){
            if(c.getAlias().equals(alias)) return c;
        }
        return null;
    }
    
    public void setDefaultCalculation(GroupStatCalculator gsc){
        this.defaultCalculation=gsc;
    }
    
    @Override
    public float getStat(String name) {
        
        List<Float> aux =  new ArrayList<>();
        for(ComicElement ce : elements) 
            aux.add(new Float(ce.getStat(name)));
        
        if(statsCalculator.containsKey(name))
            return statsCalculator.get(name).calculate(aux);
        
        return defaultCalculation.calculate(aux);
        
    }

}

