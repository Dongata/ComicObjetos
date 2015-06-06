package comicobjetos;
import comicobjetos.entities.ComicElement;
import java.util.ArrayList;
import java.util.List;


public class Arena{
    private BattleCriteria criterias;
    private List<ComicElement> players = new ArrayList<>();

    public Arena() {
    }
    
    public Arena(BattleCriteria criterias, List<ComicElement> players) {
        this.criterias = criterias;
        this.players = players;
    }

    public void setCriterias(BattleCriteria criterias) {
        this.criterias = criterias;
    }

    public void setPlayers(List<ComicElement> players) {
        this.players = players;
    }
     
    public void addCriteria(BattleCriteria criteria){
        criteria.setNext(criterias);
        criterias = criteria;
    }
    
    public void clearCriterias(){
        criterias = null;
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
    
    public ComicElement battle(String name1, String name2){
        //null??
        ComicElement ce1 = getComicElement(name1);
        ComicElement ce2 = getComicElement(name2);
        return criterias.battle(ce1, ce2);      
    }
    
    public List<ComicElement> sort(){
        ArrayList<ComicElement> orderedList = new ArrayList<>(players.size());
        orderedList.add(0, players.get(0));
        ComicElement best = null;
        int k = 0, j = 0;
        
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
                k = 0;
                best = null;
            }
            j = 0;
        }
        return orderedList;
    }
    
    public List<ComicElement> bestOf(){
        List <ComicElement> ord = new ArrayList<>();
        ord = sort();
        List <ComicElement> winners = new ArrayList<>();
        winners.add(ord.get(0));
        for (int i=1; i<ord.size(); i++){
            if (ord.get(0).getStat(criterias.getNameStat()) == ord.get(i).getStat(criterias.getNameStat()))
                winners.add(ord.get(i));
            else return winners;
        }
        return null;
    }
    
}