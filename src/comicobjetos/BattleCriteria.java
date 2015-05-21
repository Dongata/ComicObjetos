package comicobjetos;

import comicobjetos.entities.ComicElement;
import sun.misc.Compare;

public abstract class BattleCriteria implements Compare{
    protected String stat;

    public BattleCriteria(String stat){
        this.stat = stat;
    }

    public abstract ComicElement battle(ComicElement char1, ComicElement char2);

    @Override
    public int doCompare(Object o, Object o1){
        ComicElement ce = battle((ComicElement)o, (ComicElement)o1);
        if(ce.equals(o)) return 1;
        if(ce.equals(o1))return -1;
        return 0;
    }

}

