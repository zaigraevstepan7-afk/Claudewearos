package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzjr {
    private static final zzjp zza = new zzjq();
    private static final zzjp zzb;

    static {
        zzjp zzjpVar = null;
        try {
            zzjpVar = (zzjp) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzjpVar;
    }

    public static zzjp zza() {
        zzjp zzjpVar = zzb;
        if (zzjpVar != null) {
            return zzjpVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzjp zzb() {
        return zza;
    }
}
