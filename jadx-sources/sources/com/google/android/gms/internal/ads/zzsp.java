package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzsp implements zztf {
    private final MediaCodec zza;
    private final zzsv zzb;
    private final zztg zzc;
    private final zztb zzd;
    private boolean zze;
    private int zzf = 0;

    public /* synthetic */ zzsp(MediaCodec mediaCodec, HandlerThread handlerThread, zztg zztgVar, zztb zztbVar, zzso zzsoVar) {
        this.zza = mediaCodec;
        this.zzb = new zzsv(handlerThread);
        this.zzc = zztgVar;
        this.zzd = zztbVar;
    }

    public static /* bridge */ /* synthetic */ void zzh(zzsp zzspVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        zztb zztbVar;
        zzsv zzsvVar = zzspVar.zzb;
        MediaCodec mediaCodec = zzspVar.zza;
        zzsvVar.zzf(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i10);
        Trace.endSection();
        zzspVar.zzc.zzh();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (zztbVar = zzspVar.zzd) != null) {
            zztbVar.zza(mediaCodec);
        }
        zzspVar.zzf = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzt(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final MediaFormat zzc() {
        return this.zzb.zzc();
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
        this.zzc.zzb();
        MediaCodec mediaCodec = this.zza;
        mediaCodec.flush();
        this.zzb.zze();
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzk(int i10, int i11, int i12, long j, int i13) {
        this.zzc.zzd(i10, 0, i12, j, i13);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzl(int i10, int i11, zzhp zzhpVar, long j, int i12) {
        this.zzc.zze(i10, 0, zzhpVar, j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzm() {
        zztb zztbVar;
        zztb zztbVar2;
        zztb zztbVar3;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzg();
                    this.zzb.zzh();
                }
                this.zzf = 2;
                if (this.zze) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30 && i10 < 33) {
                    this.zza.stop();
                }
                if (i10 >= 35 && (zztbVar3 = this.zzd) != null) {
                    zztbVar3.zzc(this.zza);
                }
                this.zza.release();
                this.zze = true;
            } catch (Throwable th2) {
                if (!this.zze) {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.zza.stop();
                    }
                    if (i11 >= 35 && (zztbVar2 = this.zzd) != null) {
                        zztbVar2.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (Build.VERSION.SDK_INT >= 35 && (zztbVar = this.zzd) != null) {
                zztbVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th3;
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
        this.zzc.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzr(int i10) {
        this.zza.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final boolean zzs(zzte zzteVar) {
        this.zzb.zzg(zzteVar);
        return true;
    }
}
