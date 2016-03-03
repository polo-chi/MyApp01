package ya.myapp01;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class second extends  Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClick(View v){

        Intent intent = new Intent();
        intent.setClassName("ya.myapp01","ya.myapp01.MainActivity");
        EditText editText = (EditText)this.findViewById(R.id.editText);
        intent.putExtra("sendText",editText.getText().toString());

        startActivity(intent);
    }



}
