public class Valet implements HotelService {

    private String PlateNumber;

    public Valet(String PlateNumber) {
        this.PlateNumber = PlateNumber;
    }

    @Override
    public void ExecuteService() {
        PickupVehicle(PlateNumber);
    }

    public void PickupVehicle(String PlateNumber) {
        System.out.println("Valet is picking up the vehicle with: " + PlateNumber);
    }
}
