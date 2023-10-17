package com.studio.carpal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {

    String fullName, parentFullName, schoolName, dateOfBirth, email, gender, password;
    Integer mobile;
    FirebaseDatabase db;
    DatabaseReference reference;
//    private ScrollView scrollView;
//    private ImageView imageViewPwd;
//    private TextView textViewRegisterHead;
//    private TextView textViewRegisterInstruction;
//    private RelativeLayout RLParentName;
//    private ImageView parentImageViewName;
//    private TextView textViewRegisterParentFullName;
//    private View parentDividerName;
//    private EditText editTextRegisterParentFullName;
//    private RelativeLayout RLName;
//    private ImageView imageViewName;
//    private TextView textViewRegisterFullName;
//    private View dividerName;
//    private EditText editTextRegisterFullName;
//    private RelativeLayout RLEmail;
//    private ImageView imageViewEmail;
//    private TextView textViewRegisterEmail;
//    private View dividerEmail;
//    private EditText editTextRegisterEmail;
//    private RelativeLayout RLDob;
//    private ImageView imageViewDoB;
//    private TextView textViewRegisterDoB;
//    private View dividerDob;
//    private EditText editTextRegisterDoB;
//    private ImageView imageViewDatePicker;
//    private RelativeLayout RLGender;
//    private ImageView imageViewGender;
//    private TextView textViewRegisterGender;
//    private View dividerGender;
//    private RadioGroup radioGroupRegisterGender;
//    private RadioButton radioFemale;
//    private RadioButton radioMale;
//    private RelativeLayout RLSchool;
//    private ImageView imageViewSchool;
//    private TextView textViewRegisterSchool;
//    private View dividerSchool;
//    private RadioGroup radioGroupRegisterSchool;
//    private RadioButton radioIhs;
//    private RadioButton radioHorner;
//    private RelativeLayout RLMobile;
//    private ImageView imageViewMobile;
//    private TextView textViewRegisterMobile;
//    private View dividerMobile;
//    private EditText editTextRegisterMobile;
//    private RelativeLayout RLPwd;
//    private TextView textViewRegisterPassword;
//    private View dividerPwd;
//    private EditText editTextRegisterPassword;
//    private ImageView imageViewShowHidePwd;
//    private CheckBox checkBoxTermsConditions;
//    private Button buttonRegister;
//    private ProgressBar progressBar;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_update_user);
//
//        // Initialize views
//        scrollView = findViewById(R.id.swipeContainer);
//        imageViewPwd = findViewById(R.id.imageViewPwd);
//        textViewRegisterHead = findViewById(R.id.textView_register_head);
//        textViewRegisterInstruction = findViewById(R.id.textView_register_instruction);
//        RLParentName = findViewById(R.id.RL_parent_name);
//        parentImageViewName = findViewById(R.id.parentImageViewName);
//        textViewRegisterParentFullName = findViewById(R.id.textView_register_parent_full_name);
//        parentDividerName = findViewById(R.id.parent_divider_name);
//        editTextRegisterParentFullName = findViewById(R.id.editText_register_parent_full_name);
//        RLName = findViewById(R.id.RL_name);
//        imageViewName = findViewById(R.id.imageViewName);
//        textViewRegisterFullName = findViewById(R.id.textView_register_full_name);
//        dividerName = findViewById(R.id.divider_name);
//        editTextRegisterFullName = findViewById(R.id.editText_register_full_name);
//        RLEmail = findViewById(R.id.RL_email);
//        imageViewEmail = findViewById(R.id.imageViewEmail);
//        textViewRegisterEmail = findViewById(R.id.textView_register_email);
//        dividerEmail = findViewById(R.id.divider_email);
//        editTextRegisterEmail = findViewById(R.id.editText_register_email);
//        RLDob = findViewById(R.id.RL_dob);
//        imageViewDoB = findViewById(R.id.imageViewDoB);
//        textViewRegisterDoB = findViewById(R.id.textView_register_dob);
//        dividerDob = findViewById(R.id.divider_dob);
//        editTextRegisterDoB = findViewById(R.id.editText_register_dob);
//        imageViewDatePicker = findViewById(R.id.imageView_date_picker);
//        RLGender = findViewById(R.id.RL_gender);
//        imageViewGender = findViewById(R.id.imageViewGender);
//        textViewRegisterGender = findViewById(R.id.textView_register_gender);
//        dividerGender = findViewById(R.id.divider_gender);
//        radioGroupRegisterGender = findViewById(R.id.radio_group_register_gender);
//        radioFemale = findViewById(R.id.radio_female);
//        radioMale = findViewById(R.id.radio_male);
//        RLSchool = findViewById(R.id.RL_school);
//        imageViewSchool = findViewById(R.id.imageViewSchool);
//        textViewRegisterSchool = findViewById(R.id.textView_register_school);
//        dividerSchool = findViewById(R.id.divider_school);
//        radioGroupRegisterSchool = findViewById(R.id.radio_group_register_school);
//        radioIhs = findViewById(R.id.radio_ihs);
//        radioHorner = findViewById(R.id.radio_horner);
//        RLMobile = findViewById(R.id.RL_mobile);
//        imageViewMobile = findViewById(R.id.imageViewMobile);
//        textViewRegisterMobile = findViewById(R.id.textView_register_mobile);
//        dividerMobile = findViewById(R.id.divider_mobile);
//        editTextRegisterMobile = findViewById(R.id.editText_register_mobile);
//        RLPwd = findViewById(R.id.RL_pwd);
//        imageViewPwd = findViewById(R.id.imageViewPwd);
//        textViewRegisterPassword = findViewById(R.id.textView_register_password);
//        dividerPwd = findViewById(R.id.divider_pwd);
//        editTextRegisterPassword = findViewById(R.id.editText_register_password);
//        imageViewShowHidePwd = findViewById(R.id.imageView_show_hide_pwd);
//        checkBoxTermsConditions = findViewById(R.id.checkBox_terms_conditions);
//        buttonRegister = findViewById(R.id.button_register);
//        progressBar = findViewById(R.id.progressBar);
//
//        // Set click listeners and implement functionality as needed
//        imageViewShowHidePwd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Implement show/hide password functionality
//            }
//        });
//
//        buttonRegister.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // Check if any radio button is selected
//                int selectedRadioButtonId = radioGroupRegisterGender.getCheckedRadioButtonId();
//                if (selectedRadioButtonId == -1) {
//                    // No radio button is selected, show a message to the user
//                    Toast.makeText(RegisterActivity.this, "Please select a gender", Toast.LENGTH_SHORT).show();
//                } else {
//                    RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
//                    String selectedGender = selectedRadioButton.getText().toString();
//                    progressBar.setVisibility(View.VISIBLE);
//                    // TODO: Implement registration logic here
//                }
//            }
//        });
//
//    }
}
