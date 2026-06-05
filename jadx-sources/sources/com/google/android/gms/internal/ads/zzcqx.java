package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcqx implements zzcqy {
    private final Map zza;

    public zzcqx(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final zzede zza(int i10, String str) {
        return (zzede) this.zza.get(str);
    }
}
