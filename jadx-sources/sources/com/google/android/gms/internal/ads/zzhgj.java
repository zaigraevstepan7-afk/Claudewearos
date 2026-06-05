package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhgj {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzhgj(int i10, int i11, zzhgi zzhgiVar) {
        this.zza = zzhfv.zzc(i10);
        this.zzb = zzhfv.zzc(i11);
    }

    public final zzhgj zza(zzhgh zzhghVar) {
        this.zzb.add(zzhghVar);
        return this;
    }

    public final zzhgj zzb(zzhgh zzhghVar) {
        this.zza.add(zzhghVar);
        return this;
    }

    public final zzhgk zzc() {
        return new zzhgk(this.zza, this.zzb, null);
    }
}
