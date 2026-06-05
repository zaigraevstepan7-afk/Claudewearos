package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import rc.o;
import rc.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfjq {
    private final Context zza;
    private final Executor zzb;
    private final zzgdn zzc;
    private final o zzd;
    private final zzfji zze;
    private final zzfhp zzf;

    public zzfjq(Context context, Executor executor, zzgdn zzgdnVar, o oVar, zzfji zzfjiVar, zzfhp zzfhpVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgdnVar;
        this.zzd = oVar;
        this.zze = zzfjiVar;
        this.zzf = zzfhpVar;
    }

    public final void zzd(final String str, p pVar, zzfhm zzfhmVar, zzcyb zzcybVar) {
        mf.a aVarZzb;
        zzfhb zzfhbVarZza = null;
        if (zzfhp.zza() && ((Boolean) zzbev.zzd.zze()).booleanValue()) {
            zzfhbVarZza = zzfha.zza(this.zza, 14);
            zzfhbVarZza.zzi();
        }
        if (pVar != null) {
            aVarZzb = new zzfjh(pVar.f14360a, this.zzd, this.zzc, this.zze).zzd(str);
        } else {
            aVarZzb = this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzd.zza(str);
                }
            });
        }
        zzgdb.zzr(aVarZzb, new zzfjp(this, zzfhbVarZza, zzfhmVar, zzcybVar), this.zzb);
    }

    public final void zze(List list, p pVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzd((String) it.next(), pVar, null, null);
        }
    }
}
