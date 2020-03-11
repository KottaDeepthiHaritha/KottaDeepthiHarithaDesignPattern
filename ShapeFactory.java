package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ShapeFactory {
	private static final Logger LOGGER=LogManager.getLogger(ShapeFactory.class); 
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new FactorypatternCircle(); 
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new FactorypatternSquare();
	      }
	      
	      return null;
	   }
	}