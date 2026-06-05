package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import nc.k2;
import nc.l2;
import nc.n2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdil extends k2 {
    private final Object zza = new Object();
    private final l2 zzb;
    private final zzbqd zzc;

    public zzdil(l2 l2Var, zzbqd zzbqdVar) {
        this.zzb = l2Var;
        this.zzc = zzbqdVar;
    }

    @Override // nc.l2
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // nc.l2
    public final float zzf() {
        zzbqd zzbqdVar = this.zzc;
        if (zzbqdVar != null) {
            return zzbqdVar.zzg();
        }
        return 0.0f;
    }

    @Override // nc.l2
    public final float zzg() {
        zzbqd zzbqdVar = this.zzc;
        if (zzbqdVar != null) {
            return zzbqdVar.zzh();
        }
        return 0.0f;
    }

    @Override // nc.l2
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // nc.l2
    public final n2 zzi() {
        synchronized (this.zza) {
            try {
                l2 l2Var = this.zzb;
                if (l2Var == null) {
                    return null;
                }
                return l2Var.zzi();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nc.l2
    public final void zzj(boolean z2) throws RemoteException {
        throw new RemoteException();
    }

    @Override // nc.l2
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // nc.l2
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // nc.l2
    public final void zzm(n2 n2Var) {
        synchronized (this.zza) {
            try {
                l2 l2Var = this.zzb;
                if (l2Var != null) {
                    l2Var.zzm(n2Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nc.l2
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // nc.l2
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // nc.l2
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // nc.l2
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
