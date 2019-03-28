package com.qcl.qcl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

/**/
public class MainActivity extends AppCompatActivity {

  private ImageView imageView;
  private ImageView imageView2;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    imageView = findViewById(R.id.iv);

    Glide.with(this)//1,获取 RequestManager
        .load("http://pic.pc6.com/up/2015-8/2015818162453.png")//2,返回 RequestBuilder
        .into(imageView);

    Log.i("qcl0328", ":onCreatethis.isFinishing():" + this.isFinishing());
  }
}
