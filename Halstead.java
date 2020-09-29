package sample;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Halstead {

    private ArrayList<String> allFileLines;
    private String groovyProgram;

    private HashSet<String> groovyTypes;

    private void fillPrimitiveGroovyTypes() throws IOException{
        ArrayList<String> basicTypes = (ArrayList<String>)
                Files.readAllLines(  Paths.get(System.getProperty("user.dir") + "\\src\\sample\\basicTypes.txt")   );
        groovyTypes = new HashSet<String>();
        groovyTypes.addAll(basicTypes);
    }

    public Halstead(File file) throws IOException {
        fillPrimitiveGroovyTypes();
        allFileLines = (ArrayList<String>) Files.readAllLines(file.toPath());

        StringBuilder sb = new StringBuilder();
        for (String s : allFileLines) {
            sb.append(s);
            sb.append("\n");
        }

        groovyProgram = sb.toString();

        System.out.println(groovyProgram);
    }
}
