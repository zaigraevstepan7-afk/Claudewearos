package com.google.android.gms.internal.ads;

import android.view.View;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzayf extends zzayi {
    private final View zzh;

    public zzayf(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11, View view) {
        super(zzawvVar, "h7NW4UTeHoapcAfHjNS1jSIEsdu+S9XbBUhqH3zqKlRoFqG3FEF52d6iyzd+cmzU", "UQVAYGHTy6RzP6i5dxbs04Nz2BVdis2XDzzm3D3JwpQ=", zzasrVar, i10, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        View view = this.zzh;
        if (view != null) {
            zzbct zzbctVar = zzbdc.zzdG;
            t tVar = t.f12227d;
            Boolean bool = (Boolean) tVar.f12230c.zzb(zzbctVar);
            Boolean bool2 = (Boolean) tVar.f12230c.zzb(zzbdc.zzlj);
            zzawz zzawzVar = new zzawz((String) this.zze.invoke(null, view, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzatm zzatmVarZza = zzatn.zza();
            zzatmVarZza.zzb(zzawzVar.zza.longValue());
            zzatmVarZza.zzd(zzawzVar.zzb.longValue());
            zzatmVarZza.zze(zzawzVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzatmVarZza.zzc(zzawzVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzatmVarZza.zza(zzawzVar.zzd.longValue());
            }
            this.zzd.zzW((zzatn) zzatmVarZza.zzbr());
        }
    }
}
