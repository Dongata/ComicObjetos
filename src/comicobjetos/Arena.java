package comicobjetos;
import comicobjetos.entities.ComicElement;
import java.util.ArrayList;
import java.util.List;


public class Arena{
    private List<BattleCriteria> criterias = new ArrayList<>();
    private ComicElement opponent1;
    private ComicElement opponent2;

    public Arena(ComicElement opponent1, ComicElement opponent2){
        this.opponent1 = opponent1;
        this.opponent2 = opponent2;
    }
    
    public void setOpponent1(ComicElement opponent1) {
        this.opponent1 = opponent1;
    }

    public void setOpponent2(ComicElement opponent2) {
        this.opponent2 = opponent2;
    }
    
    public void addCriteria(BattleCriteria criteria){
        criterias.add(criteria);
    }
    
    public ComicElement battle(){
        ComicElement winner=null;
        for (BattleCriteria battle: criterias){
            winner = battle.battle(opponent1, opponent2);
            if (winner != null)
                return winner;
        }
        return null;
    }
}

