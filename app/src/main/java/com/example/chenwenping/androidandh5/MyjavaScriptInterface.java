package com.example.chenwenping.androidandh5;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by chenwenping on 17/2/19.
 */

public class MyjavaScriptInterface {
    private Context context;
    public MyjavaScriptInterface(Context context) {
        this.context = context;

    }

    @JavascriptInterface
    public void myShowToast(String toast) {
        Toast.makeText(context, toast, Toast.LENGTH_LONG).show();
    }
}
