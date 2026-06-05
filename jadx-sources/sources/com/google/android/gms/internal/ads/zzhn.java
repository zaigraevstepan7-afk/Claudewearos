package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhn {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void zza(zzhn zzhnVar, int i10, int i11) {
        MediaCodec.CryptoInfo.Pattern pattern = zzhnVar.zzb;
        pattern.set(i10, i11);
        zzhnVar.zza.setPattern(pattern);
    }
}
