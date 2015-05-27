package comicobjetos;

import comicobjetos.entities.ComicElement;

public abstract class BattleCriteria{
    protected String stat;

    public BattleCriteria(String stat){
        this.stat = stat;
    }

    public abstract ComicElement battle(ComicElement char1, ComicElement char2);

    public int doCompare(Object o, Object o1){
        ComicElement ce = battle((ComicElement)o, (ComicElement)o1);
        if(ce.equals(o)) return 1;
        if(ce.equals(o1))return -1;
        return 0;
    }

}

