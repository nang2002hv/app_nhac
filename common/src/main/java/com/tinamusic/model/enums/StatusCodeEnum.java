package com.tinamusic.model.enums;

public enum StatusCodeEnum {
    //SUCCESS RESPONSE
    SUCCESS200(1036),

    //INTERNAL SERVER ERROR
    INTERNAL_SERVER_ERROR500(500), //Internal server

    //EXCEPTION
    EXCEPTION(1000), // Exception
    EXCEPTION0400(1001), // Bad request
    EXCEPTION0404(1002), // Not found
    EXCEPTION0409(1003), // Data integrity violation
    EXCEPTION0503(1004), // Http message not readable
    EXCEPTION0504(1005), // Missing servlet request parameter
    EXCEPTION0505(1006), // Access Denied/Not have permission

    //USER
    USER0000(1008), // Get my user information failed
    USER0001(1009), // Get user information failed

    //AUTH
    AUTH0000(1012), // Login failed
    AUTH0001(1013), // Incorrect login information
    AUTH0002(1014), // User not found
    AUTH0003(1015), // Update user lao id failed
    AUTH0004(1016), // Account already exists

    //RESET PASSWORD
    RESETPASS0000(1019), // This email does not exist for reset password
    RESETPASS0001(1020), // Type login not support for reset password
    RESETPASS0002(1021), // Verify OTP password reset failed
    RESETPASS0003(1022), // This email does not exist for reset password
    RESETPASS0004(1023), // Type login not support for reset password
    RESETPASS0005(1024), // Save reset token to redis failed
    RESETPASS0006(1025), // Update account password failed
    RESETPASS0007(1026), // Get account id from token failed
    RESETPASS0008(1027), // Get account info failed for reset password

    // OTP
    OTP0000(1030), // Send otp to request register failed
    OTP0001(1031), // Enter incorrect OTP
    OTP0002(1032), // Wrong otp reset password
    OTP0003(1033), // Send otp to request reset password failed

    //Home
    HOME0000(1035), // Get home data failed


    //Music collection
    MUSICCOLLECTION0000(1037), // Add music collection failed

    //Theme and genre
    GENRE0000(1038), // Add music theme and genre failed

    //Update User
    USER0002(1040), // Get user from context failed
    USER0003(1041), // Username is existed in system when update user
    USER0004(1042), // Update User info failed
    USER0005(1044), // Get user info failed from context when upload avatar
    USER0006(1045), // Update user avatar failed by upload to minio failed
    USER0007(1046), // Update user avatar failed
    USER0008(1048), // Get user info from context failed when change password
    USER0009(1049), // Wrong old password
    USER0010(1050), // Password not match between new password and confirm password
    USER0011(1051), // Change user password failed
    USER0012(1053), // Get user info failed from context when update user language
    USER0013(1054), // Update user language failed
    USER0014(1056), // Get user info from context failed when get info logged in
    USER0015(1057), // Get user info logged in failed
    USER0016(1058), // The new password must not match the old password

    //Delete User
    USER0017(1043), // Delete my account successfully
    USER0018(1047), // Get user info from context failed when delete account
    USER0019(1052), // Delete my account failed
    USER0020(1039), // Account is deleted

    // Playlist details
    PLAYLISTDETAILS0001(1059), // Playlist not found
    PLAYLISTDETAILS0002(1060), // Song not found
    PLAYLISTDETAILS0003(1061), // Artist not found
    PLAYLISTDETAILS0004(1062), // Album not found
    PLAYLISTDETAILS0005(1063), // Get playlist details failed

    // Album
    ALBUM0001(1065), // Create album failed
    ALBUM0002(1067), // Update album failed
    ALBUM0003(1069), // Get album failed
    ALBUM0004(1070), // Not found album
    ALBUM0005(1072), // Delete album failed

    // Playlist
    PLAYLIST0001(1074), // Create playlist failed
    PLAYLIST0002(1076), // Update playlist failed
    PLAYLIST0003(1078), // Get playlist failed
    PLAYLIST0004(1079), // Not found playlist
    PLAYLIST0005(1081), // Delete playlist failed

    //Artist
    ARTIST0001(1082), // Email artist has been used
    ARTIST0002(1083), // Create artist failed
    ARTIST0003(1084), // Get artist info failed
    ARTIST0004(1085), // Update artist failed
    ARTIST0005(1086), // Get all artist failed
    ARTIST0006(1087), // Get artist detail failed
    ARTIST0007(1088), // Delete artist failed

    // Song
    SONG0001(1083), // Create song failed
    SONG0002(1085), // Update song failed
    SONG0003(1087), // Get song failed
    SONG0004(1088), // Not found song
    SONG0005(1090), // Delete song failed
    SONG0006(1091), // Upload lyrics file failed
    SONG0007(1093), // Upload audio file failed

    // Music collection
    MUSICCOLLECTION0001(1092), // Create music collection failed
    MUSICCOLLECTION0002(1094), // Update music collection failed
    MUSICCOLLECTION0003(1096), // Get music collection failed
    MUSICCOLLECTION0004(1097), // Not found music collection
    MUSICCOLLECTION0005(1099), // Delete music collection failed

    // Autofill
    ERROR1100(1100), // Error when autofill

    // OAuth
    OAUTH0001(1101), // Get userInfo failed
    OAUTH0002(1102), // Unsupported login type
    OAUTH0003(1103), // Authentication failed
    OAUTH0004(1104), // Get linked account failed
    OAUTH0005(1105), // Link social account failed
    OAUTH0006(1106), // Not found social account

    // Play Music
    PLAYMUSIC0001(1107), // Get music failed
    PLAYMUSIC0002(1108), // Get playlist by userId failed
    PLAYMUSIC0003(1109), // Playlist not found
    PLAYMUSIC0004(1110), // Add song to user playlist failed
    PLAYMUSIC0005(1111), // Song already in playlist
    PLAYMUSIC0006(1112), // Get option download song failed
    PLAYMUSIC0007(1113), // Song not found
    PLAYMUSIC0008(1114), // Get waiting list song failed
    PLAYMUSIC0009(1115), // Add song to waiting list failed
    PLAYMUSIC0010(1116), // Get remaining time failed
    PLAYMUSIC0011(1117), // Set sleep timer failed
    PLAYMUSIC0012(1118), // Invalid sleep timer
    PLAYMUSIC0013(1119), // Get album of the song failed
    PLAYMUSIC0014(1120), // Get recently heard failed

    // Like/Dislike song, album, artist
    FAVOURITE0001(1107), // Like/Dislike failed
    FAVORITE00002(1108), // // Get artist failed
    LISTENCOUNT0001(1108), //Listen count success

    //search
    NO_CONTENT204(1110), //No content found
    KEY_EXPIRED401(1111), // API key has expired or is no longer valid
    SEARCH_ERROR500(1112), // Search error
    //CMS-USER
    CMSUSER0000(1115), // Add cms user account failed

    ;

    public final int value;

    StatusCodeEnum(int i) {
        value = i;
    }
}
