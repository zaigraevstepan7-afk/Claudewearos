package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Callable;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzemx implements zzetu {
    private final Context zza;
    private final zzgdm zzb;

    public zzemx(zzgdm zzgdmVar, Context context) {
        this.zzb = zzgdmVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznb)).booleanValue()) {
            return zzgdb.zzh(new zzemy(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        return contentResolver == null ? zzgdb.zzh(new zzemy(null, false)) : this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new zzemy(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }
}
