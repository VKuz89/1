import asg.cliche.ShellFactory;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ShellFactory.createConsoleShell("hello", "This is Product Accounting System", new Products())
                .commandLoop();
    }

}