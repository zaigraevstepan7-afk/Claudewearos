package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import nc.m0;
import nc.s2;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbip implements Runnable {
    final /* synthetic */ gc.b zza;
    final /* synthetic */ m0 zzb;
    final /* synthetic */ zzbiq zzc;

    public zzbip(zzbiq zzbiqVar, gc.b bVar, m0 m0Var) {
        this.zza = bVar;
        this.zzb = m0Var;
        this.zzc = zzbiqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gc.b bVar = this.zza;
        m0 m0Var = this.zzb;
        s2 s2Var = bVar.f6708a;
        s2Var.getClass();
        try {
            xd.a aVarZzn = m0Var.zzn();
            if (aVarZzn != null && ((View) xd.b.u(aVarZzn)).getParent() == null) {
                s2Var.f12218l.addView((View) xd.b.u(aVarZzn));
                s2Var.f12216i = m0Var;
                zzbiq.zzc(this.zzc);
                throw null;
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
        k.g("Could not bind.");
    }
}
