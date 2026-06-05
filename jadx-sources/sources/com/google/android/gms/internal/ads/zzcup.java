package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcup implements zzcxf, zzcwm {
    private final zzfbt zza;

    public zzcup(Context context, zzfbt zzfbtVar, zzbtt zzbttVar) {
        this.zza = zzfbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() {
        zzbtu zzbtuVar = this.zza.zzad;
        if (zzbtuVar == null || !zzbtuVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzbtuVar.zzb;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdj(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdl(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdm(Context context) {
    }
}
