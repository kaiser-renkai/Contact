package kren.com.contact;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class StudentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        String[] students = new String[]{"Kai Ren", "Selina Ding", "Sophia Ren","Michael Phelps", "Christiano Ronaldo"};
        ListView studentsList = (ListView) findViewById(R.id.students_list_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, students);
        studentsList.setAdapter(adapter);

        Button newStudent = (Button) findViewById(R.id.student_list_new_student);
        newStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(StudentListActivity.this, "Showing the form...", Toast.LENGTH_SHORT).show();

                // how to switch UI from one to other
                Intent intention = new Intent(StudentListActivity.this, StudentFormActivity.class) ;
                startActivity(intention);
            }
        });
    }
}
