package Menu;

import Drives.Disk;
import Menu.DiskMenu.AddSongCommand;
import Menu.DiskMenu.DeleteSongCommand;
import Menu.DiskMenu.ShowSongListCommand;

import java.util.Scanner;

public class menu {
    public menu()
    {
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.println("Please make choice and press Enter");
            System.out.println("1: Music");
            System.out.println("2: Files");
            System.out.println("3: Exit");
            command = scanner.nextLine();
            switch (command){
                case  "1":
                    musicMenu();
                    break;

                case  "2":
                    fileMenu();
                    break;

                case  "3":
                    break;

                default:
                    System.out.println("Command not recognized! Try again");
            }
        }
        while(!command.equals("3"));
    }
    public void musicMenu()
    {
        Invoker user = new Invoker();
        Scanner scanner = new Scanner(System.in);
        String command;
        System.out.println("Name List");
        Disk disk = new Disk(scanner.nextLine());
        do {
            System.out.println("Please make choice and press Enter");
            System.out.println("1: Add song");
            System.out.println("2: Delete song");
            System.out.println("3: show Song list");
            System.out.println("4: get Total Duration");
            System.out.println("5: Sort Disk");
            System.out.println("6: Exit");
            command = scanner.nextLine();
            switch (command){
                case  "1":
                    Command addSong = new AddSongCommand(disk);
                    break;

                case  "2":
                    Command delSong = new DeleteSongCommand(disk);
                    break;

                case  "3":
                    Command getSongs = new ShowSongListCommand(disk);
                    break;
                case  "4":

                    break;

                case  "5":
                    break;

                case  "6":
                    break;

                default:
                    System.out.println("Command not recognized! Try again");
            }
        }
        while(!command.equals("3"));
    }
    public void fileMenu()
    {
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.println("Please make choice and press Enter");
            System.out.println("1: Music");
            System.out.println("2: Files");
            System.out.println("3: Exit");
            command = scanner.nextLine();
            switch (command){
                case  "1":
                    break;

                case  "2":
                    break;

                case  "3":
                    break;

                default:
                    System.out.println("Command not recognized! Try again");
            }
        }
        while(!command.equals("4"));
    }
}
