package comicobjetos.entities.groupstats;

import comicobjetos.entities.ComicElement;
import java.util.List;

public class AverageGroupStat extends SumGroupStat
{
    @Override
    public float calculate(List<Float> elements){
        return super.calculate(elements)/elements.size();
    }

}

