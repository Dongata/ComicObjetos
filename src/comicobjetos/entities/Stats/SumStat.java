package comicobjetos.entities.Stats;


public class SumStat extends CompoundStat
{
    
    public SumStat(Stat s1, Stat s2){
        super(s1, s2);
    }
    
    @Override
    public float getValue(){
        return stat1.getValue()+stat2.getValue();
    }

}

