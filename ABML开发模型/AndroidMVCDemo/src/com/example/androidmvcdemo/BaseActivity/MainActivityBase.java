package com.example.androidmvcdemo.BaseActivity;

import com.example.androidmvcdemo.R;
import com.example.androidmvcdemo.AbstractActivity.MainActivityAbstract;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * ��ͼ�㣺<br>
 * ��ͼ�����࣬����ʵ�� ��ͼ�� �����л�������<br>
 * �õ��ؼ���Ϊÿ���ؼ���������¼�,��Ϊ���ݡ��߼����ṩ �ǹ����� ����д�� ������ͼ��������(�򹫿��ģ���ֱ�ӵ��õķ���)<br>
 * (ע�⣺���е���ͼ������Ӧ���óɷǹ���Ȩ��)<br>
 * (���磺 private Button mButton;)
 */
@SuppressLint("RtlHardcoded")
public abstract class MainActivityBase extends MainActivityAbstract {

	private Button mButton;
	private EditText mEditText;
	private LinearLayout mShowLL;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findView();
		OnClick();
	}

	protected abstract void setButtonData();

	private void findView() {
		mButton = (Button) findViewById(R.id.hello_bt);
		mEditText = (EditText) findViewById(R.id.hello_et);
		mShowLL = (LinearLayout) findViewById(R.id.show_ll);
	}

	private void OnClick() {
		mButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				setButtonData();
			}
		});
	}

	public String getEditTextContent() {
		return mEditText.getText().toString();
	}

	public void setTextView(String text, boolean IsLeft) {
		TextView tv1 = new TextView(this);
		tv1.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		if (IsLeft) {
			tv1.setGravity(Gravity.LEFT);
		} else {
			tv1.setGravity(Gravity.RIGHT);
		}
		tv1.setText(text);
		mShowLL.addView(tv1);
	}
}
