package com.example.resource_library.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JJY on 2016/8/22.
 */
public class MIMEUtil {
    private static String DOC_TYPE_TMP= ".doc .docx .xls .xlsx .ppt .pptx .txt .wps .prop .log .conf .htm .html .pdf .xml";
    public static final String IMG_TYPE_TMP = ".gif .jpg .jpeg .png .bmp";
    public static final String VIDEO_TYPE_TMP = ".3gp .asf .avi .m4u .m4v .mov .mp4 .mpe .mpeg .mpg .mpg4 .rmvb";

    public static final String DOC_TYPE =DOC_TYPE_TMP+" "+DOC_TYPE_TMP.toUpperCase();
    public static final String IMG_TYPE = IMG_TYPE_TMP+" "+IMG_TYPE_TMP.toUpperCase();
    public static final String VIDEO_TYPE = VIDEO_TYPE_TMP+" "+VIDEO_TYPE_TMP.toUpperCase();


    private static final Map<String, String> MINE_MAP = new HashMap<>();

    static {
        //{后缀名，MIME类型}
        MINE_MAP.put(".3gp", "video/3gpp");
        MINE_MAP.put(".apk", "application/vnd.android.package-archive");
        MINE_MAP.put(".asf", "video/x-ms-asf");
        MINE_MAP.put(".avi", "video/x-msvideo");
        MINE_MAP.put(".bin", "application/octet-stream");
        MINE_MAP.put(".bmp", "image/bmp");
        MINE_MAP.put(".c", "text/plain");
        MINE_MAP.put(".class", "application/octet-stream");
        MINE_MAP.put(".conf", "text/plain");
        MINE_MAP.put(".cpp", "text/plain");
        MINE_MAP.put(".doc", "application/msword");
        MINE_MAP.put(".docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        MINE_MAP.put(".xls", "application/vnd.ms-excel");
        MINE_MAP.put(".xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        MINE_MAP.put(".exe", "application/octet-stream");
        MINE_MAP.put(".gif", "image/gif");
        MINE_MAP.put(".gtar", "application/x-gtar");
        MINE_MAP.put(".gz", "application/x-gzip");
        MINE_MAP.put(".h", "text/plain");
        MINE_MAP.put(".htm", "text/html");
        MINE_MAP.put(".html", "text/html");
        MINE_MAP.put(".jar", "application/java-archive");
        MINE_MAP.put(".java", "text/plain");
        MINE_MAP.put(".jpeg", "image/jpeg");
        MINE_MAP.put(".jpg", "image/jpeg");
        MINE_MAP.put(".js", "application/x-javascript");
        MINE_MAP.put(".log", "text/plain");
        MINE_MAP.put(".m3u", "audio/x-mpegurl");
        MINE_MAP.put(".m4a", "audio/mp4a-latm");
        MINE_MAP.put(".m4b", "audio/mp4a-latm");
        MINE_MAP.put(".m4p", "audio/mp4a-latm");
        MINE_MAP.put(".m4u", "video/vnd.mpegurl");
        MINE_MAP.put(".m4v", "video/x-m4v");
        MINE_MAP.put(".mov", "video/quicktime");
        MINE_MAP.put(".mp2", "audio/x-mpeg");
        MINE_MAP.put(".mp3", "audio/x-mpeg");
        MINE_MAP.put(".mp4", "video/mp4");
        MINE_MAP.put(".mpc", "application/vnd.mpohun.certificate");
        MINE_MAP.put(".mpe", "video/mpeg");
        MINE_MAP.put(".mpeg", "video/mpeg");
        MINE_MAP.put(".mpg", "video/mpeg");
        MINE_MAP.put(".mpg4", "video/mp4");
        MINE_MAP.put(".mpga", "audio/mpeg");
        MINE_MAP.put(".msg", "application/vnd.ms-outlook");
        MINE_MAP.put(".ogg", "audio/ogg");
        MINE_MAP.put(".pdf", "application/pdf");
        MINE_MAP.put(".png", "image/png");
        MINE_MAP.put(".pps", "application/vnd.ms-powerpoint");
        MINE_MAP.put(".ppt", "application/vnd.ms-powerpoint");
        MINE_MAP.put(".pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation");
        MINE_MAP.put(".prop", "text/plain");
        MINE_MAP.put(".rc", "text/plain");
        MINE_MAP.put(".rmvb", "audio/x-pn-realaudio");
        MINE_MAP.put(".rtf", "application/rtf");
        MINE_MAP.put(".sh", "text/plain");
        MINE_MAP.put(".tar", "application/x-tar");
        MINE_MAP.put(".tgz", "application/x-compressed");
        MINE_MAP.put(".txt", "text/plain");
        MINE_MAP.put(".wav", "audio/x-wav");
        MINE_MAP.put(".wma", "audio/x-ms-wma");
        MINE_MAP.put(".wmv", "audio/x-ms-wmv");
        MINE_MAP.put(".wps", "application/vnd.ms-works");
        MINE_MAP.put(".xml", "text/plain");
        MINE_MAP.put(".z", "application/x-compress");
        MINE_MAP.put(".zip", "application/x-zip-compressed");
    }

    /* public static String getMIME(String suffix){
         String mime="";
         if(suffix.endsWith(".doc")||suffix.equals(".DOC")){
             return "application/msword";
         }else if(suffix.endsWith(".docx")||suffix.endsWith(".DOCX")){
             return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
         }if(suffix.endsWith(".ppt")||suffix.endsWith(".PPT")){
             return "application/vnd.ms-powerpoint";
         }else if(suffix.endsWith(".pptx")||suffix.endsWith(".PPTX")){
             return "application/vnd.openxmlformats-officedocument.presentationml.presentation";
         }if(suffix.endsWith(".jpg")||suffix.endsWith(".JPG")||suffix.endsWith(".jpeg")||suffix.endsWith(".JEPG")){
             return "image/jpeg";
         }if(suffix.endsWith(".ppt")||suffix.endsWith(".PPT")){
             return "application/vnd.ms-powerpoint";
         }if(suffix.endsWith(".ppt")||suffix.endsWith(".PPT")){
             return "application/vnd.ms-powerpoint";
         }else{
         }if(suffix.endsWith(".mp4")||suffix.endsWith(".3gp")||suffix.equals(".avi")){
             return "video/mp4";
         }else{
         }if(suffix.endsWith(".txt")){
             return "text/plain";
         }else{
             return "";
         }
     }*/
    public static String getMIME(String suffix) {
        return MINE_MAP.get(suffix);
    }


}
