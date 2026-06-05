package com.google.android.gms.internal.ads;

import android.content.Context;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzevn implements zzetu {
    private final JSONObject zza;

    public zzevn(Context context) {
        this.zza = zzbvk.zzc(context, rc.a.b());
    }

    public static /* synthetic */ void zzc(zzevn zzevnVar, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("gms_sdk_env", zzevnVar.zza);
        } catch (JSONException unused) {
            l0.k("Failed putting version constants.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmi)).booleanValue() ? zzgdb.zzh(new zzett() { // from class: com.google.android.gms.internal.ads.zzevl
            @Override // com.google.android.gms.internal.ads.zzett
            public final void zzb(Object obj) {
            }

            @Override // com.google.android.gms.internal.ads.zzett
            public final /* synthetic */ void zza(Object obj) {
            }
        }) : zzgdb.zzh(new zzett() { // from class: com.google.android.gms.internal.ads.zzevm
            @Override // com.google.android.gms.internal.ads.zzett
            public final void zzb(Object obj) throws JSONException {
                zzevn.zzc(this.zza, (JSONObject) obj);
            }

            @Override // com.google.android.gms.internal.ads.zzett
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }
}
