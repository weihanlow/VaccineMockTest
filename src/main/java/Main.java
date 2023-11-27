
public class Main {
    public static void main(String[] args) {
        ClinicSetup NHS = new ClinicSetup();
        VaccineAppointments system = new VaccineAppointments();
        Patient JM = new Patient("John Mobius");
        Patient JB = new Patient("Jill Biomedenhall");

        JM.Register(NHS.Moderna,NHS.Epping);
        JM.Register(NHS.Pfizer, NHS.Epping);
        JB.Register(NHS.Pfizer, NHS.Southall);

        system.getAppointment(JM);
        system.getAppointment(JB);
    }
}