package com.example.androidmvcdemo.DataActivity;

import com.example.androidmvcdemo.BaseActivity.MainActivityBase;
import android.os.Bundle;

/**���ݲ㣺<br>
 * ����Ӧ��������ȫ�ֱ����ĳ���<br>
 * ���ݳ����࣬����ʵ�� ���ݲ� �����л�������<br>
 * �õ����ݣ�Ϊÿ�����ݶ���get��set����,��Ϊ�߼����ṩ���������ݲ�������<br>
 * (ע�⣺���е����ݱ�����Ӧ���óɷǹ���Ȩ��)<br>
 * (���磺 private Button mButton;)
 */
public abstract class MainActivityData extends MainActivityBase {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	public String getData() {
		return getEditTextContent();
	}

}
