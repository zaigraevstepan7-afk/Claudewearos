package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzyv {
    public final zzbm zza;
    public final int[] zzb;

    public zzyv(zzbm zzbmVar, int[] iArr, int i10) {
        if (iArr.length == 0) {
            zzea.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbmVar;
        this.zzb = iArr;
    }
}
