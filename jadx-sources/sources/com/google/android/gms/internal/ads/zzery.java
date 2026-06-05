package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Callable;
import qc.n0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzery implements zzetu {
    private final zzgdm zza;
    private final zzfco zzb;
    private final PackageInfo zzc;
    private final n0 zzd;

    public zzery(zzgdm zzgdmVar, zzfco zzfcoVar, PackageInfo packageInfo, n0 n0Var) {
        this.zza = zzgdmVar;
        this.zzb = zzfcoVar;
        this.zzc = packageInfo;
        this.zzd = n0Var;
    }

    public static /* synthetic */ zzerz zzc(zzery zzeryVar) {
        return new zzerz(zzeryVar.zzb, zzeryVar.zzc, zzeryVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzery.zzc(this.zza);
            }
        });
    }
}
