/*
 * Shannon Duvall and <Put your name here.>
 * This object does basic reflection functions
 */
import java.lang.reflect.*;

public class ReflectionUtilities {
	
	/* Given a class and an object, tell whether or not the object represents 
	 * either an int or an Integer, and the class is also either int or Integer.
	 * This is really yucky, but the reflection things we need like Class.isInstance(arg)
	 * just don't work when the arg is a primitive.  Luckily, we're only worrying with ints.
	 * This method works - don't change it.
	 * 
	 * Note that if the inputs aren't integers at all it just returns false.
	 */
	private static boolean typesMatchInts(Class<?> maybeIntClass, Object maybeIntObj){
		//System.out.println("I'm checking on "+maybeIntObj);
		//System.out.println(maybeIntObj.getClass());
		try{
			return (maybeIntClass == int.class) &&
				(int.class.isAssignableFrom(maybeIntObj.getClass()) || 
						maybeIntObj.getClass()==Class.forName("java.lang.Integer"));
		}
		catch(ClassNotFoundException e){
			return false;
		}
	}
	
	/*
	 * TODO: typesMatch
	 * Takes an array of Classes and an array of Objects.
	 * This method should return true if and only if the following 
	 * two things are true:
	 * 1) The 2 arrays are the same length
	 * 2) The ith Object has a type equal to the ith Class.
	 * 
	 * For examples:
	 * typesMatch([String.class, int.class], ["hey", 3]) returns true
	 * typesMatch([],[]) returns true
	 * typesMatch([String.class], [3]) returns false
	 * typesMatch([String.class, String.class], ["hey"]) returns false
	 * 
	 * Note: call my typesMatchInts method to see if an object and class
	 * match as int types.  If it returns false, check if they match 
	 * using isInstance.
	 */
	public static boolean typesMatch(Class<?>[] formals, Object[] actuals){
		if (formals.length != actuals.length){
			return false;
		}
		else if (formals.length == actuals.length){
			for (int i=0; i<formals.length; i++){
				System.out.println(actuals[i]);
				System.out.println(i+" actuals equal " +actuals[i].getClass());
				System.out.println(i+" formals equal " +formals[i]);
				if(actuals[i].getClass()!=formals[i]){
//					System.out.println(actuals[i].getClass());
//					System.out.println(formals[i]);
					System.out.println("false");
					
					return false;
				}
			}
			System.out.println("true");
			return true;
		}
		System.out.println(formals.length);
		System.out.println(actuals.length);
		System.out.println("False");
		return false;
	}
	
	
	/*
	 * TODO: createInstance
	 * Given String representing fully qualified name of a class and the
	 * actual parameters for a constructor, 
	 * returns initialized instance of the corresponding 
	 * class using the matching constructor.  
	 * 
	 * Examples:
	 * createInstance("java.lang.String", []) returns an empty String.
	 * createInstance("java.lang.Integer", [3]) returns a new Integer, 3.
	 * 
	 * You need to use typeMatch to do this correctly.  Use the class to 
	 * get all the Constructors, then check each one to see if the types of the
	 * constructor parameters match the actual parameters given.
	 */
	public static Object createInstance(String name, Object[] args){
		//recognize type of object it is (String or int)
		try {
			Class<?> theClass = Class.forName(name);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(name == "java.lang.String"){
			
		}
		//get class of args
		//use typeMatch to compare args to the String given (typeMatch(String, args))
		//if they are the same, make the array into the actual parameter of the formal String name
		
		//turn what is in the array to the object (string or int)
		
		//return object 
		return null;
	}
	
	/*
	 * TODO: callMethod
	 * Given a target object with a method of the given name that takes 
	 * the given actual parameters, call the named method on that object 
	 * and return the result. 
	 * 
	 * If the method's return type is void, null is returned, but the 
	 * method should still be invoked.
	 * 
	 * Again, to do this correctly, you should get a list of the object's 
	 * methods that match the method name you are given.  Then check each one to 
	 * see which has formal parameters to match the actual parameters given.  When
	 * you find one that matches, invoke it.
	 */
	public static Object callMethod (Object target, String methodName, Object[] args)
	{
		return null;
	}
	
}
