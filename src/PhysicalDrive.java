import java.util.UUID;
public class PhysicalDrive extends LVM{
    private String size;
    public PhysicalDrive(String n, String s)
    {
        super(n);
        size = s;
    }

    public PhysicalDrive(String n)
    {
        super(n);
    }

    public String getSize()
    {
        return size;
    }

}
