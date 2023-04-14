package codeexecutor;

import java.io.File;

public class JavaCodeExecutionEngine extends CodeExecutionEngine {
    public JavaCodeExecutionEngine() {
        super("codeexecutor/java");
    }

    @Override
    public ProcessBuilder buildAndRunContainer(String fileName) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.directory(new File(this.workingDirectory));
        processBuilder.command("sh", "-c", "bash execute.sh " + fileName);
        return processBuilder;
    }
}
