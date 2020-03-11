package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class LuxuryCar extends CarDecorator {
	private  final Logger LOGGER=LogManager.getLogger(SportsCar.class);
	public LuxuryCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		LOGGER.info(" Adding features of Luxury Car.");
	}
}