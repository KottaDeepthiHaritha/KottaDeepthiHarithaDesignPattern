package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
interface Car{
	public void assemble();
}
public class DecoratorpatternBasicCar implements Car{
	private static final Logger LOGGER=LogManager.getLogger(DecoratorpatternBasicCar.class);
   @Override
	public void assemble() {
		LOGGER.info("Basic Car");
	}

}
