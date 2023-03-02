
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static Log log = new Log();


    public static String getLogMessage(String name, String path, String e) {
        String s = name.equals("") ? path + "был создан" : " что-то пошло не так и объект" + name.equals("") + "по пути" + path + "не был создан";

        return e.equals("") ? s : s + path;
    }


    private static void create(ArrayList<String> list, String path) {
        File root = new File(path);
        if (!root.exists()) {
            try {
                root.mkdir();
                log.addlog(getLogMessage("", path, ""));
            } catch (Exception e) {
                log.addlog(getLogMessage("", path, e.getMessage()));
            }
        }
        for (String a : list) {
            if (a.contains(".")) {
                File file = new File(path + "//" + a);
                try {
                    file.createNewFile();
                    log.addlog(getLogMessage(a, path, ""));
                } catch (Exception e) {
                    log.addlog(getLogMessage(a, path, e.getMessage()));
                }
            } else {
                File dir = new File(path + "//" + a);
                try {
                    dir.mkdir();
                    log.addlog(getLogMessage(dir.getName(), path, ""));
                } catch (Exception e) {
                    log.addlog(getLogMessage(dir.getName(), path, e.getMessage()));
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

        File logger = new File("C:/Users/Анастасия/Desktop/Games/temp/temp.txt");
        FileWriter fileWriter = new FileWriter(logger);
        fileWriter.write(log.getLog().toString());
        fileWriter.flush();
        fileWriter.close();
    }
}















