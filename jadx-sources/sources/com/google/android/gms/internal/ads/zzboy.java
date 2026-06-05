package com.google.android.gms.internal.ads;

import java.util.UUID;
import mc.n;
import org.json.JSONObject;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzboy implements zzbok {
    private final zzbom zza;
    private final zzbon zzb;
    private final zzbog zzc;
    private final String zzd;

    public zzboy(zzbog zzbogVar, String str, zzbon zzbonVar, zzbom zzbomVar) {
        this.zzc = zzbogVar;
        this.zzd = str;
        this.zzb = zzbonVar;
        this.zza = zzbomVar;
    }

    public static void zzd(zzboy zzboyVar, zzboa zzboaVar, zzboh zzbohVar, Object obj, zzcai zzcaiVar) {
        try {
            r0 r0Var = n.D.f11577c;
            String string = UUID.randomUUID().toString();
            zzbkc.zzo.zzc(string, new zzbox(zzboyVar, zzboaVar, zzcaiVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", zzboyVar.zzb.zzb(obj));
            zzbohVar.zzp(zzboyVar.zzd, jSONObject);
        } catch (Exception e10) {
            try {
                zzcaiVar.zzd(e10);
                int i10 = l0.f13401b;
                k.e("Unable to invokeJavascript", e10);
            } finally {
                zzboaVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final mf.a zza(Object obj) {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbok
    public final mf.a zzb(Object obj) {
        zzcai zzcaiVar = new zzcai();
        zzboa zzboaVarZzb = this.zzc.zzb(null);
        l0.k("callJs > getEngine: Promise created");
        zzboaVarZzb.zzj(new zzbov(this, zzboaVarZzb, obj, zzcaiVar), new zzbow(this, zzcaiVar, zzboaVarZzb));
        return zzcaiVar;
    }
}
