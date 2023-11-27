public class Vaccine {

    public final String name;

    private final int daysBetweenDoses;

    private final Clinic vaccineOrigin;

    public Vaccine(String name, int daysBetweenDoses, Clinic vaccineOrigin) {
        this.name = name;
        this.daysBetweenDoses = daysBetweenDoses;
        this.vaccineOrigin = vaccineOrigin;
    }

    public int getDaysBetweenDoses() {
        return daysBetweenDoses;
    }

    public Clinic getVaccineOrigin() {
        return vaccineOrigin;
    }
}
