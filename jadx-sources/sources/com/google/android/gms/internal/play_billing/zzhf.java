package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzhf implements zzik {
    private static final zzhf zza = new zzhf();

    private zzhf() {
    }

    public static zzhf zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzik
    public final zzij zzb(Class cls) {
        if (!zzhk.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzij) zzhk.zzo(cls.asSubclass(zzhk.class)).zzd(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzik
    public final boolean zzc(Class cls) {
        return zzhk.class.isAssignableFrom(cls);
    }
}
