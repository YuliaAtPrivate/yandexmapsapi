import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.*;

/**
 * Created by Roman_Iovlev on 1/17/2017.
 */
public class LogStream extends PrintStream {
    public static LogStream logStream() {
        try {
            return new LogStream();
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    /*private LogStream() throws FileNotFoundException {
        super(new File("D:/temp/test.txt"));
    }*/
    private LogStream() throws FileNotFoundException {
        super(new File("D:/temp/test.txt"));
    }
    @Override
    public void println(String s) {
        super.println(request(s));
    }
    @Step("Request")
    @Attachment("text/plain")
    private String request(String s) { return s; }

}
