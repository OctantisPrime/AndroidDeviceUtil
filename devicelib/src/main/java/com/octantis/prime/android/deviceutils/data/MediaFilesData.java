package com.octantis.prime.android.deviceutils.data;


import static com.octantis.prime.android.deviceutils.utils.MediaFilesUtils.getAudioExternal;
import static com.octantis.prime.android.deviceutils.utils.MediaFilesUtils.getAudioInternal;
import static com.octantis.prime.android.deviceutils.utils.MediaFilesUtils.getDownloadFilesCount;
import static com.octantis.prime.android.deviceutils.utils.MediaFilesUtils.getImagesExternal;
import static com.octantis.prime.android.deviceutils.utils.MediaFilesUtils.getImagesInternal;
import static com.octantis.prime.android.deviceutils.utils.MediaFilesUtils.getVideoExternal;
import static com.octantis.prime.android.deviceutils.utils.MediaFilesUtils.getVideoInternal;
import static com.octantis.prime.android.deviceutils.utils.OtherUtils.getContactGroupCount;

public class MediaFilesData {

    public int audio_internal;
    public int audio_external;
    public int images_internal;
    public int images_external;
    public int video_internal;
    public int video_external;
    public int download_files;
    public int contact_group;

    {
        audio_internal = getAudioInternal();
        audio_external = getAudioExternal();
        images_internal = getImagesInternal();
        images_external = getImagesExternal();
        video_internal = getVideoInternal();
        video_external = getVideoExternal();
        download_files = getDownloadFilesCount();
        contact_group = getContactGroupCount();

    }

}
