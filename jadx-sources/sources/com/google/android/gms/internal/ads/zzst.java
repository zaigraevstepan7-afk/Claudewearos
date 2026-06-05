package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzst implements zztg {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdm zzg;
    private boolean zzh;

    public zzst(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdm zzdmVar = new zzdm(zzdj.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdmVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzst r10, android.os.Message r11) throws android.media.MediaCodec.CryptoException {
        /*
            int r0 = r11.what
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 2
            if (r0 == r1) goto L38
            r1 = 3
            if (r0 == r1) goto L32
            r1 = 4
            if (r0 == r1) goto L20
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r0.<init>(r11)
            com.google.android.gms.internal.ads.zzsq.zza(r10, r2, r0)
            goto L74
        L20:
            java.lang.Object r11 = r11.obj
            android.os.Bundle r11 = (android.os.Bundle) r11
            android.media.MediaCodec r0 = r10.zzc     // Catch: java.lang.RuntimeException -> L2a
            r0.setParameters(r11)     // Catch: java.lang.RuntimeException -> L2a
            goto L74
        L2a:
            r0 = move-exception
            r11 = r0
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            com.google.android.gms.internal.ads.zzsq.zza(r10, r2, r11)
            goto L74
        L32:
            com.google.android.gms.internal.ads.zzdm r10 = r10.zzg
            r10.zzf()
            goto L74
        L38:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zzss r11 = (com.google.android.gms.internal.ads.zzss) r11
            int r4 = r11.zza
            android.media.MediaCodec$CryptoInfo r6 = r11.zzd
            long r7 = r11.zze
            int r9 = r11.zzf
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzst.zzb     // Catch: java.lang.RuntimeException -> L52
            monitor-enter(r1)     // Catch: java.lang.RuntimeException -> L52
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.Throwable -> L4f
            r5 = 0
            r3.queueSecureInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            goto L58
        L4f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            throw r0     // Catch: java.lang.RuntimeException -> L52
        L52:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            com.google.android.gms.internal.ads.zzsq.zza(r10, r2, r0)
        L58:
            r2 = r11
            goto L74
        L5a:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zzss r11 = (com.google.android.gms.internal.ads.zzss) r11
            int r4 = r11.zza
            int r6 = r11.zzc
            long r7 = r11.zze
            int r9 = r11.zzf
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.RuntimeException -> L6d
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L6d
            goto L58
        L6d:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            com.google.android.gms.internal.ads.zzsq.zza(r10, r2, r0)
            goto L58
        L74:
            if (r2 == 0) goto L82
            java.util.ArrayDeque r10 = com.google.android.gms.internal.ads.zzst.zza
            monitor-enter(r10)
            r10.add(r2)     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7e
            goto L82
        L7e:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7e
            throw r11
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzst.zza(com.google.android.gms.internal.ads.zzst, android.os.Message):void");
    }

    private static zzss zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zzss();
                }
                return (zzss) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static byte[] zzj(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] zzk(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                zzdm zzdmVar = this.zzg;
                zzdmVar.zzd();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                zzdmVar.zza();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzd(int i10, int i11, int i12, long j, int i13) {
        zzc();
        zzss zzssVarZzi = zzi();
        zzssVarZzi.zza(i10, 0, i12, j, i13);
        Handler handler = this.zze;
        String str = zzex.zza;
        handler.obtainMessage(1, zzssVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zze(int i10, int i11, zzhp zzhpVar, long j, int i12) {
        zzc();
        zzss zzssVarZzi = zzi();
        zzssVarZzi.zza(i10, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzssVarZzi.zzd;
        cryptoInfo.numSubSamples = zzhpVar.zzf;
        cryptoInfo.numBytesOfClearData = zzk(zzhpVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzk(zzhpVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzj = zzj(zzhpVar.zzb, cryptoInfo.key);
        bArrZzj.getClass();
        cryptoInfo.key = bArrZzj;
        byte[] bArrZzj2 = zzj(zzhpVar.zza, cryptoInfo.iv);
        bArrZzj2.getClass();
        cryptoInfo.iv = bArrZzj2;
        cryptoInfo.mode = zzhpVar.zzc;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzhpVar.zzg, zzhpVar.zzh));
        Handler handler = this.zze;
        String str = zzex.zza;
        handler.obtainMessage(2, zzssVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzf(Bundle bundle) {
        zzc();
        Handler handler = this.zze;
        String str = zzex.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzg() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzh() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zzsr(this, handlerThread.getLooper());
        this.zzh = true;
    }
}
