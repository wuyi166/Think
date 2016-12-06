package com.think.comm.ui.test.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.thin.core.BaseActivity;
import com.thin.core.auto.install.AutoInstaller;
import com.think.comm.ui.R;



public class FmenuAvtivity extends BaseActivity implements View.OnClickListener {
    public static final String APK_URL = "http://10.173.29.94/app.apk";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fmenu_avtivity);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn:
                 /* 方案一: 默认安装器 */
                AutoInstaller installer = AutoInstaller.getDefault(FmenuAvtivity.this);
                installer.installFromUrl(APK_URL);
                installer.setOnStateChangedListener(new AutoInstaller.OnStateChangedListener() {
                    @Override
                    public void onStart() {


                    }

                    @Override
                    public void onComplete() {


                    }

                    @Override
                    public void onNeed2OpenService() {
                        Toast.makeText(FmenuAvtivity.this, "请打开辅助功能服务", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
        }
    }
}
