package fr.efrei.domain;

public class Ticket {
    private int reservationNumber;
    private String fileName;
    private int roomNumber;
    private int seatNumber;

    private Ticket (){}

    private Ticket (TicketBuilder builder){
        this.reservationNumber = builder.reservationNumber;
        this.fileName = builder.fileName;
        this.seatNumber = builder.seatNumber;
        this.roomNumber = builder.roomNumber;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public String getFileName() {
        return fileName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public static class TicketBuilder {
        private int reservationNumber;
        private String fileName;
        private int roomNumber;
        private int seatNumber;

        public TicketBuilder(int reservationNumber, String fileName, int roomNumber, int seatNumber) {
            this.reservationNumber = reservationNumber;
            this.fileName = fileName;
            this.roomNumber = roomNumber;
            this.seatNumber = seatNumber;
        }

        public TicketBuilder setReservationNumber(TicketBuilder builder) {
            this.reservationNumber = builder.reservationNumber;
            return this;
        }

        public TicketBuilder setFileName(TicketBuilder builder) {
            this.fileName = builder.fileName;
            return this;
        }

        public TicketBuilder setRoomNumber(TicketBuilder builder) {
            this.roomNumber = builder.roomNumber;
            return this;
        }

        public TicketBuilder setSeatNumber(TicketBuilder builder) {
            this.seatNumber = builder.seatNumber;
            return this;
        }

        public Ticket build() {return new Ticket(this);}

    }
}
