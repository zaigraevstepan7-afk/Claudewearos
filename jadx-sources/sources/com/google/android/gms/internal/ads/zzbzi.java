package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbzi {
    final /* synthetic */ zzbzj zza;
    private long zzb = -1;
    private long zzc = -1;

    public zzbzi(zzbzj zzbzjVar) {
        this.zza = zzbzjVar;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }

    public final void zzc() {
        ((ud.b) this.zza.zza).getClass();
        this.zzc = SystemClock.elapsedRealtime();
    }

    public final void zzd() {
        ((ud.b) this.zza.zza).getClass();
        this.zzb = SystemClock.elapsedRealtime();
    }
}
