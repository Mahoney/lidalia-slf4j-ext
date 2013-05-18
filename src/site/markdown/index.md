## Lidalia SLF4J Extensions

An extension to [SLF4J](http://www.slf4j.org/) allowing logging at a level determined at run, rather than compile, time via a
Level enum.

See the [JavaDocs](./apidocs/index.html) for full documentation and the [Test Source](./xref-test/index.html) for complete
examples of usage.

Details on how to depend on this library in your favourite build tool can be found [here](./dependency-info.html).

### Usage

The basic class is a decorator around an org.slf4j.Logger that also implements that class. As such it can operate as a direct
drop-in replacement for the SLF4J API without breaking any existing code. The decorator adds a set of methods called log that take
an instance of Level as the first argument and delegate to the appropriate method on the SLF4J Logger (info for INFO, etc.).

    import uk.org.lidalia.slf4jext.Level;
    import uk.org.lidalia.slf4jext.Logger;
    import uk.org.lidalia.slf4jext.LoggerFactory;

    public class Example {

        private static final Logger logger = LoggerFactory.getLogger(Example.class);

        public static void main(String[] args) {
            Level level = Level.valueOf(args[0]);
            logger.log(level, "Logged at a level configured at runtime");
        }
    }
