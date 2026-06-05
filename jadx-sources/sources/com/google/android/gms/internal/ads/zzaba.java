package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaba extends zztp implements zzabq {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private int zzC;
    private zzmh zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private long zzH;
    private zzcd zzI;
    private zzcd zzJ;
    private int zzK;
    private int zzL;
    private zzabo zzM;
    private long zzN;
    private long zzO;
    private boolean zzP;
    private boolean zzQ;
    private int zzR;
    private final Context zze;
    private final boolean zzf;
    private final zzach zzg;
    private final boolean zzh;
    private final zzabr zzi;
    private final zzabp zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzaaz zzm;
    private boolean zzn;
    private boolean zzo;
    private zzacn zzp;
    private boolean zzq;
    private int zzr;
    private List zzs;
    private Surface zzt;
    private zzabd zzu;
    private zzeo zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    public zzaba(zzaay zzaayVar) {
        super(2, zzaayVar.zzd, zzaayVar.zzc, false, 30.0f);
        Context applicationContext = zzaayVar.zza.getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        this.zzg = new zzach(zzaayVar.zze, zzaayVar.zzf);
        this.zzf = this.zzp == null;
        this.zzi = new zzabr(applicationContext, this, 0L);
        this.zzj = new zzabp();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzv = zzeo.zza;
        this.zzx = 1;
        this.zzy = 0;
        this.zzI = zzcd.zza;
        this.zzL = 0;
        this.zzJ = null;
        this.zzK = -1000;
        this.zzN = -9223372036854775807L;
        this.zzO = -9223372036854775807L;
        this.zzl = new PriorityQueue();
        this.zzk = -9223372036854775807L;
        this.zzD = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bc, code lost:
    
        if (r3.equals("video/av01") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        if (r3.equals("video/3gpp") != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzad(com.google.android.gms.internal.ads.zzti r8, com.google.android.gms.internal.ads.zzz r9) {
        /*
            int r0 = r9.zzv
            int r1 = r9.zzw
            r2 = -1
            if (r0 == r2) goto Lcc
            if (r1 != r2) goto Lb
            goto Lcc
        Lb:
            java.lang.String r3 = r9.zzo
            r3.getClass()
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/av01"
            java.lang.String r7 = "video/hevc"
            if (r4 == 0) goto L42
            int r3 = com.google.android.gms.internal.ads.zzuc.zza
            android.util.Pair r9 = com.google.android.gms.internal.ads.zzdk.zza(r9)
            if (r9 == 0) goto L41
            java.lang.Object r9 = r9.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r9 == r3) goto L3f
            r3 = 1
            if (r9 == r3) goto L3f
            r3 = 2
            if (r9 != r3) goto L39
            goto L3f
        L39:
            r3 = 1024(0x400, float:1.435E-42)
            if (r9 != r3) goto L41
            r3 = r6
            goto L42
        L3f:
            r3 = r5
            goto L42
        L41:
            r3 = r7
        L42:
            int r9 = r3.hashCode()
            r4 = 4
            switch(r9) {
                case -1664118616: goto Lbf;
                case -1662735862: goto Lb8;
                case -1662541442: goto La7;
                case 1187890754: goto L9e;
                case 1331836730: goto L61;
                case 1599127256: goto L58;
                case 1599127257: goto L4c;
                default: goto L4a;
            }
        L4a:
            goto Lcc
        L4c:
            java.lang.String r8 = "video/x-vnd.on2.vp9"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
            r4 = 8
            goto Lc7
        L58:
            java.lang.String r8 = "video/x-vnd.on2.vp8"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
            goto Lc7
        L61:
            boolean r9 = r3.equals(r5)
            if (r9 == 0) goto Lcc
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto Lcc
            java.lang.String r3 = "Amazon"
            java.lang.String r5 = android.os.Build.MANUFACTURER
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8f
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto Lcc
            java.lang.String r3 = "AFTS"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L8f
            boolean r8 = r8.zzf
            if (r8 != 0) goto Lcc
        L8f:
            java.lang.String r8 = com.google.android.gms.internal.ads.zzex.zza
            int r0 = r0 + 15
            int r1 = r1 + 15
            int r0 = r0 / 16
            int r1 = r1 / 16
            int r1 = r1 * r0
            int r1 = r1 * 768
            int r1 = r1 / r4
            return r1
        L9e:
            java.lang.String r8 = "video/mp4v-es"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
            goto Lc7
        La7:
            boolean r8 = r3.equals(r7)
            if (r8 == 0) goto Lcc
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            r8 = 2097152(0x200000, float:2.938736E-39)
            int r8 = java.lang.Math.max(r8, r0)
            return r8
        Lb8:
            boolean r8 = r3.equals(r6)
            if (r8 == 0) goto Lcc
            goto Lc7
        Lbf:
            java.lang.String r8 = "video/3gpp"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
        Lc7:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            return r0
        Lcc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaba.zzad(com.google.android.gms.internal.ads.zzti, com.google.android.gms.internal.ads.zzz):int");
    }

    public static int zzae(zzti zztiVar, zzz zzzVar) {
        int i10 = zzzVar.zzp;
        if (i10 == -1) {
            return zzad(zztiVar, zzzVar);
        }
        List list = zzzVar.zzr;
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return i10 + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean zzba(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaba.zzba(java.lang.String):boolean");
    }

    public static final boolean zzbb(zzti zztiVar) {
        return Build.VERSION.SDK_INT >= 35 && zztiVar.zzh;
    }

    private final Surface zzbc(zzti zztiVar) {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            return zzacnVar.zzb();
        }
        Surface surface = this.zzt;
        if (surface != null) {
            return surface;
        }
        if (zzbb(zztiVar)) {
            return null;
        }
        zzdd.zzf(zzaZ(zztiVar));
        zzabd zzabdVar = this.zzu;
        if (zzabdVar != null) {
            if (zzabdVar.zza != zztiVar.zzf) {
                zzbh();
            }
        }
        if (this.zzu == null) {
            this.zzu = zzabd.zza(this.zze, zztiVar.zzf);
        }
        return this.zzu;
    }

    private static List zzbd(Context context, zztr zztrVar, zzz zzzVar, boolean z2, boolean z10) {
        String str = zzzVar.zzo;
        if (str == null) {
            return zzfyf.zzn();
        }
        if ("video/dolby-vision".equals(str) && !zzaax.zza(context)) {
            List listZzc = zzuc.zzc(zztrVar, zzzVar, z2, z10);
            if (!listZzc.isEmpty()) {
                return listZzc;
            }
        }
        return zzuc.zze(zztrVar, zzzVar, z2, z10);
    }

    private final void zzbe() {
        zzcd zzcdVar = this.zzJ;
        if (zzcdVar != null) {
            this.zzg.zzt(zzcdVar);
        }
    }

    private final void zzbf(long j, long j4, zzz zzzVar) {
        zzabo zzaboVar = this.zzM;
        if (zzaboVar != null) {
            zzaboVar.zzcT(j, j4, zzzVar, zzay());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbg() {
        this.zzg.zzq(this.zzt);
        this.zzw = true;
    }

    private final void zzbh() {
        zzabd zzabdVar = this.zzu;
        if (zzabdVar != null) {
            zzabdVar.release();
            this.zzu = null;
        }
    }

    private final void zzbi(Object obj) throws Throwable {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzt == surface) {
            if (surface != null) {
                zzbe();
                Surface surface2 = this.zzt;
                if (surface2 == null || !this.zzw) {
                    return;
                }
                this.zzg.zzq(surface2);
                return;
            }
            return;
        }
        this.zzt = surface;
        if (this.zzp == null) {
            this.zzi.zzk(surface);
        }
        this.zzw = false;
        int iZzcU = zzcU();
        zztf zztfVarZzaB = zzaB();
        if (zztfVarZzaB != null && this.zzp == null) {
            zzti zztiVarZzaD = zzaD();
            zztiVarZzaD.getClass();
            if (!zzbj(zztiVarZzaD) || this.zzn) {
                zzaI();
                zzaF();
            } else {
                Surface surfaceZzbc = zzbc(zztiVarZzaD);
                if (surfaceZzbc != null) {
                    zztfVarZzaB.zzp(surfaceZzbc);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zztfVarZzaB.zzi();
                }
            }
        }
        if (surface != null) {
            zzbe();
        } else {
            this.zzJ = null;
            zzacn zzacnVar = this.zzp;
            if (zzacnVar != null) {
                zzacnVar.zzi();
            }
        }
        if (iZzcU == 2) {
            zzacn zzacnVar2 = this.zzp;
            if (zzacnVar2 != null) {
                zzacnVar2.zzk(true);
            } else {
                this.zzi.zzc(true);
            }
        }
    }

    private final boolean zzbj(zzti zztiVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzt;
        return (surface != null && surface.isValid()) || zzbb(zztiVar) || zzaZ(zztiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzA() {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar == null || !this.zzf) {
            return;
        }
        zzacnVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzC() {
        try {
            super.zzC();
        } finally {
            this.zzq = false;
            this.zzN = -9223372036854775807L;
            zzbh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzD() {
        this.zzA = 0;
        this.zzz = zzi().zzb();
        this.zzF = 0L;
        this.zzG = 0;
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzx();
        } else {
            this.zzi.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzE() {
        if (this.zzA > 0) {
            long jZzb = zzi().zzb();
            this.zzg.zzn(this.zzA, jZzb - this.zzz);
            this.zzA = 0;
            this.zzz = jZzb;
        }
        int i10 = this.zzG;
        if (i10 != 0) {
            this.zzg.zzr(this.zzF, i10);
            this.zzF = 0L;
            this.zzG = 0;
        }
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzy();
        } else {
            this.zzi.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzF(zzz[] zzzVarArr, long j, long j4, zzvh zzvhVar) {
        super.zzF(zzzVarArr, j, j4, zzvhVar);
        zzbl zzblVarZzh = zzh();
        if (zzblVarZzh.zzo()) {
            this.zzO = -9223372036854775807L;
        } else {
            this.zzO = zzblVarZzh.zzn(zzvhVar.zza, new zzbj()).zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzma
    public final void zzM(float f10, float f11) throws Throwable {
        super.zzM(f10, f11);
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzt(f10);
        } else {
            this.zzi.zzl(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma, com.google.android.gms.internal.ads.zzmd
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzma
    public final void zzV(long j, long j4) throws Throwable {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            try {
                zzacnVar.zzo(j, j4);
            } catch (zzacm e10) {
                throw zzcX(e10, e10.zza, false, 7001);
            }
        }
        super.zzV(j, j4);
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzma
    public final boolean zzW() {
        if (!super.zzW()) {
            return false;
        }
        zzacn zzacnVar = this.zzp;
        return zzacnVar == null || zzacnVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzma
    public final boolean zzX() {
        boolean zZzX = super.zzX();
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            return zzacnVar.zzD(zZzX);
        }
        if (zZzX && zzaB() == null) {
            return true;
        }
        return this.zzi.zzm(zZzX);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final float zzZ(float f10, zzz zzzVar, zzz[] zzzVarArr) {
        zzti zztiVarZzaD;
        float fMax = -1.0f;
        for (zzz zzzVar2 : zzzVarArr) {
            float f11 = zzzVar2.zzz;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f10;
        if (this.zzD == null || (zztiVarZzaD = zzaD()) == null) {
            return f12;
        }
        float fZza = zztiVarZzaD.zza(zzzVar.zzv, zzzVar.zzw);
        return f12 != -1.0f ? Math.max(f12, fZza) : fZza;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final zzth zzaC(Throwable th2, zzti zztiVar) {
        return new zzaau(th2, zztiVar, this.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzaG(long j) {
        super.zzaG(j);
        this.zzC--;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzaH(zzhs zzhsVar) {
        this.zzR = 0;
        this.zzC++;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzaJ() {
        super.zzaJ();
        this.zzl.clear();
        this.zzQ = false;
        this.zzC = 0;
        this.zzR = 0;
        this.zzE = false;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzaP(zzz zzzVar) throws zzin {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar == null || zzacnVar.zzC()) {
            return true;
        }
        try {
            zzacnVar.zzA(zzzVar);
            return true;
        } catch (zzacm e10) {
            throw zzcX(e10, zzzVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzaQ(zzhs zzhsVar) {
        if (!zzQ() && !zzhsVar.zzh() && this.zzO != -9223372036854775807L) {
            if (this.zzO - (zzhsVar.zze - zzaw()) > 100000) {
                boolean z2 = zzhsVar.zze < zzf();
                if ((z2 || this.zzQ) && !zzhsVar.zze() && zzhsVar.zzi()) {
                    zzhsVar.zzb();
                    if (z2) {
                        ((zztp) this).zza.zzd++;
                    } else if (this.zzQ) {
                        this.zzl.add(Long.valueOf(zzhsVar.zze));
                        this.zzR++;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzaR() {
        return this.zzD == null || this.zzE || zzaM() || zzav() != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzaS(zzti zztiVar) {
        return zzbj(zztiVar);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzaT() {
        zzti zztiVarZzaD = zzaD();
        if (this.zzp != null && zztiVarZzaD != null) {
            String str = zztiVarZzaD.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaT();
    }

    public final void zzaW(int i10, int i11) {
        zzid zzidVar = ((zztp) this).zza;
        zzidVar.zzh += i10;
        int i12 = i10 + i11;
        zzidVar.zzg += i12;
        this.zzA += i12;
        int i13 = this.zzB + i12;
        this.zzB = i13;
        zzidVar.zzi = Math.max(i13, zzidVar.zzi);
    }

    public final void zzaX(long j) {
        zzid zzidVar = ((zztp) this).zza;
        zzidVar.zzk += j;
        zzidVar.zzl++;
        this.zzF += j;
        this.zzG++;
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final boolean zzaY(long j, long j4, long j10, boolean z2, boolean z10) throws Throwable {
        int iZzd;
        if (this.zzp != null && this.zzf) {
            j4 -= -this.zzN;
        }
        long j11 = this.zzk;
        if (j11 != -9223372036854775807L) {
            this.zzQ = j4 > zzf() + 200000 && j < j11;
        }
        if (j >= -500000 || z2 || (iZzd = zzd(j4)) == 0) {
            return false;
        }
        if (z10) {
            zzid zzidVar = ((zztp) this).zza;
            int i10 = zzidVar.zzd + iZzd;
            zzidVar.zzd = i10;
            zzidVar.zzf += this.zzC;
            zzidVar.zzd = this.zzl.size() + i10;
        } else {
            ((zztp) this).zza.zzj++;
            zzaW(this.zzl.size() + iZzd, this.zzC);
        }
        zzaL();
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzj(false);
        }
        return true;
    }

    public final boolean zzaZ(zzti zztiVar) {
        if (zzba(zztiVar.zza)) {
            return false;
        }
        return !zztiVar.zzf || zzabd.zzb(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final int zzaa(zztr zztrVar, zzz zzzVar) {
        boolean z2;
        String str = zzzVar.zzo;
        if (!zzay.zzj(str)) {
            return 128;
        }
        Context context = this.zze;
        int i10 = 0;
        boolean z10 = zzzVar.zzs != null;
        List listZzbd = zzbd(context, zztrVar, zzzVar, z10, false);
        if (z10 && listZzbd.isEmpty()) {
            listZzbd = zzbd(context, zztrVar, zzzVar, false, false);
        }
        if (listZzbd.isEmpty()) {
            return 129;
        }
        if (!zztp.zzaU(zzzVar)) {
            return 130;
        }
        zzti zztiVar = (zzti) listZzbd.get(0);
        boolean zZzf = zztiVar.zzf(zzzVar);
        if (zZzf) {
            z2 = true;
        } else {
            for (int i11 = 1; i11 < listZzbd.size(); i11++) {
                zzti zztiVar2 = (zzti) listZzbd.get(i11);
                if (zztiVar2.zzf(zzzVar)) {
                    zZzf = true;
                    z2 = false;
                    zztiVar = zztiVar2;
                    break;
                }
            }
            z2 = true;
        }
        int i12 = true != zZzf ? 3 : 4;
        int i13 = true != zztiVar.zzg(zzzVar) ? 8 : 16;
        int i14 = true != zztiVar.zzg ? 0 : 64;
        int i15 = true != z2 ? 0 : 128;
        if ("video/dolby-vision".equals(str) && !zzaax.zza(context)) {
            i15 = 256;
        }
        if (zZzf) {
            List listZzbd2 = zzbd(context, zztrVar, zzzVar, z10, true);
            if (!listZzbd2.isEmpty()) {
                zzti zztiVar3 = (zzti) zzuc.zzf(listZzbd2, zzzVar).get(0);
                if (zztiVar3.zzf(zzzVar) && zztiVar3.zzg(zzzVar)) {
                    i10 = 32;
                }
            }
        }
        return i12 | i13 | i10 | i14 | i15;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final zzie zzab(zzti zztiVar, zzz zzzVar, zzz zzzVar2) {
        int i10;
        int i11;
        zzie zzieVarZzc = zztiVar.zzc(zzzVar, zzzVar2);
        int i12 = zzieVarZzc.zze;
        zzaaz zzaazVar = this.zzm;
        zzaazVar.getClass();
        if (zzzVar2.zzv > zzaazVar.zza || zzzVar2.zzw > zzaazVar.zzb) {
            i12 |= 256;
        }
        if (zzae(zztiVar, zzzVar2) > zzaazVar.zzc) {
            i12 |= 64;
        }
        String str = zztiVar.zza;
        if (i12 != 0) {
            i11 = 0;
            i10 = i12;
        } else {
            i10 = 0;
            i11 = zzieVarZzc.zzd;
        }
        return new zzie(str, zzzVar, zzzVar2, i11, i10);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final zzie zzac(zzkv zzkvVar) {
        zzie zzieVarZzac = super.zzac(zzkvVar);
        zzz zzzVar = zzkvVar.zza;
        zzzVar.getClass();
        this.zzg.zzp(zzzVar, zzieVarZzac);
        return zzieVarZzac;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final zztc zzag(zzti zztiVar, zzz zzzVar, MediaCrypto mediaCrypto, float f10) {
        zzaaz zzaazVar;
        Point pointZzb;
        int i10;
        int i11;
        int i12;
        boolean z2;
        zzz[] zzzVarArr;
        char c6;
        boolean z10;
        int iZzad;
        zzz[] zzzVarArrZzT = zzT();
        int length = zzzVarArrZzT.length;
        int iZzae = zzae(zztiVar, zzzVar);
        int i13 = zzzVar.zzw;
        int i14 = zzzVar.zzv;
        if (length == 1) {
            if (iZzae != -1 && (iZzad = zzad(zztiVar, zzzVar)) != -1) {
                iZzae = Math.min((int) (iZzae * 1.5f), iZzad);
            }
            zzaazVar = new zzaaz(i14, i13, iZzae);
        } else {
            int iMax = i13;
            int iMax2 = i14;
            int i15 = 0;
            boolean z11 = false;
            while (i15 < length) {
                zzz zzzVarZzan = zzzVarArrZzT[i15];
                zzk zzkVar = zzzVar.zzE;
                if (zzkVar != null && zzzVarZzan.zzE == null) {
                    zzx zzxVarZzb = zzzVarZzan.zzb();
                    zzxVarZzb.zzF(zzkVar);
                    zzzVarZzan = zzxVarZzb.zzan();
                }
                if (zztiVar.zzc(zzzVar, zzzVarZzan).zzd != 0) {
                    int i16 = zzzVarZzan.zzv;
                    c6 = '\uffff';
                    if (i16 != -1) {
                        zzzVarArr = zzzVarArrZzT;
                        if (zzzVarZzan.zzw != -1) {
                            z10 = false;
                        }
                        z11 |= z10;
                        iMax2 = Math.max(iMax2, i16);
                        iMax = Math.max(iMax, zzzVarZzan.zzw);
                        iZzae = Math.max(iZzae, zzae(zztiVar, zzzVarZzan));
                    } else {
                        zzzVarArr = zzzVarArrZzT;
                    }
                    z10 = true;
                    z11 |= z10;
                    iMax2 = Math.max(iMax2, i16);
                    iMax = Math.max(iMax, zzzVarZzan.zzw);
                    iZzae = Math.max(iZzae, zzae(zztiVar, zzzVarZzan));
                } else {
                    zzzVarArr = zzzVarArrZzT;
                    c6 = '\uffff';
                }
                i15++;
                zzzVarArrZzT = zzzVarArr;
            }
            if (z11) {
                zzea.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax2 + "x" + iMax);
                boolean z12 = i13 > i14;
                int i17 = z12 ? i13 : i14;
                int i18 = true != z12 ? i13 : i14;
                int[] iArr = zzb;
                int i19 = 0;
                while (i19 < 9) {
                    float f11 = i18;
                    float f12 = i17;
                    int i20 = iArr[i19];
                    int i21 = i19;
                    float f13 = i20;
                    if (i20 <= i17 || (i10 = (int) (f13 * (f11 / f12))) <= i18) {
                        break;
                    }
                    int i22 = i17;
                    if (true != z12) {
                        i11 = i18;
                        i12 = i20;
                    } else {
                        i11 = i18;
                        i12 = i10;
                    }
                    if (true != z12) {
                        i20 = i10;
                    }
                    pointZzb = zztiVar.zzb(i12, i20);
                    float f14 = zzzVar.zzz;
                    if (pointZzb != null) {
                        z2 = z12;
                        if (zztiVar.zzh(pointZzb.x, pointZzb.y, f14)) {
                            break;
                        }
                    } else {
                        z2 = z12;
                    }
                    i19 = i21 + 1;
                    i17 = i22;
                    i18 = i11;
                    z12 = z2;
                }
                pointZzb = null;
                if (pointZzb != null) {
                    iMax2 = Math.max(iMax2, pointZzb.x);
                    iMax = Math.max(iMax, pointZzb.y);
                    zzx zzxVarZzb2 = zzzVar.zzb();
                    zzxVarZzb2.zzam(iMax2);
                    zzxVarZzb2.zzQ(iMax);
                    iZzae = Math.max(iZzae, zzad(zztiVar, zzxVarZzb2.zzan()));
                    zzea.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax2 + "x" + iMax);
                }
            }
            zzaazVar = new zzaaz(iMax2, iMax, iZzae);
        }
        String str = zztiVar.zzc;
        this.zzm = zzaazVar;
        boolean z13 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i14);
        mediaFormat.setInteger("height", i13);
        zzed.zzb(mediaFormat, zzzVar.zzr);
        float f15 = zzzVar.zzz;
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        zzed.zza(mediaFormat, "rotation-degrees", zzzVar.zzA);
        zzk zzkVar2 = zzzVar.zzE;
        if (zzkVar2 != null) {
            zzed.zza(mediaFormat, "color-transfer", zzkVar2.zzd);
            zzed.zza(mediaFormat, "color-standard", zzkVar2.zzb);
            zzed.zza(mediaFormat, "color-range", zzkVar2.zzc);
            byte[] bArr = zzkVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzzVar.zzo)) {
            int i23 = zzuc.zza;
            Pair pairZza = zzdk.zza(zzzVar);
            if (pairZza != null) {
                zzed.zza(mediaFormat, "profile", ((Integer) pairZza.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzaazVar.zza);
        mediaFormat.setInteger("max-height", zzaazVar.zzb);
        zzed.zza(mediaFormat, "max-input-size", zzaazVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (z13) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzK));
        }
        Surface surfaceZzbc = zzbc(zztiVar);
        if (this.zzp != null && !zzex.zzL(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zztc.zzb(zztiVar, mediaFormat, zzzVar, surfaceZzbc, null);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final List zzah(zztr zztrVar, zzz zzzVar, boolean z2) {
        return zzuc.zzf(zzbd(this.zze, zztrVar, zzzVar, false, false), zzzVar);
    }

    public final void zzaj(zztf zztfVar, int i10, long j, long j4) {
        Trace.beginSection("releaseOutputBuffer");
        zztfVar.zzn(i10, j4);
        Trace.endSection();
        ((zztp) this).zza.zze++;
        this.zzB = 0;
        if (this.zzp == null) {
            zzcd zzcdVar = this.zzI;
            if (!zzcdVar.equals(zzcd.zza) && !zzcdVar.equals(this.zzJ)) {
                this.zzJ = zzcdVar;
                this.zzg.zzt(zzcdVar);
            }
            if (!this.zzi.zzn() || this.zzt == null) {
                return;
            }
            zzbg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    @TargetApi(29)
    public final void zzak(zzhs zzhsVar) {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzhsVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zztf zztfVarZzaB = zzaB();
                        zztfVarZzaB.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zztfVarZzaB.zzq(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzal(Exception exc) {
        zzea.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzam(String str, zztc zztcVar, long j, long j4) {
        this.zzg.zzk(str, j, j4);
        this.zzn = zzba(str);
        zzti zztiVarZzaD = zzaD();
        zztiVarZzaD.getClass();
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zztiVarZzaD.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzi = zztiVarZzaD.zzi();
            int length = codecProfileLevelArrZzi.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (codecProfileLevelArrZzi[i10].profile == 16384) {
                    z2 = true;
                    break;
                }
                i10++;
            }
        }
        this.zzo = z2;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzan(String str) {
        this.zzg.zzl(str);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzao(zzz zzzVar, MediaFormat mediaFormat) {
        zztf zztfVarZzaB = zzaB();
        if (zztfVarZzaB != null) {
            zztfVarZzaB.zzr(this.zzx);
        }
        mediaFormat.getClass();
        boolean z2 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z2 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z2 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f10 = zzzVar.zzB;
        int i10 = zzzVar.zzA;
        if (i10 == 90 || i10 == 270) {
            f10 = 1.0f / f10;
            int i11 = integer2;
            integer2 = integer;
            integer = i11;
        }
        this.zzI = new zzcd(integer, integer2, f10);
        zzacn zzacnVar = this.zzp;
        if (zzacnVar == null || !this.zzP) {
            this.zzi.zzj(zzzVar.zzz);
        } else {
            zzx zzxVarZzb = zzzVar.zzb();
            zzxVarZzb.zzam(integer);
            zzxVarZzb.zzQ(integer2);
            zzxVarZzb.zzad(f10);
            zzz zzzVarZzan = zzxVarZzb.zzan();
            int i12 = this.zzr;
            List listZzn = this.zzs;
            if (listZzn == null) {
                listZzn = zzfyf.zzn();
            }
            zzacnVar.zzl(1, zzzVarZzan, zzax(), i12, listZzn);
            this.zzr = 2;
        }
        this.zzP = false;
    }

    public final void zzap(zztf zztfVar, int i10, long j) {
        Trace.beginSection("skipVideoBuffer");
        zztfVar.zzo(i10, false);
        Trace.endSection();
        ((zztp) this).zza.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzaq() {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzw();
            long jZzax = this.zzN;
            if (jZzax == -9223372036854775807L) {
                jZzax = zzax();
                this.zzN = jZzax;
            }
            this.zzp.zzp(-jZzax);
        } else {
            this.zzi.zzf(2);
        }
        this.zzP = true;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzar() {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzas(long j, long j4, zztf zztfVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j10, boolean z2, boolean z10, zzz zzzVar) {
        zzaba zzabaVar;
        long j11;
        zztfVar.getClass();
        long jZzaw = j10 - zzaw();
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzl;
            Long l10 = (Long) priorityQueue.peek();
            if (l10 == null || l10.longValue() >= j10) {
                break;
            }
            priorityQueue.poll();
            i13++;
        }
        zzaW(i13, 0);
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            if (!z2 || z10) {
                return zzacnVar.zzz(j10, new zzaaw(this, zztfVar, i10, jZzaw));
            }
            zzap(zztfVar, i10, jZzaw);
            return true;
        }
        zzabr zzabrVar = this.zzi;
        long jZzax = zzax();
        zzabp zzabpVar = this.zzj;
        int iZza = zzabrVar.zza(j10, j, j4, jZzax, z2, z10, zzabpVar);
        if (iZza == 0) {
            long jZzc = zzi().zzc();
            zzbf(jZzaw, jZzc, zzzVar);
            zzaj(zztfVar, i10, jZzaw, jZzc);
            zzaX(zzabpVar.zzc());
            return true;
        }
        if (iZza != 1) {
            if (iZza != 2) {
                if (iZza != 3) {
                    return false;
                }
                zzap(zztfVar, i10, jZzaw);
                zzaX(zzabpVar.zzc());
                return true;
            }
            Trace.beginSection("dropVideoBuffer");
            zztfVar.zzo(i10, false);
            Trace.endSection();
            zzaW(0, 1);
            zzaX(zzabpVar.zzc());
            return true;
        }
        long jZzd = zzabpVar.zzd();
        long jZzc2 = zzabpVar.zzc();
        if (jZzd == this.zzH) {
            zzap(zztfVar, i10, jZzaw);
            j11 = jZzd;
            zzabaVar = this;
        } else {
            zzbf(jZzaw, jZzd, zzzVar);
            zzaj(zztfVar, i10, jZzaw, jZzd);
            zzabaVar = this;
            j11 = jZzd;
        }
        zzabaVar.zzaX(jZzc2);
        zzabaVar.zzH = j11;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzma
    public final void zzt() {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar == null) {
            this.zzi.zzb();
            return;
        }
        int i10 = this.zzr;
        if (i10 == 0 || i10 == 1) {
            this.zzr = 0;
        } else {
            zzacnVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlv
    public final void zzu(int i10, Object obj) throws Throwable {
        if (i10 == 1) {
            zzbi(obj);
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            zzabo zzaboVar = (zzabo) obj;
            this.zzM = zzaboVar;
            zzacn zzacnVar = this.zzp;
            if (zzacnVar != null) {
                zzacnVar.zzv(zzaboVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzL != iIntValue) {
                this.zzL = iIntValue;
                return;
            }
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzx = iIntValue2;
            zztf zztfVarZzaB = zzaB();
            if (zztfVarZzaB != null) {
                zztfVarZzaB.zzr(iIntValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzy = iIntValue3;
            zzacn zzacnVar2 = this.zzp;
            if (zzacnVar2 != null) {
                zzacnVar2.zzq(iIntValue3);
                return;
            } else {
                this.zzi.zzh(iIntValue3);
                return;
            }
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbz.zza)) {
                zzacn zzacnVar3 = this.zzp;
                if (zzacnVar3 == null || !zzacnVar3.zzC()) {
                    return;
                }
                zzacnVar3.zzm();
                return;
            }
            this.zzs = list;
            zzacn zzacnVar4 = this.zzp;
            if (zzacnVar4 != null) {
                zzacnVar4.zzu(list);
                return;
            }
            return;
        }
        if (i10 == 14) {
            obj.getClass();
            zzeo zzeoVar = (zzeo) obj;
            if (zzeoVar.zzb() == 0 || zzeoVar.zza() == 0) {
                return;
            }
            this.zzv = zzeoVar;
            zzacn zzacnVar5 = this.zzp;
            if (zzacnVar5 != null) {
                Surface surface = this.zzt;
                zzdd.zzb(surface);
                zzacnVar5.zzs(surface, zzeoVar);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                obj.getClass();
                this.zzK = ((Integer) obj).intValue();
                zztf zztfVarZzaB2 = zzaB();
                if (zztfVarZzaB2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzK));
                    zztfVarZzaB2.zzq(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzt;
                zzbi(null);
                obj.getClass();
                ((zzaba) obj).zzu(1, surface2);
                break;
            case 18:
                boolean z2 = this.zzD != null;
                zzmh zzmhVar = (zzmh) obj;
                this.zzD = zzmhVar;
                if (z2 != (zzmhVar != null)) {
                    zzaV();
                    break;
                }
                break;
            default:
                super.zzu(i10, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzx() {
        this.zzJ = null;
        this.zzO = -9223372036854775807L;
        this.zzw = false;
        this.zzE = true;
        try {
            super.zzx();
        } finally {
            zzach zzachVar = this.zzg;
            zzachVar.zzm(((zztp) this).zza);
            zzachVar.zzt(zzcd.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzy(boolean z2, boolean z10) {
        super.zzy(z2, z10);
        zzn();
        this.zzg.zzo(((zztp) this).zza);
        if (!this.zzq) {
            if (this.zzs != null && this.zzp == null) {
                zzabg zzabgVar = new zzabg(this.zze, this.zzi);
                zzabgVar.zze(true);
                zzabgVar.zzd(zzi());
                zzabn zzabnVarZzf = zzabgVar.zzf();
                zzabnVarZzf.zzt(1);
                this.zzp = zzabnVarZzf.zze(0);
            }
            this.zzq = true;
        }
        int i10 = !z10 ? 1 : 0;
        zzacn zzacnVar = this.zzp;
        if (zzacnVar == null) {
            zzabr zzabrVar = this.zzi;
            zzabrVar.zzi(zzi());
            zzabrVar.zzf(i10);
            return;
        }
        zzacnVar.zzr(new zzaav(this), zzgdt.zzc());
        zzabo zzaboVar = this.zzM;
        if (zzaboVar != null) {
            this.zzp.zzv(zzaboVar);
        }
        if (this.zzt != null && !this.zzv.equals(zzeo.zza)) {
            this.zzp.zzs(this.zzt, this.zzv);
        }
        this.zzp.zzq(this.zzy);
        this.zzp.zzt(zzau());
        List list = this.zzs;
        if (list != null) {
            this.zzp.zzu(list);
        }
        this.zzr = i10;
        zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzz(long j, boolean z2) {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null && !z2) {
            zzacnVar.zzj(true);
        }
        super.zzz(j, z2);
        if (this.zzp == null) {
            this.zzi.zzg();
        }
        if (z2) {
            zzacn zzacnVar2 = this.zzp;
            if (zzacnVar2 != null) {
                zzacnVar2.zzk(false);
            } else {
                this.zzi.zzc(false);
            }
        }
        this.zzB = 0;
    }
}
