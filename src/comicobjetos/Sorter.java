package comicobjetos;

import comicobjetos.entities.ComicElement;
import java.util.ArrayList;
import java.util.List;


public class Sorter
{
    private List<BattleCriteria> criterias = new ArrayList<>();
    
    public void addCriteria(BattleCriteria criteria){
        criterias.add(criteria);
    }

    public ArrayList<ComicElement> sort(List<ComicElement> elements){
        ArrayList<ComicElement> orderedList = new ArrayList<>(elements.size());
        orderedList.add(0, elements.get(0));
        ComicElement best = null;
        int k = 0;
        int j = 0;
        for (int i=1; i<elements.size(); i++){
            while (j<orderedList.size()){          
                while ((k<criterias.size()) && (best == null)){
                    best = criterias.get(k).battle(elements.get(i), orderedList.get(j));
                    k++;
                }
                if (best == null){
                    orderedList.add(j,elements.get(i));
                    j = orderedList.size();
                }
                else if (best == orderedList.get(j)){
                    orderedList.add(j,elements.get(i));
                    j = orderedList.size();
                }
                else if (best == elements.get(i)){
                    j++;
                    if (j == orderedList.size()){
                        orderedList.add(j,elements.get(i));
                        j++;
                    }
                }
                k = 0;
                best = null;
            }
            j = 0;
        }
        return orderedList;
    }
    
}