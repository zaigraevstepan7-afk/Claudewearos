package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import nc.a2;
import nc.i2;
import nc.l2;
import nc.p1;
import nc.s1;
import nc.t;
import org.json.JSONException;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdnb extends zzbig {
    private final String zza;
    private final zzdih zzb;
    private final zzdim zzc;
    private final zzdsc zzd;

    public zzdnb(String str, zzdih zzdihVar, zzdim zzdimVar, zzdsc zzdscVar) {
        this.zza = str;
        this.zzb = zzdihVar;
        this.zzc = zzdimVar;
        this.zzd = zzdscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzA() {
        this.zzb.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzB(Bundle bundle) throws JSONException {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzng)).booleanValue()) {
            this.zzb.zzI(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzC(Bundle bundle) {
        this.zzb.zzM(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzD() {
        this.zzb.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzE(p1 p1Var) {
        this.zzb.zzP(p1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzF(a2 a2Var) {
        try {
            if (!a2Var.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.c("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzb.zzQ(a2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzG(zzbie zzbieVar) {
        this.zzb.zzR(zzbieVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final boolean zzH() {
        return this.zzb.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final boolean zzI() {
        zzdim zzdimVar = this.zzc;
        return (zzdimVar.zzH().isEmpty() || zzdimVar.zzk() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final boolean zzJ(Bundle bundle) {
        return this.zzb.zzZ(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final double zze() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final Bundle zzf() {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final i2 zzg() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgR)).booleanValue()) {
            return this.zzb.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final l2 zzh() {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final zzbgg zzi() {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final zzbgk zzj() {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final zzbgn zzk() {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final xd.a zzl() {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final xd.a zzm() {
        return new xd.b(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzn() {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzo() {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzp() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzq() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzr() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzs() {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzt() {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final List zzu() {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final List zzv() {
        return zzI() ? this.zzc.zzH() : Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzw() {
        this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzx() {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzy(s1 s1Var) {
        this.zzb.zzC(s1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzz(Bundle bundle) {
        this.zzb.zzG(bundle);
    }
}
