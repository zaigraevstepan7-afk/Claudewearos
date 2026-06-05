package com.google.android.gms.internal.ads;

import pc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdnu extends zzdne implements zzddw {
    private zzddw zza;

    @Override // com.google.android.gms.internal.ads.zzddw
    public final synchronized void zzdf() {
        zzddw zzddwVar = this.zza;
        if (zzddwVar != null) {
            zzddwVar.zzdf();
        }
    }

    public final synchronized void zzi(nc.a aVar, zzbit zzbitVar, m mVar, zzbiv zzbivVar, pc.c cVar, zzddw zzddwVar) throws Throwable {
        try {
            try {
                zzh(aVar, zzbitVar, mVar, zzbivVar, cVar);
                this.zza = zzddwVar;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final synchronized void zzu() {
        zzddw zzddwVar = this.zza;
        if (zzddwVar != null) {
            zzddwVar.zzu();
        }
    }
}
