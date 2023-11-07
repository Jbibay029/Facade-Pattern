public class Cart implements HotelService {
    private int NumberofCarts;

    public Cart(int NumberofCarts) {
        this.NumberofCarts = NumberofCarts;
    }

    @Override
    public void ExecuteService() {
        requestCart(NumberofCarts);
    }

    public void requestCart(int NumberofCarts) {
        System.out.println("Handling request for: " + NumberofCarts + " cart(s)");
    }
}
