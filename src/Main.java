
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void createDirectorion (String divPath, StringBuilder stringBuilder) {
        File dir = new File(divPath);
        if(dir.mkdir())
        stringBuilder.append(dir.getName() + "  каталог создан \n");
    }

    public static void  createFile ( String filePath, String fileName, StringBuilder stringBuilder){
        File file = new File(filePath, fileName);
        try {
            if (file.createNewFile())
                stringBuilder.append(file.getName() + "  файл создан\n");
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }



    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        String[] dirArray = new String[] { "C:/Users/Анастасия/Desktop/Games", "C:/Users/Анастасия/Desktop/Games/src", "C:/Users/Анастасия/Desktop/Games/res", "C:/Users/Анастасия/Desktop/Games/savegames",
        "C:/Users/Анастасия/Desktop/Games/temp", "C:/Users/Анастасия/Desktop/Games/src/main", "C:/Users/Анастасия/Desktop/Games/src/test",
        "C:/Users/Анастасия/Desktop/Games/res/drawables", "C:/Users/Анастасия/Desktop/Games/res/vectors", "C:/Users/Анастасия/Desktop/Games/res/icons"};

        String[] fileNames = new String[] {"Main.java", "Utils.java", "temp.txt"};
        String[] filePath = new String[] {"C:/Users/Анастасия/Desktop/Games/src/main", "C:/Users/Анастасия/Desktop/Games/src/main",
                "C:/Users/Анастасия/Desktop/Games/temp/temp"};

        for (String dir : dirArray) {
            createDirectorion(dir, str);
        }

        for (int i = 0; i < fileNames.length; i++) {
            createFile(filePath[i],fileNames[i], str);
        }
//
        try (FileWriter writer  = new FileWriter("C:/Users/Анастасия/Desktop/Games/temp/temp.txt")) {
            writer.write(str.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }



//

    }
}















