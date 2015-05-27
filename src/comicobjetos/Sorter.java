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
        for (int i=1; i<elements.size(); i++){
            System.out.println("lelele");
                
            for (int j=0; j<orderedList.size(); j++){
                while ((k<criterias.size()) && (best == null)){
                    best = criterias.get(k).battle(elements.get(i), orderedList.get(j));
                    k++;
                    System.out.println("1");
                }
                System.out.println("2");
                if ((best == null)||(best == elements.get(i))){
                    orderedList.add(j,elements.get(i));
                }
                k = 0;
                best = null;
            }
        }
        return orderedList;
    }
    
}