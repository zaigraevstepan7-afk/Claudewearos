package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;
import nc.l2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdmw extends zzbhd {
    private final String zza;
    private final zzdih zzb;
    private final zzdim zzc;

    public zzdmw(String str, zzdih zzdihVar, zzdim zzdimVar) {
        this.zza = str;
        this.zzb = zzdihVar;
        this.zzc = zzdimVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final Bundle zzb() {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final l2 zzc() {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final zzbgg zzd() {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final zzbgn zze() {
        return this.zzc.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final xd.a zzf() {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final xd.a zzg() {
        return new xd.b(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final String zzh() {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final String zzi() {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final String zzj() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final String zzk() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final String zzl() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final List zzm() {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final void zzn() {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final void zzo(Bundle bundle) {
        this.zzb.zzG(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final void zzp(Bundle bundle) {
        this.zzb.zzM(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final boolean zzq(Bundle bundle) {
        return this.zzb.zzZ(bundle);
    }
}
