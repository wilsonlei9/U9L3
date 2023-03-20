import java.util.UUID;

public class PhysicalDrive extends LVM{
    public PhysicalDrive(String n, int s, UUID id)
    {
        super(n, s, id);
    }

    public void getSize()
    {
        return size;
    }
}
