package cool.contactsproject.gifanimation;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button mStartAnimation;
    private Button mStartAnimation2;
    private BubbleView mBubbleView;
    private GifView mGifView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStartAnimation = findViewById(R.id.btn_start_animation);
        mStartAnimation2 = findViewById(R.id.btn_start_animation2);
        mBubbleView = findViewById(R.id.blv_view);
        mGifView = findViewById(R.id.gif_view);
        List<Drawable> drawableList = new ArrayList<>();
        drawableList.add(getResources().getDrawable(R.drawable.ic_favorite_indigo_900_24dp));
        drawableList.add(getResources().getDrawable(R.drawable.ic_favorite_deep_purple_900_24dp));
        drawableList.add(getResources().getDrawable(R.drawable.ic_favorite_cyan_900_24dp));
        drawableList.add(getResources().getDrawable(R.drawable.ic_favorite_blue_900_24dp));
        drawableList.add(getResources().getDrawable(R.drawable.ic_favorite_deep_purple_900_24dp));
        drawableList.add(getResources().getDrawable(R.drawable.ic_favorite_light_blue_900_24dp));
        drawableList.add(getResources().getDrawable(R.drawable.ic_favorite_lime_a200_24dp));
        drawableList.add(getResources().getDrawable(R.drawable.ic_favorite_pink_900_24dp));
        drawableList.add(getResources().getDrawable(R.drawable.ic_favorite_red_900_24dp));
        mBubbleView.setDrawableList(drawableList);
        mGifView.setDrawableList(drawableList);
        mStartAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBubbleView.startAnimation(mBubbleView.getWidth(), mBubbleView.getHeight());
            }
        });

        mStartAnimation2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mGifView.startAnimation(mGifView.getWidth(), mGifView.getHeight());
            }
        });
    }
}
