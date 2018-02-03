package com.example.shitenshi.livres;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Created by masuken111 on 2017/12/31.
 */

class Theme {
    void themeset(Context context){
         String listpre = PreferenceManager
                .getDefaultSharedPreferences(context)
                .getString("list_preference_1","akari");
        switch (listpre){
            case "oumurasaki":
                if (context instanceof AddActivity) {
                    context.setTheme(R.style.AppTheme);
                }
                if (context instanceof PreferenceActivity) {
                    context.setTheme(R.style.AppTheme_PreferenceTheme);
                }else{
                context.setTheme(R.style.AppTheme_NoActionBar);
                }
            case "akari":
                if (context instanceof AddActivity) {
                    context.setTheme(R.style.AppTheme_Akari);
                }
                if (context instanceof PreferenceActivity) {
                    context.setTheme(R.style.AppTheme_PreferenceTheme_Akari);
                }else{
                    context.setTheme(R.style.AppTheme_Akari_NoActionBar);
                }
            case "kaeru":
                if (context instanceof AddActivity) {
                    context.setTheme(R.style.AppTheme_kaeru);
                }
                if (context instanceof PreferenceActivity) {
                    context.setTheme(R.style.AppTheme_PreferenceTheme_kaeru);
                }else{
                    context.setTheme(R.style.AppTheme_kaeru_NoActionBar);
                }
        }
    }

}
