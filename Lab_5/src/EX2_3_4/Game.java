package EX2_3_4;

public class Game{
    private String description;
    public Game(String description )
    {
        this.description = description;
    }
    public String getDescription( )
    {
        return description;
    }
    public void setDescription( String newDescription )
    {
        description = newDescription;
    }
    @Override
    public String toString() {
        return "Description: "+description;
    }
}
