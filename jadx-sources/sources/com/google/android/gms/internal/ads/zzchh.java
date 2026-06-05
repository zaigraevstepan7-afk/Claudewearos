package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzchh implements zzhfy {
    private final zzchc zza;

    public zzchh(zzchc zzchcVar) {
        this.zza = zzchcVar;
    }

    public static WeakReference zzc(zzchc zzchcVar) {
        WeakReference weakReferenceZzg = zzchcVar.zzg();
        zzhgg.zzb(weakReferenceZzg);
        return weakReferenceZzg;
    }

    public final WeakReference zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
