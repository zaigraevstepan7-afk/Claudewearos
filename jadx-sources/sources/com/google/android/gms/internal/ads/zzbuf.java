package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import nc.p;
import nc.q2;
import nc.q3;
import nc.r3;
import nc.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbuf {
    private static zzbyy zza;
    private final Context zzb;
    private final fc.b zzc;
    private final q2 zzd;
    private final String zze;

    public zzbuf(Context context, fc.b bVar, q2 q2Var, String str) {
        this.zzb = context;
        this.zzc = bVar;
        this.zzd = q2Var;
        this.zze = str;
    }

    public static zzbyy zza(Context context) {
        zzbyy zzbyyVar;
        synchronized (zzbuf.class) {
            try {
                if (zza == null) {
                    p pVar = s.f12202f.f12204b;
                    zzbpk zzbpkVar = new zzbpk();
                    pVar.getClass();
                    zza = (zzbyy) new nc.e(context, zzbpkVar).d(context, false);
                }
                zzbyyVar = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbyyVar;
    }

    public final void zzb(zc.b bVar) {
        zzbyy zzbyyVar;
        xd.b bVar2;
        q3 q3VarA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = this.zzb;
        zzbyy zzbyyVarZza = zza(context);
        if (zzbyyVarZza == null) {
            bVar.onFailure("Internal Error, query info generator is null.");
            return;
        }
        xd.b bVar3 = new xd.b(context);
        q2 q2Var = this.zzd;
        if (q2Var == null) {
            zzbyyVar = zzbyyVarZza;
            bVar2 = bVar3;
            q3VarA = new q3(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, jCurrentTimeMillis);
        } else {
            zzbyyVar = zzbyyVarZza;
            bVar2 = bVar3;
            q2Var.j = jCurrentTimeMillis;
            q3VarA = r3.a(context, q2Var);
        }
        try {
            zzbyyVar.zzf(bVar2, new zzbzc(this.zze, this.zzc.name(), null, q3VarA, 0, null), new zzbue(this, bVar));
        } catch (RemoteException unused) {
            bVar.onFailure("Internal Error.");
        }
    }
}
