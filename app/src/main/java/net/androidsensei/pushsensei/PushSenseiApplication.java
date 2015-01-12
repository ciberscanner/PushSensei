package net.androidsensei.pushsensei;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseInstallation;

public class PushSenseiApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "zonv8oWSwrpDQ0F2At7Va9MvoNSchPy7sSNCOKSj",
                "XCLRorAEQpxwDtgCnj5tmfke1ogeTJEFaCaRdWqu");
        ParseInstallation.getCurrentInstallation()
                    .saveInBackground();
    }
}
