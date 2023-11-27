import java.time.LocalDate;

public interface Appointments {
    LocalDate currentDate = LocalDate.now();
    default void getAppointment(Patient patient) {
        System.out.println("All your appointments will be at this clinic."); //Change to specific clinic
        int daysBetweenAppointments = 7; // Change this to daysBetweenDoses of whatever is being administered
        System.out.println("First Appointment: " + currentDate.plusDays(daysBetweenAppointments) + ", administered by a nurse.");
        System.out.println("Second Appointment: " + currentDate.plusDays(daysBetweenAppointments) + ", administered by a doctor.");
        System.out.println("Third Appointment: " + currentDate.plusDays(daysBetweenAppointments) + ", administered by a doctor.");
        System.out.println(" ");
    }
}
