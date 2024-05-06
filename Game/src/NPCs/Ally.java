package NPCs;

public class Ally {
    private String name;
    private int affection;

    public Ally(String name, int affection){
        this.name = name;
        this.affection = affection;
    }

    public void setName(String name){ this.name = name; }
    public void setAffection(int affection){ this.affection = affection; }

    public String getName(){ return name; }
    public int getAffection(){ return affection; }
}
