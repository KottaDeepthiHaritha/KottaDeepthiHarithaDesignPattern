package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class DecoratorpatternLuxuryCar implements Car {
	private static final Logger LOGGER=LogManager.getLogger(DecoratorpatternLuxuryCar.class);
	 @Override
		public void assemble() {
			LOGGER.info("Luxury Car");
		}
}
