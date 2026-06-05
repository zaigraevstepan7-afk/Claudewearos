package com.google.android.gms.internal.ads;

import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcdp extends zzcdl {
    public zzcdp(zzcbz zzcbzVar) {
        super(zzcbzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final boolean zzt(String str) {
        String strD = rc.e.d(str, "MD5");
        zzcbz zzcbzVar = (zzcbz) this.zzc.get();
        if (zzcbzVar != null && strD != null) {
            zzcbzVar.zzt(strD, this);
        }
        int i10 = l0.f13401b;
        k.g("VideoStreamNoopCache is doing nothing.");
        zzg(str, strD, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzf() {
    }
}
