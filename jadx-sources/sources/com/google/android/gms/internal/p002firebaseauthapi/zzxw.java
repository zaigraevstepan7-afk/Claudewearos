package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzxw {
    private final zzxv zza;

    private zzxw(zzxv zzxvVar) {
        this.zza = zzxvVar;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public static zzxw zza(byte[] bArr, zzcn zzcnVar) {
        if (zzcnVar != null) {
            return new zzxw(zzxv.zza(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static zzxw zza(int i10) {
        return new zzxw(zzxv.zza(zzow.zza(i10)));
    }

    public final byte[] zza(zzcn zzcnVar) {
        if (zzcnVar != null) {
            return this.zza.zzb();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
