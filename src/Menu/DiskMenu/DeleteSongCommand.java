package Menu.DiskMenu;

import Drives.Disk;
import Menu.Command;

public class DeleteSongCommand implements Command {
    private Disk disk;

    public DeleteSongCommand(Disk disk) {
        this.disk = disk;
    }

    @Override
    public void execute() {
        disk.removeSong();
    }
}
