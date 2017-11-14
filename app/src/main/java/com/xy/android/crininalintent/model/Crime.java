package com.xy.android.crininalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by xy on 2017/11/7.
 */

public class Crime {
    private UUID mUUID;
    private String mTitle;
    private Date mDate;
    private Boolean mSolved;
    private String mSuspect;

    public Crime() {
        this(UUID.randomUUID());
//        mUUID = UUID.randomUUID();
//        mDate = new Date();
    }

    public Crime(UUID uuid){
        mUUID = uuid;
        mDate = new Date();
        mSolved = true;
    }


    public UUID getUUID() {
        return mUUID;
    }

    public void setUUID(UUID UUID) {
        mUUID = UUID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Boolean isSolved() {
        return mSolved;
    }

    public void setSolved(Boolean solved) {
        mSolved = solved;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }
}
