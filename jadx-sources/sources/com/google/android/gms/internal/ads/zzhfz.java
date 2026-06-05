package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhfz implements zzhfy, zzhfs {
    private static final zzhfz zza = new zzhfz(null);
    private final Object zzb;

    private zzhfz(Object obj) {
        this.zzb = obj;
    }

    public static zzhfy zza(Object obj) {
        zzhgg.zza(obj, "instance cannot be null");
        return new zzhfz(obj);
    }

    public static zzhfy zzc(Object obj) {
        return obj == null ? zza : new zzhfz(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        return this.zzb;
    }
}
