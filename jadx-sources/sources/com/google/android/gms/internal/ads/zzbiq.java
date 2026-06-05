package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.e0;
import ic.f;
import nc.m0;
import nc.m3;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbiq extends zzbhx {
    private final f zza;

    public zzbiq(f fVar) {
    }

    public static /* bridge */ /* synthetic */ f zzc(zzbiq zzbiqVar) {
        zzbiqVar.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final void zze(m0 m0Var, xd.a aVar) {
        if (m0Var == null || aVar == null) {
            return;
        }
        Context context = (Context) xd.b.u(aVar);
        gc.b bVar = new gc.b(context);
        e0.j(context, "Context cannot be null");
        try {
            if (m0Var.zzi() instanceof m3) {
                m3 m3Var = (m3) m0Var.zzi();
                bVar.setAdListener(m3Var != null ? m3Var.f12148a : null);
            }
        } catch (RemoteException e10) {
            k.e("", e10);
        }
        try {
            if (m0Var.zzj() instanceof zzazp) {
                zzazp zzazpVar = (zzazp) m0Var.zzj();
                bVar.setAppEventListener(zzazpVar != null ? zzazpVar.zzb() : null);
            }
        } catch (RemoteException e11) {
            k.e("", e11);
        }
        rc.e.f14331b.post(new zzbip(this, bVar, m0Var));
    }
}
