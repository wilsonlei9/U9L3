import java.util.ArrayList;
import java.util.Scanner;
public class LVMRunner {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the LVM System.");
        String cmd = "";
        ArrayList<String> driveName = new ArrayList<String>();
        String driveSize = "";
        ArrayList<PhysicalDrive> arr = new ArrayList<PhysicalDrive>();
        ArrayList<PhysicalVolume> pvarr = new ArrayList<PhysicalVolume>();
        while (!cmd.equals("exit"))
        {
            System.out.print("cmd#: ");
            cmd = s.nextLine();
            if (cmd.contains("install-drive"))
            {
                String name = cmd.substring(14, 17);
                String size = cmd.substring(18, cmd.indexOf("G") + 1);
                PhysicalDrive drive = new PhysicalDrive(name, size);
                arr.add(drive);
                System.out.println("Drive " + name + " installed");
            }
            if (cmd.equals("list-drives"))
            {
                for (int i = 0; i < arr.size(); i++)
                {
                    System.out.println(arr.get(i).getName() + " [" + arr.get(i).getSize() + "] " + arr.get(i).getU()) ;
                }
            }
            if (cmd.contains("pvcreate"))
            {
                String name = cmd.substring(9, 12);
                PhysicalVolume pv = new PhysicalVolume(name);
                pvarr.add(pv);
                System.out.println(name + " created");
                driveName.add(cmd.substring(cmd.length() - 3, cmd.length()));
            }
            if (cmd.equals("pvlist"))
            {
                for (int i = 0; i < arr.size(); i++)
                {
                    if (arr.get(i).getName().equals(driveName.get(i)))
                    {
                        driveSize = arr.get(i).getSize();
                        System.out.println(pvarr.get(i).getName() + ": " + "[" + driveSize + "] " + pvarr.get(i).getU());
                    }
                }
            }
        }
    }
}
