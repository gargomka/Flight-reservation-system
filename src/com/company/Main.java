package com.company;

public class Main {

    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("Omks", "9876544310", "omks@email.com", "lokmanya road", "Pune", "Maharashtra");
        Passenger passenger2 = new Passenger("Modi", "8976543210", "aomks@email.com", "Vallabhnagar", "Pune", "Maharashtra");

        Flight flight1 = new Flight("D2345", "Spice Jet", 100);
        Flight flight2 = new Flight("E6789", "Indigo", 200);

        Ticket ticket1 = new RegularTicket(2345, "Mumbai", "Goa", flight1, "11:00, 29th Oct ", "14:00, 30th Oct ", passenger1, 18, 2899, "Happy Meal");
        Ticket ticket2 = new TouristTicket(4589, "Indore", "Banglore", flight2, " 12:00, 28th Oct ", "14:00, 30th Oct ", passenger2, 18, 2899, "Radhe", new String[]{"Konkan", "Dapoli", "Ratnagiri", "Kolhapur", "Budhapest"});

        printTicketDetails(ticket1);
        printTicketDetails(ticket2);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPrn());
    }
}
