package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzakz {
    private static final zzakx zza = zzc();
    private static final zzakx zzb = new zzakw();

    public static zzakx zza() {
        return zza;
    }

    public static zzakx zzb() {
        return zzb;
    }

    private static zzakx zzc() {
        try {
            return (zzakx) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
