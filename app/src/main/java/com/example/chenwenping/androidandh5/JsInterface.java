package com.example.chenwenping.androidandh5;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by chenwenping on 17/2/19.
 */

public class JsInterface {

    private Context context;

    public JsInterface(Context context) {
        this.context = context;
    }

    @JavascriptInterface
    public void showToast(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
        log(msg);
    }

    private void log(String msg) {
       // Console.log(msg);
    }

}
