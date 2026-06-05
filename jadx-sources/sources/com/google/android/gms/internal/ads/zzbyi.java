package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbyi implements zzazb {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzbyi(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final String zza() {
        return this.zzc;
    }

    public final void zzb(boolean z2) {
        n nVar = n.D;
        zzbym zzbymVar = nVar.f11599z;
        Context context = this.zza;
        if (zzbymVar.zzp(context)) {
            synchronized (this.zzb) {
                try {
                    if (this.zzd == z2) {
                        return;
                    }
                    this.zzd = z2;
                    String str = this.zzc;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.zzd) {
                        nVar.f11599z.zzf(context, str);
                    } else {
                        nVar.f11599z.zzg(context, str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final void zzdr(zzaza zzazaVar) {
        zzb(zzazaVar.zzj);
    }
}
