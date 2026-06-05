package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import nc.t;
import org.json.JSONObject;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeie implements zzedg {
    private final zzeji zza;
    private final zzdps zzb;

    public zzeie(zzeji zzejiVar, zzdps zzdpsVar) {
        this.zza = zzejiVar;
        this.zzb = zzdpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final zzedh zza(String str, JSONObject jSONObject) {
        zzbrn zzbrnVarZzb;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzbO)).booleanValue()) {
            try {
                zzbrnVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e10) {
                int i10 = l0.f13401b;
                k.e("Coundn't create RTB adapter: ", e10);
                zzbrnVarZzb = null;
            }
        } else {
            zzbrnVarZzb = this.zza.zza(str);
        }
        if (zzbrnVarZzb == null) {
            return null;
        }
        return new zzedh(zzbrnVarZzb, new zzeev(), str);
    }
}
