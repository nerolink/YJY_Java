package com.example.resource_library.util;

import android.app.Activity;
import android.app.Service;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import java.io.File;
import java.text.DecimalFormat;

/**
 * Created by Hyman on 2016/8/29.
 */
public class FileUtil {

    public static String getFormatFileSize(long size) {
        String str = "0";
        DecimalFormat df2 = new DecimalFormat("###.0");
        if (size > 0) {
            long s1 = size;
            if (s1 / 1024 < 1024) {//如果小于1M
                str = df2.format(((double) s1 / (double) 1024)) + "Kb";
            } else if (s1 / 1024 >= 1024) {//如果大于1M
                str = df2.format((s1 / (1024 * 1024))) + "MB";
            } else if (s1 / 1024 >= 1024 * 1024) {//如果大于1024MB
                str = df2.format((s1 / (1024 * 1024 * 1024))) + "G";
            }
        }
        return str;
    }

    public static void openFile(Activity activity, String fileName, String filePath) {

        if (fileName != null && !fileName.equals("")) {
            if (fileName.lastIndexOf(".") >= 0) {

                String fType = fileName.substring(fileName.lastIndexOf("."), fileName.length()).toLowerCase();

                String MIME = MIMEUtil.getMIME(fType);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Uri uri = Uri.fromFile(new File(filePath));

                if (MIME != null && !MIME.equals("")) {
                    intent.setDataAndType(uri, MIME);

                    try {
                        activity.startActivity(intent);
                    } catch (Exception e) {
                        ToastUtil.showShortToast(activity, "很抱歉，暂时无法打开此类文件！");
                    }

                } else {
                    ToastUtil.showShortToast(activity, "很抱歉，暂时无法打开此类文件！");
                }

            } else {
                ToastUtil.showShortToast(activity, "很抱歉，暂时无法打开此类文件！");
            }
        }

    }

    public static void openFile(Service service, String fileName, String filePath) {

        if (fileName != null && !fileName.equals("")) {
            if (fileName.lastIndexOf(".") >= 0) {

                String fType = fileName.substring(fileName.lastIndexOf("."), fileName.length()).toLowerCase();

                String MIME = MIMEUtil.getMIME(fType);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Uri uri = Uri.fromFile(new File(filePath));

                if (MIME != null && !MIME.equals("")) {
                    intent.setDataAndType(uri, MIME);

                    try {
                        service.startActivity(intent);
                    } catch (Exception e) {
                        ToastUtil.showShortToast(service, "很抱歉，暂时无法打开此类文件！");
                    }

                } else {
                    ToastUtil.showShortToast(service, "很抱歉，暂时无法打开此类文件！");
                }

            } else {
                ToastUtil.showShortToast(service, "很抱歉，暂时无法打开此类文件！");
            }
        }

    }

    public static void openFileWithWPS(Context context, String fileUrl, String fileType) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setAction(Intent.ACTION_VIEW);
        intent.setClassName("cn.wps.moffice_eng", "cn.wps.moffice.documentmanager.PreStartActivity2");
        Uri uri = Uri.parse(fileUrl + "." + fileType);
        intent.setData(uri);

        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ToastUtil.showShortToast(context, "未找到WPS应用程序");
            //e.printStackTrace();
        }
    }

    public static void openFileWithWPSPro(Context context, String fileUrl, String fileType) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setAction(Intent.ACTION_VIEW);
        intent.setClassName("com.kingsoft.moffice_pro", "cn.wps.moffice.documentmanager.PreStartActivity2");
        Uri uri = Uri.parse(fileUrl + "." + fileType);
        intent.setData(uri);

        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ToastUtil.showShortToast(context, "未找到WPS专业版应用程序");
            //e.printStackTrace();
        }
    }
}
