package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import fc.l;
import fc.m;
import fc.q;
import fc.t;
import java.util.concurrent.atomic.AtomicReference;
import nc.i2;
import nc.i3;
import nc.k;
import nc.m0;
import nc.o3;
import nc.p;
import nc.q2;
import nc.r3;
import nc.s;
import nc.s3;
import nc.u;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbmx extends gc.c {
    private final Context zza;
    private final r3 zzb;
    private final m0 zzc;
    private final AtomicReference zzd;
    private final zzbpk zze;
    private final long zzf;
    private gc.e zzg;
    private l zzh;
    private q zzi;

    public zzbmx(Context context, String str) {
        zzbpk zzbpkVar = new zzbpk();
        this.zze = zzbpkVar;
        this.zzf = System.currentTimeMillis();
        this.zza = context;
        this.zzd = new AtomicReference(str);
        this.zzb = r3.f12201a;
        p pVar = s.f12202f.f12204b;
        s3 s3Var = new s3();
        pVar.getClass();
        this.zzc = (m0) new k(pVar, context, s3Var, str, zzbpkVar).d(context, false);
    }

    public final String getAdUnitId() {
        String strZzr;
        String str;
        AtomicReference atomicReference = this.zzd;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzr = this.zzc.zzr();
            } catch (RemoteException e10) {
                rc.k.i("#007 Could not call remote method.", e10);
                strZzr = null;
            }
            if (strZzr == null) {
                this.zzd.set("");
            } else {
                this.zzd.set(strZzr);
            }
            str = (String) this.zzd.get();
        }
        return str;
    }

    public final gc.e getAppEventListener() {
        return this.zzg;
    }

    public final l getFullScreenContentCallback() {
        return this.zzh;
    }

    public final q getOnPaidEventListener() {
        return null;
    }

    @Override // sc.a
    public final t getResponseInfo() {
        i2 i2VarZzk = null;
        try {
            m0 m0Var = this.zzc;
            if (m0Var != null) {
                i2VarZzk = m0Var.zzk();
            }
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
        }
        return new t(i2VarZzk);
    }

    public final void setAppEventListener(gc.e eVar) {
        try {
            this.zzg = eVar;
            m0 m0Var = this.zzc;
            if (m0Var != null) {
                m0Var.zzG(eVar != null ? new zzazp(eVar) : null);
            }
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // sc.a
    public final void setFullScreenContentCallback(l lVar) {
        try {
            this.zzh = lVar;
            m0 m0Var = this.zzc;
            if (m0Var != null) {
                m0Var.zzJ(new u(lVar));
            }
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // sc.a
    public final void setImmersiveMode(boolean z2) {
        try {
            m0 m0Var = this.zzc;
            if (m0Var != null) {
                m0Var.zzL(z2);
            }
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void setOnPaidEventListener(q qVar) {
        try {
            m0 m0Var = this.zzc;
            if (m0Var != null) {
                m0Var.zzP(new i3());
            }
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // sc.a
    public final void show(Activity activity) {
        if (activity == null) {
            rc.k.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            m0 m0Var = this.zzc;
            if (m0Var != null) {
                m0Var.zzW(new xd.b(activity));
            }
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void zza(q2 q2Var, fc.d dVar) {
        try {
            m0 m0Var = this.zzc;
            if (m0Var != null) {
                q2Var.j = this.zzf;
                r3 r3Var = this.zzb;
                Context context = this.zza;
                r3Var.getClass();
                m0Var.zzy(r3.a(context, q2Var), new o3(dVar, this));
            }
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
            dVar.onAdFailedToLoad(new m(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }

    public zzbmx(Context context, String str, m0 m0Var) {
        this.zze = new zzbpk();
        this.zzf = System.currentTimeMillis();
        this.zza = context;
        this.zzd = new AtomicReference(str);
        this.zzb = r3.f12201a;
        this.zzc = m0Var;
    }

    public zzbmx(Context context, m0 m0Var) {
        this.zze = new zzbpk();
        this.zzf = System.currentTimeMillis();
        this.zza = context;
        this.zzd = new AtomicReference();
        this.zzb = r3.f12201a;
        this.zzc = m0Var;
    }
}
