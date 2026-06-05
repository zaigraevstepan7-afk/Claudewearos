package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzesc implements zzetu {
    private static String zza;
    private final zzgdm zzb;
    private final Context zzc;

    public zzesc(zzgdm zzgdmVar, Context context) {
        this.zzb = zzgdmVar;
        this.zzc = context;
    }

    public static zzesd zzc(zzesc zzescVar) {
        zzbct zzbctVar = zzbdc.zzfu;
        t tVar = t.f12227d;
        if (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            return new zzesd(null);
        }
        if (!((Boolean) tVar.f12230c.zzb(zzbdc.zzfD)).booleanValue()) {
            return new zzesd(n.D.f11598y.zzf(zzescVar.zzc));
        }
        if (zza == null) {
            zza = n.D.f11598y.zzf(zzescVar.zzc);
        }
        return new zzesd(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesc.zzc(this.zza);
            }
        });
    }
}
