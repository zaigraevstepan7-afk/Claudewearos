package com.google.android.gms.internal.ads;

import android.content.Context;
import ic.g;
import java.util.ArrayList;
import nc.e1;
import nc.f0;
import nc.h0;
import nc.s3;
import nc.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzejt extends h0 {
    final zzfcm zza;
    final zzdiv zzb;
    private final Context zzc;
    private final zzcgz zzd;
    private z zze;

    public zzejt(zzcgz zzcgzVar, Context context, String str) {
        zzfcm zzfcmVar = new zzfcm();
        this.zza = zzfcmVar;
        this.zzb = new zzdiv();
        this.zzd = zzcgzVar;
        zzfcmVar.zzt(str);
        this.zzc = context;
    }

    @Override // nc.i0
    public final f0 zze() {
        zzdix zzdixVarZzg = this.zzb.zzg();
        ArrayList arrayListZzi = zzdixVarZzg.zzi();
        zzfcm zzfcmVar = this.zza;
        zzfcmVar.zzE(arrayListZzi);
        zzfcmVar.zzF(zzdixVarZzg.zzh());
        if (zzfcmVar.zzh() == null) {
            zzfcmVar.zzs(s3.c());
        }
        return new zzeju(this.zzc, this.zzd, zzfcmVar, zzdixVarZzg, this.zze);
    }

    @Override // nc.i0
    public final void zzf(zzbhl zzbhlVar) {
        this.zzb.zza(zzbhlVar);
    }

    @Override // nc.i0
    public final void zzg(zzbho zzbhoVar) {
        this.zzb.zzb(zzbhoVar);
    }

    @Override // nc.i0
    public final void zzh(String str, zzbhu zzbhuVar, zzbhr zzbhrVar) {
        this.zzb.zzc(str, zzbhuVar, zzbhrVar);
    }

    @Override // nc.i0
    public final void zzi(zzbmw zzbmwVar) {
        this.zzb.zzd(zzbmwVar);
    }

    @Override // nc.i0
    public final void zzj(zzbhy zzbhyVar, s3 s3Var) {
        this.zzb.zze(zzbhyVar);
        this.zza.zzs(s3Var);
    }

    @Override // nc.i0
    public final void zzk(zzbib zzbibVar) {
        this.zzb.zzf(zzbibVar);
    }

    @Override // nc.i0
    public final void zzl(z zVar) {
        this.zze = zVar;
    }

    @Override // nc.i0
    public final void zzm(ic.a aVar) {
        this.zza.zzr(aVar);
    }

    @Override // nc.i0
    public final void zzn(zzbmn zzbmnVar) {
        this.zza.zzw(zzbmnVar);
    }

    @Override // nc.i0
    public final void zzo(zzbgc zzbgcVar) {
        this.zza.zzD(zzbgcVar);
    }

    @Override // nc.i0
    public final void zzp(g gVar) {
        this.zza.zzG(gVar);
    }

    @Override // nc.i0
    public final void zzq(e1 e1Var) {
        this.zza.zzV(e1Var);
    }
}
