package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import nc.h2;
import nc.z;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeld {
    private final zzdix zza;
    private final zzekq zzb;
    private final zzcvu zzc;

    public zzeld(zzdix zzdixVar, zzdsc zzdscVar) {
        this.zza = zzdixVar;
        final zzekq zzekqVar = new zzekq(zzdscVar);
        this.zzb = zzekqVar;
        final zzbmw zzbmwVarZzg = zzdixVar.zzg();
        this.zzc = new zzcvu() { // from class: com.google.android.gms.internal.ads.zzelc
            @Override // com.google.android.gms.internal.ads.zzcvu
            public final void zzdD(h2 h2Var) {
                zzekqVar.zzdD(h2Var);
                zzbmw zzbmwVar = zzbmwVarZzg;
                if (zzbmwVar != null) {
                    try {
                        zzbmwVar.zzf(h2Var);
                    } catch (RemoteException e10) {
                        k.i("#007 Could not call remote method.", e10);
                    }
                }
                if (zzbmwVar != null) {
                    try {
                        zzbmwVar.zze(h2Var.f12114a);
                    } catch (RemoteException e11) {
                        k.i("#007 Could not call remote method.", e11);
                    }
                }
            }
        };
    }

    public final zzcvu zza() {
        return this.zzc;
    }

    public final zzcxf zzb() {
        return this.zzb;
    }

    public final zzdgp zzc() {
        return new zzdgp(this.zza, this.zzb.zzg());
    }

    public final zzekq zzd() {
        return this.zzb;
    }

    public final void zze(z zVar) {
        this.zzb.zzj(zVar);
    }
}
