public class SilverstoneTrack extends LasVegasTrack {

    protected String tyresType;
    private String weather;
    private int trophyWeight;

    public SilverstoneTrack() {}

    @Override
    public void congratulateWinner() {
        System.out.println("Wow! Lewis Hamilton winned!");
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public int getTrophyWeight() {
        return trophyWeight;
    }

    public void setTrophyWeight(int trophyWeight) {
        this.trophyWeight = trophyWeight;
    }
}
