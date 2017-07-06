package com.is_great.pro.exoplayer2;

/**
 * Created by Pravinyo on 6/15/2017.
 */

public class VideoFile {
    private String mName;
    private String mUri;
    private Long mDuration;

    public VideoFile(String url,String name,Long Duration){
        mName=name;
        mUri=url;
        mDuration=Duration;
    }

    public String getName() {
        return mName;
    }

    public Long getDuration() {
        return mDuration;
    }

    public String getUri(){
        return mUri;
    }

}
