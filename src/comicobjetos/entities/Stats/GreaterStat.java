package comicobjetos.entities.Stats;


public class GreaterStat extends ComparisonStat
{

    public GreaterStat(Stat stat1, Stat stat2, Stat trueResult, Stat falseResult) {
        super(stat1, stat2, trueResult, falseResult);
    }

    @Override
    public float getValue(){
        if(stat1.getValue()>stat2.getValue()) return trueResult.getValue();
        return falseResult.getValue();
    }

}

