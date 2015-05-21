package comicobjetos.entities.groupstats;

import java.util.List;


public class SimpleGroupStat extends GroupStatCalculator
{
    private float value;
    int caro;

    @Override
    public float calculate(List<Float> elements) {
        return value;
    }

}

