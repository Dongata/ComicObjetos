package comicobjetos.entities.Stats;

public class GreaterStat extends CompoundStat
{
    
    public GreaterStat(Stat s1, Stat s2){
        super(s1, s2);
    }
    
    @Override
    public float getValue(){
        if(stat1.getValue()>stat2.getValue()) return stat1.getValue();
        return stat2.getValue();
    }

}

