package com.example.resource_library.view;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.resource_library.R;
import com.example.resource_library.constant.APPConstant;


/**
 * Created by JJY on 2016/8/24.
 */
public class LoadingDialog extends Dialog {
    private TextView textView;

    public LoadingDialog(Context context) {
        super(context, R.style.MyDialogNODim);
        setCustomDialog();
        getWindow().setLayout((int) (APPConstant.SCRRENWIDTH * 0.5), (int) (APPConstant.SCRRENWIDTH * 0.5));
    }

    private void setCustomDialog() {
        View mView = LayoutInflater.from(getContext()).inflate(R.layout.dialog_loading, null);
        textView = (TextView) mView.findViewById(R.id.loadingtxt);

        super.setContentView(mView);
    }

    @Override
    public void setContentView(int layoutResID) {

    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
    }

    @Override
    public void setContentView(View view) {
    }

    public void setLoadingtxt(String str) {
        this.textView.setText(str);
    }


}