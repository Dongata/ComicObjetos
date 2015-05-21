package comicobjetos.entities.Stats;

public class SimpleStat extends Stat{
    private float value;
    
    public SimpleStat(float value){
        this.value=value;
    }
    
    public void setValue(float value){
        this.value=value;
    }
    
    @Override
    public float getValue(){
        return value;
    }

}

