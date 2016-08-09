package com.lzg.circleseekbar;

import android.os.Bundle;
import android.widget.TextView;

import com.lzg.circleseekbar.widget.MCircleSeekBar;
import com.lzg.circleseekbar.widget.MCircleSeekBar.OnSeekChangeListener;

/**
 * 
 * @author lzg
 *
 */
public class MainActivity extends BaseActivity {
	private TextView tvPerencetValue;
	private MCircleSeekBar mCircleSeekBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tvPerencetValue = getViewById(R.id.tv_perencet_set_perencet);
		mCircleSeekBar = getViewById(R.id.m_circleSeekBar_set_perencet);

		mCircleSeekBar.setSeekBarChangeListener(new OnSeekChangeListener() {

			public void onProgressChange(MCircleSeekBar view, int newProgress) {
				tvPerencetValue.setText(view.getProgress() + "");
			}
		});
	}

}
