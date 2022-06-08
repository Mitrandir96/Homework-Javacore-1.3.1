import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        File src = new File("C://Users//i.grachev//IdeaProjects//Games//src");
        if (src.mkdir()) {
            sb.append("Директория src успешно создана" + "\n");
        } else {
            sb.append("Директория src не создана" + "\n");
        }
        File res = new File("C://Users//i.grachev//IdeaProjects//Games//res");
        if (res.mkdir()) {
            sb.append("Директория res успешно создана" + "\n");
        } else {
            sb.append("Директория res не создана" + "\n");
        }
        File savegames = new File("C://Users//i.grachev//IdeaProjects//Games//savegames");
        if (savegames.mkdir()) {
            sb.append("Директория savegames успешно создана" + "\n");
        } else {
            sb.append("Директория savegames не создана" + "\n");
        }
        File temp = new File("C://Users//i.grachev//IdeaProjects//Games//temp");
        if (temp.mkdir()) {
            sb.append("Директория temp успешно создана" + "\n");
        } else {
            sb.append("Директория temp не создана" + "\n");
        }
        File main = new File("C://Users//i.grachev//IdeaProjects//Games//src//main");
        if (main.mkdir()) {
            sb.append("Директория main успешно создана" + "\n");
        } else {
            sb.append("Директория main не создана" + "\n");
        }
        File test = new File("C://Users//i.grachev//IdeaProjects//Games//src//test");
        if (test.mkdir()) {
            sb.append("Директория test успешно создана" + "\n");
        } else {
            sb.append("Директория test не создана" + "\n");
        }
        File mainJava = new File("C://Users//i.grachev//IdeaProjects//Games//src//main//main.java");
        try {
            if (mainJava.createNewFile()) {
                sb.append("Файл main.java успешно создан" + "\n");
            }
        } catch (IOException ex) {
            sb.append(ex.getMessage());
        }
        File utilsJava = new File("C://Users//i.grachev//IdeaProjects//Games//src//main//Utils.java");
        try {
            if (utilsJava.createNewFile()) {
                sb.append("Файл Utils.java успешно создан" + "\n");
            }
        } catch (IOException ex) {
            sb.append(ex.getMessage());
        }
        File drawables = new File("C://Users//i.grachev//IdeaProjects//Games//res//drawables");
        if (drawables.mkdir()) {
            sb.append("Директория drawables успешно создана" + "\n");
        } else {
            sb.append("Директория drawables не создана" + "\n");
        }
        File vectors = new File("C://Users//i.grachev//IdeaProjects//Games//res//vectors");
        if (vectors.mkdir()) {
            sb.append("Директория vectors успешно создана" + "\n");
        } else {
            sb.append("Директория vectors не создана" + "\n");
        }
        File icons = new File("C://Users//i.grachev//IdeaProjects//Games//res//icons");
        if (icons.mkdir()) {
            sb.append("Директория icons успешно создана" + "\n");
        } else {
            sb.append("Директория icons не создана" + "\n");
        }
        File temptxt = new File("C://Users//i.grachev//IdeaProjects//Games//temp//temp.txt");
        try {
            if (temptxt.createNewFile()) {
                sb.append("Файл temp.txt успешно создан" + "\n");
            }
        } catch (IOException ex) {
            sb.append(ex.getMessage());
        }
        String text = String.valueOf(sb);
        try (FileWriter writer = new FileWriter("C://Users//i.grachev//IdeaProjects//Games//temp//temp.txt",
                false)) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}