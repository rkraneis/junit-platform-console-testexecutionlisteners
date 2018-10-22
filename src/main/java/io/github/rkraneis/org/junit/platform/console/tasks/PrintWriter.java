package io.github.rkraneis.org.junit.platform.console.tasks;

// drop-in for java.io.PrintWriter to keep changes to all classes minimal
import java.util.Locale;

public class PrintWriter {

    void print(String s) {
        System.out.print(s);
    }

    void print(Object obj) {
        System.out.print(obj);
    }

    void printf(String format, Object... args) {
        System.out.printf(format, args);
    }

    void printf(Locale l, String format, Object... args) {
        System.out.printf(l, format, args);
    }

    void println() {
        System.out.println();
    }

    void println(String s) {
        System.out.println(s);
    }

    void flush() {
        System.out.flush();
    }

}
