package com.example.resource_library.util;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by JJY on 2016/8/22.
 */
public class BASE64Util {
    public static String encodeBase64File(String path) throws Exception {
        File file = new File(path);
        FileInputStream inputFile = new FileInputStream(file);
        byte[] buffer = new byte[(int) file.length()];
        inputFile.read(buffer);
        inputFile.close();
        return android.util.Base64.encodeToString(buffer, android.util.Base64.DEFAULT);
    }
}
