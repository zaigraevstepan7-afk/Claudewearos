package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;
import nc.i2;
import nc.j3;
import nc.s0;
import nc.u0;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfkz extends zzfkv {
    public zzfkz(ClientApi clientApi, Context context, int i10, zzbpo zzbpoVar, j3 j3Var, s0 s0Var, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjyVar, ud.a aVar) {
        super(clientApi, context, i10, zzbpoVar, j3Var, s0Var, scheduledExecutorService, zzfjyVar, aVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final /* bridge */ /* synthetic */ i2 zza(Object obj) {
        try {
            return ((zzbwt) obj).zzc();
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.c("Failed to get response info for the rewarded ad.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final mf.a zzb(Context context) {
        zzgdv zzgdvVarZze = zzgdv.zze();
        zzbwt zzbwtVarS = this.zza.s(new xd.b(context), this.zze.f12129a, this.zzd, this.zzc);
        zzfky zzfkyVar = new zzfky(this, zzgdvVarZze, zzbwtVarS);
        if (zzbwtVarS == null) {
            zzgdvVarZze.zzd(new zzfjs(1, "Failed to create a rewarded ad."));
            return zzgdvVarZze;
        }
        try {
            zzbwtVarS.zzg(this.zze.f12131c, zzfkyVar);
            return zzgdvVarZze;
        } catch (RemoteException unused) {
            k.g("Failed to load rewarded ad.");
            zzgdvVarZze.zzd(new zzfjs(1, "remote exception"));
            return zzgdvVarZze;
        }
    }

    public zzfkz(String str, ClientApi clientApi, Context context, int i10, zzbpo zzbpoVar, j3 j3Var, u0 u0Var, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjyVar, ud.a aVar) {
        super(str, clientApi, context, i10, zzbpoVar, j3Var, u0Var, scheduledExecutorService, zzfjyVar, aVar);
    }
}
