public class ClinicSetup {
    public final Clinic Epping = new Clinic("Epping");
    public final Clinic Southall = new Clinic("Southall");
    public final Vaccine Moderna = new Vaccine("Moderna",4, Epping);
    public final Vaccine Pfizer = new Vaccine("Pfizer",5, Southall);

    public ClinicSetup() {
        Epping.getInventory().add(Moderna);
        Southall.getInventory().add(Pfizer);
    }
}


