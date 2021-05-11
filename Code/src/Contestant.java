public class Contestant {
    private String name;
    private int score;

    public Contestant(String name, int score){
        if(name != null) {
            this.name = name;
        }
        this.score = score;
    }

    @Override
    public String toString() {
        return name;
    }
    public int getScore() {
        return score;
    }
}
