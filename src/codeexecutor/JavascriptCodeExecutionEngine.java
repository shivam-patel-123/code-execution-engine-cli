package codeexecutor;

import java.io.File;

public class JavascriptCodeExecutionEngine extends CodeExecutionEngine {
    public JavascriptCodeExecutionEngine() {
        super("codeexecutor/javascript");
    }

    @Override
    public ProcessBuilder buildAndRunContainer(String fileName) {
         ProcessBuilder processBuilder = new ProcessBuilder();
         processBuilder.directory(new File(this.workingDirectory));
         processBuilder.command("sh", "-c", "bash execute.sh " + fileName);
         return processBuilder;
    }
}
