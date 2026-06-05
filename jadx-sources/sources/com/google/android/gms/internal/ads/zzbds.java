package com.google.android.gms.internal.ads;

import android.view.View;
import mc.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbds extends zzbdt {
    private final f zza;
    private final String zzb;
    private final String zzc;

    public zzbds(f fVar, String str, String str2) {
        this.zza = fVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final void zzd(xd.a aVar) {
        if (aVar == null) {
            return;
        }
        this.zza.zza((View) xd.b.u(aVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final void zze() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final void zzf() {
        this.zza.zzc();
    }
}
