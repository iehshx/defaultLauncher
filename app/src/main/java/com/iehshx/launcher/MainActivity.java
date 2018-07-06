package com.iehshx.launcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //        IntentFilter filter = new IntentFilter("android.intent.action.MAIN");
//        filter.addCategory("android.intent.category.HOME");
//        filter.addCategory("android.intent.category.DEFAULT");
//
//        ComponentName[] components = new ComponentName[]
//                {
//                        new ComponentName("com.android.launcher3", "com.android.launcher3.Launcher")
////                        new ComponentName("com.iehshx.crashexception", "com.iehshx.crashexception.MainActivity")
//                };
//
//        Context context = getApplicationContext();
//        ComponentName component = new ComponentName(context.getPackageName(),
//                MyApp.class.getName());
//        PackageManager pm = getPackageManager();
//        pm.clearPackagePreferredActivities("com.machinsight.rollmachine");
//        try {
//            Method method = PackageManager.class.getMethod("replacePreferredActivity",IntentFilter.class,int.class,ComponentName[].class,ComponentName.class);
//            try {
//                method.invoke(pm,filter,IntentFilter.MATCH_CATEGORY_EMPTY,components, component);
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            }
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//        pm.replacePreferredActivity(filter, IntentFilter.MATCH_CATEGORY_EMPTY,
//                components, component);
    }


    //    private void setupDefaultLauncher2() {
//        String packageName = "******"; // package name
//        PackageManager mPm = getPackageManager();
//        ArrayList<ResolveInfo> homeActivities = new ArrayList<ResolveInfo>();
//        ComponentName currentDefaultHome  = mPm.getHomeActivities(homeActivities);
//        IntentFilter mHomeFilter = new IntentFilter(Intent.ACTION_MAIN);
//        mHomeFilter.addCategory(Intent.CATEGORY_HOME);
//        mHomeFilter.addCategory(Intent.CATEGORY_DEFAULT);
//        ComponentName[] mHomeComponentSet = new ComponentName[homeActivities.size()];
//        int prefIndex = 0;
//        for (int i = 0; i < homeActivities.size(); i++) {
//            final ResolveInfo candidate = homeActivities.get(i);
//            final ActivityInfo info = candidate.activityInfo;
//            ComponentName activityName = new ComponentName(info.packageName, info.name);
//            mHomeComponentSet[i] = activityName;
//            if(info.packageName.equals(packageName)){
//                currentDefaultHome = activityName;
//            }
//        }
//        mPm.replacePreferredActivity(mHomeFilter, IntentFilter.MATCH_CATEGORY_EMPTY,
//                mHomeComponentSet, currentDefaultHome);
//    }


}
