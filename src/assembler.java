public class assembler {

    private int slots;
    private String availability;
    private String manufacturer;
    private double speed;

    public assembler(int slots, String availability, String manufacturer, double speed) {
        this.slots = slots;
        this.availability = availability;
        this.manufacturer = manufacturer;
        this.speed = speed;
    }

    public int getSlots() {
        return slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void printOut() {
        System.out.println("Assebler description : " + "Slots : " + slots + ", availability : " + availability +
            ", manufacturer : " + manufacturer + ", speed : " + speed + " pcs/h." );
    }
}
