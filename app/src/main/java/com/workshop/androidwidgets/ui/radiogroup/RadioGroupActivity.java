package com.workshop.androidwidgets.ui.radiogroup;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;

import com.workshop.androidwidgets.R;
import com.workshop.androidwidgets.ui.base.BaseActivity;
import com.workshop.androidwidgets.utils.UiUtils;

public class RadioGroupActivity extends BaseActivity {

    private RadioGroup radioGroup;
    private RadioButton rbMale;
    private RadioButton rbFemale;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiogroup);
        getSupportActionBar().setTitle("RadioGroup Tutorial");

        radioGroup = findViewById(R.id.radiogroup);
        rbMale = findViewById(R.id.rb_male);
        rbFemale = findViewById(R.id.rb_female);

    }

    public void onRGClick(View view) {

        int selectedId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(selectedId);

        String value = radioButton != null ? radioButton.getText().toString() : "Nothing is selected...";
//        String value = rbMale.isChecked() ? "Male" : rbFemale.isChecked() ? "Female" : "Nothing is selected...";
        UiUtils.showToast(this, value);
    }

}
