package comicobjetos.entities.Stats;


public abstract class ComparisonStat implements Stat
{
    protected Stat stat1;
    protected Stat stat2;
    protected Stat trueResult;
    protected Stat falseResult;

    public ComparisonStat(Stat stat1, Stat stat2, Stat trueResult, Stat falseResult) {
        this.stat1 = stat1;
        this.stat2 = stat2;
        this.trueResult = trueResult;
        this.falseResult = falseResult;
    }
    
}
