package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FactorypatternSquare  extends DesignPattern implements Shape{
	private static final Logger LOGGER=LogManager.getLogger(FactorypatternSquare.class);
	@Override
	public void draw() {
		LOGGER.info("Inside Square::draw() method.");
		
	}

}
