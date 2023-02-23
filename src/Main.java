
import java.io.*;

public class Main {
    public static void files() {

        File file = new File("C:/Users/Анастасия/Desktop/Games");
        if (file.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что-то пошло не так");

        File src = new File("C:/Users/Анастасия/Desktop/Games/src");
        if (src.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что-то пошло не так");

        File res = new File("C:/Users/Анастасия/Desktop/Games/res");
        if (res.mkdir())
            System.out.println("каталог создан");
        else
            System.out.println("Что-то пошло не так");

        File savegames = new File("C:/Users/Анастасия/Desktop/Games/savegames");
        if (savegames.mkdir())
            System.out.println("каталог создан");
        else
            System.out.println("Что-то пошло не так");

        File temp = new File("C:/Users/Анастасия/Desktop/Games/temp");
        if (temp.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что-то пошло не так");


        File main = new File("C:/Users/Анастасия/Desktop/Games/src/main");
        if (main.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что-то пошло не так");
        File test = new File("C:/Users/Анастасия/Desktop/Games/src/test");
        if (test.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что-то пошло не так ");


        File mainJava = new File("C:/Users/Анастасия/Desktop/Games/src/main/Main.java");
        try {
            if (mainJava.createNewFile())
                System.out.println("Файл был успешно создан");

        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }

        File utilsJava = new File("C:/Users/Анастасия/Desktop/Games/src/main/Utils.java");
        try {
            if (utilsJava.createNewFile())
                System.out.println("Файл был успешно создан");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File drawables = new File("C:/Users/Анастасия/Desktop/Games/res/drawables");
        if (drawables.mkdir())
            System.out.println("Ok");
        else
            System.out.println("error");

        File vectors = new File("C:/Users/Анастасия/Desktop/Games/resvectors");
        if (vectors.mkdir())
            System.out.println("ok");
        else
            System.out.println("error");

        File icons = new File("C:/Users/Анастасия/Desktop/Games/icons");
        if (icons.mkdir())
            System.out.println("ok");
        else
            System.out.println("error");
        File txt = new File("C:/Users/Анастасия/Desktop/Games/temp/temp.txt");
        try {
            if (txt.createNewFile())
                System.out.println("ok");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static void main(String[] args) {



            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);

            PrintStream originalStdOut = System.out;

            System.setOut(ps);

            files();

            System.out.flush();
            System.setOut(originalStdOut);

            try (OutputStream fos = new FileOutputStream("C:/Users/Анастасия/Desktop/Games/temp/temp.txt")) {
                baos.writeTo(fos);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                ;
            }
        }
    }










