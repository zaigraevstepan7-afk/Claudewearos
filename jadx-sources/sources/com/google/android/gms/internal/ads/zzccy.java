package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzccy extends zzark {
    static final zzccy zzb = new zzccy();

    @Override // com.google.android.gms.internal.ads.zzark
    public final zzaro zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzarq() : "mvhd".equals(str) ? new zzarr() : new zzars(str);
    }
}
