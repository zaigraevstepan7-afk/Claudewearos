package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import mc.n;
import nc.t;
import qc.n0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeuo implements zzetu {
    private final n0 zza;
    private final Context zzb;
    private final zzgdm zzc;
    private final ScheduledExecutorService zzd;
    private final zzedc zze;
    private final zzfco zzf;
    private final rc.a zzg;

    public zzeuo(n0 n0Var, Context context, zzgdm zzgdmVar, ScheduledExecutorService scheduledExecutorService, zzedc zzedcVar, zzfco zzfcoVar, rc.a aVar) {
        this.zza = n0Var;
        this.zzb = context;
        this.zzc = zzgdmVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzedcVar;
        this.zzf = zzfcoVar;
        this.zzg = aVar;
    }

    public static /* synthetic */ mf.a zzc(zzeuo zzeuoVar, final Throwable th2) {
        zzeuoVar.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeul
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkH)).booleanValue();
                Throwable th3 = th2;
                if (zBooleanValue) {
                    n.D.f11582h.zzx(th3, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    n.D.f11582h.zzv(th3, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return zzgdb.zzh(th2 instanceof SecurityException ? new zzeuq("", 2, null) : th2 instanceof IllegalStateException ? new zzeuq("", 3, null) : th2 instanceof IllegalArgumentException ? new zzeuq("", 4, null) : th2 instanceof TimeoutException ? new zzeuq("", 5, null) : new zzeuq("", 0, null));
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r9.zzb.getPackageName()) == false) goto L48;
     */
    @Override // com.google.android.gms.internal.ads.zzetu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final mf.a zzb() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuo.zzb():mf.a");
    }
}
