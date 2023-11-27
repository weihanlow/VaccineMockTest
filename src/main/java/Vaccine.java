public class Vaccine extends Drug{

    private final Clinic vaccineOrigin;

    public Vaccine(String name, int daysBetweenDoses, Clinic vaccineOrigin) {
        super(name, daysBetweenDoses);
        this.vaccineOrigin = vaccineOrigin;
    }

    public int getDaysBetweenDoses() {
        return daysBetweenDoses;
    }

    public Clinic getVaccineOrigin() {
        return vaccineOrigin;
    }
}
