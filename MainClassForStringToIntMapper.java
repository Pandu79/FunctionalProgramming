/**
 * This is the main class to run lambda expressions.
 * @author Pandu79
 *
 */
public class MainClassForStringToIntMapper {
	public static void main(String[] args) {
		StringToIntMapper mapper = str -> str.length();
		String name ="Java8Lambdas";
		int mappedValue = passLambdaexprIntoMethod(mapper);
		System.out.println("name:" +name +", mappedValue:" +mappedValue);
	}

	private static int passLambdaexprIntoMethod(StringToIntMapper mapper) {
		String name ="Java8Lambdas";
		int mappedValue = mapper.map(name);
		return mappedValue;
	}
}
