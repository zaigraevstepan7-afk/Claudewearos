package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzun implements zzvs, zzsd {
    final /* synthetic */ zzup zza;
    private final Object zzb;
    private zzvr zzc;
    private zzsc zzd;

    public zzun(zzup zzupVar, Object obj) {
        this.zza = zzupVar;
        this.zzc = zzupVar.zze(null);
        this.zzd = zzupVar.zzc(null);
        this.zzb = obj;
    }

    private final zzvd zzf(zzvd zzvdVar, zzvh zzvhVar) {
        zzup zzupVar = this.zza;
        Object obj = this.zzb;
        zzupVar.zzx(obj, zzvdVar.zzc, zzvhVar);
        zzupVar.zzx(obj, zzvdVar.zzd, zzvhVar);
        return zzvdVar;
    }

    private final boolean zzg(int i10, zzvh zzvhVar) {
        zzvh zzvhVarZzy;
        if (zzvhVar != null) {
            zzvhVarZzy = this.zza.zzy(this.zzb, zzvhVar);
            if (zzvhVarZzy == null) {
                return false;
            }
        } else {
            zzvhVarZzy = null;
        }
        zzup zzupVar = this.zza;
        zzupVar.zzw(this.zzb, 0);
        zzvr zzvrVar = this.zzc;
        int i11 = zzvrVar.zza;
        if (!Objects.equals(zzvrVar.zzb, zzvhVarZzy)) {
            this.zzc = zzupVar.zzf(0, zzvhVarZzy);
        }
        zzsc zzscVar = this.zzd;
        int i12 = zzscVar.zza;
        if (Objects.equals(zzscVar.zzb, zzvhVarZzy)) {
            return true;
        }
        this.zzd = zzupVar.zzd(0, zzvhVarZzy);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zzag(int i10, zzvh zzvhVar, zzvd zzvdVar) {
        if (zzg(0, zzvhVar)) {
            zzvr zzvrVar = this.zzc;
            zzf(zzvdVar, zzvhVar);
            zzvrVar.zzd(zzvdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zzah(int i10, zzvh zzvhVar, zzuy zzuyVar, zzvd zzvdVar) {
        if (zzg(0, zzvhVar)) {
            zzvr zzvrVar = this.zzc;
            zzf(zzvdVar, zzvhVar);
            zzvrVar.zze(zzuyVar, zzvdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zzai(int i10, zzvh zzvhVar, zzuy zzuyVar, zzvd zzvdVar) {
        if (zzg(0, zzvhVar)) {
            zzvr zzvrVar = this.zzc;
            zzf(zzvdVar, zzvhVar);
            zzvrVar.zzf(zzuyVar, zzvdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zzaj(int i10, zzvh zzvhVar, zzuy zzuyVar, zzvd zzvdVar, IOException iOException, boolean z2) {
        if (zzg(0, zzvhVar)) {
            zzvr zzvrVar = this.zzc;
            zzf(zzvdVar, zzvhVar);
            zzvrVar.zzg(zzuyVar, zzvdVar, iOException, z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zzak(int i10, zzvh zzvhVar, zzuy zzuyVar, zzvd zzvdVar, int i11) {
        if (zzg(0, zzvhVar)) {
            zzvr zzvrVar = this.zzc;
            zzf(zzvdVar, zzvhVar);
            zzvrVar.zzh(zzuyVar, zzvdVar, i11);
        }
    }
}
