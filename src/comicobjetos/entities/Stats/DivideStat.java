package comicobjetos.entities.Stats;

public class DivideStat extends CompoundStat
{
    public DivideStat(Stat s1, Stat s2){
            super(s1, s2);
    }
    @Override
    public float getValue()
    {
            return stat1.getValue()/stat2.getValue();
    }

}

