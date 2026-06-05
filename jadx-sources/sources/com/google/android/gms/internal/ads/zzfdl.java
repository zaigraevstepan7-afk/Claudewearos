package com.google.android.gms.internal.ads;

import android.content.Context;
import mc.n;
import nc.s;
import qc.l0;
import rc.k;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfdl {
    public static void zza(Context context, boolean z2) {
        if (z2) {
            int i10 = l0.f13401b;
            k.f("This request is sent from a test device.");
        } else {
            rc.e eVar = s.f12202f.f12203a;
            String strJ = m1.j("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", rc.e.c(context), "\")) to get test ads on this device.");
            int i11 = l0.f13401b;
            k.f(strJ);
        }
    }

    public static void zzb(int i10, Throwable th2, String str) {
        String strD = m6.a.d(i10, "Ad failed to load : ");
        int i11 = l0.f13401b;
        k.f(strD);
        l0.l(str, th2);
        if (i10 == 3) {
            return;
        }
        n.D.f11582h.zzv(th2, str);
    }
}
