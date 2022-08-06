import java.util.ArrayList;

public class FlightManager {
    Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public double getTotalBaggageLimit() {
        return flight.getPlane().getWeight() / 2;
    }

    public double getBaggageLimitPerPassenger() {
        return getTotalBaggageLimit() / flight.getPlane().getCapacity();
    }

    public double getBookedBaggageWeight() {
        return getBaggageLimitPerPassenger() * flight.getPassengerCount();
    }

    public double getRemainingBaggageWeightAllowed() {
        return getTotalBaggageLimit() - getBookedBaggageWeight();
    }
}
