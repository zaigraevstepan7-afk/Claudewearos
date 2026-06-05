package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import fc.l;
import fc.q;
import fc.r;
import fc.t;
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
public final class zzbxn extends bd.a {
    private final String zza;
    private final zzbwt zzb;
    private final Context zzc;
    private final zzbxl zzd;
    private l zze;
    private ad.a zzf;
    private q zzg;
    private final long zzh = System.currentTimeMillis();

    public zzbxn(Context context, String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        p pVar = s.f12202f.f12204b;
        zzbpk zzbpkVar = new zzbpk();
        pVar.getClass();
        this.zzb = (zzbwt) new nc.b(context, str, zzbpkVar).d(context, false);
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
        return this.zza;
    }

    public final l getFullScreenContentCallback() {
        return this.zze;
    }

    public final ad.a getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    public final q getOnPaidEventListener() {
        return null;
    }

    @Override // bd.a
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
        try {
            zzbwt zzbwtVar = this.zzb;
            zzbwq zzbwqVarZzd = zzbwtVar != null ? zzbwtVar.zzd() : null;
            if (zzbwqVarZzd != null) {
                return new zzbxd(zzbwqVarZzd);
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
        return ad.b.f417g;
    }

    public final void setFullScreenContentCallback(l lVar) {
        this.zze = lVar;
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
        this.zzf = aVar;
        try {
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

    public final void setServerSideVerificationOptions(ad.e eVar) {
        try {
            zzbwt zzbwtVar = this.zzb;
            if (zzbwtVar != null) {
                zzbwtVar.zzm(new zzbxh(eVar));
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // bd.a
    public final void show(Activity activity, r rVar) {
        zzbxl zzbxlVar = this.zzd;
        zzbxlVar.zzc(rVar);
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

    public final void zza(q2 q2Var, bd.b bVar) {
        try {
            zzbwt zzbwtVar = this.zzb;
            if (zzbwtVar != null) {
                q2Var.j = this.zzh;
                zzbwtVar.zzh(r3.a(this.zzc, q2Var), new zzbxm(bVar, this));
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }
}
