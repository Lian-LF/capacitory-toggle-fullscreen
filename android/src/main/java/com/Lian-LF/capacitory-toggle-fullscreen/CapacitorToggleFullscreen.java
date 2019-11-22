package com.Lian-LF.capacitory-toggle-fullscreen;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import android.view.WindowManager;
import android.content.pm.ActivityInfo;


@NativePlugin()
public class CapacitorToggleFullscreen extends Plugin {

    @PluginMethod()
    public void echo(PluginCall call) {
//         String value = call.getString("value");
//

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        JSObject ret = new JSObject();
//         ret.put("value", value);
        call.resolve(ret);
    }
}
