package comicobjetos;
import comicobjetos.entities.ComicElement;
import java.util.List;


public class Arena{
    private List<BattleCriteria> criterias;
    private ComicElement opponent1;

    private ComicElement opponent2;

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

