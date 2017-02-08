package creational.singleton.improved;

public class Client {

	/**
	 * Two instances TOTAL:
	 * ONE instance of Preferences
	 * ONE instance of MyPreferences
	 *
	 * So for each object definition there is only one object at runtime.
	 * @param args
	 */
	public static void main(String [] args){

		// Hello I'm a singleton
		Preferences.getInstance().helloSingleton();

		// Hello My Preferences
        MyPreferences.getInstance().helloSingleton();
		
	}
	
}
