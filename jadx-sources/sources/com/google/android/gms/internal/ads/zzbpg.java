package com.google.android.gms.internal.ads;

import java.util.UUID;
import mc.n;
import org.json.JSONException;
import org.json.JSONObject;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbpg implements zzgci {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final mf.a zzb;

    public zzbpg(mf.a aVar, String str, zzbon zzbonVar, zzbom zzbomVar) {
        this.zzb = aVar;
    }

    public static mf.a zzb(zzbpg zzbpgVar, Object obj, zzboh zzbohVar) throws JSONException {
        zzcai zzcaiVar = new zzcai();
        r0 r0Var = n.D.f11577c;
        String string = UUID.randomUUID().toString();
        zzbkc.zzo.zzc(string, new zzbpf(zzbpgVar, zzcaiVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbohVar.zzp(zzbpgVar.zza, jSONObject);
        return zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final mf.a zza(Object obj) {
        return zzc(obj);
    }

    public final mf.a zzc(final Object obj) {
        return zzgdb.zzn(this.zzb, new zzgci() { // from class: com.google.android.gms.internal.ads.zzbpe
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj2) {
                return zzbpg.zzb(this.zza, obj, (zzboh) obj2);
            }
        }, zzcad.zzg);
    }
}
