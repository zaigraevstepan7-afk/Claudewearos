package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzezc implements zzfut {
    final /* synthetic */ zzezg zza;

    public zzezc(zzezg zzezgVar) {
        this.zza = zzezgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfut
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i10 = l0.f13401b;
        k.e("", (zzdyp) obj);
        l0.k("Failed to get a cache key, reverting to legacy flow.");
        zzezg zzezgVar = this.zza;
        zzezgVar.zzd = new zzeze(null, zzezgVar.zze(), null);
        return zzezgVar.zzd;
    }
}
