import java.util.UUID;

public class LVM {
    private String name;
    private UUID u;

    public LVM(String n)
    {
        name = n;
        u = UUID.randomUUID();
    }

    public LVM()
    {

    }
    public String getName() {
        return name;
    }
    public UUID getU() {
        return u;
    }
}
