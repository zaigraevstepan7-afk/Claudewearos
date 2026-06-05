package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzsr extends Handler {
    final /* synthetic */ zzst zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzsr(zzst zzstVar, Looper looper) {
        super(looper);
        this.zza = zzstVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException {
        zzst.zza(this.zza, message);
    }
}
