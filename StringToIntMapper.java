/**
 * An example of functional interface with only one abstract
 * method to be later used in a lambda expression.
 * @author Pandu79
 *
 */
@FunctionalInterface
public interface StringToIntMapper {
	public int map(String str);
}
