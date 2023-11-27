import java.util.ArrayList;

public class Patient {

    private final String name;

    private ArrayList<Vaccine> bookedVaccines = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }
    public ArrayList<Vaccine> getBookedVaccines() {
        return bookedVaccines;
    }
    public String getName() {
        return name;
    }

    public void Register(Vaccine vaccine, Clinic clinic) {
        System.out.println("Thank you " + name + " for registering at " + clinic.name + ".");
        bookedVaccines.add(vaccine);
        if (vaccine.getVaccineOrigin() == clinic) {
            System.out.println("Please return to this clinic for your " + vaccine.name + " dose administrations.");
        } else {
            System.out.println("Refer to the appointments schedule to find out which clinic your " + vaccine.name + " dose administrations will be.");
        }
        System.out.println(" ");
    }
}
