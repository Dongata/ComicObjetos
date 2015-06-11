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