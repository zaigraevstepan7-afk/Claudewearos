package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzaiu {
    private static final zzais<?> zza = new zzaiv();
    private static final zzais<?> zzb = zzc();

    public static zzais<?> zza() {
        zzais<?> zzaisVar = zzb;
        if (zzaisVar != null) {
            return zzaisVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzais<?> zzb() {
        return zza;
    }

    private static zzais<?> zzc() {
        try {
            return (zzais) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
