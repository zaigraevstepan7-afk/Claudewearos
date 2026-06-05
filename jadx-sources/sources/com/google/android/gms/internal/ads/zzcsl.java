package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzbch;
import nc.q3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcsl implements zzcxf, nc.a, zzcyt, zzcwl, zzcvr, zzdbf {
    private final ud.a zza;
    private final zzbzj zzb;

    public zzcsl(ud.a aVar, zzbzj zzbzjVar) {
        this.zza = aVar;
        this.zzb = zzbzjVar;
    }

    @Override // nc.a
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdo(zzfcf zzfcfVar) {
        ud.a aVar = this.zza;
        zzbzj zzbzjVar = this.zzb;
        ((ud.b) aVar).getClass();
        zzbzjVar.zzk(SystemClock.elapsedRealtime());
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzi(zzbch.zzb zzbVar) {
        this.zzb.zzi();
    }

    public final void zzk(q3 q3Var) {
        this.zzb.zzj(q3Var);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzm(zzbch.zzb zzbVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() {
        this.zzb.zzh(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzj(zzbch.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzl(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzn(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzdu(zzbwa zzbwaVar, String str, String str2) {
    }
}
