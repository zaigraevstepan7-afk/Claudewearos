package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import ef.f;
import fc.l;
import fc.q;
import fc.r;
import fc.t;
import java.util.concurrent.atomic.AtomicReference;
import nc.h3;
import nc.i2;
import nc.i3;
import nc.p;
import nc.q2;
import nc.r3;
import nc.s;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbxc extends ad.c {
    private final AtomicReference zza;
    private final zzbwt zzb;
    private final Context zzc;
    private final zzbxl zzd;
    private ad.a zze;
    private q zzf;
    private l zzg;
    private final long zzh;

    public zzbxc(Context context, zzbwt zzbwtVar) {
        this.zzh = System.currentTimeMillis();
        this.zzc = context.getApplicationContext();
        this.zza = new AtomicReference();
        this.zzb = zzbwtVar;
        this.zzd = new zzbxl();
    }

    public final Bundle getAdMetadata() {
        try {
            zzbwt zzbwtVar = this.zzb;
            if (zzbwtVar != null) {
                return zzbwtVar.zzb();
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
        return new Bundle();
    }

    public final String getAdUnitId() {
        String strZze;
        String str;
        AtomicReference atomicReference = this.zza;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZze = this.zzb.zze();
            } catch (RemoteException e10) {
                k.i("#007 Could not call remote method.", e10);
                strZze = null;
            }
            if (strZze == null) {
                this.zza.set("");
            } else {
                this.zza.set(strZze);
            }
            str = (String) this.zza.get();
        }
        return str;
    }

    public final l getFullScreenContentCallback() {
        return this.zzg;
    }

    public final ad.a getOnAdMetadataChangedListener() {
        return this.zze;
    }

    public final q getOnPaidEventListener() {
        return null;
    }

    @Override // ad.c
    public final t getResponseInfo() {
        i2 i2VarZzc = null;
        try {
            zzbwt zzbwtVar = this.zzb;
            if (zzbwtVar != null) {
                i2VarZzc = zzbwtVar.zzc();
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
        return new t(i2VarZzc);
    }

    public final ad.b getRewardItem() {
        f fVar = ad.b.f417g;
        try {
            zzbwt zzbwtVar = this.zzb;
            zzbwq zzbwqVarZzd = zzbwtVar != null ? zzbwtVar.zzd() : null;
            return zzbwqVarZzd == null ? fVar : new zzbxd(zzbwqVarZzd);
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            return fVar;
        }
    }

    @Override // ad.c
    public final void setFullScreenContentCallback(l lVar) {
        this.zzg = lVar;
        this.zzd.zzb(lVar);
    }

    public final void setImmersiveMode(boolean z2) {
        try {
            zzbwt zzbwtVar = this.zzb;
            if (zzbwtVar != null) {
                zzbwtVar.zzi(z2);
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void setOnAdMetadataChangedListener(ad.a aVar) {
        try {
            this.zze = aVar;
            zzbwt zzbwtVar = this.zzb;
            if (zzbwtVar != null) {
                zzbwtVar.zzj(new h3(aVar));
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void setOnPaidEventListener(q qVar) {
        try {
            zzbwt zzbwtVar = this.zzb;
            if (zzbwtVar != null) {
                zzbwtVar.zzk(new i3());
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ad.c
    public final void show(Activity activity, r rVar) {
        zzbxl zzbxlVar = this.zzd;
        zzbxlVar.zzc(rVar);
        if (activity == null) {
            k.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbwt zzbwtVar = this.zzb;
            if (zzbwtVar != null) {
                zzbwtVar.zzl(zzbxlVar);
                zzbwtVar.zzn(new xd.b(activity));
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void zza(q2 q2Var, ad.d dVar) {
        try {
            zzbwt zzbwtVar = this.zzb;
            if (zzbwtVar != null) {
                q2Var.j = this.zzh;
                zzbwtVar.zzg(r3.a(this.zzc, q2Var), new zzbxg(dVar, this));
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public zzbxc(Context context, String str, zzbwt zzbwtVar) {
        this.zzh = System.currentTimeMillis();
        this.zzc = context.getApplicationContext();
        this.zza = new AtomicReference(str);
        this.zzb = zzbwtVar;
        this.zzd = new zzbxl();
    }

    public zzbxc(Context context, String str) {
        p pVar = s.f12202f.f12204b;
        zzbpk zzbpkVar = new zzbpk();
        pVar.getClass();
        this(context, str, (zzbwt) new nc.b(context, str, zzbpkVar).d(context, false));
    }

    public final void setServerSideVerificationOptions(ad.e eVar) {
    }
}
