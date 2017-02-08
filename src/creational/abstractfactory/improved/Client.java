package creational.abstractfactory.improved;

public class Client {

	
	public static void initializeGUI(WidgetFactory factory){
		initializeGUI(factory.createScrollBar(), factory.createWindow());
	}
		
	public static void initializeGUI(ScrollBar bar, Window window){
		System.out.println("Do initazation logic here with "+bar.getClass().getName()+" and "+window.getClass().getName());
	}

	/**
	 * With this implementation we are FORCING the user's to have similar themes, i.e.
	 * we will have a full Pink Theme (PinkScrollBar/PinkWindow) there is no mixing involved
	 * here, so we won't have say a PinkScrollBar with a YellowWindow.
	 *
	 * @param args
	 */
	public static void main(String [] args){

        WidgetFactory factory = new PinkThemeWidgetFactory();
        initializeGUI(factory);

        factory = new  YellowThemeWidgetFactory();
        initializeGUI(factory);

		
	}
	
	
	
}
