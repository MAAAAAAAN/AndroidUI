package com.taifua.androidlearning;

import android.app.UiAutomation;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.taifua.androidlearning.gridview.GridViewActivity;
import com.taifua.androidlearning.listview.ListViewActivity;
import com.taifua.androidlearning.recyclerview.RecyclerViewActivity;

public class UIActivity extends AppCompatActivity
{

    private Button mBtnLinearlayout;
    private Button mBtnRelativelayout;
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRatioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;
    private Button mBtnScrollView;
    private Button mBtnRecycleView;
    private Button mBtnWebView;
    private Button mBtnToast;
    private Button mBtnDialog;
    private Button mBtnProgress;
    private Button mBtnCustomDialog;
    private Button mBtnPopupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);

        mBtnLinearlayout = findViewById(R.id.btn_linearlayout);
        mBtnRelativelayout = findViewById(R.id.btn_relativelayout);
        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnButton = findViewById(R.id.btn_button);
        mBtnEditText = findViewById(R.id.btn_edittext);
        mBtnRatioButton = findViewById(R.id.btn_ratiobutton);
        mBtnCheckBox = findViewById(R.id.btn_checkbox);
        mBtnImageView = findViewById(R.id.btn_image_view);
        mBtnListView = findViewById(R.id.btn_list_view);
        mBtnGridView = findViewById(R.id.btn_grid_view);
        mBtnScrollView = findViewById(R.id.btn_scroll_view);
        mBtnRecycleView = findViewById(R.id.btn_recycle_view);
        mBtnWebView = findViewById(R.id.btn_web_view);
        mBtnToast = findViewById(R.id.btn_toast);
        mBtnDialog = findViewById(R.id.btn_dialog);
        mBtnProgress = findViewById(R.id.btn_progress);
        mBtnCustomDialog = findViewById(R.id.btn_custom_dialog);
        mBtnPopupWindow = findViewById(R.id.btn_popup_window);
        setListeners();
    }

    // ???????????????
    private void setListeners()
    {
        OnClick onClick = new OnClick();
        mBtnLinearlayout.setOnClickListener(onClick);
        mBtnRelativelayout.setOnClickListener(onClick);
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRatioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnGridView.setOnClickListener(onClick);
        mBtnScrollView.setOnClickListener(onClick);
        mBtnRecycleView.setOnClickListener(onClick);
        mBtnWebView.setOnClickListener(onClick);
        mBtnToast.setOnClickListener(onClick);
        mBtnDialog.setOnClickListener(onClick);
        mBtnProgress.setOnClickListener(onClick);
        mBtnCustomDialog.setOnClickListener(onClick);
        mBtnPopupWindow.setOnClickListener(onClick);
    }

    // ?????????????????????
    private class OnClick implements View.OnClickListener
    {
        @Override
        public void onClick(View view)
        {
            Intent intent = null;
            switch (view.getId())
            {
                // ?????????LinearLayout????????????
                case R.id.btn_linearlayout:
                    intent = new Intent(UIActivity.this, LinearlayoutActivity.class);
                    break;
                // ?????????RelativeLayout????????????
                case R.id.btn_relativelayout:
                    intent = new Intent(UIActivity.this, RelativelayoutActivity.class);
                    break;
                // ?????????TextView????????????
                case R.id.btn_textview:
                    intent = new Intent(UIActivity.this, TextViewActivity.class);
                    break;
                // ?????????Button????????????
                case R.id.btn_button:
                    intent = new Intent(UIActivity.this, ButtonActivity.class);
                    break;
                // ?????????EditText????????????
                case R.id.btn_edittext:
                    intent = new Intent(UIActivity.this, EditTextActivity.class);
                    break;
                // ?????????RatioButton????????????
                case R.id.btn_ratiobutton:
                    intent = new Intent(UIActivity.this, RatioButtonActivity.class);
                    break;
                // ?????????CheckBox????????????
                case R.id.btn_checkbox:
                    intent = new Intent(UIActivity.this, CheckBoxActivity.class);
                    break;
                // ?????????ImageView????????????
                case R.id.btn_image_view:
                    intent = new Intent(UIActivity.this, ImageViewActivity.class);
                    break;
                // ?????????ListView????????????
                case R.id.btn_list_view:
                    intent = new Intent(UIActivity.this, ListViewActivity.class);
                    break;
                // ?????????GridView????????????
                case R.id.btn_grid_view:
                    intent = new Intent(UIActivity.this, GridViewActivity.class);
                    break;
                // ?????????ScrollView????????????
                case R.id.btn_scroll_view:
                    intent = new Intent(UIActivity.this, ScrollViewActivity.class);
                    break;
                // ?????????RecycleView????????????
                case R.id.btn_recycle_view:
                    intent = new Intent(UIActivity.this, RecyclerViewActivity.class);
                    break;
                // ?????????WebView????????????
                case R.id.btn_web_view:
                    intent = new Intent(UIActivity.this, WebViewActivity.class);
                    break;
                // ?????????Toast??????
                case R.id.btn_toast:
                    intent = new Intent(UIActivity.this, ToastActivity.class);
                    break;
                // ?????????Dialog??????
                case R.id.btn_dialog:
                    intent = new Intent(UIActivity.this, DialogActivity.class);
                    break;
                // ?????????Progress??????
                case R.id.btn_progress:
                    intent = new Intent(UIActivity.this, ProgressActivity.class);
                    break;
                // ?????????CustomDialog??????
                case R.id.btn_custom_dialog:
                    intent = new Intent(UIActivity.this, CustomDialogActivity.class);
                    break;
                // ?????????PopupWindow??????
                case R.id.btn_popup_window:
                    intent = new Intent(UIActivity.this, PopupWindowActivity.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }
    }
}


