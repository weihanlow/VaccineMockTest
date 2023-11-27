public abstract class Drug {
    protected final String name;

    protected final int daysBetweenDoses;

    public Drug(String name, int daysBetweenDoses) {
        this.name = name;
        this.daysBetweenDoses = daysBetweenDoses;
    }
}
