package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfdv implements zzcvu {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzbzu zzc;

    public zzfdv(Context context, zzbzu zzbzuVar) {
        this.zzb = context;
        this.zzc = zzbzuVar;
    }

    public final Bundle zzb() {
        return this.zzc.zzn(this.zzb, this);
    }

    public final synchronized void zzc(HashSet hashSet) {
        HashSet hashSet2 = this.zza;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final synchronized void zzdD(h2 h2Var) {
        if (h2Var.f12114a != 3) {
            this.zzc.zzl(this.zza);
        }
    }
}
