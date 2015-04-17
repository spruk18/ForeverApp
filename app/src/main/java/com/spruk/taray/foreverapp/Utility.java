package com.spruk.taray.foreverapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by taray on 4/16/2015.
 */
public class Utility {
    public static String getUserName(Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(context.getString(R.string.pref_username_key), context.getString(R.string.pref_username_default));
    }
}
