package com.alexjlockwood.example.delight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SearchActivity extends AppCompatActivity {

  @BindView(R.id.icon) ImageView iconView;
  private boolean isChecked;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.rootview)
  void onButtonClick() {
    isChecked = !isChecked;
    iconView.setImageState(new int[]{android.R.attr.state_checked * (isChecked ? 1 : -1)}, true);
  }
}
