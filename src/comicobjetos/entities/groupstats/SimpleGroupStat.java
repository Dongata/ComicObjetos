package comicobjetos.entities.groupstats;

import java.util.List;


public class SimpleGroupStat extends GroupStatCalculator
{
    private float value;
    
    public SimpleGroupStat(float value){
        this.value = value;
    }

    @Override
    public float calculate(List<Float> elements) {
        return value;
    }

}

