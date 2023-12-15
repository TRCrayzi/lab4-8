package Menu.DiskMenu;

import Drives.Disk;
import Menu.Command;
import Music.Song;

import java.util.ArrayList;
import java.util.List;

public class AddSongCommand implements Command {
    private Disk disk;

    public AddSongCommand(Disk disk) {
        this.disk = disk;
    }

    @Override
    public void execute() {
        disk.addSong();
    }
}
