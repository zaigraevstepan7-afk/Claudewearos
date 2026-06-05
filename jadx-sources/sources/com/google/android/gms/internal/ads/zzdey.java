package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import pc.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzdey {
    private final zzdgg zza;
    private final zzcfe zzb;

    public zzdey(zzdgg zzdggVar, zzcfe zzcfeVar) {
        this.zza = zzdggVar;
        this.zzb = zzcfeVar;
    }

    public final View zza() {
        zzcfe zzcfeVar = this.zzb;
        if (zzcfeVar == null) {
            return null;
        }
        return zzcfeVar.zzG();
    }

    public final View zzb() {
        zzcfe zzcfeVar = this.zzb;
        if (zzcfeVar != null) {
            return zzcfeVar.zzG();
        }
        return null;
    }

    public final zzcfe zzc() {
        return this.zzb;
    }

    public final zzddo zzd(Executor executor) {
        final zzcfe zzcfeVar = this.zzb;
        return new zzddo(new zzdal() { // from class: com.google.android.gms.internal.ads.zzdex
            @Override // com.google.android.gms.internal.ads.zzdal
            public final void zza() {
                i iVarZzL;
                zzcfe zzcfeVar2 = zzcfeVar;
                if (zzcfeVar2 == null || (iVarZzL = zzcfeVar2.zzL()) == null) {
                    return;
                }
                iVarZzL.zzb();
            }
        }, executor);
    }

    public final zzdgg zze() {
        return this.zza;
    }

    public Set zzf(zzcum zzcumVar) {
        return Collections.singleton(new zzddo(zzcumVar, zzcad.zzg));
    }

    public Set zzg(zzcum zzcumVar) {
        return Collections.singleton(new zzddo(zzcumVar, zzcad.zzg));
    }
}
