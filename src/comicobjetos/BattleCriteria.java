package comicobjetos;

import comicobjetos.entities.ComicElement;

public abstract class BattleCriteria{
    protected String stat;

    public BattleCriteria(String stat){
        this.stat = stat;
    }

    public abstract ComicElement battle(ComicElement char1, ComicElement char2);

}