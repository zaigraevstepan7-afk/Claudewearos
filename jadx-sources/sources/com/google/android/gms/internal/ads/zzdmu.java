package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;
import nc.l2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdmu extends zzbhb {
    private final String zza;
    private final zzdih zzb;
    private final zzdim zzc;

    public zzdmu(String str, zzdih zzdihVar, zzdim zzdimVar) {
        this.zza = str;
        this.zzb = zzdihVar;
        this.zzc = zzdimVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final double zzb() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final Bundle zzc() {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final l2 zzd() {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final zzbgg zze() {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final zzbgn zzf() {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final xd.a zzg() {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final xd.a zzh() {
        return new xd.b(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final String zzi() {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final String zzj() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final String zzk() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final String zzl() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final String zzm() {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final String zzn() {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final List zzo() {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzp() {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzq(Bundle bundle) {
        this.zzb.zzG(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzr(Bundle bundle) {
        this.zzb.zzM(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzs(Bundle bundle) {
        return this.zzb.zzZ(bundle);
    }
}
