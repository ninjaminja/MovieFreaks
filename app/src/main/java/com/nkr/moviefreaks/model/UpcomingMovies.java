package com.nkr.moviefreaks.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by neel on 17/12/2015.
 */
public class UpcomingMovies implements Parcelable {
    public String mPoster;
    public String mReleaseDate;
    public String mOverview;
    public String mTitle;

    public UpcomingMovies(){};

    public String getPoster() {
        return mPoster;
    }

    public void setPoster(String poster) {
        mPoster = poster;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        mReleaseDate = releaseDate;
    }

    public String getOverview() {
        return mOverview;
    }

    public void setOverview(String overview) {
        mOverview = overview;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mTitle);
        dest.writeString(mOverview);
        dest.writeString(mReleaseDate);
        dest.writeString(mPoster);

    }

    private UpcomingMovies(Parcel in){
        mTitle=in.readString();
        mOverview=in.readString();
        mReleaseDate=in.readString();
        mPoster=in.readString();

    }

    public static final Creator<UpcomingMovies> CREATOR=new Creator<UpcomingMovies>() {
        @Override
        public UpcomingMovies createFromParcel(Parcel source) {
            return new UpcomingMovies(source);
        }

        @Override
        public UpcomingMovies[] newArray(int size) {
            return new UpcomingMovies[size];
        }
    };
}
