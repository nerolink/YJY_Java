package com.example.resource_library.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.resource_library.R;
import com.example.resource_library.constant.ResourceConstant;



/**
 * Created by Guan on 2016/5/25.
 */
public class IconUtil {
    private static Bitmap floder, def, music, video, photo, doc, xls, ppt, txt, pdf;

    public static Bitmap getIcon(Context mContext, String fType) {
        if (fType.equals(ResourceConstant.STRING_FOLDER)) {
            floder = BitmapFactory.decodeResource(mContext.getResources(), R.mipmap.folder);
            return floder;
        } else if (fType.equals("mp3") || fType.equals("wav") || fType.equals("wma")) {
            music = BitmapFactory.decodeResource(mContext.getResources(), R.mipmap.music);
            return music;
        } else if (fType.equals("3gp") || fType.equals("mp4") || fType.equals("rmvb") ||
                fType.equals("rm") || fType.equals("avi") || fType.equals("mov") ||
                fType.equals("wmv") || fType.equals("mkv") || fType.equals("asf")) {
            video = BitmapFactory.decodeResource(mContext.getResources(), R.mipmap.video);
            return video;
        } else if (fType.equals("jpg") || fType.equals("gif") || fType.equals("png") ||
                fType.equals("jpeg") || fType.equals("bmp")) {
            photo = BitmapFactory.decodeResource(mContext.getResources(), R.mipmap.photo);
            return photo;
        } else if (fType.equals("doc") || fType.equals("docx")) {
            doc = BitmapFactory.decodeResource(mContext.getResources(), R.mipmap.doc);
            return doc;
            //Log.d(TAG, "doc" + fType);
        } else if (fType.equals("xls") || fType.equals("xlsx")) {
            xls = BitmapFactory.decodeResource(mContext.getResources(), R.mipmap.xls);
            return xls;
        } else if (fType.equals("ppt") || fType.equals("pptx")) {
            ppt = BitmapFactory.decodeResource(mContext.getResources(), R.mipmap.ppt);
            return ppt;
        } else if (fType.equals("pdf")) {
            pdf = BitmapFactory.decodeResource(mContext.getResources(), R.mipmap.pdf);
            return pdf;
        } else if (fType.equals("txt")) {
            txt = BitmapFactory.decodeResource(mContext.getResources(), R.mipmap.txt);
            return txt;
        } else {
            def = BitmapFactory.decodeResource(mContext.getResources(), R.mipmap.def);
            return def;
            //Log.d(TAG, fType);
        }
    }

}
