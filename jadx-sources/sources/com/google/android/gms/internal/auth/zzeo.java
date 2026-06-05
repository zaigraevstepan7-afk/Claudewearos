package com.google.android.gms.internal.auth;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzeo {
    private static final zzem zza = new zzen();
    private static final zzem zzb;

    static {
        zzem zzemVar = null;
        try {
            zzemVar = (zzem) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzemVar;
    }

    public static zzem zza() {
        zzem zzemVar = zzb;
        if (zzemVar != null) {
            return zzemVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzem zzb() {
        return zza;
    }
}
