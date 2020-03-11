package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
interface Car{

	public void assemble();
}
public class BasicCar implements Car {
	private  final Logger LOGGER=LogManager.getLogger(BasicCar.class);
	@Override
	public void assemble() {
		LOGGER.info("Basic Car.");
	}

}