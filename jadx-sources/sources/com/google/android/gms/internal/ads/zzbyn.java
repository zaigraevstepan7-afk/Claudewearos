package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import mc.n;
import nc.t;
import qc.o0;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbyn {
    static zzbyn zzi;

    public static synchronized zzbyn zzb(Context context) {
        try {
            zzbyn zzbynVar = zzi;
            if (zzbynVar != null) {
                return zzbynVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbdc.zza(applicationContext);
            n nVar = n.D;
            o0 o0Var = (o0) nVar.f11582h.zzi();
            o0Var.p(applicationContext);
            zzbyf zzbyfVar = new zzbyf(null);
            zzbyfVar.zzb(applicationContext);
            zzbyfVar.zzc(nVar.f11584k);
            zzbyfVar.zza(o0Var);
            zzbyfVar.zzd(nVar.f11599z);
            zzbyn zzbynVarZze = zzbyfVar.zze();
            zzi = zzbynVarZze;
            ((zzbxz) ((zzbyg) zzbynVarZze).zzc.zzb()).zza();
            zzbyr zzbyrVar = (zzbyr) ((zzbyg) zzi).zzh.zzb();
            zzbct zzbctVar = zzbdc.zzaH;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                HashMap mapJ = r0.J((String) tVar.f12230c.zzb(zzbdc.zzaI));
                Iterator it = mapJ.keySet().iterator();
                while (it.hasNext()) {
                    zzbyrVar.zzc((String) it.next());
                }
                zzbyrVar.zzd(new zzbyp(zzbyrVar, mapJ));
            }
            return zzi;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract zzbyd zza();
}
