// The package in which the current Java compilation unit is to be found.
package coloured.graphs.util.parsers;
// Imports from existing Java libraries, classes and interfaces.
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import java.io.File;
import java.net.URISyntaxException;
import java.util.Objects;
// Import from custom libraries, classes and interfaces.

/**
 * @author Andrei-Paul Ionescu
 */
public final class XYParserTest {

    private static File target;

    @BeforeAll
    public static void init() {
        try {
            XYParserTest.target = new File(Objects.requireNonNull(XYParserTest.class.getResource("graph.xy")).toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This here routine is responsible for ensuring that the parse method properly extracts the data from the file.
     */
    @Test
    @DisplayName("Test the parse method.")
    public void testParseOfDummyFile() {
        // I might break this into smaller tests, such as check that the width was properly parsed and stored, etcetera.
        var data = XYParser.parse(XYParserTest.target.getAbsoluteFile());
        System.out.println(data);
    }
}
