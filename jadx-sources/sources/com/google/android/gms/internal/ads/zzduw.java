package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nc.t;
import org.json.JSONArray;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzduw {
    private final zzdug zza;
    private final zzdpp zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzduw(zzdug zzdugVar, zzdpp zzdppVar) {
        this.zza = zzdugVar;
        this.zzb = zzdppVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        zzdpo zzdpoVarZza;
        zzdpo zzdpoVarZza2;
        zzbsc zzbscVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbmb zzbmbVar = (zzbmb) it.next();
                    zzbct zzbctVar = zzbdc.zzjC;
                    t tVar = t.f12227d;
                    String string = (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() || (zzdpoVarZza2 = this.zzb.zza(zzbmbVar.zza)) == null || (zzbscVar = zzdpoVarZza2.zzc) == null) ? "" : zzbscVar.toString();
                    String str = string;
                    boolean z2 = ((Boolean) tVar.f12230c.zzb(zzbdc.zzjD)).booleanValue() && (zzdpoVarZza = this.zzb.zza(zzbmbVar.zza)) != null && zzdpoVarZza.zzd;
                    List list2 = this.zzd;
                    String str2 = zzbmbVar.zza;
                    list2.add(new zzduv(str2, str, this.zzb.zzb(str2), zzbmbVar.zzb ? 1 : 0, zzbmbVar.zzd, zzbmbVar.zzc, z2));
                }
                this.zze = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final JSONArray zza() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            try {
                if (!this.zze) {
                    zzdug zzdugVar = this.zza;
                    if (!zzdugVar.zzt()) {
                        zzc();
                        return jSONArray;
                    }
                    zzd(zzdugVar.zzg());
                }
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzduv) it.next()).zza());
                }
                return jSONArray;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzduu(this));
    }
}
