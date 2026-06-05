package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzlf {
    private static final zzle zza;
    private static final zzle zzb;

    static {
        zzle zzleVar = null;
        try {
            zzleVar = (zzle) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzleVar;
        zzb = new zzle();
    }

    public static zzle zza() {
        return zza;
    }

    public static zzle zzb() {
        return zzb;
    }
}
