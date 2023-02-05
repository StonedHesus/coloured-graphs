// The package in which the current Java compilation unit is to be found.
package coloured.graphs.util.parsers;
// Imports from existing Java libraries, classes and interfaces.

// Import from custom libraries, classes and interfaces.

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * <p>
 *     This compilation unit contains a Java class construct which models a parser specifically tailored for the
 *     .xy file format.
 * </p>
 *
 * <p>
 *     It is important to note, that due to high nature of the .xy file format, the parse method will return a
 *     dictionary, containing all the data from the file. The keys of the dictionary are defined as static public constant
 *     in this unit, and hence can be accessed from outside the class.
 * </p>
 * @author Andrei-Paul Ionescu
 */
public final class XYParser extends Parser{
    // Static values/constants of the class.
    public static final String WIDTH = "width";
    public static final String HEIGHT = "height";
    public static final String RADIUS = "radius";
    public static final String NODES = "nodes";
    // Fields/attributes of the class.

    // Constructor(s) of the class.

    // Getters of the class.

    // Setters of the class.

    // Public non-static methods of the unit.

    // Public static methods of the unit.
    public static HashMap<String, Number> parse(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            Scanner scanner = new Scanner(bufferedReader);
            scanner.useDelimiter(" ");
            HashMap<String, Number> map = new HashMap<>();

            map.put(WIDTH, scanner.nextInt());
            map.put(HEIGHT, scanner.nextInt());
            map.put(RADIUS, scanner.nextInt());
            var nodes = scanner.nextInt();
            var coordinates = new ArrayList<Point>();
            System.out.println(scanner.next());

            return  map;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // Private methods of the unit.

    // Nested class(es)/membered type(s).
}
