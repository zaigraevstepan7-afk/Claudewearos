package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import fc.l;
import fc.q;
import fc.t;
import java.util.concurrent.atomic.AtomicReference;
import nc.i2;
import nc.i3;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbaq extends hc.b {
    l zza;
    private final zzbau zzb;
    private final AtomicReference zzc;
    private final zzbar zzd;
    private q zze;

    public zzbaq(zzbau zzbauVar) {
        this.zzd = new zzbar();
        this.zzb = zzbauVar;
        this.zzc = new AtomicReference();
    }

    public final String getAdUnitId() {
        String strZzg;
        String str;
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzg = this.zzb.zzg();
            } catch (RemoteException e10) {
                k.i("#007 Could not call remote method.", e10);
                strZzg = null;
            }
            if (strZzg == null) {
                this.zzc.set("");
            } else {
                this.zzc.set(strZzg);
            }
            str = (String) this.zzc.get();
        }
        return str;
    }

    public final l getFullScreenContentCallback() {
        return this.zza;
    }

    public final q getOnPaidEventListener() {
        return null;
    }

    @Override // hc.b
    public final t getResponseInfo() {
        i2 i2VarZzf;
        try {
            i2VarZzf = this.zzb.zzf();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            i2VarZzf = null;
        }
        return new t(i2VarZzf);
    }

    public final void setFullScreenContentCallback(l lVar) {
        this.zza = lVar;
        this.zzd.zzg(lVar);
    }

    public final void setImmersiveMode(boolean z2) {
        try {
            this.zzb.zzh(z2);
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void setOnPaidEventListener(q qVar) {
        try {
            this.zzb.zzi(new i3());
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // hc.b
    public final void show(Activity activity) {
        try {
            this.zzb.zzj(new xd.b(activity), this.zzd);
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public zzbaq(zzbau zzbauVar, String str) {
        this.zzd = new zzbar();
        this.zzb = zzbauVar;
        this.zzc = new AtomicReference(str);
    }
}
