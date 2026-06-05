package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeua implements zzetu {
    private final Context zza;
    private final zzgdm zzb;

    public zzeua(Context context, zzgdm zzgdmVar) {
        this.zza = context;
        this.zzb = zzgdmVar;
    }

    public static /* synthetic */ zzeub zzc(zzeua zzeuaVar) {
        Context context = zzeuaVar.zza;
        return new zzeub(zzbcm.zzb(context), zzbcm.zza(context));
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return ((Boolean) zzbeu.zzb.zze()).booleanValue() ? this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeua.zzc(this.zza);
            }
        }) : zzgdb.zzh(new zzeub(-1, -1));
    }
}
