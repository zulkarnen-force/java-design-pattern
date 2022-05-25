package structural.decorators;

/**
 * Simple interaface that define read and write operations
 */

public interface DataSource {

    void writeData(String data);

    String readData();
    
}
