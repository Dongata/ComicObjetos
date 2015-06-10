package comicobjetos;
import comicobjetos.entities.ComicElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Arena{
    private List<ComicElement> players = new ArrayList<>();

    public Arena() {
    }
    
    public Arena(List<ComicElement> players) {
        this.players = players;
    }

    public void setPlayers(List<ComicElement> players) {
        this.players = players;
    }

    public void addPlayer(ComicElement player){
        players.add(player);
    }
    
    public ComicElement getComicElement(String name){
        for (ComicElement ce: players){
            if (ce.getAlias().equals(name))
                return ce;
        }
        return null;
    }
    
    public ComicElement battle(ComicElement ce1, ComicElement ce2, BattleCriteria criterias){
        if ((ce1 != null) && (ce2 !=null))
            if (criterias.compare(ce1, ce2) == 1)
                return ce1;
            else if (criterias.compare(ce1, ce2) == -1)
                return ce2;
        return null;
    }
    
    public List<ComicElement> sort(BattleCriteria criterias){
        Collections.sort(players, criterias);
        return players;
        
        /*ArrayList<ComicElement> orderedList = new ArrayList<>(players.size());
        if((!players.isEmpty())&&(criterias != null)){
            orderedList.add(0, players.get(0));
            ComicElement best = null;
            int j = 0;
            for (int i=1; i<players.size(); i++){
                while (j<orderedList.size()){          
                    best = criterias.battle(players.get(i), orderedList.get(j));
                    if ((best == null) || (best == orderedList.get(j))){
                        orderedList.add(j,players.get(i));
                        j = orderedList.size();
                    }
                    else if (best == players.get(i)){
                        j++;
                        if (j == orderedList.size()){
                            orderedList.add(j,players.get(i));
                            j++;
                        }
                    }
                    best = null;
                }
                j = 0;
            }
        }
        return orderedList;*/
    }
    
public List<ComicElement> battle(BattleCriteria criterias){
        List <ComicElement> ord = sort(criterias);
        List <ComicElement> winners = new ArrayList<>();
        if((!ord.isEmpty())&&(criterias != null)){
            winners.add(ord.get(0));
            for (int i=1; i<ord.size(); i++){
                if (criterias.compare(ord.get(0),ord.get(i)) == 0)
                    winners.add(ord.get(i));
                else return winners;
            }
        }
        return winners;
    }
    
}