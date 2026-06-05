package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzftm extends zzfsf {
    final /* synthetic */ zzftn zza;
    private final zzfts zzb;

    public zzftm(zzftn zzftnVar, zzfts zzftsVar) {
        this.zza = zzftnVar;
        this.zzb = zzftsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsg
    public final void zzb(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzftq zzftqVarZzc = zzftr.zzc();
        zzftqVarZzc.zzb(i10);
        if (string != null) {
            zzftqVarZzc.zza(string);
        }
        this.zzb.zza(zzftqVarZzc.zzc());
        if (i10 == 8157) {
            this.zza.zzd();
        }
    }
}
