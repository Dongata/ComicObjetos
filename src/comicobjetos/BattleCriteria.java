package comicobjetos;

import comicobjetos.entities.ComicElement;
import java.util.Comparator;


public abstract class BattleCriteria implements Comparator<ComicElement>{
    protected String stat;
    protected BattleCriteria next;

    public BattleCriteria(String stat) {
        this.stat = stat;
        this.next = null;
    }

    public BattleCriteria(String stat, BattleCriteria next) {
        this.stat = stat;
        this.next = next;
    }

    public String getNameStat(){
        return stat;
    }

    public void setNameStat(String stat) {
        this.stat = stat;
    }

    public void setNext(BattleCriteria next) {
        this.next = next;
    }

}