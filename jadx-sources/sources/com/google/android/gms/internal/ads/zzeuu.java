package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import nc.s;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeuu implements zzetu {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbzh zzg;

    public zzeuu(zzbzh zzbzhVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z2, boolean z10) {
        this.zzg = zzbzhVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i10;
        this.zze = z2;
        this.zzf = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzeuv zzc(com.google.android.gms.internal.ads.zzeuu r7, kc.a r8) {
        /*
            com.google.android.gms.internal.ads.zzfrr r0 = new com.google.android.gms.internal.ads.zzfrr
            r0.<init>()
            boolean r1 = r7.zze
            if (r1 != 0) goto L1c
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.internal.ads.zzbdc.zzdr
            nc.t r2 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r2 = r2.f12230c
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2f
            goto L6b
        L1c:
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.internal.ads.zzbdc.zzds
            nc.t r2 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r2 = r2.f12230c
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2f
            goto L6b
        L2f:
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L58 java.io.IOException -> L5b
            com.google.android.gms.internal.ads.zzfrv r1 = com.google.android.gms.internal.ads.zzfrv.zzj(r0)     // Catch: java.lang.IllegalArgumentException -> L58 java.io.IOException -> L5b
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L58 java.io.IOException -> L5b
            java.lang.String r2 = r8.f9508a     // Catch: java.lang.IllegalArgumentException -> L58 java.io.IOException -> L5b
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalArgumentException -> L58 java.io.IOException -> L5b
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L58 java.io.IOException -> L5b
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.internal.ads.zzbdc.zzdx     // Catch: java.lang.IllegalArgumentException -> L58 java.io.IOException -> L5b
            nc.t r4 = nc.t.f12227d     // Catch: java.lang.IllegalArgumentException -> L58 java.io.IOException -> L5b
            com.google.android.gms.internal.ads.zzbda r4 = r4.f12230c     // Catch: java.lang.IllegalArgumentException -> L58 java.io.IOException -> L5b
            java.lang.Object r0 = r4.zzb(r0)     // Catch: java.lang.IllegalArgumentException -> L58 java.io.IOException -> L5b
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L58 java.io.IOException -> L5b
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L58 java.io.IOException -> L5b
            boolean r6 = r7.zzf     // Catch: java.lang.IllegalArgumentException -> L58 java.io.IOException -> L5b
            com.google.android.gms.internal.ads.zzfrr r0 = r1.zzi(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L58 java.io.IOException -> L5b
            goto L6b
        L58:
            r0 = move-exception
        L59:
            r7 = r0
            goto L5d
        L5b:
            r0 = move-exception
            goto L59
        L5d:
            mc.n r0 = mc.n.D
            com.google.android.gms.internal.ads.zzbzq r0 = r0.f11582h
            java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
            r0.zzw(r7, r1)
            com.google.android.gms.internal.ads.zzfrr r0 = new com.google.android.gms.internal.ads.zzfrr
            r0.<init>()
        L6b:
            com.google.android.gms.internal.ads.zzeuv r7 = new com.google.android.gms.internal.ads.zzeuv
            r1 = 0
            r7.<init>(r8, r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuu.zzc(com.google.android.gms.internal.ads.zzeuu, kc.a):com.google.android.gms.internal.ads.zzeuv");
    }

    public static zzeuv zzd(zzeuu zzeuuVar, Throwable th2) {
        rc.e eVar = s.f12202f.f12203a;
        ContentResolver contentResolver = zzeuuVar.zza.getContentResolver();
        return new zzeuv(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfrr());
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        zzgcs zzgcsVarZzw = zzgcs.zzw(this.zzg.zza(this.zza, this.zzd));
        zzfut zzfutVar = new zzfut() { // from class: com.google.android.gms.internal.ads.zzeus
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return zzeuu.zzc(this.zza, (kc.a) obj);
            }
        };
        Executor executor = this.zzc;
        return (zzgcs) zzgdb.zze((zzgcs) zzgdb.zzo((zzgcs) zzgdb.zzm(zzgcsVarZzw, zzfutVar, executor), ((Long) t.f12227d.f12230c.zzb(zzbdc.zzbg)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfut() { // from class: com.google.android.gms.internal.ads.zzeut
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return zzeuu.zzd(this.zza, (Throwable) obj);
            }
        }, executor);
    }
}
