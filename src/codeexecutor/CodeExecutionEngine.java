package codeexecutor;

import java.io.IOException;
import java.io.InputStream;

public abstract class CodeExecutionEngine {
    protected String workingDirectory;

    protected CodeExecutionEngine(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    public InputStream executeCode(String fileName) throws IOException {
         ProcessBuilder processBuilder = buildAndRunContainer(fileName);
         Process process = processBuilder.start();
         return process.getInputStream();
    }

    public abstract ProcessBuilder buildAndRunContainer(String fileName);
}
