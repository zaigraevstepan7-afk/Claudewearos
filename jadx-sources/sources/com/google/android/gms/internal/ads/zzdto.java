package com.google.android.gms.internal.ads;

import nc.h2;
import nc.y;
import org.json.JSONException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdto extends y {
    final /* synthetic */ zzdti zza;
    final /* synthetic */ zzdtp zzb;

    public zzdto(zzdtp zzdtpVar, zzdti zzdtiVar) {
        this.zza = zzdtiVar;
        this.zzb = zzdtpVar;
    }

    @Override // nc.z
    public final void zzc() throws JSONException {
        this.zza.zzb(this.zzb.zza);
    }

    @Override // nc.z
    public final void zzd() throws JSONException {
        this.zza.zzc(this.zzb.zza);
    }

    @Override // nc.z
    public final void zze(int i10) throws JSONException {
        this.zza.zzd(this.zzb.zza, i10);
    }

    @Override // nc.z
    public final void zzf(h2 h2Var) throws JSONException {
        this.zza.zzd(this.zzb.zza, h2Var.f12114a);
    }

    @Override // nc.z
    public final void zzi() throws JSONException {
        this.zza.zze(this.zzb.zza);
    }

    @Override // nc.z
    public final void zzj() throws JSONException {
        this.zza.zzg(this.zzb.zza);
    }

    @Override // nc.z
    public final void zzg() {
    }

    @Override // nc.z
    public final void zzh() {
    }

    @Override // nc.z
    public final void zzk() {
    }
}
