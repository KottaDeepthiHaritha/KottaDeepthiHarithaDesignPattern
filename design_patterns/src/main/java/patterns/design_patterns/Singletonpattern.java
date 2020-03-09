package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class Singletonpattern extends DesignPattern{
	private static final Logger LOGGER=LogManager.getLogger(Singletonpattern.class);
	private static Singletonpattern instance = new Singletonpattern();
	public static Singletonpattern getInstance() {
		return instance;
	}
	public void Message() {
	    LOGGER.info("only one instance");
	}

}
