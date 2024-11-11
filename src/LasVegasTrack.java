public class LasVegasTrack {

    private int maxSpeed;
    private int turnAmount;
    private int lapAmount;

    public LasVegasTrack() {}

    public void congratulateWinner() {
        System.out.println("Wow! Max Verstappen winned!");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getTurnAmount() {
        return turnAmount;
    }

    public void setTurnAmount(int turnAmount) {
        this.turnAmount = turnAmount;
    }

    public int getLapAmount() {
        return lapAmount;
    }

    public void setLapAmount(int lapAmount) {
        this.lapAmount = lapAmount;
    }
}
