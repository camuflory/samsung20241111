public class Main {
    public static void main(String[] args) {

        LasVegasTrack la = new LasVegasTrack();
        la.setMaxSpeed(367);
        la.setTurnAmount(23);
        la.setLapAmount(63);
        la.congratulateWinner();

        SilverstoneTrack s = new SilverstoneTrack();
        s.tyresType = "medium";
        s.setWeather("windy");
        s.setTrophyWeight(5);
        s.congratulateWinner();

        ZandvoortTrack z = new ZandvoortTrack(1200, "Lando Norris", 19.0);
        z.bankingDegree = 19.1;

        MonzaTrack m = new MonzaTrack(123, 1400, 1);
        m.setTrophyWeight(2);
        m.takeTrophy();
        m.takeTrophy("Sharles Leclerc");
    }
}