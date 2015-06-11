package comicobjetos.entities.groupstats;

import java.util.List;


public interface GroupStatCalculator{
    public abstract float calculate(List<Float> elements);
}

