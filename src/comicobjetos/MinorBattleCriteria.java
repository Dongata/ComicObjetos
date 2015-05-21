package comicobjetos;

import comicobjetos.entities.ComicElement;


public class MinorBattleCriteria extends BattleCriteria
{
    
    public MinorBattleCriteria(String stat){
        super(stat);
    }

    @Override
    public ComicElement battle(ComicElement char1, ComicElement char2) {
        if(char1.getStat(stat)<char2.getStat(stat))
            return char1;
        if(char1.getStat(stat)>char2.getStat(stat))
            return char2;
        return null;
    }

}

