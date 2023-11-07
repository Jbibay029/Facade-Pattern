public class HouseKeep implements HotelService {

    private int RoomNumber;

    public HouseKeep(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    @Override
    public void ExecuteService() {
        cleanRoom(RoomNumber);
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping is cleaning room: " + roomNumber);
    }
}
