package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzerc implements zzetu {
    private final zzgdm zza;
    private final zzfco zzb;

    public zzerc(zzgdm zzgdmVar, zzfco zzfcoVar) {
        this.zza = zzgdmVar;
        this.zzb = zzfcoVar;
    }

    public static /* synthetic */ zzerd zzc(zzerc zzercVar) {
        return new zzerd("requester_type_2".equals(u3.c.w(zzercVar.zzb.zzd)));
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerc.zzc(this.zza);
            }
        });
    }
}
