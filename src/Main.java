import codeexecutor.CodeExecutionEngine;
import codeexecutor.JavaCodeExecutionEngine;
import codeexecutor.JavascriptCodeExecutionEngine;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String codeFileName = args[0];
            CodeExecutionEngine executionEngine = null;
        if (args[0].contains((".js"))) {
            executionEngine = new JavascriptCodeExecutionEngine();
        } else if (args[0].contains(".java")) {
            executionEngine = new JavaCodeExecutionEngine();
        }
        printStream(executionEngine.executeCode(codeFileName));
    }

    private static void printStream(InputStream inputStream) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
