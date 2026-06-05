package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import mc.n;
import nc.h2;
import nc.t;
import qc.l0;
import qc.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdzp implements zzgcx {
    final /* synthetic */ zzbvo zza;
    final /* synthetic */ zzbvg zzb;

    public zzdzp(zzdzt zzdztVar, zzbvo zzbvoVar, zzbvg zzbvgVar) {
        this.zza = zzbvoVar;
        this.zzb = zzbvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        try {
            zzbvg zzbvgVar = this.zzb;
            h2 h2VarZza = zzfdp.zza(th2);
            zzbvgVar.zze(new r(zzfvv.zzd(th2.getMessage()) ? h2VarZza.f12115b : th2.getMessage(), h2VarZza.f12114a));
        } catch (RemoteException e10) {
            l0.l("Service can't call client", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzb(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            zzbct zzbctVar = zzbdc.zzco;
            t tVar = t.f12227d;
            if (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                this.zzb.zzf(parcelFileDescriptor);
                return;
            }
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzcp)).booleanValue() && (bundle = this.zza.zzm) != null) {
                String strZza = zzdrk.BINDER_CALL_START.zza();
                n.D.f11584k.getClass();
                bundle.putLong(strZza, System.currentTimeMillis());
            }
            this.zzb.zzg(parcelFileDescriptor, this.zza);
        } catch (RemoteException e10) {
            l0.l("Service can't call client", e10);
        }
    }
}
