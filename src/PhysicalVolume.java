import java.util.ArrayList;
public class PhysicalVolume extends PhysicalDrive {
    ArrayList<PhysicalVolume> list = new ArrayList<PhysicalVolume>();
    public PhysicalVolume(String n, int s)
    {
        super(n, s);
        list.add(this);
    }

    public PhysicalVolume() {

    }
}
