package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.internal.i0;
import java.util.Map;
import mc.n;
import nc.t;
import p7.k;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbjo implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzfsv zzfsvVar;
        i0 i0Var = n.D.f11592s;
        if (!i0Var.f3551a || (zzfsvVar = (zzfsv) i0Var.f3555e) == null) {
            l0.k("LastMileDelivery not connected");
            return;
        }
        zzfst zzfstVarZzc = zzfsu.zzc();
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlK)).booleanValue() || TextUtils.isEmpty((String) i0Var.f3553c)) {
            String str = (String) i0Var.f3552b;
            if (str != null) {
                zzfstVarZzc.zzb(str);
            } else {
                i0Var.c("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfstVarZzc.zza((String) i0Var.f3553c);
        }
        zzfsvVar.zzb(zzfstVarZzc.zzc(), (k) i0Var.f3556f);
    }
}
