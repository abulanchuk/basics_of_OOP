package Task1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        TextFile myFile = new TextFile("D:\\MyFiles\\JavaTraining\\basics_of_OOP\\note.txt");
        myFile.createFile();
        System.out.println("1. rename, 2. output, 3. add, 4. delete");
        Scanner in = new Scanner(System.in);
        int n = 0;
        do {
            n = in.nextInt();
            switch (n) {
                case 1: {
                    myFile.rename("D:\\MyFiles\\JavaTraining\\basics_of_OOP\\note2.txt");
                    break;
                }
                case 2: {
                    myFile.output();
                    break;
                }
                case 3: {
                    String text = in.nextLine();
                    text = in.nextLine();
                    myFile.add(text);
                    break;
                }
                case 4: {
                    myFile.delete();
                    break;
                }

                default:
                    break;
            }
        } while (n > 0 && n < 5);
    }
}
