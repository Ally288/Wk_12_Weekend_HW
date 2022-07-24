package People;

public abstract class People {

    String name;
    String rank;

    public People(String name, String rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() { return name; }
    public String getRank() { return rank; }

}
