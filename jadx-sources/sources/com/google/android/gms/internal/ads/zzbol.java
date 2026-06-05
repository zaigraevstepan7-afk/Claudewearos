package com.google.android.gms.internal.ads;

import android.content.Context;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbol {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbou zzc;
    private zzbou zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbou zza(Context context, rc.a aVar, zzfhp zzfhpVar) {
        zzbou zzbouVar;
        String str;
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    if (((Boolean) zzbfi.zzf.zze()).booleanValue()) {
                        str = (String) t.f12227d.f12230c.zzb(zzbdc.zza);
                    } else {
                        str = (String) t.f12227d.f12230c.zzb(zzbdc.zzb);
                    }
                    this.zzc = new zzbou(zzc(context), aVar, str, zzfhpVar);
                }
                zzbouVar = this.zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbouVar;
    }

    public final zzbou zzb(Context context, rc.a aVar, zzfhp zzfhpVar) {
        zzbou zzbouVar;
        synchronized (this.zzb) {
            try {
                if (this.zzd == null) {
                    this.zzd = new zzbou(zzc(context), aVar, (String) zzbfm.zza.zze(), zzfhpVar);
                }
                zzbouVar = this.zzd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbouVar;
    }
}
