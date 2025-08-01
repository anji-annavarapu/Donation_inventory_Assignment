import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Donation_manager {
    List<Donation> donations=new ArrayList<>();
    List<Distribution> donatedList=new ArrayList<>();

    public void registereDonation(String donor_name, String type, Integer quantity, LocalDate date){
        donations.add(new Donation(donor_name, type, quantity, date));
        System.out.println("Donation registered succesfully ");
    }
    public void distributeDonation(String type,LocalDate date,Integer quantity){
        donatedList.add(new Distribution(type,date,quantity));
        System.out.println(type.toUpperCase()+" distribute and logged succesfully");
    }
    // Generate the Inventory report
    public void donationRepost(){
        Map<String,Integer> donationStatus=donations.stream()
                .collect(Collectors.groupingBy(d->d.getType_donation(),Collectors.summingInt(d->d.getQuantity())));
        Map<String,Integer> distributionStatus=donatedList.stream().
                collect(Collectors.groupingBy(d->d.getType(),Collectors.summingInt(d->d.getQuantity())));
        Set<String> donationSet=donationStatus.keySet();
        System.out.println("\n--- Inventory Report ---");
        for(String type:donationSet){
            int donated=donationStatus.get(type);
            int distributed=distributionStatus.getOrDefault(type,0);
            int remain=donated-distributed;
            System.out.printf("%s: %d remaining (Donated: %d, Distributed: %d)\n", type, remain, donated, distributed);
        }

    }

    // Generate donor contributions report
    public void donorReport(){
        Map<String,Integer> donorsums=donations.stream().
                collect(Collectors.groupingBy(d->d.getDonar_name(),Collectors.summingInt(d-> d.getQuantity())));
        Set<String> donorSet=donorsums.keySet();
        System.out.println("\n--- Donor Report ---");
        for (String donor:donorSet){
            System.out.printf("%s: %d units donated\n", donor, donorsums.getOrDefault(donor,0));
        }
    }

    public void searchDistributionByDate(String dateString) {
        LocalDate date = LocalDate.parse(dateString);
        List<Distribution> result = donatedList.stream()
                .filter(d -> d.getDate().equals(date))
                .collect(Collectors.toList());

        System.out.println("\n--- Distributions on " + date + " ---");
        if (result.isEmpty()) {
            System.out.println("No distributions found on this date.");
        } else {
            result.forEach(System.out::println);
        }
    }
}
