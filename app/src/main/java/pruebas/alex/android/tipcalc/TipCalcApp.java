package pruebas.alex.android.tipcalc;

import android.app.Application;

/**
 * Created by alexander on 06-23-16.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL="https://www.google.com.ni";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
