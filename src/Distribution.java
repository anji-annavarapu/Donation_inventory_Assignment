import java.time.LocalDate;
/**
 * Represents a distribution of donation.
 *
 * <p>This POJO class holds information about a single distribution,
 * including the type of item donated, the quantity,
 * and the date of donation.
 *
 * <p>Used for storing distribution records, generating reports.
 */
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
