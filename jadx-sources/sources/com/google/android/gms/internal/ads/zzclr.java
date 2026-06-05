package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.Map;
import mc.n;
import qc.n0;
import qc.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzclr implements zzclb {
    private final Context zza;
    private final n0 zzb = n.D.f11582h.zzi();

    public zzclr(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zza(Map map) throws IOException {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        n0 n0Var = this.zzb;
        boolean z2 = Boolean.parseBoolean(str);
        ((o0) n0Var).c(z2);
        if (z2) {
            cg.b.Z(this.zza);
        }
    }
}
