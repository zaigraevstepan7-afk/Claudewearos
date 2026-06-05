package com.google.android.gms.internal.ads;

import mc.n;
import qc.l0;
import qc.p;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbzm extends p {
    final /* synthetic */ zzbzq zza;

    public zzbzm(zzbzq zzbzqVar) {
        this.zza = zzbzqVar;
    }

    @Override // qc.p
    public final void zza() {
        zzbzq zzbzqVar = this.zza;
        zzbdf zzbdfVar = new zzbdf(zzbzqVar.zze, zzbzqVar.zzf.f14321a);
        synchronized (zzbzqVar.zza) {
            try {
                zzbdi zzbdiVar = n.D.f11586m;
                zzbdi.zza(zzbzqVar.zzh, zzbdfVar);
            } catch (IllegalArgumentException e10) {
                int i10 = l0.f13401b;
                k.h("Cannot config CSI reporter.", e10);
            }
        }
    }
}
