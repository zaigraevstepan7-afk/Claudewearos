package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbvt implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvv zzb;

    public zzbvt(zzbvv zzbvvVar, Context context) {
        this.zza = context;
        this.zzb = zzbvvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbvv r0 = r7.zzb
            java.util.WeakHashMap r1 = com.google.android.gms.internal.ads.zzbvv.zza(r0)
            android.content.Context r2 = r7.zza
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.ads.zzbvu r1 = (com.google.android.gms.internal.ads.zzbvu) r1
            if (r1 == 0) goto L3b
            com.google.android.gms.internal.ads.zzbem r3 = com.google.android.gms.internal.ads.zzber.zzd
            java.lang.Object r3 = r3.zze()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r5 = r1.zza
            long r5 = r5 + r3
            mc.n r3 = mc.n.D
            ud.b r3 = r3.f11584k
            r3.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L3b
        L2f:
            com.google.android.gms.internal.ads.zzbvs r1 = r1.zzb
            com.google.android.gms.internal.ads.zzbvr r3 = new com.google.android.gms.internal.ads.zzbvr
            r3.<init>(r2, r1)
            com.google.android.gms.internal.ads.zzbvs r1 = r3.zza()
            goto L44
        L3b:
            com.google.android.gms.internal.ads.zzbvr r1 = new com.google.android.gms.internal.ads.zzbvr
            r1.<init>(r2)
            com.google.android.gms.internal.ads.zzbvs r1 = r1.zza()
        L44:
            java.util.WeakHashMap r3 = com.google.android.gms.internal.ads.zzbvv.zza(r0)
            com.google.android.gms.internal.ads.zzbvu r4 = new com.google.android.gms.internal.ads.zzbvu
            r4.<init>(r0, r1)
            r3.put(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvt.call():java.lang.Object");
    }
}
