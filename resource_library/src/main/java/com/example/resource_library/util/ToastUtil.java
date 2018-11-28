package com.example.resource_library.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by JJY on 2016/8/24.
 */
public class ToastUtil {
    public static void showShortToast(Context context, String content) {
        Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
    }

    public static void showLongToast(Context context, String content) {
        Toast.makeText(context, content, Toast.LENGTH_LONG).show();
    }

}
