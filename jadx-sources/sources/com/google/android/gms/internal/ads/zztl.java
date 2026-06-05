package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import y8.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zztl extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzti zzc;
    public final String zzd;

    public zztl(zzz zzzVar, Throwable th2, boolean z2, int i10) {
        this("Decoder init failed: [" + i10 + "], " + zzzVar.toString(), th2, zzzVar.zzo, false, null, m6.a.d(Math.abs(i10), "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_"), null);
    }

    public static /* bridge */ /* synthetic */ zztl zza(zztl zztlVar, zztl zztlVar2) {
        return new zztl(zztlVar.getMessage(), zztlVar.getCause(), zztlVar.zza, false, zztlVar.zzc, zztlVar.zzd, zztlVar2);
    }

    public zztl(zzz zzzVar, Throwable th2, boolean z2, zzti zztiVar) {
        this(f.b("Decoder init failed: ", zztiVar.zza, ", ", zzzVar.toString()), th2, zzzVar.zzo, false, zztiVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
    }

    private zztl(String str, Throwable th2, String str2, boolean z2, zzti zztiVar, String str3, zztl zztlVar) {
        super(str, th2);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zztiVar;
        this.zzd = str3;
    }
}
