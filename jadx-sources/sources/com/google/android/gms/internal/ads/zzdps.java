package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdps {
    private final zzfdk zza;
    private final zzdpp zzb;

    public zzdps(zzfdk zzfdkVar, zzdpp zzdppVar) {
        this.zza = zzfdkVar;
        this.zzb = zzdppVar;
    }

    public final zzbpo zza() throws RemoteException {
        zzbpo zzbpoVarZzb = this.zza.zzb();
        if (zzbpoVarZzb != null) {
            return zzbpoVarZzb;
        }
        int i10 = l0.f13401b;
        k.g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbrn zzb(String str) {
        zzbrn zzbrnVarZzc = zza().zzc(str);
        this.zzb.zzd(str, zzbrnVarZzc);
        return zzbrnVarZzc;
    }

    public final zzfdm zzc(String str, JSONObject jSONObject) {
        zzbpr zzbprVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbprVarZzb = new zzbqp(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbprVarZzb = new zzbqp(new zzbsg());
            } else {
                zzbpo zzbpoVarZza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzbprVarZzb = zzbpoVarZza.zze(string) ? zzbpoVarZza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzbpoVarZza.zzd(string) ? zzbpoVarZza.zzb(string) : zzbpoVarZza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e10) {
                        int i10 = l0.f13401b;
                        k.e("Invalid custom event.", e10);
                    }
                } else {
                    zzbprVarZzb = zzbpoVarZza.zzb(str);
                }
            }
            zzfdm zzfdmVar = new zzfdm(zzbprVarZzb);
            this.zzb.zzc(str, zzfdmVar);
            return zzfdmVar;
        } catch (Throwable th2) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjD)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new zzfcv(th2);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
