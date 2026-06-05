package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzlx {
    private final zzbh zza;
    private final zzbq zzb;

    public zzlx(zzbh zzbhVar) {
        this.zza = zzbhVar;
        this.zzb = null;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        zzbh zzbhVar = this.zza;
        return zzbhVar != null ? zzbhVar.zza(bArr, bArr2) : this.zzb.zza(bArr, bArr2);
    }

    public zzlx(zzbq zzbqVar) {
        this.zza = null;
        this.zzb = zzbqVar;
    }
}
