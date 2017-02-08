package creational.singleton;


public class Preferences {

    // global identifier that links to this class
    public static Preferences globalPreferences = new Preferences("First one created");

    private String preference;

    public Preferences(String preference){
        this.preference = preference;
    }

    public String getPreferencesDetail(){
        return preference;
    }

}
