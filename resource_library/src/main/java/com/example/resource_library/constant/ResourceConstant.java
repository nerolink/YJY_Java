package com.example.resource_library.constant;

import android.os.Environment;

/**
 * Created by JJY on 2016/8/23.
 */
public class ResourceConstant {

    public static final String APKNAME = "YJY";
    public static String APK_DIR = Environment.getExternalStorageDirectory().getPath() + "/" + ResourceConstant.APKNAME;
    public static String DOWNLOAD_DIR = APK_DIR + "/Download/teacher";
    public static String DISTRIBUTE_DIR = APK_DIR + "/Distribute/teacher";

    public static String FILE_HOST = "http://121.199.23.184";
    //private static String FILE_HOST = "http://121.199.23.184";
    public static String OWNER_ID = "ddr";//仅供测试，ownerid，所有者的ID
    public static String FILE_ROOT_PATH = "/";//仅供测试，ownerid，所有者的ID


    public static String URL_UPLOAD = FILE_HOST + "/yjyFS/file/upload";

    public static String URL_FILE_LIST = FILE_HOST + "/yjyFS/file/list";
    public static String URL_DELETE_FILE = FILE_HOST + "/yjyFS/file/delete";
    public static String URL_NEW_FOLDER = FILE_HOST + "/yjyFS/file/mkdir";
    public static String URL_UPDATE_FILE = FILE_HOST + "/yjyFS/file/modify";
    public static String URL_MOVE_FILE = FILE_HOST + "/yjyFS/file/move";
    public static String URL_CHECK_UPDATE = FILE_HOST + "/yjyFS/resources/update.json";
    public static String URL_DOWNLOAD_APK = FILE_HOST + "/yjyFS/file/downloadAPK?type=teacher";

    public static String PARAM_OWNER_ID = "ownerId";
    public static String PARAM_FILE_PATH = "path";
    public static String PARAM_DIR_NAME = "dirName";
    public static String PARAM_FILE_ID = "fileId";
    public static String PARAM_FILE_NAME = "fileName";

    public static String STRING_UPLOAD = "UPLOAD";
    public static String STRING_DOWNLOAD = "DOWNLOAD";
    public static String STRING_PATHS = "paths";
    public static String STRING_FOLDER = "directory";

    public static String INTENT_WHAT = "what";
    public static String INTENT_UPLOAD_DEST_FOLDER = "uploadFolder"; //要上传到的目的文件夹
    public static String INTENT_COURSEWARE = "courseware";


    //这的用于startActivityForResult——onResult系列方法中的RequestCode
    public static int CODE_DODETAIL = 101;
    public static int CODE_DOMOVE = 102;

    public static String URL_SEARCH_FILE = FILE_HOST + "/yjyFS/file/search";

    public static void update() {
        URL_UPLOAD = FILE_HOST + "/yjyFS/file/upload";
        URL_FILE_LIST = FILE_HOST + "/yjyFS/file/list";
        URL_DELETE_FILE = FILE_HOST + "/yjyFS/file/delete";
        URL_NEW_FOLDER = FILE_HOST + "/yjyFS/file/mkdir";
        URL_UPDATE_FILE = FILE_HOST + "/yjyFS/file/modify";
        URL_MOVE_FILE = FILE_HOST + "/yjyFS/file/move";
        URL_CHECK_UPDATE = FILE_HOST + "/yjyFS/resources/update.json";
        URL_DOWNLOAD_APK = FILE_HOST + "/yjyFS/file/downloadAPK?type=teacher";

        URL_SEARCH_FILE = FILE_HOST + "/yjyFS/file/search";
    }
}
