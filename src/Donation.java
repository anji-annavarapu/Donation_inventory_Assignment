import java.time.LocalDate;

public class Donation {
    private String donar_name;
    private String type_donation;
    private Integer quantity;
    private LocalDate date;

    public Donation(String donar_name, String type_donation, Integer quantity, LocalDate date) {
        this.donar_name = donar_name;
        this.type_donation = type_donation;
        this.quantity = quantity;
        this.date = date;
    }

    public String getDonar_name() {
        return donar_name;
    }

    public void setDonar_name(String donar_name) {
        this.donar_name = donar_name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getType_donation() {
        return type_donation;
    }

    public void setType_donation(String type_donation) {
        this.type_donation = type_donation;
    }
}
