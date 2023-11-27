
public class Main {
    public static void main(String[] args) {
        ClinicSetup NHS = new ClinicSetup();
        Appointments system = new Appointments();
        Patient JM = new Patient("John Molecules");
        Patient JB = new Patient("Jill Biomedenhall");

        JM.Register(NHS.Moderna,NHS.Epping);
        JM.Register(NHS.Pfizer, NHS.Epping);
        JB.Register(NHS.Pfizer, NHS.Southall);

        system.getAppointment(JM);
        system.getAppointment(JB);

    }
}