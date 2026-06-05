package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import nc.i;
import nc.m0;
import nc.p;
import nc.q2;
import nc.r3;
import nc.s;
import nc.s3;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbbc {
    private m0 zza;
    private final Context zzb;
    private final String zzc;
    private final q2 zzd;
    private final hc.a zze;
    private final zzbpk zzf = new zzbpk();
    private final r3 zzg = r3.f12201a;

    public zzbbc(Context context, String str, q2 q2Var, hc.a aVar) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = q2Var;
        this.zze = aVar;
    }

    public final void zza() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            s3 s3VarB = s3.b();
            p pVar = s.f12202f.f12204b;
            Context context = this.zzb;
            String str = this.zzc;
            zzbpk zzbpkVar = this.zzf;
            pVar.getClass();
            m0 m0Var = (m0) new i(pVar, context, s3VarB, str, zzbpkVar).d(context, false);
            this.zza = m0Var;
            if (m0Var != null) {
                q2 q2Var = this.zzd;
                q2Var.j = jCurrentTimeMillis;
                m0Var.zzH(new zzbap(this.zze, str));
                m0 m0Var2 = this.zza;
                this.zzg.getClass();
                m0Var2.zzab(r3.a(context, q2Var));
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }
}
