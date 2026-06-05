package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import nc.i2;
import nc.q3;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzelb {
    private final zzelg zza;
    private final String zzb;
    private i2 zzc;

    public zzelb(zzelg zzelgVar, String str) {
        this.zza = zzelgVar;
        this.zzb = str;
    }

    public final synchronized String zza() {
        i2 i2Var;
        try {
            i2Var = this.zzc;
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.i("#007 Could not call remote method.", e10);
            return null;
        }
        return i2Var != null ? i2Var.zzg() : null;
    }

    public final synchronized String zzb() {
        i2 i2Var;
        try {
            i2Var = this.zzc;
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.i("#007 Could not call remote method.", e10);
            return null;
        }
        return i2Var != null ? i2Var.zzg() : null;
    }

    public final synchronized void zzd(q3 q3Var, int i10) {
        this.zzc = null;
        zzelh zzelhVar = new zzelh(i10);
        zzela zzelaVar = new zzela(this);
        this.zza.zzb(q3Var, this.zzb, zzelhVar, zzelaVar);
    }

    public final synchronized boolean zze() {
        return this.zza.zza();
    }
}
