package comicobjetos.entities.groupstats;

import comicobjetos.entities.ComicElement;
import java.util.List;



public class MinorGroupStat extends GroupStatCalculator
{
    
    @Override
    public float calculate(List<Float> elements) {
        float min= Float.MAX_VALUE;
        for (float ce: elements)
            if (ce<min)
                min=ce;
        return min;
    }

}

