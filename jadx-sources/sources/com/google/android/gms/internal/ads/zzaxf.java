package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxf extends zzayi {
    private final Activity zzh;
    private final View zzi;

    public zzaxf(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11, View view, Activity activity) {
        super(zzawvVar, "YX3pd3fZ/j0e82Z3yXv98nYqAI3nsN+d0YAKVHjoLLbjd+BRZ45hNatoujYNmZM/", "2IfMUy5zOuVT1ilWAqZrt9PNbHCY94WGDxwYlYOFZTM=", zzasrVar, i10, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        View view = this.zzi;
        if (view == null) {
            return;
        }
        Boolean bool = (Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcQ);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, view, this.zzh, bool);
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            try {
                zzasrVar.zzc(((Long) objArr[0]).longValue());
                zzasrVar.zze(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    zzasrVar.zzd((String) objArr[2]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
