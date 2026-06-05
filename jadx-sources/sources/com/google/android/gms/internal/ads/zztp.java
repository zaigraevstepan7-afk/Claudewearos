package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zztp extends zzic {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private zzti zzA;
    private int zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private int zzJ;
    private int zzK;
    private ByteBuffer zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private long zzY;
    private long zzZ;
    protected zzid zza;
    private boolean zzaa;
    private boolean zzab;
    private boolean zzac;
    private zztn zzad;
    private long zzae;
    private boolean zzaf;
    private boolean zzag;
    private boolean zzah;
    private long zzai;
    private long zzaj;
    private zzsi zzak;
    private zzsi zzal;
    private final zztd zzc;
    private final zztr zzd;
    private final float zze;
    private final zzhs zzf;
    private final zzhs zzg;
    private final zzhs zzh;
    private final zzsw zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzrv zzl;
    private zzz zzm;
    private zzz zzn;
    private zzlz zzo;
    private MediaCrypto zzp;
    private long zzq;
    private float zzr;
    private float zzs;
    private zztf zzt;
    private zzz zzu;
    private MediaFormat zzv;
    private boolean zzw;
    private float zzx;
    private ArrayDeque zzy;
    private zztl zzz;

    public zztp(int i10, zztd zztdVar, zztr zztrVar, boolean z2, float f10) {
        super(i10);
        this.zzc = zztdVar;
        zztrVar.getClass();
        this.zzd = zztrVar;
        this.zze = f10;
        this.zzf = new zzhs(0, 0);
        this.zzg = new zzhs(0, 0);
        this.zzh = new zzhs(2, 0);
        zzsw zzswVar = new zzsw();
        this.zzi = zzswVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzr = 1.0f;
        this.zzs = 1.0f;
        this.zzq = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzad = zztn.zza;
        zzswVar.zzj(0);
        zzswVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzrv();
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzS = 0;
        this.zzJ = -1;
        this.zzK = -1;
        this.zzI = -9223372036854775807L;
        this.zzY = -9223372036854775807L;
        this.zzZ = -9223372036854775807L;
        this.zzae = -9223372036854775807L;
        this.zzH = -9223372036854775807L;
        this.zzT = 0;
        this.zzU = 0;
        this.zza = new zzid();
        this.zzai = -9223372036854775807L;
        this.zzaj = -9223372036854775807L;
    }

    public static boolean zzaU(zzz zzzVar) {
        return zzzVar.zzN == 0;
    }

    private final void zzaW(zztn zztnVar) {
        this.zzad = zztnVar;
        if (zztnVar.zzd != -9223372036854775807L) {
            this.zzaf = true;
        }
    }

    private final void zzaX() {
        zzsi zzsiVar = this.zzal;
        zzsiVar.getClass();
        this.zzak = zzsiVar;
        this.zzT = 0;
        this.zzU = 0;
    }

    @TargetApi(23)
    private final boolean zzaY() {
        if (this.zzV) {
            this.zzT = 1;
            if (this.zzD) {
                this.zzU = 3;
                return false;
            }
            this.zzU = 2;
        } else {
            zzaX();
        }
        return true;
    }

    private final boolean zzaZ() {
        if (this.zzt == null) {
            return false;
        }
        if (zzaT()) {
            zzaI();
            return true;
        }
        if (zzaR()) {
            zzaf();
            return false;
        }
        long j = this.zzaj;
        if (j == -9223372036854775807L || zzf() > j || this.zzae >= j) {
            return false;
        }
        this.zzah = true;
        this.zzaj = -9223372036854775807L;
        return false;
    }

    private final void zzad() {
        this.zzQ = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzP = false;
        this.zzO = false;
        this.zzl.zzb();
    }

    private final void zzae() throws Throwable {
        if (this.zzV) {
            this.zzT = 1;
            this.zzU = 3;
        } else {
            zzaI();
            zzaF();
        }
    }

    private final void zzaf() {
        try {
            zztf zztfVar = this.zzt;
            zzdd.zzb(zztfVar);
            zztfVar.zzj();
        } finally {
            zzaJ();
        }
    }

    @TargetApi(23)
    private final void zzai() throws Throwable {
        int i10 = this.zzU;
        if (i10 == 1) {
            zzaf();
            return;
        }
        if (i10 == 2) {
            zzaf();
            zzaX();
        } else if (i10 != 3) {
            this.zzab = true;
            zzar();
        } else {
            zzaI();
            zzaF();
        }
    }

    private final void zzaj() {
        this.zzJ = -1;
        this.zzg.zzc = null;
    }

    private final void zzap() {
        this.zzK = -1;
        this.zzL = null;
    }

    private final boolean zzba() {
        return this.zzK >= 0;
    }

    private final boolean zzbb(long j, long j4) {
        if (j4 >= j) {
            return false;
        }
        zzz zzzVar = this.zzn;
        return (zzzVar != null && Objects.equals(zzzVar.zzo, "audio/opus") && zzaeo.zzf(j, j4)) ? false : true;
    }

    private final boolean zzbc(int i10) throws Throwable {
        zzkv zzkvVarZzk = zzk();
        zzhs zzhsVar = this.zzf;
        zzhsVar.zzb();
        int iZzcV = zzcV(zzkvVarZzk, zzhsVar, i10 | 4);
        if (iZzcV == -5) {
            zzac(zzkvVarZzk);
            return true;
        }
        if (iZzcV != -4 || !zzhsVar.zzf()) {
            return false;
        }
        this.zzaa = true;
        zzai();
        return false;
    }

    private final boolean zzbd(long j) {
        return this.zzq == -9223372036854775807L || zzi().zzb() - j < this.zzq;
    }

    private final boolean zzbe(zzz zzzVar) throws Throwable {
        if (this.zzt != null && this.zzU != 3 && zzcU() != 0) {
            float f10 = this.zzs;
            zzzVar.getClass();
            float fZzZ = zzZ(f10, zzzVar, zzT());
            float f11 = this.zzx;
            if (f11 != fZzZ) {
                if (fZzZ == -1.0f) {
                    zzae();
                    return false;
                }
                if (f11 != -1.0f || fZzZ > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzZ);
                    zztf zztfVar = this.zzt;
                    zztfVar.getClass();
                    zztfVar.zzq(bundle);
                    this.zzx = fZzZ;
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzC() {
        try {
            zzad();
            zzaI();
        } finally {
            this.zzal = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzF(com.google.android.gms.internal.ads.zzz[] r12, long r13, long r15, com.google.android.gms.internal.ads.zzvh r17) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zztn r12 = r11.zzad
            long r0 = r12.zzd
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.zztn r4 = new com.google.android.gms.internal.ads.zztn
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzaW(r4)
            boolean r12 = r11.zzag
            if (r12 == 0) goto L56
            r11.zzaq()
            return
        L24:
            java.util.ArrayDeque r12 = r11.zzk
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.zzY
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.zzae
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.zztn r4 = new com.google.android.gms.internal.ads.zztn
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzaW(r4)
            com.google.android.gms.internal.ads.zztn r12 = r11.zzad
            long r12 = r12.zzd
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.zzaq()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.zztn r0 = new com.google.android.gms.internal.ads.zztn
            long r1 = r11.zzY
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzF(com.google.android.gms.internal.ads.zzz[], long, long, com.google.android.gms.internal.ads.zzvh):void");
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzma
    public void zzM(float f10, float f11) throws Throwable {
        this.zzr = f10;
        this.zzs = f11;
        zzbe(this.zzu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x034d, code lost:
    
        r9 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0529, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02d6 A[Catch: IllegalStateException -> 0x000b, CryptoException -> 0x000f, TryCatch #1 {CryptoException -> 0x000f, blocks: (B:3:0x0003, B:5:0x0007, B:11:0x0012, B:13:0x0017, B:15:0x001d, B:21:0x0039, B:23:0x0058, B:25:0x0066, B:36:0x0082, B:114:0x01c2, B:343:0x0544, B:43:0x0094, B:49:0x00a0, B:51:0x00a4, B:53:0x00aa, B:57:0x00bb, B:58:0x00ca, B:62:0x00d7, B:64:0x00dd, B:104:0x01a7, B:106:0x01ad, B:107:0x01b0, B:109:0x01b6, B:111:0x01ba, B:65:0x00e3, B:67:0x00e9, B:68:0x00f1, B:70:0x0101, B:73:0x010b, B:76:0x0111, B:78:0x0115, B:80:0x011f, B:82:0x0129, B:83:0x0146, B:84:0x014e, B:85:0x014f, B:87:0x0156, B:89:0x015e, B:91:0x0164, B:92:0x016b, B:94:0x0177, B:95:0x0180, B:100:0x019b, B:102:0x01a1, B:98:0x0187, B:72:0x0109, B:103:0x01a4, B:31:0x007b, B:117:0x01cc, B:119:0x01d3, B:120:0x01e1, B:122:0x01e5, B:124:0x01f0, B:128:0x01fb, B:130:0x0201, B:132:0x0209, B:134:0x0213, B:136:0x021b, B:220:0x0352, B:224:0x0361, B:226:0x0365, B:228:0x036a, B:231:0x0371, B:233:0x0375, B:235:0x037d, B:236:0x0388, B:239:0x038d, B:241:0x0391, B:244:0x03a4, B:337:0x0529, B:245:0x03a8, B:247:0x03ac, B:249:0x03b5, B:333:0x0520, B:250:0x03cc, B:251:0x03cd, B:254:0x03d3, B:256:0x03d7, B:258:0x03df, B:260:0x03ef, B:261:0x03f5, B:262:0x03f6, B:263:0x03f9, B:264:0x03fa, B:266:0x0400, B:267:0x0408, B:270:0x040f, B:272:0x0415, B:275:0x041e, B:277:0x0422, B:278:0x0429, B:279:0x042e, B:281:0x0436, B:283:0x043e, B:284:0x0443, B:286:0x0449, B:287:0x044e, B:289:0x0452, B:290:0x0463, B:292:0x0467, B:294:0x046d, B:296:0x0474, B:297:0x0478, B:299:0x047e, B:301:0x0484, B:302:0x0489, B:304:0x048f, B:306:0x0497, B:308:0x04a3, B:313:0x04b3, B:309:0x04a7, B:310:0x04a8, B:312:0x04b0, B:314:0x04b6, B:315:0x04b7, B:317:0x04c5, B:320:0x04cd, B:322:0x04d6, B:323:0x04d9, B:325:0x04eb, B:329:0x0504, B:326:0x04f5, B:328:0x04fb, B:330:0x0514, B:319:0x04cb, B:332:0x0516, B:336:0x0528, B:138:0x0221, B:139:0x0226, B:140:0x0227, B:142:0x022b, B:144:0x022f, B:146:0x0233, B:147:0x0236, B:149:0x023c, B:151:0x024b, B:153:0x0252, B:155:0x0256, B:156:0x025c, B:158:0x0260, B:160:0x0266, B:161:0x026a, B:163:0x0274, B:164:0x0283, B:166:0x0291, B:168:0x0295, B:170:0x0299, B:172:0x02a5, B:177:0x02b0, B:179:0x02b4, B:180:0x02be, B:173:0x02a8, B:175:0x02ac, B:181:0x02bf, B:185:0x02ce, B:187:0x02d6, B:192:0x02e3, B:194:0x02e9, B:196:0x02ef, B:198:0x02f5, B:199:0x02fa, B:200:0x0302, B:203:0x031d, B:205:0x0323, B:210:0x0333, B:212:0x0337, B:214:0x033b, B:215:0x0345, B:217:0x034a, B:339:0x0530, B:341:0x0534, B:342:0x0535), top: B:370:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e9 A[Catch: IllegalStateException -> 0x000b, CryptoException -> 0x000f, TryCatch #1 {CryptoException -> 0x000f, blocks: (B:3:0x0003, B:5:0x0007, B:11:0x0012, B:13:0x0017, B:15:0x001d, B:21:0x0039, B:23:0x0058, B:25:0x0066, B:36:0x0082, B:114:0x01c2, B:343:0x0544, B:43:0x0094, B:49:0x00a0, B:51:0x00a4, B:53:0x00aa, B:57:0x00bb, B:58:0x00ca, B:62:0x00d7, B:64:0x00dd, B:104:0x01a7, B:106:0x01ad, B:107:0x01b0, B:109:0x01b6, B:111:0x01ba, B:65:0x00e3, B:67:0x00e9, B:68:0x00f1, B:70:0x0101, B:73:0x010b, B:76:0x0111, B:78:0x0115, B:80:0x011f, B:82:0x0129, B:83:0x0146, B:84:0x014e, B:85:0x014f, B:87:0x0156, B:89:0x015e, B:91:0x0164, B:92:0x016b, B:94:0x0177, B:95:0x0180, B:100:0x019b, B:102:0x01a1, B:98:0x0187, B:72:0x0109, B:103:0x01a4, B:31:0x007b, B:117:0x01cc, B:119:0x01d3, B:120:0x01e1, B:122:0x01e5, B:124:0x01f0, B:128:0x01fb, B:130:0x0201, B:132:0x0209, B:134:0x0213, B:136:0x021b, B:220:0x0352, B:224:0x0361, B:226:0x0365, B:228:0x036a, B:231:0x0371, B:233:0x0375, B:235:0x037d, B:236:0x0388, B:239:0x038d, B:241:0x0391, B:244:0x03a4, B:337:0x0529, B:245:0x03a8, B:247:0x03ac, B:249:0x03b5, B:333:0x0520, B:250:0x03cc, B:251:0x03cd, B:254:0x03d3, B:256:0x03d7, B:258:0x03df, B:260:0x03ef, B:261:0x03f5, B:262:0x03f6, B:263:0x03f9, B:264:0x03fa, B:266:0x0400, B:267:0x0408, B:270:0x040f, B:272:0x0415, B:275:0x041e, B:277:0x0422, B:278:0x0429, B:279:0x042e, B:281:0x0436, B:283:0x043e, B:284:0x0443, B:286:0x0449, B:287:0x044e, B:289:0x0452, B:290:0x0463, B:292:0x0467, B:294:0x046d, B:296:0x0474, B:297:0x0478, B:299:0x047e, B:301:0x0484, B:302:0x0489, B:304:0x048f, B:306:0x0497, B:308:0x04a3, B:313:0x04b3, B:309:0x04a7, B:310:0x04a8, B:312:0x04b0, B:314:0x04b6, B:315:0x04b7, B:317:0x04c5, B:320:0x04cd, B:322:0x04d6, B:323:0x04d9, B:325:0x04eb, B:329:0x0504, B:326:0x04f5, B:328:0x04fb, B:330:0x0514, B:319:0x04cb, B:332:0x0516, B:336:0x0528, B:138:0x0221, B:139:0x0226, B:140:0x0227, B:142:0x022b, B:144:0x022f, B:146:0x0233, B:147:0x0236, B:149:0x023c, B:151:0x024b, B:153:0x0252, B:155:0x0256, B:156:0x025c, B:158:0x0260, B:160:0x0266, B:161:0x026a, B:163:0x0274, B:164:0x0283, B:166:0x0291, B:168:0x0295, B:170:0x0299, B:172:0x02a5, B:177:0x02b0, B:179:0x02b4, B:180:0x02be, B:173:0x02a8, B:175:0x02ac, B:181:0x02bf, B:185:0x02ce, B:187:0x02d6, B:192:0x02e3, B:194:0x02e9, B:196:0x02ef, B:198:0x02f5, B:199:0x02fa, B:200:0x0302, B:203:0x031d, B:205:0x0323, B:210:0x0333, B:212:0x0337, B:214:0x033b, B:215:0x0345, B:217:0x034a, B:339:0x0530, B:341:0x0534, B:342:0x0535), top: B:370:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0359 A[LOOP:0: B:120:0x01e1->B:223:0x0359, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x052d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // com.google.android.gms.internal.ads.zzma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzV(long r22, long r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzV(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public boolean zzW() {
        return this.zzab;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public boolean zzX() {
        if (this.zzm == null) {
            return false;
        }
        if (zzS() || zzba()) {
            return true;
        }
        return this.zzI != -9223372036854775807L && zzi().zzb() < this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final int zzY(zzz zzzVar) throws zzin {
        try {
            return zzaa(this.zzd, zzzVar);
        } catch (zztw e10) {
            throw zzcX(e10, zzzVar, false, 4002);
        }
    }

    public float zzZ(float f10, zzz zzzVar, zzz[] zzzVarArr) {
        throw null;
    }

    public final zzlz zzaA() {
        return this.zzo;
    }

    public final zztf zzaB() {
        return this.zzt;
    }

    public zzth zzaC(Throwable th2, zzti zztiVar) {
        return new zzth(th2, zztiVar);
    }

    public final zzti zzaD() {
        return this.zzA;
    }

    public final void zzaE() {
        this.zzag = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x048d A[Catch: Exception -> 0x016a, TryCatch #3 {Exception -> 0x016a, blocks: (B:69:0x013e, B:71:0x015f, B:75:0x016e, B:77:0x0173, B:78:0x017b, B:80:0x017f, B:81:0x0187, B:83:0x018b, B:84:0x0193, B:86:0x0197, B:88:0x01a5, B:103:0x0204, B:90:0x01ad, B:92:0x01b5, B:93:0x01bb, B:95:0x01c3, B:96:0x01c9, B:98:0x01d1, B:99:0x01d7, B:101:0x01df, B:102:0x01e5, B:104:0x0209, B:106:0x0219, B:109:0x0220, B:111:0x0224, B:112:0x0232, B:114:0x0237, B:116:0x023b, B:117:0x0249, B:121:0x0266, B:123:0x026c, B:125:0x0272, B:126:0x028c, B:128:0x0290, B:130:0x0296, B:132:0x029c, B:133:0x02a8, B:135:0x02ae, B:136:0x02b6, B:138:0x02bb, B:139:0x02c3, B:141:0x02c8, B:142:0x02d0, B:144:0x02d5, B:145:0x02dd, B:147:0x02e1, B:148:0x02e9, B:151:0x02f3, B:152:0x0307, B:154:0x030b, B:156:0x031b, B:157:0x0320, B:159:0x0324, B:160:0x0329, B:161:0x032f, B:163:0x0336, B:165:0x0346, B:166:0x034b, B:168:0x034f, B:169:0x0354, B:171:0x0358, B:172:0x035d, B:174:0x0361, B:175:0x0366, B:177:0x036a, B:178:0x036f, B:180:0x0373, B:181:0x0378, B:183:0x037c, B:184:0x0381, B:186:0x0385, B:187:0x038a, B:189:0x038e, B:190:0x0393, B:192:0x0397, B:193:0x039c, B:195:0x03a0, B:196:0x03a5, B:198:0x03a9, B:199:0x03ae, B:201:0x03b2, B:202:0x03b7, B:204:0x03bb, B:205:0x03c0, B:207:0x03c4, B:208:0x03c9, B:210:0x03cd, B:211:0x03d2, B:212:0x03d8, B:214:0x03db, B:231:0x0408, B:225:0x03f5, B:226:0x03fc, B:232:0x040b, B:234:0x0439, B:236:0x0446, B:240:0x0451, B:242:0x045a, B:244:0x0462, B:246:0x046a, B:248:0x0472, B:250:0x047a, B:252:0x0482, B:264:0x04a7, B:266:0x04ad, B:268:0x04b4, B:269:0x04c1, B:256:0x048d, B:258:0x0497, B:260:0x04a1), top: B:310:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04ad A[Catch: Exception -> 0x016a, TryCatch #3 {Exception -> 0x016a, blocks: (B:69:0x013e, B:71:0x015f, B:75:0x016e, B:77:0x0173, B:78:0x017b, B:80:0x017f, B:81:0x0187, B:83:0x018b, B:84:0x0193, B:86:0x0197, B:88:0x01a5, B:103:0x0204, B:90:0x01ad, B:92:0x01b5, B:93:0x01bb, B:95:0x01c3, B:96:0x01c9, B:98:0x01d1, B:99:0x01d7, B:101:0x01df, B:102:0x01e5, B:104:0x0209, B:106:0x0219, B:109:0x0220, B:111:0x0224, B:112:0x0232, B:114:0x0237, B:116:0x023b, B:117:0x0249, B:121:0x0266, B:123:0x026c, B:125:0x0272, B:126:0x028c, B:128:0x0290, B:130:0x0296, B:132:0x029c, B:133:0x02a8, B:135:0x02ae, B:136:0x02b6, B:138:0x02bb, B:139:0x02c3, B:141:0x02c8, B:142:0x02d0, B:144:0x02d5, B:145:0x02dd, B:147:0x02e1, B:148:0x02e9, B:151:0x02f3, B:152:0x0307, B:154:0x030b, B:156:0x031b, B:157:0x0320, B:159:0x0324, B:160:0x0329, B:161:0x032f, B:163:0x0336, B:165:0x0346, B:166:0x034b, B:168:0x034f, B:169:0x0354, B:171:0x0358, B:172:0x035d, B:174:0x0361, B:175:0x0366, B:177:0x036a, B:178:0x036f, B:180:0x0373, B:181:0x0378, B:183:0x037c, B:184:0x0381, B:186:0x0385, B:187:0x038a, B:189:0x038e, B:190:0x0393, B:192:0x0397, B:193:0x039c, B:195:0x03a0, B:196:0x03a5, B:198:0x03a9, B:199:0x03ae, B:201:0x03b2, B:202:0x03b7, B:204:0x03bb, B:205:0x03c0, B:207:0x03c4, B:208:0x03c9, B:210:0x03cd, B:211:0x03d2, B:212:0x03d8, B:214:0x03db, B:231:0x0408, B:225:0x03f5, B:226:0x03fc, B:232:0x040b, B:234:0x0439, B:236:0x0446, B:240:0x0451, B:242:0x045a, B:244:0x0462, B:246:0x046a, B:248:0x0472, B:250:0x047a, B:252:0x0482, B:264:0x04a7, B:266:0x04ad, B:268:0x04b4, B:269:0x04c1, B:256:0x048d, B:258:0x0497, B:260:0x04a1), top: B:310:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x050f A[Catch: zztl -> 0x0082, TryCatch #6 {zztl -> 0x0082, blocks: (B:25:0x0057, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:284:0x04f4, B:286:0x050f, B:288:0x0518, B:291:0x051f, B:292:0x0521, B:287:0x0512, B:294:0x0524, B:295:0x0525, B:297:0x052a, B:298:0x052b, B:299:0x0535, B:38:0x008a, B:39:0x0092, B:301:0x0537), top: B:316:0x0057, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0512 A[Catch: zztl -> 0x0082, TryCatch #6 {zztl -> 0x0082, blocks: (B:25:0x0057, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:284:0x04f4, B:286:0x050f, B:288:0x0518, B:291:0x051f, B:292:0x0521, B:287:0x0512, B:294:0x0524, B:295:0x0525, B:297:0x052a, B:298:0x052b, B:299:0x0535, B:38:0x008a, B:39:0x0092, B:301:0x0537), top: B:316:0x0057, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x051f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.media.MediaCrypto, com.google.android.gms.internal.ads.zzto] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzaF() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzaF():void");
    }

    public void zzaG(long j) {
        this.zzae = j;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j < ((zztn) arrayDeque.peek()).zzb) {
                return;
            }
            zztn zztnVar = (zztn) arrayDeque.poll();
            zztnVar.getClass();
            zzaW(zztnVar);
            zzaq();
        }
    }

    public final void zzaI() {
        try {
            zztf zztfVar = this.zzt;
            if (zztfVar != null) {
                zztfVar.zzm();
                this.zza.zzb++;
                zzti zztiVar = this.zzA;
                if (zztiVar == null) {
                    throw null;
                }
                zzan(zztiVar.zza);
            }
            this.zzt = null;
            this.zzp = null;
            this.zzak = null;
            zzaK();
        } catch (Throwable th2) {
            this.zzt = null;
            this.zzp = null;
            this.zzak = null;
            zzaK();
            throw th2;
        }
    }

    public void zzaJ() {
        zzaj();
        zzap();
        this.zzI = -9223372036854775807L;
        this.zzW = false;
        this.zzH = -9223372036854775807L;
        this.zzV = false;
        this.zzE = false;
        this.zzF = false;
        this.zzM = false;
        this.zzN = false;
        this.zzY = -9223372036854775807L;
        this.zzZ = -9223372036854775807L;
        this.zzae = -9223372036854775807L;
        this.zzT = 0;
        this.zzU = 0;
        this.zzS = this.zzR ? 1 : 0;
        this.zzah = false;
        this.zzai = -9223372036854775807L;
        this.zzaj = -9223372036854775807L;
    }

    public final void zzaK() {
        zzaJ();
        this.zzy = null;
        this.zzA = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzX = false;
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzC = false;
        this.zzD = false;
        this.zzG = false;
        this.zzR = false;
        this.zzS = 0;
    }

    public final boolean zzaL() throws Throwable {
        boolean zZzaZ = zzaZ();
        if (zZzaZ) {
            zzaF();
        }
        return zZzaZ;
    }

    public final boolean zzaM() {
        return this.zzah;
    }

    public final boolean zzaN() {
        return this.zzO;
    }

    public final boolean zzaO(zzz zzzVar) {
        return this.zzal == null && zzat(zzzVar);
    }

    public boolean zzaP(zzz zzzVar) {
        return true;
    }

    public boolean zzaQ(zzhs zzhsVar) {
        return false;
    }

    public boolean zzaR() {
        return true;
    }

    public boolean zzaS(zzti zztiVar) {
        return true;
    }

    public boolean zzaT() {
        int i10 = this.zzU;
        if (i10 == 3 || ((this.zzC && !this.zzX) || (this.zzD && this.zzW))) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        try {
            zzaX();
            return false;
        } catch (zzin e10) {
            zzea.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
            return true;
        }
    }

    public final boolean zzaV() {
        return zzbe(this.zzu);
    }

    public abstract int zzaa(zztr zztrVar, zzz zzzVar);

    public zzie zzab(zzti zztiVar, zzz zzzVar, zzz zzzVar2) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.zzie zzac(com.google.android.gms.internal.ads.zzkv r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzac(com.google.android.gms.internal.ads.zzkv):com.google.android.gms.internal.ads.zzie");
    }

    public abstract zztc zzag(zzti zztiVar, zzz zzzVar, MediaCrypto mediaCrypto, float f10);

    public abstract List zzah(zztr zztrVar, zzz zzzVar, boolean z2);

    public void zzak(zzhs zzhsVar) {
        throw null;
    }

    public void zzal(Exception exc) {
        throw null;
    }

    public void zzam(String str, zztc zztcVar, long j, long j4) {
        throw null;
    }

    public void zzan(String str) {
        throw null;
    }

    public void zzao(zzz zzzVar, MediaFormat mediaFormat) {
        throw null;
    }

    public void zzar() {
        throw null;
    }

    public abstract boolean zzas(long j, long j4, zztf zztfVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j10, boolean z2, boolean z10, zzz zzzVar);

    public boolean zzat(zzz zzzVar) {
        return false;
    }

    public final float zzau() {
        return this.zzr;
    }

    public final long zzav() {
        return this.zzZ;
    }

    public final long zzaw() {
        return this.zzad.zzd;
    }

    public final long zzax() {
        return this.zzad.zzc;
    }

    public final MediaFormat zzay() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzmd
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlv
    public void zzu(int i10, Object obj) {
        if (i10 == 11) {
            zzlz zzlzVar = (zzlz) obj;
            zzlzVar.getClass();
            this.zzo = zzlzVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzx() {
        this.zzm = null;
        zzaW(zztn.zza);
        this.zzk.clear();
        zzaZ();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzy(boolean z2, boolean z10) {
        this.zza = new zzid();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzz(long j, boolean z2) {
        this.zzaa = false;
        this.zzab = false;
        if (this.zzO) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzP = false;
            this.zzl.zzb();
        } else {
            zzaL();
        }
        zzet zzetVar = this.zzad.zze;
        if (zzetVar.zza() > 0) {
            this.zzac = true;
        }
        zzetVar.zze();
        this.zzk.clear();
    }

    public void zzaq() {
    }

    public void zzaH(zzhs zzhsVar) {
    }
}
