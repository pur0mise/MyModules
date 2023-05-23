package sg.edu.rp.c346.id22023910.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView modCode;
    TextView modName;
    TextView acadYear;
    TextView sem;
    TextView modCred;
    TextView venue;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        modCode = findViewById(R.id.modCode);
        modName = findViewById(R.id.modName);
        acadYear = findViewById(R.id.acadYear);
        sem = findViewById(R.id.sem);
        modCred = findViewById(R.id.modCredit);
        venue = findViewById(R.id.venue);
        backButton = findViewById(R.id.btnBack);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("modCode");
        modCode.setText("Module Code:" + moduleCode);

        String moduleName = intentReceived.getStringExtra("modName");
        modName.setText("Module Name: " + moduleName);

        String academicYear = intentReceived.getStringExtra("acadYear");
        acadYear.setText("Academic Year: " + academicYear);

        String semesterYear = intentReceived.getStringExtra("sem");
        sem.setText("Semester: " + semesterYear);

        String modCredit = intentReceived.getStringExtra("modCredit");
        modCred.setText("Module Credit: " + modCredit);

        String modVenue = intentReceived.getStringExtra("venue");
        venue.setText("Module Credit: " + modVenue);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                finish();
            }
        });
    }
}