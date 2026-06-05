package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzue implements zztf {
    private final MediaCodec zza;
    private final zztb zzb;

    public /* synthetic */ zzue(MediaCodec mediaCodec, zztb zztbVar, zzud zzudVar) {
        this.zza = mediaCodec;
        this.zzb = zztbVar;
        if (Build.VERSION.SDK_INT < 35 || zztbVar == null) {
            return;
        }
        zztbVar.zza(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final ByteBuffer zzf(int i10) {
        return this.zza.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final ByteBuffer zzg(int i10) {
        return this.zza.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzi() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzj() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzk(int i10, int i11, int i12, long j, int i13) throws MediaCodec.CryptoException {
        this.zza.queueInputBuffer(i10, 0, i12, j, i13);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzl(int i10, int i11, zzhp zzhpVar, long j, int i12) throws MediaCodec.CryptoException {
        this.zza.queueSecureInputBuffer(i10, 0, zzhpVar.zza(), j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzm() {
        zztb zztbVar;
        zztb zztbVar2;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && i10 < 33) {
                this.zza.stop();
            }
            if (i10 >= 35 && (zztbVar2 = this.zzb) != null) {
                zztbVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (zztbVar = this.zzb) != null) {
                zztbVar.zzc(this.zza);
            }
            this.zza.release();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzn(int i10, long j) {
        this.zza.releaseOutputBuffer(i10, j);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzo(int i10, boolean z2) {
        this.zza.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzp(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzq(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzr(int i10) {
        this.zza.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final /* synthetic */ boolean zzs(zzte zzteVar) {
        return false;
    }
}
