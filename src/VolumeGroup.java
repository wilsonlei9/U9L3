import java.util.ArrayList;
import java.util.UUID;

public class VolumeGroup extends PhysicalVolume {
    private UUID u;

    public VolumeGroup(String n, ArrayList<PhysicalVolume> pvList, ArrayList<LogicalVolume> lvList)
    {
        super(n);
        list = pvList;
        u = UUID.randomUUID();
    }

    public int vgSize()
    {
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
        {
            sum += Integer.parseInt(list.get(i).getSize());
        }
        return sum;
    }

    public UUID getU()
    {
        return u;
    }
}
