

package com.kashdevelopment.development.kashmirstudentportal;





import com.kashdevelopment.development.kashmirstudentportal.managers.DatabaseHelper;

public class Application extends android.app.Application {

    public static final String TAG = Application.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();

        ApplicationHelper.initDatabaseHelper(this);
        DatabaseHelper.getInstance(this).subscribeToNewPosts();
    }
}
