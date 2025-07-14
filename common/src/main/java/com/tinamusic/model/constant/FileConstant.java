package com.tinamusic.model.constant;

import java.util.List;

public class FileConstant {
    public final static String DIRECTORY_DIVIDE = "/";
    public static final int AVATAR_RESIZE_DIMENSION_MAX = 480;
    public static final int COVER_IMAGE_RESIZE_DIMENSION_MAX = 1280;
    public final static int FILE_IMAGE_SIZE_MAX = 10 * 1024 * 1024; //max size is 10MB

    public final static String FILE_MP3 = "MP3";
    public final static int FILE_AUDIO_SIZE_MAX = 15 * 1024 * 1024; //max size is 15MB
    public final static List<String> FILE_AUDIO_MP3 = List.of("audio/mpeg");

    public final static String FILE_FLAC = "FLAC";
    public final static int FILE_AUDIO_FLAC_SIZE_MAX = 50 * 1024 * 1024; //max size is 50MB
    public final static List<String> FILE_AUDIO_FLAC = List.of(
            "audio/x-flac"  // x-flac
            , "audio/flac" // flac
    );
}
