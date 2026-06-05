package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzly implements zzlk {
    private final zzxv zza;
    private final zzxv zzb;

    private zzly(byte[] bArr, byte[] bArr2) {
        this.zza = zzxv.zza(bArr);
        this.zzb = zzxv.zza(bArr2);
    }

    public static zzly zza(byte[] bArr) {
        return new zzly(bArr, zzxt.zza(bArr));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlk
    public final zzxv zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlk
    public final zzxv zza() {
        return this.zza;
    }
}
