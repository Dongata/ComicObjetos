package comicobjetos.entities.Stats;

public class GreaterStat extends CompoundStat
{
    Stat trueResult;
    Stat falseResult;
    public GreaterStat(Stat s1, Stat s2, Stat trueResult, Stat falseResult){
        super(s1, s2);
        this.trueResult=trueResult;
        this.falseResult=falseResult;
    }
    
    @Override
    public float getValue(){
        if(stat1.getValue()>stat2.getValue()) return trueResult.getValue();
        return falseResult.getValue();
    }

}

