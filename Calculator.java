
/**
 * An interface definition with single abstract method, two default
 * methods and the requirement to override toString() by classes implementing
 * the interface
 * @author Pandu79
 *
 */
@FunctionalInterface
public interface Calculator {
	public abstract int calculate(int a, int b);
	public default int substract(int a, int b) { return a - b; }
	public default int add(int a, int b) {return a + b; }
	
	@Override
	public String toString();
	
}
