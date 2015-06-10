package comicobjetos.entities.groupstats;

import comicobjetos.entities.ComicElement;
import java.util.List;


public class SumGroupStat implements GroupStatCalculator
{
    @Override
    public float calculate(List<Float> elements){
        float sum=0;
        for(float ce : elements){
            sum+=ce;
        }
        return sum;
    }


}

