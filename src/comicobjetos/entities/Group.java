package comicobjetos.entities;

import comicobjetos.entities.groupstats.GreaterGroupStat;
import comicobjetos.entities.groupstats.GroupStatCalculator;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;


public class Group extends ComicElement
{
    private List<ComicElement> elements;
    private GroupStatCalculator defaultCalculation =  new GreaterGroupStat();
    private Hashtable<String,GroupStatCalculator> statsCalculator;
    
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

