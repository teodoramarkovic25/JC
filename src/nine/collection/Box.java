package nine.collection;

public class Box<S, U, V> {
    private S sport;
    private U utility;
    private V vehicle;

    public S getSport() {
        return sport;
    }

    public void setSport(S sport) {
        this.sport = sport;
    }

    public U getUtility() {
        return utility;
    }

    public void setUtility(U utility) {
        this.utility = utility;
    }

    public V getVehicle() {
        return vehicle;
    }

    public void setVehicle(V vehicle) {
        this.vehicle = vehicle;
    }
}
