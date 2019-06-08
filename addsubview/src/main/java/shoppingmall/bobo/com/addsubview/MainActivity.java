package shoppingmall.bobo.com.addsubview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AddSubView add_sub_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add_sub_view = (AddSubView)findViewById(R.id.add_sub_view);

        add_sub_view.setOnNumberChangeListener(new AddSubView.OnNumberChangeListener() {
            @Override
            public void onNumberChange(int value) {
                Toast.makeText(MainActivity.this,"当前的商品数=="+value,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
