package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // global or module level variable

    private EditText editTextName, editTextAge;
    private TextView textViewMessage;

    //onCreate same as main() function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContainView method display UI
        // R = resource class
        setContentView(R.layout.activity_main);

        //Linking program with UI
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);
        textViewMessage =(TextView)findViewById(R.id.textViewMessage);
    }

    // a method to handle view content
    public void displayMessage(View view){
        String name ;
        int age;
        name = editTextName.getText().toString();
        // become Integer
        age = Integer.parseInt(editTextAge.getText().toString());
        age++;
        textViewMessage.setText("Voala, my name is "+ name + ". You will be "+ age+" in 2018");
    }

    public void resetScreen(View view){
        textViewMessage.setText("");
        editTextName.setText("");
        editTextAge.setText("");
    }
}
