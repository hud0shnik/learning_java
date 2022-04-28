/*
 * Да, тут, конечно, файлов побольше чем в проектах на плюсах...
 */

package helloWorld;

public class App {
    public String getGreeting() {
        return "101";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
