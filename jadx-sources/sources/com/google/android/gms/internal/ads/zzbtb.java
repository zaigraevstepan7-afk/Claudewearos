package com.google.android.gms.internal.ads;

import wc.k;
import wc.l;
import wc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbtb {
    private final l zza;
    private final k zzb;
    private m zzc;

    public zzbtb(l lVar, k kVar) {
    }

    public static /* bridge */ /* synthetic */ k zzc(zzbtb zzbtbVar) {
        zzbtbVar.getClass();
        return null;
    }

    public static /* bridge */ /* synthetic */ l zzd(zzbtb zzbtbVar) {
        zzbtbVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized m zzf(zzbhh zzbhhVar) {
        m mVar = this.zzc;
        if (mVar != null) {
            return mVar;
        }
        zzbtc zzbtcVar = new zzbtc(zzbhhVar);
        this.zzc = zzbtcVar;
        return zzbtcVar;
    }

    public final zzbhr zza() {
        return null;
    }

    public final zzbhu zzb() {
        return new zzbsz(this, null);
    }
}
