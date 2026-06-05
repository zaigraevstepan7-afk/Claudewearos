package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import q.g;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzsv extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private IllegalStateException zzn;
    private zzte zzo;
    private final Object zza = new Object();
    private final g zzd = new g();
    private final g zze = new g();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    public zzsv(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    public static /* synthetic */ void zzd(zzsv zzsvVar) {
        Object obj = zzsvVar.zza;
        synchronized (obj) {
            try {
                if (zzsvVar.zzm) {
                    return;
                }
                long j = zzsvVar.zzl - 1;
                zzsvVar.zzl = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    zzsvVar.zzj();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (obj) {
                    zzsvVar.zzn = illegalStateException;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzi(MediaFormat mediaFormat) {
        this.zze.a(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzj() {
        ArrayDeque arrayDeque = this.zzg;
        if (!arrayDeque.isEmpty()) {
            this.zzi = (MediaFormat) arrayDeque.getLast();
        }
        g gVar = this.zzd;
        gVar.f13071c = gVar.f13070b;
        g gVar2 = this.zze;
        gVar2.f13071c = gVar2.f13070b;
        this.zzf.clear();
        arrayDeque.clear();
    }

    private final void zzk() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    private final boolean zzl() {
        return this.zzl > 0 || this.zzm;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.zza) {
            try {
                this.zzd.a(i10);
                zzte zzteVar = this.zzo;
                if (zzteVar != null) {
                    zztp zztpVar = ((zztm) zzteVar).zza;
                    if (zztpVar.zzo != null) {
                        zztpVar.zzo.zza();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                MediaFormat mediaFormat = this.zzi;
                if (mediaFormat != null) {
                    zzi(mediaFormat);
                    this.zzi = null;
                }
                this.zze.a(i10);
                this.zzf.add(bufferInfo);
                zzte zzteVar = this.zzo;
                if (zzteVar != null) {
                    zztp zztpVar = ((zztm) zzteVar).zza;
                    if (zztpVar.zzo != null) {
                        zztpVar.zzo.zza();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzi(mediaFormat);
            this.zzi = null;
        }
    }

    public final int zza() {
        synchronized (this.zza) {
            try {
                zzk();
                int i10 = -1;
                if (zzl()) {
                    return -1;
                }
                g gVar = this.zzd;
                int i11 = gVar.f13070b;
                int i12 = gVar.f13071c;
                if (!(i11 == i12)) {
                    if (i11 == i12) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i10 = gVar.f13069a[i11];
                    gVar.f13070b = (i11 + 1) & gVar.f13072d;
                }
                return i10;
            } finally {
            }
        }
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                zzk();
                if (zzl()) {
                    return -1;
                }
                g gVar = this.zze;
                int i10 = gVar.f13070b;
                int i11 = gVar.f13071c;
                if (i10 == i11) {
                    return -1;
                }
                if (i10 == i11) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i12 = gVar.f13069a[i10];
                gVar.f13070b = (i10 + 1) & gVar.f13072d;
                if (i12 >= 0) {
                    zzdd.zzb(this.zzh);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i12 == -2) {
                    this.zzh = (MediaFormat) this.zzg.remove();
                    i12 = -2;
                }
                return i12;
            } finally {
            }
        }
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            try {
                mediaFormat = this.zzh;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            String str = zzex.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsu
                @Override // java.lang.Runnable
                public final void run() {
                    zzsv.zzd(this.zza);
                }
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        zzdd.zzf(this.zzc == null);
        HandlerThread handlerThread = this.zzb;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg(zzte zzteVar) {
        synchronized (this.zza) {
            this.zzo = zzteVar;
        }
    }

    public final void zzh() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }
}
