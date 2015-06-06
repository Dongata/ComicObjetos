package comicobjetos.entities.Stats;


public class SubsStat extends CompoundStat
{
    
    public SubsStat(Stat s1, Stat s2){
        super(s1, s2);
    }
    
    @Override
    public float getValue(){
        return stat1.getValue()-stat2.getValue();
    }

}

