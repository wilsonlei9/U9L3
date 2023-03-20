import java.util.UUID;

public class LVM {
    private String name;
    private int size;
    private UUID u;

    public LVM(String n, int s, UUID id)
    {
        name = n;
        size = s;
        id = UUID.randomUUID();
        u = id;
    }

    public void generate()
    {
        System.out.println(u.toString());
    }


}
