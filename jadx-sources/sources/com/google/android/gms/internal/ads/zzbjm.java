package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.internal.i0;
import java.util.HashMap;
import java.util.Map;
import mc.n;
import p7.k;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbjm implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzfsv zzfsvVar;
        i0 i0Var = n.D.f11592s;
        if (!i0Var.f3551a || (zzfsvVar = (zzfsv) i0Var.f3555e) == null) {
            l0.k("LastMileDelivery not connected");
        } else {
            zzfsvVar.zzc(i0Var.g(), (k) i0Var.f3556f);
            zzcad.zzf.execute(new b8.b(i0Var, "onLMDOverlayExpand", new HashMap(), 6, false));
        }
    }
}
