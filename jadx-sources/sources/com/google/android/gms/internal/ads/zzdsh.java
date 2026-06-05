package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import mc.n;
import nc.t;
import qc.o0;
import qc.r0;
import rc.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdsh extends zzdsl {
    private final yc.a zzf;

    public zzdsh(Executor executor, o oVar, yc.a aVar, yc.c cVar, Context context) {
        super(executor, oVar, cVar, context);
        this.zzf = aVar;
        Map map = this.zza;
        aVar.getClass();
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        n nVar = n.D;
        r0 r0Var = nVar.f11577c;
        zzbzq zzbzqVar = nVar.f11582h;
        map.put("device", r0.I());
        map.put("app", aVar.f20272b);
        Context context2 = aVar.f20271a;
        map.put("is_lite_sdk", true != r0.e(context2) ? "0" : "1");
        zzbct zzbctVar = zzbdc.zza;
        t tVar = t.f12227d;
        zzbcu zzbcuVar = tVar.f12228a;
        zzbda zzbdaVar = tVar.f12230c;
        List listZzb = zzbcuVar.zzb();
        if (((Boolean) zzbdaVar.zzb(zzbdc.zzgX)).booleanValue()) {
            listZzb.addAll(((o0) zzbzqVar.zzi()).n().zzd());
        }
        map.put("e", TextUtils.join(",", listZzb));
        map.put("sdkVersion", aVar.f20273c);
        if (((Boolean) zzbdaVar.zzb(zzbdc.zzlC)).booleanValue()) {
            map.put("is_bstar", true != r0.c(context2) ? "0" : "1");
        }
        if (((Boolean) zzbdaVar.zzb(zzbdc.zzjG)).booleanValue() && ((Boolean) zzbdaVar.zzb(zzbdc.zzcA)).booleanValue()) {
            map.put("plugin", zzfvv.zzc(zzbzqVar.zzn()));
        }
    }

    public final Map zza() {
        return new HashMap(this.zza);
    }
}
