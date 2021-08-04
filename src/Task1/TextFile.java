package Task1;

import java.io.*;
import java.util.Scanner;
import java.io.File;

public class TextFile {
    String path;
    File file;

    public TextFile(String path) {
        this.path = path;
    }

    public void createFile() {
        file = new File(this.path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("was created");
    }

    public void rename(String newPath) {
        File f = new File(newPath);
        boolean result = this.file.renameTo(f);
        if (!result) {
            System.out.println("this file didn't rename");
        }
        this.file = f;
        System.out.println("done");
    }

    public void output() {
        try (BufferedReader br = new BufferedReader(new FileReader(this.file))){
            for (String line; (line = br.readLine()) != null;) {
                System.out.print(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void add(String text) {
        try (FileWriter fw = new FileWriter(this.file, true)) {
            fw.write(text);//appends the string to the file
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void delete() {
        if (!file.delete()) {
            System.out.println("Cannot delete file");
        }
    }
}
