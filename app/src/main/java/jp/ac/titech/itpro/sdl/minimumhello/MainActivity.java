package jp.ac.titech.itpro.sdl.minimumhello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstraintLayout mainView = new ConstraintLayout(this);
        ViewGroup.LayoutParams mainParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        mainView.setLayoutParams(mainParams);

        TextView text = new TextView(this);
        text.setText("Hello, World!");
        ConstraintLayout.LayoutParams textParams = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);
        textParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;
        textParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        textParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        textParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        text.setLayoutParams(textParams);

        mainView.addView(text);

        setContentView(mainView);
    }
}
