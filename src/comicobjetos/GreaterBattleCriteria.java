package comicobjetos;

import comicobjetos.entities.ComicElement;


public class GreaterBattleCriteria extends BattleCriteria{
    
    public GreaterBattleCriteria(String stat) {
        super(stat);
    }

    public GreaterBattleCriteria(String stat, BattleCriteria next) {
        super(stat, next);
    }

    @Override
    public int compare(ComicElement o1, ComicElement o2) {
        if(o1.getStat(stat)<o2.getStat(stat))
            return -1;
        if(o1.getStat(stat)>o2.getStat(stat))
            return 1;
        if (next != null)
            return next.compare(o1, o2);
        return 0;
    }
}