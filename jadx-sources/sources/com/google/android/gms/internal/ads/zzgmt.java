package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgmt {
    private HashMap zza = new HashMap();

    public final zzgmv zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzgmv zzgmvVar = new zzgmv(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzgmvVar;
    }
}
