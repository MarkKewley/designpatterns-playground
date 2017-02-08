package creational.singleton;


public class Client {

    public static void main(String[] args) {
        System.out.println(Preferences.globalPreferences.getPreferencesDetail());

        // Here we have a second preference being created
        Preferences secondPreferences = new Preferences("Second Preference");


        // Doesn't matter since we could set this to final, but just to see you could set the global preference
        Preferences.globalPreferences = secondPreferences;

    }

}
