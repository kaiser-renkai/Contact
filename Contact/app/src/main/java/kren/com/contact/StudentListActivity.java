package kren.com.contact;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StudentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        String[] students = new String[]{"Kai Ren", "Selina Ding", "Sophia Ren","Michael Phelps", "Christiano Ronaldo"};
        ListView studentsList = (ListView) findViewById(R.id.students_list_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, students);
        studentsList.setAdapter(adapter);
    }
}
