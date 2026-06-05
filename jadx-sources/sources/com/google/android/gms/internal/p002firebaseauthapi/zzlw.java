package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzlw implements zzlk {
    private final zzxv zza;
    private final zzxv zzb;

    private zzlw(byte[] bArr, byte[] bArr2) {
        this.zza = zzxv.zza(bArr);
        this.zzb = zzxv.zza(bArr2);
    }

    public static zzlw zza(byte[] bArr, byte[] bArr2, zzwq zzwqVar) throws GeneralSecurityException {
        zzwr.zza(zzwr.zza(zzwqVar, zzwt.UNCOMPRESSED, bArr2), zzwr.zza(zzwqVar, bArr));
        return new zzlw(bArr, bArr2);
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
