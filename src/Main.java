import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = out::println;
        OnTaskErrorListener errorListener = out::println;
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}