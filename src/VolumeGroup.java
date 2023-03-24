import java.util.ArrayList;

public class VolumeGroup extends PhysicalVolume {
    String name;
    public VolumeGroup(String n, ArrayList<PhysicalVolume> pvList, ArrayList<LogicalVolume> lvList)
    {
        name = n;
        list = pvList;
    }

    public int vgSize()
    {
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
        {
            sum += list.get(i).getSize();
        }
        return sum;
    }
}
