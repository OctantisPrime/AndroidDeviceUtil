package com.octantis.prime.android.deviceutils.data;


import static com.octantis.prime.android.deviceutils.utils.OtherUtils.getAvailMemory;
import static com.octantis.prime.android.deviceutils.utils.OtherUtils.getInternalAvailableSize;
import static com.octantis.prime.android.deviceutils.utils.OtherUtils.getInternalTotalSize;
import static com.octantis.prime.android.deviceutils.utils.OtherUtils.getTotalMemory;

public class StorageData {
    public long ram_total_size;
    public long ram_usable_size;
    public long internal_storage_total;
    public long internal_storage_usable;
    public long memory_card_size;
    public long memory_card_size_use;

    {
        ram_total_size = getTotalMemory();
        ram_usable_size = getAvailMemory();
        internal_storage_total = getInternalTotalSize();
        internal_storage_usable = getInternalAvailableSize();
//        memory_card_size = getExternalTotalSize();
//        memory_card_size_use = getExternalTotalSize() - getExternalAvailableSize();
    }

}