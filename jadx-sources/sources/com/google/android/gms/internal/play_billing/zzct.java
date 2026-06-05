package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzct extends zzbi implements Serializable {
    private static final zzct zza;
    private static final zzct zzb;
    private final transient zzco zzc;

    static {
        int i10 = zzco.zzd;
        zza = new zzct(zzdk.zza);
        zzb = new zzct(zzco.zzm(zzdh.zza()));
    }

    public zzct(zzco zzcoVar) {
        this.zzc = zzcoVar;
    }

    public static zzct zza() {
        return zzb;
    }

    public static zzct zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdj
    public final /* bridge */ /* synthetic */ Set zzc() {
        return this.zzc.isEmpty() ? zzdq.zza : new zzdr(this.zzc, zzdg.zza);
    }
}
