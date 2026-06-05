package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.internal.i0;
import java.util.HashMap;
import java.util.Map;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbjk implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzcfe zzcfeVar = (zzcfe) obj;
        i0 i0Var = n.D.f11592s;
        Context context = zzcfeVar.getContext();
        synchronized (i0Var) {
            i0Var.f3554d = zzcfeVar;
            if (!i0Var.f(context)) {
                i0Var.c("Unable to bind", "on_play_store_bind");
                return;
            }
            HashMap map2 = new HashMap();
            map2.put("action", "fetch_completed");
            zzcad.zzf.execute(new b8.b(i0Var, "on_play_store_bind", map2, 6, false));
        }
    }
}
