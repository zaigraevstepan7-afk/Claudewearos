package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzetr implements zzetu {
    private final zzgdm zza;
    private final Context zzb;

    public zzetr(zzgdm zzgdmVar, Context context) {
        this.zza = zzgdmVar;
        this.zzb = context;
    }

    public static zzetq zzc(zzetr zzetrVar) {
        return new zzetq(cg.b.Y(zzetrVar.zzb, (String) t.f12227d.f12230c.zzb(zzbdc.zzgm)));
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetr.zzc(this.zza);
            }
        });
    }
}
