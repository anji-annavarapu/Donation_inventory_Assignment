import java.time.LocalDate;

public class Distribution {
    private String type;
    private Integer quantity;
    private LocalDate date;

    public Distribution(String type, LocalDate date, Integer quantity) {
        this.type = type;
        this.date = date;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public LocalDate getDate() {
        return date;
    }
    @Override
    public String toString() {
        return String.format("Type: %s, Quantity: %d, Date: %s", type, quantity, date);
    }
}
