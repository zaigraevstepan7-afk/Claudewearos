package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaay {
    private final Context zza;
    private boolean zzb;
    private zztr zzc = zztr.zza;
    private final zztd zzd;
    private Handler zze;
    private zzaci zzf;

    public zzaay(Context context) {
        this.zza = context;
        this.zzd = new zzsx(context, null, null);
    }

    public final zzaay zze(Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzaay zzf(zzaci zzaciVar) {
        this.zzf = zzaciVar;
        return this;
    }

    public final zzaay zzg(zztr zztrVar) {
        this.zzc = zztrVar;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzaba zzh() {
        /*
            r3 = this;
            boolean r0 = r3.zzb
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdd.zzf(r0)
            android.os.Handler r0 = r3.zze
            if (r0 != 0) goto L12
            com.google.android.gms.internal.ads.zzaci r2 = r3.zzf
            if (r2 == 0) goto L10
            goto L12
        L10:
            r2 = r1
            goto L1a
        L12:
            r2 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzaci r0 = r3.zzf
            if (r0 == 0) goto L1a
            goto L10
        L1a:
            com.google.android.gms.internal.ads.zzdd.zzf(r2)
            r3.zzb = r1
            com.google.android.gms.internal.ads.zzaba r0 = new com.google.android.gms.internal.ads.zzaba
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaay.zzh():com.google.android.gms.internal.ads.zzaba");
    }
}
