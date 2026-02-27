
public class Hospital {

    String hospitalName;
    String hospitalLocation;
    int numberOfBeds;
    int numberOfDoctors;
    String chiefDoctorName;
    double consultationFee;
    boolean isEmergencyAvailable;

    void displayDetails() {
        System.out.println("---- Hospital Details ----");
        System.out.println("Name: " + hospitalName);
        System.out.println("Location: " + hospitalLocation);
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Doctors: " + numberOfDoctors);
        System.out.println("Chief Doctor: " + chiefDoctorName);
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Emergency Available: " + isEmergencyAvailable);
    }

    public static void main(String[] args) {

        Hospital h = new Hospital();

        h.hospitalName = "City Care Hospital";
        h.hospitalLocation = "Pune";
        h.numberOfBeds = 150;
        h.numberOfDoctors = 45;
        h.chiefDoctorName = "Dr. Sharma";
        h.consultationFee = 500.0;
        h.isEmergencyAvailable = true;

        h.displayDetails();
    }
}