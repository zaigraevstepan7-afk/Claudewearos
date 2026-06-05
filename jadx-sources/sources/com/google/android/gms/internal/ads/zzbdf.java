package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import mc.n;
import nc.t;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbdf {
    private final String zza = (String) zzbew.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbdf(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        n nVar = n.D;
        r0 r0Var = nVar.f11577c;
        linkedHashMap.put("device", r0.I());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        r0 r0Var2 = nVar.f11577c;
        linkedHashMap.put("is_lite_sdk", true != r0.e(context) ? "0" : "1");
        Future futureZzb = nVar.f11589p.zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbvs) futureZzb.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbvs) futureZzb.get()).zzk));
        } catch (Exception e10) {
            n.D.f11582h.zzw(e10, "CsiConfiguration.CsiConfiguration");
        }
        zzbct zzbctVar = zzbdc.zzlC;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            Map map = this.zzb;
            r0 r0Var3 = n.D.f11577c;
            map.put("is_bstar", true != r0.c(context) ? "0" : "1");
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzjG)).booleanValue()) {
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzcA)).booleanValue()) {
                n nVar2 = n.D;
                if (zzfvv.zzd(nVar2.f11582h.zzn())) {
                    return;
                }
                this.zzb.put("plugin", nVar2.f11582h.zzn());
            }
        }
    }

    public final Context zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final Map zzd() {
        return this.zzb;
    }
}
