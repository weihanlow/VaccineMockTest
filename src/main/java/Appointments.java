import java.time.LocalDate;

public class Appointments {
    LocalDate currentdate = LocalDate.now();

    public void getAppointment(Patient patient) {
        System.out.println("Dear " + patient.getName() + ",");
        int i;
        for (i = 0; i < patient.getBookedVaccines().size(); i++) {
            Vaccine selectedvac = patient.getBookedVaccines().get(i);
            if ("Moderna".equals(selectedvac.name)) {
                System.out.println("All your " + selectedvac.name + " dose administrations will be at " + selectedvac.getVaccineOrigin().name + " Clinic.");
                System.out.println("First " + selectedvac.name + " Dose: " + currentdate.plusDays(selectedvac.getDaysBetweenDoses()) + ", administered by a nurse.");
                System.out.println("Second " + selectedvac.name + " Dose: " + currentdate.plusDays(selectedvac.getDaysBetweenDoses() * 2) + ", administered by a doctor.");
                System.out.println("Third " + selectedvac.name + " Dose: " + currentdate.plusDays(selectedvac.getDaysBetweenDoses() * 3) + ", administered by a doctor.");
                System.out.println(" ");
            } else if ("Pfizer".equals(selectedvac.name)) {
                System.out.println("All your " + selectedvac.name + " dose administrations will be at " + selectedvac.getVaccineOrigin().name + " Clinic.");
                System.out.println("First " + selectedvac.name + " Dose: " + currentdate.plusDays(selectedvac.getDaysBetweenDoses()) + ", administered by a doctor.");
                System.out.println("Second " + selectedvac.name + " Dose: " + currentdate.plusDays(selectedvac.getDaysBetweenDoses() * 2) + ", administered by a nurse.");
                System.out.println(" ");
            }
        }
    }
}

