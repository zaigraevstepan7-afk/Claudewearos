package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzakk {
    private static final zzaki zza = zzc();
    private static final zzaki zzb = new zzakl();

    public static zzaki zza() {
        return zza;
    }

    public static zzaki zzb() {
        return zzb;
    }

    private static zzaki zzc() {
        try {
            return (zzaki) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
