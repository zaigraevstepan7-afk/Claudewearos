package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcpe implements zzhfy {
    private final zzcou zza;
    private final zzhgh zzb;

    public zzcpe(zzcou zzcouVar, zzhgh zzhghVar) {
        this.zza = zzcouVar;
        this.zzb = zzhghVar;
    }

    public static Set zza(zzcou zzcouVar, zzcqk zzcqkVar) {
        Set setSingleton = Collections.singleton(new zzddo(zzcqkVar, zzcad.zzg));
        zzhgg.zzb(setSingleton);
        return setSingleton;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzcqk) this.zzb.zzb());
    }
}
