package com.google.android.gms.internal.ads;

import nc.t;
import qc.l0;
import qc.n0;
import qc.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbyb {
    private final n0 zza;

    public zzbyb(ud.a aVar, n0 n0Var, zzbym zzbymVar) {
        this.zza = n0Var;
    }

    public final void zza(int i10, long j) {
        long j4;
        zzbct zzbctVar = zzbdc.zzaG;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            return;
        }
        n0 n0Var = this.zza;
        o0 o0Var = (o0) n0Var;
        o0Var.l();
        synchronized (o0Var.f13414a) {
            j4 = o0Var.D;
        }
        if (j - j4 < 0) {
            l0.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzaH)).booleanValue()) {
            o0 o0Var2 = (o0) n0Var;
            o0Var2.f(i10);
            o0Var2.g(j);
        } else {
            o0 o0Var3 = (o0) n0Var;
            o0Var3.f(-1);
            o0Var3.g(j);
        }
    }
}
