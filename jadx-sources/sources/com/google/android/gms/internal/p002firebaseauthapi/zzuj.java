package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public enum zzuj implements zzajg {
    KDF_UNKNOWN(0),
    HKDF_SHA256(1),
    HKDF_SHA384(2),
    HKDF_SHA512(3),
    UNRECOGNIZED(-1);

    private static final zzajj<zzuj> zzf = new zzajj<zzuj>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzum
    };
    private final int zzh;

    zzuj(int i10) {
        this.zzh = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzuj.class.getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb2.append(" number=");
            sb2.append(zza());
        }
        sb2.append(" name=");
        sb2.append(name());
        sb2.append('>');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzuj zza(int i10) {
        if (i10 == 0) {
            return KDF_UNKNOWN;
        }
        if (i10 == 1) {
            return HKDF_SHA256;
        }
        if (i10 == 2) {
            return HKDF_SHA384;
        }
        if (i10 != 3) {
            return null;
        }
        return HKDF_SHA512;
    }
}
