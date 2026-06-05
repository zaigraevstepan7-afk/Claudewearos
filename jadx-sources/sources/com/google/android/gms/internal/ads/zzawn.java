package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzawn {
    private List zza = Collections.EMPTY_LIST;

    public final List zza() {
        List list = this.zza;
        this.zza = Collections.EMPTY_LIST;
        return list;
    }

    public final void zzb(List list) {
        this.zza = new ArrayList(list);
    }
}
