package com.workshop.androidwidgets.ui.edittext;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.workshop.androidwidgets.R;
import com.workshop.androidwidgets.ui.base.BaseActivity;
import com.workshop.androidwidgets.utils.UiUtils;

public class EditTextActivity extends BaseActivity {

    private EditText edtName;
    private EditText edtPassword;
    private EditText edtPhoneNumber;
    private EditText edtNumberSigned;
    private EditText edtNumberDecimal;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext);
        getSupportActionBar().setTitle("EditText Tutorial");

        edtName = findViewById(R.id.edt_name);
        edtPassword = findViewById(R.id.edt_password);
        edtPhoneNumber = findViewById(R.id.edt_phone);
        edtNumberSigned = findViewById(R.id.edt_number_signed);
        edtNumberDecimal = findViewById(R.id.edt_number_decimal);

    }

    public void onClickButton(View view) {
        String value = "";
        switch (view.getId()) {
            case R.id.btn_name:
                value = getString(edtName);
                break;
            case R.id.btn_password:
                value = getString(edtPassword);
                break;
            case R.id.btn_phone:
                value = getString(edtPhoneNumber);
                break;
            case R.id.btn_number_signed:
                value = getString(edtNumberSigned);
                break;
            case R.id.btn_number_decimal:
                value = getString(edtNumberDecimal);
                break;
        }
        UiUtils.showToast(this, value);
    }

    private String getString(EditText editText) {
        return editText.getText().toString();
    }

}
