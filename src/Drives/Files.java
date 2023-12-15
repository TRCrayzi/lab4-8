package Drives;

import Music.Song;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Files {
    private File saveDir;
    private File saveFile;
    private Scanner scanner;
    private String command;

    public Files(){
        scanner = new Scanner(System.in);
        saveDir = new File("B:\\Songs");
        if (!saveDir.exists()) {
            saveDir.mkdir();
        }
    }

    public void createFile(List<Song> songlist ) {
        System.out.println("name the file");
        command = scanner.nextLine();
        saveFile = new File("B:\\Music\\"+command+".txt");
        WriteFile(songlist);
    }

    public void WriteFile(List<Song> songlist) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(saveFile));
            for (Song song: songlist) {
                writer.write(song.toString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    public File chooseFile() {
        File[] files = saveDir.listFiles();
        System.out.println("choose Replay 1-n");
        showFiles();
        int f = new Scanner(System.in).nextInt();
        return files[f];
    }
    public void openFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(chooseFile()))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showFiles() {
        File[] files = saveDir.listFiles();
        int i=0;
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(i+ ") " + file.getName());
            }
            i++;
        }
    }
    public void deleteFile(File file) {
        if (file.delete()) {
            System.out.println(file.getName() + " deleted");
        } else {
            System.out.println(file.getName() + " not deleted");
        }
    }
}
