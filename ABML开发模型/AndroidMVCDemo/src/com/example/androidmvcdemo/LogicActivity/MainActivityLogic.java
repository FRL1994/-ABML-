package com.example.androidmvcdemo.LogicActivity;

import com.example.androidmvcdemo.DataActivity.MainActivityData;
import android.os.Bundle;

/**
 * �߼��㣺<br>
 * ����Ӧ��������ȫ�ֱ����ĳ���<br>
 * ͨ���������ݲ�ͽ�����ṩ�ķ�����ʵ�ֳ����߼��������ݺͽ���󶨣�����ʾ����<br>
 */
public class MainActivityLogic extends MainActivityData {
	private int x = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void setButtonData() {
		if (x < 5) {
			setTextView(getData(), true);
			x++;
		} else {
			setTextView(getData(), false);
			x = 0;
		}
	}

}
