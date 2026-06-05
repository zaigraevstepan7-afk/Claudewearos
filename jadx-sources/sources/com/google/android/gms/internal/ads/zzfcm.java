package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.e0;
import ic.g;
import java.util.ArrayList;
import nc.b1;
import nc.e1;
import nc.n3;
import nc.q3;
import nc.s3;
import nc.v3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfcm {
    private q3 zza;
    private s3 zzb;
    private String zzc;
    private n3 zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbgc zzh;
    private v3 zzi;
    private ic.a zzj;
    private g zzk;
    private b1 zzl;
    private zzbmn zzn;
    private zzekq zzr;
    private Bundle zzt;
    private e1 zzu;
    private int zzm = 1;
    private final zzfbz zzo = new zzfbz();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;

    public final zzfcm zzA(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final zzfcm zzB(boolean z2) {
        this.zze = z2;
        return this;
    }

    public final zzfcm zzC(int i10) {
        this.zzm = i10;
        return this;
    }

    public final zzfcm zzD(zzbgc zzbgcVar) {
        this.zzh = zzbgcVar;
        return this;
    }

    public final zzfcm zzE(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfcm zzF(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfcm zzG(g gVar) {
        this.zzk = gVar;
        if (gVar != null) {
            this.zze = gVar.f8502a;
            this.zzl = gVar.f8503b;
        }
        return this;
    }

    public final zzfcm zzH(q3 q3Var) {
        this.zza = q3Var;
        return this;
    }

    public final zzfcm zzI(n3 n3Var) {
        this.zzd = n3Var;
        return this;
    }

    public final zzfco zzJ() {
        e0.j(this.zzc, "ad unit must not be null");
        e0.j(this.zzb, "ad size must not be null");
        e0.j(this.zza, "ad request must not be null");
        return new zzfco(this, null);
    }

    public final String zzL() {
        return this.zzc;
    }

    public final boolean zzS() {
        return this.zzp;
    }

    public final boolean zzT() {
        return this.zzq;
    }

    public final zzfcm zzV(e1 e1Var) {
        this.zzu = e1Var;
        return this;
    }

    public final q3 zzf() {
        return this.zza;
    }

    public final s3 zzh() {
        return this.zzb;
    }

    public final zzfbz zzp() {
        return this.zzo;
    }

    public final zzfcm zzq(zzfco zzfcoVar) {
        this.zzo.zza(zzfcoVar.zzo.zza);
        this.zza = zzfcoVar.zzd;
        this.zzb = zzfcoVar.zze;
        this.zzu = zzfcoVar.zzt;
        this.zzc = zzfcoVar.zzf;
        this.zzd = zzfcoVar.zza;
        this.zzf = zzfcoVar.zzg;
        this.zzg = zzfcoVar.zzh;
        this.zzh = zzfcoVar.zzi;
        this.zzi = zzfcoVar.zzj;
        zzr(zzfcoVar.zzl);
        zzG(zzfcoVar.zzm);
        this.zzp = zzfcoVar.zzp;
        this.zzq = zzfcoVar.zzq;
        this.zzr = zzfcoVar.zzc;
        this.zzs = zzfcoVar.zzr;
        this.zzt = zzfcoVar.zzs;
        return this;
    }

    public final zzfcm zzr(ic.a aVar) {
        this.zzj = aVar;
        if (aVar != null) {
            this.zze = aVar.f8487a;
        }
        return this;
    }

    public final zzfcm zzs(s3 s3Var) {
        this.zzb = s3Var;
        return this;
    }

    public final zzfcm zzt(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfcm zzu(v3 v3Var) {
        this.zzi = v3Var;
        return this;
    }

    public final zzfcm zzv(zzekq zzekqVar) {
        this.zzr = zzekqVar;
        return this;
    }

    public final zzfcm zzw(zzbmn zzbmnVar) {
        this.zzn = zzbmnVar;
        this.zzd = new n3(false, true, false);
        return this;
    }

    public final zzfcm zzx(boolean z2) {
        this.zzp = z2;
        return this;
    }

    public final zzfcm zzy(boolean z2) {
        this.zzq = z2;
        return this;
    }

    public final zzfcm zzz(boolean z2) {
        this.zzs = true;
        return this;
    }
}
