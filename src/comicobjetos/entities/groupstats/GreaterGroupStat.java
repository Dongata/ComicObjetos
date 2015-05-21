package comicobjetos.entities.groupstats;

import comicobjetos.entities.ComicElement;
import java.util.List;



public class GreaterGroupStat extends GroupStatCalculator
{

    @Override
    public float calculate(List<Float> elements) {
        float max= 0;
        for (float ce: elements)
            if (ce>max)
                max=ce;
        return max;
    }

}

