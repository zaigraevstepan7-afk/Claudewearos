package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdww implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;

    public zzdww(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        zzfgs zzfgsVar = (zzfgs) this.zza.zzb();
        final CookieManager cookieManagerD = n.D.f11580f.d();
        zzfgi zzfgiVarZzi = zzfgc.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerD;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) t.f12227d.f12230c.zzb(zzbdc.zzba));
            }
        }, zzfgm.WEBVIEW_COOKIE, zzfgsVar).zzi(1L, TimeUnit.SECONDS);
        final zzffw zzffwVar = new zzffw() { // from class: com.google.android.gms.internal.ads.zzdwr
            @Override // com.google.android.gms.internal.ads.zzffw
            public final Object zza(Object obj) {
                return "";
            }
        };
        return zzfgiVarZzi.zzc(Exception.class, new zzgci(zzffwVar) { // from class: com.google.android.gms.internal.ads.zzfgd
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzgdb.zzh("");
            }
        }).zza();
    }
}
