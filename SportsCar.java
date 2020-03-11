package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SportsCar extends CarDecorator {
	private  final Logger LOGGER=LogManager.getLogger(SportsCar.class);
	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		LOGGER.info(" Adding features of Sports Car.");
	}
}