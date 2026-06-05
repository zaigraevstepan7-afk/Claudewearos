package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;
import nc.i2;
import nc.j3;
import nc.m0;
import nc.s0;
import nc.s3;
import nc.u0;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfka extends zzfkv {
    public zzfka(ClientApi clientApi, Context context, int i10, zzbpo zzbpoVar, j3 j3Var, s0 s0Var, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjyVar, ud.a aVar) {
        super(clientApi, context, i10, zzbpoVar, j3Var, s0Var, scheduledExecutorService, zzfjyVar, aVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final /* bridge */ /* synthetic */ i2 zza(Object obj) {
        try {
            return ((m0) obj).zzk();
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.c("Failed to get response info for  the interstitial ad.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final mf.a zzb(Context context) {
        zzgdv zzgdvVarZze = zzgdv.zze();
        m0 m0VarL = this.zza.l(new xd.b(context), new s3(), this.zze.f12129a, this.zzd, this.zzc);
        if (m0VarL == null) {
            zzgdvVarZze.zzd(new zzfjs(1, "Failed to create an interstitial ad manager."));
            return zzgdvVarZze;
        }
        try {
            m0VarL.zzy(this.zze.f12131c, new zzfjz(this, zzgdvVarZze, m0VarL));
            return zzgdvVarZze;
        } catch (RemoteException e10) {
            k.h("Failed to load interstitial ad.", e10);
            zzgdvVarZze.zzd(new zzfjs(1, "remote exception"));
            return zzgdvVarZze;
        }
    }

    public zzfka(String str, ClientApi clientApi, Context context, int i10, zzbpo zzbpoVar, j3 j3Var, u0 u0Var, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjyVar, ud.a aVar) {
        super(str, clientApi, context, i10, zzbpoVar, j3Var, u0Var, scheduledExecutorService, zzfjyVar, aVar);
    }
}
