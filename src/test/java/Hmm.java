import kiddi.music.abletonparser.AbletonParser;
import kiddi.music.abletonparser.simplemodel.AbletonWrapper;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Paths;

public class Hmm {
    @Test
    public void bla() throws IOException {
        AbletonParser parser = new AbletonParser();
        AbletonWrapper ableton = parser.parse(Paths.get("src/test/resources/Agnosie.als"));

    }
}
