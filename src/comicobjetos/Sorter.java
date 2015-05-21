package comicobjetos;

import comicobjetos.entities.ComicElement;
import java.util.List;
import sun.misc.Compare;
import sun.misc.Sort;


public class Sorter
{
    private List<BattleCriteria> criterias;

    public List<ComicElement> sort(List<ComicElement> elements){

        Sort.quicksort(elements.toArray(), criterias.get(0));
        return null;
    }
    
}

