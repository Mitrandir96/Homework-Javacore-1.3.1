import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    final static String prefix = ("C:" + File.separator + "Users" + File.separator + "i.grachev" +
            File.separator + "IdeaProjects" + File.separator + "Games" + File.separator);
    final static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        createDir("src");
        createDir("res");
        createDir("savegames");
        createDir("temp");
        createSubDir("src", "main");
        createSubDir("src", "test");
        createFile("src" + File.separator + "main", "main.java");
        createFile("src" + File.separator + "main", "Utils.java");
        createSubDir("res", "drawables");
        createSubDir("res", "vectors");
        createSubDir("res", "icons");
        createFile("temp", "temp.txt");

        String text = String.valueOf(sb);
        try (FileWriter writer = new FileWriter(prefix + "temp" + File.separator + "temp.txt",
                false)) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
    private static void createDir(String name) {
        File dir = new File(prefix + name);
        if (dir.mkdir()) {
            sb.append("Директория " + name + " успешно создана" + "\n");
        } else {
            sb.append("Директория " + name + " не создана" + "\n");
        }
    }
    private static void createFile(String dir, String name) {
        File file = new File(prefix + dir + File.separator + name);
        try {
            if (file.createNewFile()) {
                sb.append("Файл " + name + " успешно создан" + "\n");
            }
        } catch (IOException ex) {
            sb.append(ex.getMessage());
        }
    }
    private static void createSubDir(String dir, String name) {
        File subDir = new File(prefix + dir + File.separator + name);
        if (subDir.mkdir()) {
            sb.append("Директория " + name + " успешно создана" + "\n");
        } else {
            sb.append("Директория " + name + " не создана" + "\n");
        }
    }

}