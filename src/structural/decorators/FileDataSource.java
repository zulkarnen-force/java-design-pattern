package structural.decorators;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Simple data reader-writer
 */

public class FileDataSource implements DataSource {

    private String path;

    public FileDataSource(String path) {
        this.path = path;
    }

    @Override
    public void writeData(String data) {
        File file = new File(path);
        try(OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException why) {
            System.out.println(why.getMessage());
        }
        
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(path);

        try(FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch(IOException why) {
            System.out.println(why.getMessage());
        }

        return new String("String");

    }
    
}
