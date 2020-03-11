package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
interface Shape{
	void draw();
}
public class FactorypatternCircle extends DesignPattern implements Shape {
	private static final Logger LOGGER=LogManager.getLogger(FactorypatternCircle.class); 
	@Override
	   public void draw(){
	      LOGGER.info("Inside Circle::draw() method.");
	   }

}
