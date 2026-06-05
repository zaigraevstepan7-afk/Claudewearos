package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Map;
import qc.n0;
import qc.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzclf implements zzclb {
    private final n0 zza;

    public zzclf(n0 n0Var) {
        this.zza = n0Var;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zza(Map map) {
        boolean z2 = Boolean.parseBoolean((String) map.get("content_vertical_opted_out"));
        o0 o0Var = (o0) this.zza;
        o0Var.l();
        synchronized (o0Var.f13414a) {
            try {
                if (o0Var.f13434v == z2) {
                    return;
                }
                o0Var.f13434v = z2;
                SharedPreferences.Editor editor = o0Var.f13420g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z2);
                    o0Var.f13420g.apply();
                }
                o0Var.m();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
