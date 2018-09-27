

package com.kashdevelopment.development.kashmirstudentportal;

import com.kashdevelopment.development.kashmirstudentportal.managers.DatabaseHelper;


public class ApplicationHelper {

    private static final String TAG = ApplicationHelper.class.getSimpleName();
    private static DatabaseHelper databaseHelper;

    public static DatabaseHelper getDatabaseHelper() {
        return databaseHelper;
    }

    public static void initDatabaseHelper(android.app.Application application) {
        databaseHelper = DatabaseHelper.getInstance(application);
        databaseHelper.init();
    }
}
