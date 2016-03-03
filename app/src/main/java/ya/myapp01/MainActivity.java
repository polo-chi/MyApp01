package ya.myapp01;

import android.app.*;
import android.content.ClipData;
import android.graphics.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.appwidget.*;
import android.content.Intent;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // ドラッグ対象Viewとイベント処理クラスを紐付ける
       // ImageView dragView = (ImageView) findViewById(R.id.imageView1);
       TextView dragView = (TextView)findViewById(R.id.textView);
        DragViewListener listener = new DragViewListener(dragView);
        dragView.setOnTouchListener(listener);
    }
}