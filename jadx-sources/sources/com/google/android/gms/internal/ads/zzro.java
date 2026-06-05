package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzro implements zzqo {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private zzrf zzA;
    private zzbb zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private float zzL;
    private ByteBuffer zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private int zzT;
    private zzf zzU;
    private zzpp zzV;
    private long zzW;
    private boolean zzX;
    private boolean zzY;
    private Looper zzZ;
    private long zzaa;
    private long zzab;
    private Handler zzac;
    private Context zzad;
    private final zzre zzae;
    private final zzqu zzaf;
    private final Context zzd;
    private final zzqt zze;
    private final zzry zzf;
    private final zzcr zzg;
    private final zzrx zzh;
    private final zzfyf zzi;
    private final zzqs zzj;
    private final ArrayDeque zzk;
    private zzrm zzl;
    private final zzri zzm;
    private final zzri zzn;
    private final int zzo;
    private zzph zzp;
    private zzql zzq;
    private zzrd zzr;
    private zzrd zzs;
    private zzck zzt;
    private AudioTrack zzu;
    private zzpj zzv;
    private zzpo zzw;
    private zzrh zzx;
    private zze zzy;
    private zzrf zzz;

    public /* synthetic */ zzro(zzrc zzrcVar, zzrn zzrnVar) {
        int deviceId;
        zzrn zzrnVar2 = null;
        Context applicationContext = zzrcVar.zza == null ? null : zzrcVar.zza.getApplicationContext();
        this.zzd = applicationContext;
        this.zzy = zze.zza;
        this.zzv = applicationContext != null ? null : zzrcVar.zzb;
        this.zzae = zzrcVar.zzf;
        zzqu zzquVar = zzrcVar.zzg;
        zzquVar.getClass();
        this.zzaf = zzquVar;
        this.zzj = new zzqs(new zzrj(this, zzrnVar2));
        zzqt zzqtVar = new zzqt();
        this.zze = zzqtVar;
        zzry zzryVar = new zzry();
        this.zzf = zzryVar;
        this.zzg = new zzcr();
        this.zzh = new zzrx();
        this.zzi = zzfyf.zzp(zzryVar, zzqtVar);
        this.zzL = 1.0f;
        this.zzT = 0;
        this.zzU = new zzf(0, 0.0f);
        zzbb zzbbVar = zzbb.zza;
        this.zzA = new zzrf(zzbbVar, 0L, 0L, null);
        this.zzB = zzbbVar;
        this.zzC = false;
        this.zzk = new ArrayDeque();
        this.zzm = new zzri();
        this.zzn = new zzri();
        int i10 = -1;
        if (Build.VERSION.SDK_INT >= 34 && zzrcVar.zza != null && (deviceId = zzrcVar.zza.getDeviceId()) != 0 && deviceId != -1) {
            i10 = deviceId;
        }
        this.zzo = i10;
    }

    public static /* synthetic */ void zzG(zzro zzroVar) {
        if (zzroVar.zzab >= 300000) {
            ((zzrs) zzroVar.zzq).zza.zzn = true;
            zzroVar.zzab = 0L;
        }
    }

    public static /* synthetic */ void zzI(AudioTrack audioTrack, final zzql zzqlVar, Handler handler, final zzqi zzqiVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzqlVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqx
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((zzrs) zzqlVar).zza.zzc.zzr(zzqiVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i10 = zzc - 1;
                    zzc = i10;
                    if (i10 == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (zzqlVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqx
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((zzrs) zzqlVar).zza.zzc.zzr(zzqiVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i11 = zzc - 1;
                    zzc = i11;
                    if (i11 == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzK() {
        boolean z2;
        synchronized (zza) {
            z2 = zzc > 0;
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzL() {
        return this.zzs.zzc == 0 ? this.zzD / r0.zzb : this.zzE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzM() {
        zzrd zzrdVar = this.zzs;
        if (zzrdVar.zzc != 0) {
            return this.zzG;
        }
        long j = this.zzF;
        long j4 = zzrdVar.zzd;
        String str = zzex.zza;
        return ((j + j4) - 1) / j4;
    }

    private final AudioTrack zzN(zzrd zzrdVar) throws zzqk {
        Context context;
        try {
            int i10 = this.zzT;
            int i11 = this.zzo;
            Context context2 = null;
            if (i11 != -1 && (context = this.zzd) != null && Build.VERSION.SDK_INT >= 34) {
                if (this.zzad == null) {
                    this.zzad = context.createDeviceContext(i11);
                }
                context2 = this.zzad;
                i10 = 0;
            }
            return zzac(zzrdVar.zza(), this.zzy, i10, zzrdVar.zza, context2);
        } catch (zzqk e10) {
            zzql zzqlVar = this.zzq;
            if (zzqlVar != null) {
                zzqlVar.zzb(e10);
            }
            throw e10;
        }
    }

    private final void zzO(long j) {
        zzbb zzbbVar;
        boolean z2;
        if (zzab()) {
            zzre zzreVar = this.zzae;
            zzbbVar = this.zzB;
            zzreVar.zzc(zzbbVar);
        } else {
            zzbbVar = zzbb.zza;
        }
        zzbb zzbbVar2 = zzbbVar;
        this.zzB = zzbbVar2;
        if (zzab()) {
            zzre zzreVar2 = this.zzae;
            z2 = this.zzC;
            zzreVar2.zzd(z2);
        } else {
            z2 = false;
        }
        this.zzC = z2;
        this.zzk.add(new zzrf(zzbbVar2, Math.max(0L, j), zzex.zzt(zzM(), this.zzs.zze), null));
        zzX();
        zzql zzqlVar = this.zzq;
        if (zzqlVar != null) {
            ((zzrs) zzqlVar).zza.zzc.zzy(this.zzC);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzP(long r8) throws com.google.android.gms.internal.ads.zzqn {
        /*
            r7 = this;
            java.nio.ByteBuffer r8 = r7.zzO
            if (r8 != 0) goto L6
            goto Lb1
        L6:
            com.google.android.gms.internal.ads.zzri r8 = r7.zzn
            boolean r9 = r8.zzc()
            if (r9 != 0) goto Lb1
            java.nio.ByteBuffer r9 = r7.zzO
            int r9 = r9.remaining()
            android.media.AudioTrack r0 = r7.zzu
            java.nio.ByteBuffer r1 = r7.zzO
            r2 = 1
            int r0 = r0.write(r1, r9, r2)
            long r3 = android.os.SystemClock.elapsedRealtime()
            r7.zzW = r3
            r3 = 0
            r1 = 0
            if (r0 >= 0) goto L68
            r9 = -6
            if (r0 == r9) goto L32
            r9 = -32
            if (r0 != r9) goto L30
            goto L32
        L30:
            r2 = r1
            goto L46
        L32:
            long r5 = r7.zzM()
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 <= 0) goto L3b
            goto L46
        L3b:
            android.media.AudioTrack r9 = r7.zzu
            boolean r9 = zzaa(r9)
            if (r9 == 0) goto L30
            r7.zzQ()
        L46:
            com.google.android.gms.internal.ads.zzqn r9 = new com.google.android.gms.internal.ads.zzqn
            com.google.android.gms.internal.ads.zzrd r1 = r7.zzs
            com.google.android.gms.internal.ads.zzz r1 = r1.zza
            r9.<init>(r0, r1, r2)
            com.google.android.gms.internal.ads.zzql r0 = r7.zzq
            if (r0 == 0) goto L56
            r0.zzb(r9)
        L56:
            boolean r0 = r9.zzb
            if (r0 == 0) goto L64
            android.content.Context r0 = r7.zzd
            if (r0 != 0) goto L5f
            goto L64
        L5f:
            com.google.android.gms.internal.ads.zzpj r8 = com.google.android.gms.internal.ads.zzpj.zza
            r7.zzv = r8
            throw r9
        L64:
            r8.zzb(r9)
            return
        L68:
            r8.zza()
            android.media.AudioTrack r8 = r7.zzu
            boolean r8 = zzaa(r8)
            if (r8 == 0) goto L87
            long r5 = r7.zzG
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 <= 0) goto L7b
            r7.zzY = r1
        L7b:
            boolean r8 = r7.zzS
            if (r8 == 0) goto L87
            com.google.android.gms.internal.ads.zzql r8 = r7.zzq
            if (r8 == 0) goto L87
            if (r0 >= r9) goto L87
            com.google.android.gms.internal.ads.zzrs r8 = (com.google.android.gms.internal.ads.zzrs) r8
        L87:
            com.google.android.gms.internal.ads.zzrd r8 = r7.zzs
            int r8 = r8.zzc
            if (r8 != 0) goto L93
            long r3 = r7.zzF
            long r5 = (long) r0
            long r3 = r3 + r5
            r7.zzF = r3
        L93:
            if (r0 != r9) goto Lb1
            if (r8 == 0) goto Lae
            java.nio.ByteBuffer r8 = r7.zzO
            java.nio.ByteBuffer r9 = r7.zzM
            if (r8 != r9) goto L9e
            goto L9f
        L9e:
            r2 = r1
        L9f:
            com.google.android.gms.internal.ads.zzdd.zzf(r2)
            long r8 = r7.zzG
            int r0 = r7.zzH
            long r0 = (long) r0
            int r2 = r7.zzN
            long r2 = (long) r2
            long r0 = r0 * r2
            long r0 = r0 + r8
            r7.zzG = r0
        Lae:
            r8 = 0
            r7.zzO = r8
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzro.zzP(long):void");
    }

    private final void zzQ() {
        if (this.zzs.zzc == 1) {
            this.zzX = true;
        }
    }

    private final void zzR() {
        Context context;
        if (this.zzw == null && (context = this.zzd) != null) {
            this.zzZ = Looper.myLooper();
            zzpo zzpoVar = new zzpo(context, new zzqy(this), this.zzy, this.zzV);
            this.zzw = zzpoVar;
            this.zzv = zzpoVar.zzc();
        }
        this.zzv.getClass();
    }

    private final void zzS() throws IllegalStateException {
        if (this.zzQ) {
            return;
        }
        this.zzQ = true;
        this.zzj.zzb(zzM());
        if (zzaa(this.zzu)) {
            this.zzR = false;
        }
        this.zzu.stop();
    }

    private final void zzT(long j) throws zzqn {
        zzP(j);
        if (this.zzO != null) {
            return;
        }
        if (!this.zzt.zzh()) {
            ByteBuffer byteBuffer = this.zzM;
            if (byteBuffer != null) {
                zzV(byteBuffer);
                zzP(j);
                return;
            }
            return;
        }
        while (!this.zzt.zzg()) {
            do {
                ByteBuffer byteBufferZzb = this.zzt.zzb();
                if (byteBufferZzb.hasRemaining()) {
                    zzV(byteBufferZzb);
                    zzP(j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzM;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzt.zze(this.zzM);
                    }
                }
            } while (this.zzO == null);
            return;
        }
    }

    private final void zzU(zzbb zzbbVar) {
        zzrf zzrfVar = new zzrf(zzbbVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzZ()) {
            this.zzz = zzrfVar;
        } else {
            this.zzA = zzrfVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzV(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzro.zzV(java.nio.ByteBuffer):void");
    }

    private final void zzW() {
        if (zzZ()) {
            this.zzu.setVolume(this.zzL);
        }
    }

    private final void zzX() {
        zzck zzckVar = this.zzs.zzi;
        this.zzt = zzckVar;
        zzckVar.zzc();
    }

    private final boolean zzY() throws zzqn {
        if (!this.zzt.zzh()) {
            zzP(Long.MIN_VALUE);
            return this.zzO == null;
        }
        this.zzt.zzd();
        zzT(Long.MIN_VALUE);
        if (!this.zzt.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzO;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private final boolean zzZ() {
        return this.zzu != null;
    }

    private static boolean zzaa(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzab() {
        zzrd zzrdVar = this.zzs;
        if (zzrdVar.zzc != 0) {
            return false;
        }
        int i10 = zzrdVar.zza.zzI;
        return true;
    }

    private static final AudioTrack zzac(zzqi zzqiVar, zze zzeVar, int i10, zzz zzzVar, Context context) throws UnsupportedOperationException, zzqk, IllegalArgumentException {
        zzz zzzVar2;
        Exception exc;
        try {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzeVar.zza().zza).setAudioFormat(zzex.zzx(zzqiVar.zzb, zzqiVar.zzc, zzqiVar.zza)).setTransferMode(1).setBufferSizeInBytes(zzqiVar.zze).setSessionId(i10);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                try {
                    sessionId.setOffloadedPlayback(zzqiVar.zzd);
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    exc = e;
                    zzzVar2 = zzzVar;
                    throw new zzqk(0, zzqiVar.zzb, zzqiVar.zzc, zzqiVar.zza, zzqiVar.zze, zzzVar2, zzqiVar.zzd, exc);
                } catch (UnsupportedOperationException e11) {
                    e = e11;
                    exc = e;
                    zzzVar2 = zzzVar;
                    throw new zzqk(0, zzqiVar.zzb, zzqiVar.zzc, zzqiVar.zza, zzqiVar.zze, zzzVar2, zzqiVar.zzd, exc);
                }
            }
            if (i11 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            int state = audioTrackBuild.getState();
            if (state == 1) {
                return audioTrackBuild;
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new zzqk(state, zzqiVar.zzb, zzqiVar.zzc, zzqiVar.zza, zzqiVar.zze, zzzVar, zzqiVar.zzd, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e12) {
            zzzVar2 = zzzVar;
            exc = e12;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final boolean zzA(zzz zzzVar) {
        return zza(zzzVar) != 0;
    }

    public final void zzJ(zzpj zzpjVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zzZ;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(m1.k("Current looper (", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null", ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
        }
        zzpj zzpjVar2 = this.zzv;
        if (zzpjVar2 == null || zzpjVar.equals(zzpjVar2)) {
            return;
        }
        this.zzv = zzpjVar;
        zzql zzqlVar = this.zzq;
        if (zzqlVar != null) {
            ((zzrs) zzqlVar).zza.zzB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final int zza(zzz zzzVar) {
        zzR();
        if (!"audio/raw".equals(zzzVar.zzo)) {
            return this.zzv.zzb(zzzVar, this.zzy) != null ? 2 : 0;
        }
        int i10 = zzzVar.zzI;
        if (zzex.zzK(i10)) {
            return i10 != 2 ? 1 : 2;
        }
        m6.a.n(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final long zzb(boolean z2) {
        ArrayDeque arrayDeque;
        long j;
        if (!zzZ() || this.zzJ) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzj.zza(), zzex.zzt(zzM(), this.zzs.zze));
        while (true) {
            arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || jMin < ((zzrf) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzA = (zzrf) arrayDeque.remove();
        }
        zzrf zzrfVar = this.zzA;
        long j4 = jMin - zzrfVar.zzc;
        long jZzq = zzex.zzq(j4, zzrfVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long jZza = this.zzae.zza(j4);
            zzrf zzrfVar2 = this.zzA;
            j = zzrfVar2.zzb + jZza;
            zzrfVar2.zzd = jZza - jZzq;
        } else {
            zzrf zzrfVar3 = this.zzA;
            j = zzrfVar3.zzb + jZzq + zzrfVar3.zzd;
        }
        long jZzb = this.zzae.zzb();
        long jZzt = zzex.zzt(jZzb, this.zzs.zze) + j;
        long j10 = this.zzaa;
        if (jZzb > j10) {
            long jZzt2 = zzex.zzt(jZzb - j10, this.zzs.zze);
            this.zzaa = jZzb;
            this.zzab += jZzt2;
            if (this.zzac == null) {
                this.zzac = new Handler(Looper.myLooper());
            }
            this.zzac.removeCallbacksAndMessages(null);
            this.zzac.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqw
                @Override // java.lang.Runnable
                public final void run() {
                    zzro.zzG(this.zza);
                }
            }, 100L);
        }
        return jZzt;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final zzbb zzc() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final zzps zzd(zzz zzzVar) {
        return this.zzX ? zzps.zza : this.zzaf.zza(zzzVar, this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zze(zzz zzzVar, int i10, int[] iArr) throws zzqj {
        zzck zzckVar;
        int i11;
        int i12;
        int iZzk;
        int iIntValue;
        int i13;
        int i14;
        zzR();
        if ("audio/raw".equals(zzzVar.zzo)) {
            int i15 = zzzVar.zzI;
            zzdd.zzd(zzex.zzK(i15));
            int i16 = zzzVar.zzG;
            iZzk = zzex.zzk(i15) * i16;
            zzfyc zzfycVar = new zzfyc();
            zzfycVar.zzh(this.zzi);
            zzfycVar.zzf(this.zzg);
            zzfycVar.zzg(this.zzae.zze());
            zzckVar = new zzck(zzfycVar.zzi());
            if (zzckVar.equals(this.zzt)) {
                zzckVar = this.zzt;
            }
            this.zzf.zzq(zzzVar.zzJ, zzzVar.zzK);
            this.zze.zzo(iArr);
            try {
                zzcl zzclVarZza = zzckVar.zza(new zzcl(zzzVar.zzH, i16, i15));
                int i17 = zzclVarZza.zzd;
                i11 = zzclVarZza.zzb;
                int i18 = zzclVarZza.zzc;
                int iZzi = zzex.zzi(i18);
                int iZzk2 = zzex.zzk(i17) * i18;
                i12 = 0;
                iIntValue = iZzi;
                i13 = i17;
                i14 = iZzk2;
            } catch (zzcm e10) {
                throw new zzqj(e10, zzzVar);
            }
        } else {
            zzckVar = new zzck(zzfyf.zzn());
            i11 = zzzVar.zzH;
            zzps zzpsVar = zzps.zza;
            Pair pairZzb = this.zzv.zzb(zzzVar, this.zzy);
            if (pairZzb == null) {
                throw new zzqj("Unable to configure passthrough for: ".concat(String.valueOf(zzzVar)), zzzVar);
            }
            int iIntValue2 = ((Integer) pairZzb.first).intValue();
            i12 = 2;
            iZzk = -1;
            iIntValue = ((Integer) pairZzb.second).intValue();
            i13 = iIntValue2;
            i14 = -1;
        }
        int i19 = i11;
        if (i13 == 0) {
            throw new zzqj("Invalid output encoding (mode=" + i12 + ") for: " + String.valueOf(zzzVar), zzzVar);
        }
        if (iIntValue == 0) {
            throw new zzqj("Invalid output channel config (mode=" + i12 + ") for: " + String.valueOf(zzzVar), zzzVar);
        }
        int i20 = zzzVar.zzj;
        if ("audio/vnd.dts.hd;profile=lbr".equals(zzzVar.zzo) && i20 == -1) {
            i20 = 768000;
        }
        int i21 = i20;
        int minBufferSize = AudioTrack.getMinBufferSize(i19, iIntValue, i13);
        zzdd.zzf(minBufferSize != -2);
        int i22 = i14 != -1 ? i14 : 1;
        int i23 = i13;
        int iZzb = zzrq.zzb(minBufferSize, i23, i12, i22, i19, i21);
        int i24 = i22;
        this.zzX = false;
        zzrd zzrdVar = new zzrd(zzzVar, iZzk, i12, i14, i19, iIntValue, i23, (((Math.max(minBufferSize, iZzb) + i24) - 1) / i24) * i24, zzckVar, false, false, false);
        if (zzZ()) {
            this.zzr = zzrdVar;
        } else {
            this.zzs = zzrdVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzf() throws IllegalStateException {
        if (zzZ()) {
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzY = false;
            this.zzH = 0;
            this.zzA = new zzrf(this.zzB, 0L, 0L, null);
            this.zzK = 0L;
            this.zzz = null;
            this.zzk.clear();
            this.zzM = null;
            this.zzN = 0;
            this.zzO = null;
            this.zzQ = false;
            this.zzP = false;
            this.zzR = false;
            this.zzf.zzp();
            zzX();
            zzqs zzqsVar = this.zzj;
            if (zzqsVar.zzh()) {
                this.zzu.pause();
            }
            if (zzaa(this.zzu)) {
                zzrm zzrmVar = this.zzl;
                zzrmVar.getClass();
                zzrmVar.zzb(this.zzu);
            }
            final zzqi zzqiVarZza = this.zzs.zza();
            zzrd zzrdVar = this.zzr;
            if (zzrdVar != null) {
                this.zzs = zzrdVar;
                this.zzr = null;
            }
            zzqsVar.zzc();
            zzrh zzrhVar = this.zzx;
            if (zzrhVar != null) {
                zzrhVar.zzb();
                this.zzx = null;
            }
            final AudioTrack audioTrack = this.zzu;
            final zzql zzqlVar = this.zzq;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                try {
                    if (zzb == null) {
                        String str = zzex.zza;
                        final String str2 = "ExoPlayer:AudioTrackReleaseThread";
                        zzb = Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.zzew
                            public final /* synthetic */ String zza = "ExoPlayer:AudioTrackReleaseThread";

                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(Runnable runnable) {
                                String str3 = zzex.zza;
                                return new Thread(runnable, this.zza);
                            }
                        });
                    }
                    zzc++;
                    zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqv
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzro.zzI(audioTrack, zzqlVar, handler, zzqiVarZza);
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.zzu = null;
        }
        this.zzn.zza();
        this.zzm.zza();
        this.zzaa = 0L;
        this.zzab = 0L;
        Handler handler2 = this.zzac;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzg() {
        this.zzI = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzh() throws IllegalStateException {
        this.zzS = false;
        if (zzZ()) {
            if (this.zzj.zzk() || zzaa(this.zzu)) {
                this.zzu.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzi() throws IllegalStateException {
        this.zzS = true;
        if (zzZ()) {
            this.zzj.zzf();
            this.zzu.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzj() throws IllegalStateException {
        if (!this.zzP && zzZ() && zzY()) {
            zzS();
            this.zzP = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzk() {
        zzpo zzpoVar = this.zzw;
        if (zzpoVar != null) {
            zzpoVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzl() throws IllegalStateException {
        zzf();
        zzfyf zzfyfVar = this.zzi;
        int size = zzfyfVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzcn) zzfyfVar.get(i10)).zzf();
        }
        this.zzg.zzf();
        this.zzh.zzf();
        zzck zzckVar = this.zzt;
        if (zzckVar != null) {
            zzckVar.zzf();
        }
        this.zzS = false;
        this.zzX = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzm(zze zzeVar) throws IllegalStateException {
        if (this.zzy.equals(zzeVar)) {
            return;
        }
        this.zzy = zzeVar;
        zzpo zzpoVar = this.zzw;
        if (zzpoVar != null) {
            zzpoVar.zzg(zzeVar);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzn(int i10) throws IllegalStateException {
        if (this.zzT != i10) {
            this.zzT = i10;
            zzf();
            zzql zzqlVar = this.zzq;
            if (zzqlVar != null) {
                zzqlVar.zza(i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzo(zzf zzfVar) {
        if (this.zzU.equals(zzfVar)) {
            return;
        }
        if (this.zzu != null) {
            int i10 = this.zzU.zza;
        }
        this.zzU = zzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzp(zzdj zzdjVar) {
        this.zzj.zze(zzdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzq(zzql zzqlVar) {
        this.zzq = zzqlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzr(int i10, int i11) {
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzaa(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzs(zzbb zzbbVar) {
        float f10 = zzbbVar.zzb;
        String str = zzex.zza;
        this.zzB = new zzbb(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(zzbbVar.zzc, 8.0f)));
        zzU(zzbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzt(zzph zzphVar) {
        this.zzp = zzphVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzu(AudioDeviceInfo audioDeviceInfo) {
        this.zzV = audioDeviceInfo == null ? null : new zzpp(audioDeviceInfo);
        zzpo zzpoVar = this.zzw;
        if (zzpoVar != null) {
            zzpoVar.zzh(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzqz.zza(audioTrack, this.zzV);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzv(boolean z2) {
        this.zzC = z2;
        zzU(this.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzw(float f10) {
        if (this.zzL != f10) {
            this.zzL = f10;
            zzW();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0195  */
    @Override // com.google.android.gms.internal.ads.zzqo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzx(java.nio.ByteBuffer r31, long r32, int r34) throws java.lang.IllegalStateException, com.google.android.gms.internal.ads.zzqn, com.google.android.gms.internal.ads.zzqk {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzro.zzx(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final boolean zzy() {
        if (zzZ()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.zzu.isOffloadedPlayback() && this.zzR) && this.zzj.zzg(zzM());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final boolean zzz() {
        if (zzZ()) {
            return this.zzP && !zzy();
        }
        return true;
    }
}
