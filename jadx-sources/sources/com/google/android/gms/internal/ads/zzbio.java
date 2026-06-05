package com.google.android.gms.internal.ads;

import ic.j;
import ic.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbio {
    private final k zza;
    private final j zzb;
    private zzbhi zzc;

    public zzbio(k kVar, j jVar) {
        this.zza = kVar;
        this.zzb = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzbhi zzf(zzbhh zzbhhVar) {
        zzbhi zzbhiVar = this.zzc;
        if (zzbhiVar != null) {
            return zzbhiVar;
        }
        zzbhi zzbhiVar2 = new zzbhi(zzbhhVar);
        this.zzc = zzbhiVar2;
        return zzbhiVar2;
    }

    public final zzbhr zzc() {
        zzbin zzbinVar = null;
        if (this.zzb == null) {
            return null;
        }
        return new zzbil(this, zzbinVar);
    }

    public final zzbhu zzd() {
        return new zzbim(this, null);
    }
}
