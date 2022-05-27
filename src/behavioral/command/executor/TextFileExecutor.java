package behavioral.command.executor;

import java.util.ArrayList;
import java.util.List;
import behavioral.command.TextFileOperation;

public class TextFileExecutor {

    private final List<TextFileOperation> textFileOperations = new ArrayList<>();

    public String executeOperation(TextFileOperation operation) {
        textFileOperations.add(operation);
        return operation.execute();
    }

    
}
