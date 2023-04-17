import java.util.ArrayList;
import java.util.UUID;

public class VolumeGroup extends PhysicalVolume {
    private UUID u;
    public VolumeGroup(String n, ArrayList<PhysicalVolume> pvList)
    {
        super(n);
        list = pvList;
        u = UUID.randomUUID();
    }

    public String vgSize()
    {
        String sum = "";
        for (int i = 0; i < list.size(); i++)
        {
            sum += list.get(i).getSize();
        }
        return sum;
    }

    public UUID getU()
    {
        return u;
    }
}
