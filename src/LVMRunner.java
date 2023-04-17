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
        ArrayList<PhysicalVolume> list = new ArrayList<PhysicalVolume>();
        ArrayList<VolumeGroup> vgList = new ArrayList<VolumeGroup>();
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
            if (cmd.contains("vgcreate"))
            {
                String name = cmd.substring(9, 12);
                String pvName = cmd.substring(13, 16);
                for (int i = 0; i < pvarr.size(); i++)
                {
                    if (pvarr.get(i).getName().equals(pvName))
                    {
                        list.add(pvarr.get(i));
                    }
                }
                VolumeGroup vg = new VolumeGroup(name, list);
                vgList.add(vg);
                System.out.println(name + " created");
            }
            if (cmd.contains("vgextend"))
            {
                String name = cmd.substring(9, 12);
                String pvName = cmd.substring(13, 16);
                for (int i = 0; i < pvarr.size(); i++)
                {
                    if (pvarr.get(i).getName().equals(pvName))
                    {
                        list.add(pvarr.get(i));
                    }
                }
                VolumeGroup vg = new VolumeGroup(name, list);
                for (int i = 0; i < vgList.size(); i++)
                {
                    if (vgList.get(i).getName().equals(name))
                    {
                        vgList.set(i, vg);
                    }
                }
                System.out.println(pvName + " added to " + name);
            }
            if (cmd.equals("vglist"))
            {
                for (int i = 0; i < vgList.size(); i++)
                {
                    System.out.println(vgList.get(i).getName() + ": total: " + "[" + arr.get(i).getSize() + "] " + "available: " + "[" + vgList.get(i).vgSize() + "] " + "[");
                }
            }
            if (cmd.contains("lvcreate"))
            {
                String name =
            }
        }
    }
}
