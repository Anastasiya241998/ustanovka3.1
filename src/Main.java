
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static String getLogMessage(String name, String path) {
        String str = name.equals(" ") ? "по пути" + path + "был создан" : "error";

        StringBuilder builder = new StringBuilder(str);
        builder.append(str);
        return builder.toString();

    }


    private static void create(ArrayList<String> list, String path) {
        File root = new File(path);
        if (!root.exists()) {
            try {
                root.mkdir();
                getLogMessage(" ", path);
            } catch (Exception e) {
                getLogMessage("", path);
            }
        }
        for (String a : list) {
            if (a.contains(".")) {
                File file = new File(path + "//" + a);
                try {
                    file.createNewFile();
                    getLogMessage(a, path);
                } catch (Exception e) {
                    getLogMessage(a, path);
                }
            } else {
                File dir = new File(path + "//" + a);
                try {
                    dir.mkdir();
                    getLogMessage(" ", path);
                } catch (Exception e) {
                    getLogMessage(" ", path);
                }
            }
        }
    }


    public static void main(String[] args) throws Exception {

        create(new ArrayList<>(Arrays.asList("src", "res", "savegames", "temp")), "C:/Users/Анастасия/Desktop/Games");
        create(new ArrayList<>(Arrays.asList("main", "test")), "C:/Users/Анастасия/Desktop/Games/src");
        create(new ArrayList<>(Arrays.asList("Main.java", "Utils.java")), "C:/Users/Анастасия/Desktop/Games/src/main");
        create(new ArrayList<>(Arrays.asList(
                "drawables", "vectors", "icons"
        )), "C:/Users/Анастасия/Desktop/Games/res");
        create(new ArrayList<>(Arrays.asList(
                "temp.txt"
        )), "C:/Users/Анастасия/Desktop/Games/temp/temp");

        FileWriter writer = new FileWriter("C:/Users/Анастасия/Desktop/Games/temp/temp.txt");
        writer.write(getLogMessage());

    }
}















