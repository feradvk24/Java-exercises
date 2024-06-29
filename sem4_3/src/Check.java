import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
public interface Check {
    boolean check(String path,List<String> s);
}
