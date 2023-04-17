import java.util.ArrayList;
import java.util.UUID;

public class LogicalVolume  {
    String name;
    int size;
    UUID u;
    public LogicalVolume(String n, int s, ArrayList<VolumeGroup> vgList)
    {
        name = n;
        size = s;
        u = UUID.randomUUID();
    }
}
