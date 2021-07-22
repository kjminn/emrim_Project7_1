package kr.hs.emirim.kjminn.emrim_project7_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    EditText editAngle;
    ImageView imgV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editAngle = findViewById(R.id.edit_angle);
        imgV = findViewById(R.id.imgv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_pic_rotate:
                int angle = Integer.parseInt(editAngle.getText().toString());
                imgV.setRotation(angle);
                return true;
            case R.id.item_img01:
                imgV.setImageResource(R.drawable.img01);
                return true;
            case R.id.item_img02:
                imgV.setImageResource(R.drawable.img02);
                return true;
            case R.id.item_img03:
                imgV.setImageResource(R.drawable.img03);
                return true;
        }

        return false;
    }
}