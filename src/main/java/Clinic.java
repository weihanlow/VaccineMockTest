import java.util.ArrayList;

public class Clinic {
    public final String name;

    private ArrayList<Vaccine> Inventory = new ArrayList<>();

    public Clinic(String name) {
        this.name = name;
    }

    public ArrayList<Vaccine> getInventory() {
        return Inventory;
    }
}
