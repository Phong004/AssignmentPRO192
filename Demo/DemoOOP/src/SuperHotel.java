class Hotel {
    public int bookings;
    public void book(int size) {
        bookings++;
    }
}
public class SuperHotel extends Hotel {
    public void book() {
        bookings--;
    }
    public void book(int size) {
        book();
        super.book(size);
        bookings += size;
    }
    public static void main(String args[]) {
        Hotel hotel = new Hotel();
        hotel.book(2);
        System.out.print(hotel.bookings);
    }
}
