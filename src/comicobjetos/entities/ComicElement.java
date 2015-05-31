    package comicobjetos.entities;




public abstract class ComicElement
{
	protected String alias;
        
        public ComicElement(String alias){
            this.alias=alias;
        }
        
        public String getAlias(){
            return alias;
        }
	public abstract float getStat(String name);
   
}

