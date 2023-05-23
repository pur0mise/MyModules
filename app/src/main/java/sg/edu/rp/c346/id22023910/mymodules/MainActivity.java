package sg.edu.rp.c346.id22023910.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event handling Step 1
    TextView tvC203;
    TextView tvC206;
    TextView tvC218;
    TextView tvC235;
    TextView tvC346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC203 = findViewById(R.id.C203Header);
        tvC206 = findViewById(R.id.C206Header);
        tvC218 = findViewById(R.id.C218Header);
        tvC235 = findViewById(R.id.C235Header);
        tvC346 = findViewById(R.id.C346Header);

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modCode", "C203");
                intent.putExtra("modName", "Web Appln Development in php");
                intent.putExtra("acadYear", "2023");
                intent.putExtra("sem", "1");
                intent.putExtra("modCredit", "4");
                intent.putExtra("venue", "W64P");
                startActivity(intent);
            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modCode", "C206");
                intent.putExtra("modName", "Software Development Process");
                intent.putExtra("acadYear", "2023");
                intent.putExtra("sem", "1");
                intent.putExtra("modCredit", "4");
                intent.putExtra("venue", "W64P");
                startActivity(intent);
            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modCode", "C218");
                intent.putExtra("modName", "UI/UX Design for Apps");
                intent.putExtra("acadYear", "2023");
                intent.putExtra("sem", "1");
                intent.putExtra("modCredit", "4");
                intent.putExtra("venue", "W64P");
                startActivity(intent);
            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modCode", "C235");
                intent.putExtra("modName", "IT Security and Management");
                intent.putExtra("acadYear", "2023");
                intent.putExtra("sem", "1");
                intent.putExtra("modCredit", "4");
                intent.putExtra("venue", "W64P");
                startActivity(intent);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modCode", "C346");
                intent.putExtra("modName", "Mobile App Development");
                intent.putExtra("acadYear", "2023");
                intent.putExtra("sem", "1");
                intent.putExtra("modCredit", "4");
                intent.putExtra("venue", "E63A");
                startActivity(intent);
            }
        });

    }

}