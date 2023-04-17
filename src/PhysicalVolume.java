import java.util.ArrayList;
import java.util.UUID;

public class PhysicalVolume extends PhysicalDrive {
    ArrayList<PhysicalVolume> list = new ArrayList<PhysicalVolume>();
    UUID u;
    public PhysicalVolume(String n) {
        super(n);
        u = UUID.randomUUID();
        list.add(this);
    }

}

