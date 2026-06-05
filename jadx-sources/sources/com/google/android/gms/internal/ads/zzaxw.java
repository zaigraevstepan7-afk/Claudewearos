package com.google.android.gms.internal.ads;

import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxw extends zzayi {
    public zzaxw(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11) {
        super(zzawvVar, "+T/U1hw7+KZ4U7a2mmAOu7BJ15632T6q77fmzX/Xgjcy3uK841Ng+VsVpINIYuXP", "GzjxqsxzxT+aATwD+mE+LGwR24OtaI/aqws6qGNlH18=", zzasrVar, i10, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        Boolean bool = (Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdd);
        bool.booleanValue();
        zzawb zzawbVar = new zzawb((String) this.zze.invoke(null, this.zza.zzb(), bool));
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            zzasrVar.zzj(zzawbVar.zza);
            zzasrVar.zzA(zzawbVar.zzb);
        }
    }
}
