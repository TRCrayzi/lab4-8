package Menu.DiskMenu;

import Drives.Disk;
import Menu.Command;

public class ShowSongListCommand implements Command {
    private Disk disk;

    public ShowSongListCommand(Disk disk) {
       this.disk = disk;
    }
    @Override
    public void execute() {
            disk.getService().getSonglist(disk.getSonglist());
    }
}
