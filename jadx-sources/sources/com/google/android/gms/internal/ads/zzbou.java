package com.google.android.gms.internal.ads;

import android.content.Context;
import qc.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbou {
    static final s zza = new zzbos();
    static final s zzb = new zzbot();
    private final zzbog zzc;

    public zzbou(Context context, rc.a aVar, String str, zzfhp zzfhpVar) {
        this.zzc = new zzbog(context, aVar, str, zza, zzb, zzfhpVar);
    }

    public final zzbok zza(String str, zzbon zzbonVar, zzbom zzbomVar) {
        return new zzboy(this.zzc, str, zzbonVar, zzbomVar);
    }

    public final zzbpd zzb() {
        return new zzbpd(this.zzc);
    }
}
