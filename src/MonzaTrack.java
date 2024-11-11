public class MonzaTrack {

    protected int tifoziAmount;
    private int distance;
    public int trophyWeight;

    public MonzaTrack() {
    }

    public MonzaTrack(int tifoziAmount, int distance, int trophyWeight) {
        this.tifoziAmount = tifoziAmount;
        this.distance = distance;
        this.trophyWeight = trophyWeight;
    }

    public int getTrophyWeight() {
        return trophyWeight;
    }

    public void setTrophyWeight(int trophyWeight) {
        this.trophyWeight = trophyWeight;
    }

    public void takeTrophy(String name) {
        System.out.println(name);
    }

    public void takeTrophy() {
        System.out.println("Winner takes trophy!");
    }
}
