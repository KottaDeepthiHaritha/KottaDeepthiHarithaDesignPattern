package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class DesignPattern 
{
	private static final Logger LOGGER=LogManager.getLogger(DesignPattern.class);
    public static void main( String[] args )
    {
        LOGGER.info("State pattern example" );
        Statepattern sp=new Statepattern();
        sp.alert(); 
        sp.alert(); 
        sp.setState(new Silent()); 
        sp.alert(); 
        sp.alert(); 
        sp.alert(); 
        LOGGER.info("--------------------------------------------");
        LOGGER.info("Decorator pattern example" );
        Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
		LOGGER.info("--------------------------------------------");
        LOGGER.info("Singleton Pattern example");
        Singletonpattern ss=new Singletonpattern();
        Singletonpattern ob=Singletonpattern.getInstance();
        ob.Message();
        LOGGER.info("--------------------------------------------");
        LOGGER.info("Factory Pattern");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        LOGGER.info("--------------------------------------------");
        LOGGER.info("Strategy Pattern");
        Context context = new Context(new Strategypatternadd());		
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        context = new Context(new StrategypatternSubtract());		
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        LOGGER.info("--------------------------------------------");
        LOGGER.info("Bridge Pattern");
        Vehicle vehicle1 = new Cars(new Produce(), new Assemble()); 
        vehicle1.manufacture(); 
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble()); 
        vehicle2.manufacture(); 

        
         

    }
}
