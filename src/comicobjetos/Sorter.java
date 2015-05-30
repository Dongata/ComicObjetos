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
    
    public List<ComicElement> bestOf(List<ComicElement> players){
        List <ComicElement> ord = new ArrayList<>();
        ord = sort(players);
        List <ComicElement> winners = new ArrayList<>();
        winners.add(ord.get(0));
        for (int i=1; i<ord.size(); i++){
            if (ord.get(0).getStat(criterias.get(0).getNameStat()) == ord.get(i).getStat(criterias.get(0).getNameStat()))
                winners.add(ord.get(i));
            else return winners;
        }
        return null;
    }

    public List<ComicElement> sort(List<ComicElement> elements){
        ArrayList<ComicElement> orderedList = new ArrayList<>(elements.size());
        orderedList.add(0, elements.get(0));
        ComicElement best = null;
        int k = 0, j = 0;
        
        for (int i=1; i<elements.size(); i++){
            while (j<orderedList.size()){          
                while ((k<criterias.size()) && (best == null)){
                    best = criterias.get(k).battle(elements.get(i), orderedList.get(j));
                    k++;
                }
                if ((best == null) || (best == orderedList.get(j))){
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