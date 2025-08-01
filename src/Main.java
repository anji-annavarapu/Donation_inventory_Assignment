import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Donation_manager manager=new Donation_manager();
        //Sample donated data
        manager.registereDonation("Alice", "Food", 50, LocalDate.of(2025, 7, 1));
        manager.registereDonation("Bob", "Clothing", 30, LocalDate.of(2025, 7, 2));
        manager.registereDonation("Alice", "Money", 100, LocalDate.of(2025, 7, 3));
        manager.registereDonation("Bob", "Clothing", 20, LocalDate.of(2025, 7, 3));
        // Sample distributed data
        manager.distributeDonation("Food", LocalDate.of(2025, 7, 4),20);
        manager.distributeDonation("Clothing",LocalDate.of(2025, 7, 5),10);

        manager.donationRepost();// generate Inventory report
        manager.donorReport();// generate donor report
        manager.searchDistributionByDate("2025-07-04");//filter the distribution on specific dates
    }
}