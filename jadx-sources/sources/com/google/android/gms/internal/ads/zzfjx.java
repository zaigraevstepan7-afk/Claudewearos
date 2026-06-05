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
public final class zzfjx extends zzfkv {
    public zzfjx(ClientApi clientApi, Context context, int i10, zzbpo zzbpoVar, j3 j3Var, s0 s0Var, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjyVar, ud.a aVar) {
        super(clientApi, context, i10, zzbpoVar, j3Var, s0Var, scheduledExecutorService, zzfjyVar, aVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final /* bridge */ /* synthetic */ i2 zza(Object obj) {
        try {
            return ((zzbau) obj).zzf();
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.c("Failed to get response info for the app open ad.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final mf.a zzb(Context context) {
        zzgdv zzgdvVarZze = zzgdv.zze();
        m0 m0VarG = this.zza.g(new xd.b(context), s3.b(), this.zze.f12129a, this.zzd, this.zzc);
        if (m0VarG == null) {
            zzgdvVarZze.zzd(new zzfjs(1, "Failed to create an app open ad manager."));
            return zzgdvVarZze;
        }
        try {
            m0VarG.zzH(new zzfjw(this, zzgdvVarZze, this.zze));
            m0VarG.zzab(this.zze.f12131c);
            return zzgdvVarZze;
        } catch (RemoteException e10) {
            k.h("Failed to load app open ad.", e10);
            zzgdvVarZze.zzd(new zzfjs(1, "remote exception"));
            return zzgdvVarZze;
        }
    }

    public zzfjx(String str, ClientApi clientApi, Context context, int i10, zzbpo zzbpoVar, j3 j3Var, u0 u0Var, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjyVar, ud.a aVar) {
        super(str, clientApi, context, i10, zzbpoVar, j3Var, u0Var, scheduledExecutorService, zzfjyVar, aVar);
    }
}
