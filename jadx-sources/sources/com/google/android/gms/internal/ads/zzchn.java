package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzchn implements zzhfy {
    private final zzhgh zza;

    public zzchn(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        Set setSingleton = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzbN)).booleanValue() ? Collections.singleton(new zzddo((zzdui) this.zza.zzb(), zzffm.zzc())) : Collections.EMPTY_SET;
        zzhgg.zzb(setSingleton);
        return setSingleton;
    }
}
