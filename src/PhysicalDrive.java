import java.util.UUID;
public class PhysicalDrive extends LVM{
    private int size;
    public PhysicalDrive(String n, int s)
    {
        super(n);
        size = s;
    }

    public PhysicalDrive() {

    }

    public int getSize()
    {
        return size;
    }

}
