package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzenb implements zzetu {
    private final zzgdm zza;
    private final zzfco zzb;
    private final zzbzu zzc;

    public zzenb(zzgdm zzgdmVar, zzfco zzfcoVar, zzbzu zzbzuVar) {
        this.zza = zzgdmVar;
        this.zzb = zzfcoVar;
        this.zzc = zzbzuVar;
    }

    public static /* synthetic */ zzenc zzc(zzenb zzenbVar) {
        return new zzenc(zzenbVar.zzb.zzj, zzenbVar.zzc.zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzena
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenb.zzc(this.zza);
            }
        });
    }
}
