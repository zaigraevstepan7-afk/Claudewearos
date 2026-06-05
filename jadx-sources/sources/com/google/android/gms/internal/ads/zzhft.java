package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzhft {
    final LinkedHashMap zza;

    public zzhft(int i10) {
        this.zza = zzhfv.zzb(i10);
    }

    public final zzhft zza(Object obj, zzhgh zzhghVar) {
        zzhgg.zza(obj, "key");
        zzhgg.zza(zzhghVar, "provider");
        this.zza.put(obj, zzhghVar);
        return this;
    }
}
