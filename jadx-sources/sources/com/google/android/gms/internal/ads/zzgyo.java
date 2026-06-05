package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgyo implements zzhae {
    private static final zzgyo zza = new zzgyo();

    private zzgyo() {
    }

    public static zzgyo zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final zzhad zzb(Class cls) {
        if (!zzgyv.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzhad) zzgyv.zzbh(cls.asSubclass(zzgyv.class)).zzbO();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final boolean zzc(Class cls) {
        return zzgyv.class.isAssignableFrom(cls);
    }
}
