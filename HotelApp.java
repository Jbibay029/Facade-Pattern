public class HotelApp {
    public static void main(String[] args) {

        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestService(new Valet("ABC329"));

        frontDesk.requestService(new HouseKeep(666));

        frontDesk.requestService(new Cart(12));
    }
}
