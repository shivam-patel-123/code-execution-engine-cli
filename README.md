# Code Execution Engine

### **About application**

This CLI runs your code in a secure and isolted environment. Docker has made this possible

### **Security**

I have used Docker container to execute code for each request, isolated from each other.

# Requirements

-   **Docker:** Docker Daemon is the primary requirement because it is used to run the user's code.

-   **Java JDK:** As I have used Java as the language to create Command Line Interface, JDK is must to have. You can run below command to check if java is installed in your machine or not:

```
java --version
```

-   **Git cli:** Download Git command line interface using this [link](https://git-scm.com/downloads). If you are not sure if you have installed git on you machine, run the following command:

```
git -v
```

# How to use

-   **Clone the Repo:** Download this code to your local machine.

```
git clone https://github.com/shivam-patel-123/code-execution-engine-cli.git
```

-   **Start Docker Daemon:** Start Docker daemon service in your machine. You can do this directly with your terminal as well. For Linux users, run below command to start docker service:

```
sudo systemctl start docker
```

-   **Compile and Run:**
    To run java code:

```
cd code-execution-engine-cli/src
javac *.java && java Main test.java
```

To run javascript code:

```
cd code-execution-engine-cli/src
javac *.java && java Main test.js
```

`Note:` `test.java` and `test.js` file is located at `src/codeexecutor/java/codefiles/test.java` and `src/codeexecutor/javascript/codefiles/test.js` respectively. You can edit this file to write the code to execute in this file. Currently, there is no any option to file the code file as the input. It will be added in the near future.
