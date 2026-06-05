package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzth extends zzhq {
    public final int zza;

    public zzth(Throwable th2, zzti zztiVar) {
        int errorCode;
        super("Decoder failed: ".concat(String.valueOf(zztiVar == null ? null : zztiVar.zza)), th2);
        if (th2 instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th2;
            codecException.getDiagnosticInfo();
            errorCode = codecException.getErrorCode();
        } else {
            errorCode = 0;
        }
        this.zza = errorCode;
    }
}
