package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzeol {
    public final mf.a zza;
    private final long zzb;
    private final ud.a zzc;

    public zzeol(mf.a aVar, long j, ud.a aVar2) {
        this.zza = aVar;
        this.zzc = aVar2;
        ((ud.b) aVar2).getClass();
        this.zzb = SystemClock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        ud.a aVar = this.zzc;
        long j = this.zzb;
        ((ud.b) aVar).getClass();
        return j < SystemClock.elapsedRealtime();
    }
}
