package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzees implements zzdgg {
    final /* synthetic */ zzcai zza;
    final /* synthetic */ zzfbt zzb;
    final /* synthetic */ zzeet zzc;

    public zzees(zzeet zzeetVar, zzcai zzcaiVar, zzfbt zzfbtVar) {
        this.zza = zzcaiVar;
        this.zzb = zzfbtVar;
        this.zzc = zzeetVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final zzfbt zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void zzb(boolean z2, Context context, zzcwe zzcweVar) {
        try {
            y9.a aVar = n.D.f11576b;
            y9.a.m(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zze);
        } catch (Exception unused) {
        }
    }
}
