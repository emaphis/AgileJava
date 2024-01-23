package util;

/**
 * Class to hold static String utilities
 * @author emaph
 */
public class StringUtil {
    public static final String NEWLINE =
            System.getProperty("line.separator");

    private StringUtil() { }

    public static String addNewLine(String line) {
        return line + NEWLINE;
    }

}
