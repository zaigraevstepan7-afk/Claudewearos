package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import java.util.concurrent.Callable;
import mc.n;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeqy implements zzetu {
    private final Context zza;
    private final zzgdm zzb;

    public zzeqy(zzgdm zzgdmVar, Context context) {
        this.zzb = zzgdmVar;
        this.zza = context;
    }

    public static zzeqz zzc(zzeqy zzeqyVar) {
        r0 r0Var = n.D.f11577c;
        Object systemService = zzeqyVar.zza.getSystemService("display");
        return new zzeqz(systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqy.zzc(this.zza);
            }
        });
    }
}
