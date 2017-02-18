package com.example.xxx.gank.base;//package com.zeyjr.bmc.std.com.example.xxx.gank.base;
//
//import android.view.KeyEvent;
//
//import com.facebook.react.ReactInstanceManager;
//import com.facebook.react.ReactRootView;
//import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
//
///**
// * Created by space on 16/12/16.
// */
//
//public abstract class BaseRNActivity extends BaseActivity implements DefaultHardwareBackBtnHandler {
//
//    protected ReactRootView mReactRootView;
//    protected ReactInstanceManager mReactInstanceManager;
//
//    /**
//     * By default, all onBackPress() calls should not execute the default backpress handler and should
//     * instead propagate it to the JS instance. If JS doesn't want to handle the back press itself,
//     * it shall call back into native to invoke this function which should execute the default handler
//     */
//
//    @Override
//    protected void initView() {
//        setRNLayout();
//    }
//
//    @Override
//    public void invokeDefaultOnBackPressed() {
//        super.onBackPressed();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//
//        if (mReactInstanceManager != null) {
//            mReactInstanceManager.onHostPause(this);
//        }
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        if (mReactInstanceManager != null) {
//            mReactInstanceManager.onHostResume(this, this);
//        }
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//
//        if (mReactInstanceManager != null) {
//            mReactInstanceManager.onHostDestroy(this);
//        }
//    }
//
//    @Override
//    public void onBackPressed() {
//        if (mReactInstanceManager != null) {
//            mReactInstanceManager.onBackPressed();
//        } else {
//            super.onBackPressed();
//        }
//    }
//
//    @Override
//    public boolean onKeyUp(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_MENU && mReactInstanceManager != null) {
//            mReactInstanceManager.showDevOptionsDialog();
//            return true;
//        }
//        return super.onKeyUp(keyCode, event);
//    }
//
//    /**
//     * 创建mReactRootView和mReactInstanceManager,放至对应的layout中
//     * <p>
//     * mReactRootView = new ReactRootView(this);
//     * <p>
//     * mReactInstanceManager = ReactInstanceManager.builder()
//     * .setApplication(getApplication())
//     * .setBundleAssetName("index.android.bundle")
//     * .setJSMainModuleName("index.android")
//     * .addPackage(new MainReactPackage())
//     * .setUseDeveloperSupport(BuildConfig.DEBUG)
//     * .setInitialLifecycleState(LifecycleState.RESUMED)
//     * .build();
//     * <p>
//     * mReactRootView.startReactApplication(mReactInstanceManager, "Banners", null);
//     */
//    protected abstract void setRNLayout();
//}
