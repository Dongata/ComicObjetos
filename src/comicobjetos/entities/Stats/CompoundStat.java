package comicobjetos.entities.Stats;

public abstract class CompoundStat implements Stat
{
	protected Stat stat1;
	protected Stat stat2;
        
        public CompoundStat(Stat s1, Stat s2){
            stat1=s1;
            stat2=s2;
        }
        public void setStat1(Stat s){
            this.stat1=s;
        }
        public void setStat2(Stat s){
            this.stat2=s;
        }

}

