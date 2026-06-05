package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import mc.n;
import nc.g2;
import nc.t;
import nc.u3;
import org.json.JSONException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcvk extends g2 {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzedj zzh;
    private final Bundle zzi;
    private final double zzj;

    public zzcvk(zzfbt zzfbtVar, String str, zzedj zzedjVar, zzfbw zzfbwVar, String str2) throws JSONException {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
        String string = null;
        this.zzb = zzfbtVar == null ? null : zzfbtVar.zzab;
        this.zzc = str2;
        this.zzd = zzfbwVar == null ? null : zzfbwVar.zzb;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfbtVar != null) {
            try {
                string = zzfbtVar.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = string != null ? string : str;
        this.zze = zzedjVar.zzc();
        this.zzh = zzedjVar;
        this.zzj = zzfbtVar == null ? 0.0d : zzfbtVar.zzaz;
        n.D.f11584k.getClass();
        this.zzf = System.currentTimeMillis() / 1000;
        zzbct zzbctVar = zzbdc.zzgT;
        t tVar = t.f12227d;
        if (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() || zzfbwVar == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzfbwVar.zzk;
        }
        this.zzg = (!((Boolean) tVar.f12230c.zzb(zzbdc.zzjx)).booleanValue() || zzfbwVar == null || TextUtils.isEmpty(zzfbwVar.zzi)) ? "" : zzfbwVar.zzi;
    }

    public final double zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzf;
    }

    @Override // nc.i2
    public final Bundle zze() {
        return this.zzi;
    }

    @Override // nc.i2
    public final u3 zzf() {
        zzedj zzedjVar = this.zzh;
        if (zzedjVar != null) {
            return zzedjVar.zza();
        }
        return null;
    }

    @Override // nc.i2
    public final String zzg() {
        return this.zza;
    }

    @Override // nc.i2
    public final String zzh() {
        return this.zzc;
    }

    @Override // nc.i2
    public final String zzi() {
        return this.zzb;
    }

    @Override // nc.i2
    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzg;
    }

    public final String zzl() {
        return this.zzd;
    }
}
