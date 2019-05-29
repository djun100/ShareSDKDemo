package cn.sharesdk.demo.utils;

import android.content.Context;
import android.widget.Toast;

public class UtilDialog {
    public static void dialog(Context context,String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
