package testng;

import java.io.IOException;
import java.util.Properties;


public class Loadproperties {
	public static String App_URl;
	public static String Browser;
	public static String Username;
	public static String Password;
	public void loadprop(){
		Properties prop = new Properties();
		try {
			prop.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Loadproperties.App_URl = prop.getProperty("APPURl");
		Loadproperties.Browser =prop.getProperty("browser");
		Loadproperties.Username =prop.getProperty("username");
		Loadproperties.Password =prop.getProperty("Password");
		

	}

}
