package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzajb implements zzadt {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzz zzb;
    private long zzA;
    private zzaja zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private zzadw zzH;
    private zzaez[] zzI;
    private zzaez[] zzJ;
    private boolean zzK;
    private final zzakp zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzen zzg;
    private final zzen zzh;
    private final zzen zzi;
    private final byte[] zzj;
    private final zzen zzk;
    private final zzagq zzl;
    private final zzen zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzfz zzp;
    private zzfyf zzq;
    private int zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private zzen zzv;
    private long zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    static {
        zzx zzxVar = new zzx();
        zzxVar.zzah("application/x-emsg");
        zzb = zzxVar.zzan();
    }

    @Deprecated
    public zzajb() {
        this(zzakp.zza, 32, null, null, zzfyf.zzn(), null);
    }

    private static int zzg(int i10) throws zzaz {
        if (i10 >= 0) {
            return i10;
        }
        throw zzaz.zza("Unexpected negative value: " + i10, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzs zzh(java.util.List r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajb.zzh(java.util.List):com.google.android.gms.internal.ads.zzs");
    }

    private final void zzj() {
        this.zzr = 0;
        this.zzu = 0;
    }

    private static void zzk(zzen zzenVar, int i10, zzajp zzajpVar) throws zzaz {
        zzenVar.zzL(i10 + 8);
        int iZzg = zzenVar.zzg();
        int i11 = zzaiv.zza;
        if ((iZzg & 1) != 0) {
            throw zzaz.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z2 = (iZzg & 2) != 0;
        int iZzp = zzenVar.zzp();
        if (iZzp == 0) {
            Arrays.fill(zzajpVar.zzl, 0, zzajpVar.zze, false);
            return;
        }
        int i12 = zzajpVar.zze;
        if (iZzp != i12) {
            throw zzaz.zza("Senc sample count " + iZzp + " is different from fragment sample count" + i12, null);
        }
        Arrays.fill(zzajpVar.zzl, 0, iZzp, z2);
        zzajpVar.zza(zzenVar.zza());
        zzen zzenVar2 = zzajpVar.zzn;
        zzenVar.zzH(zzenVar2.zzN(), 0, zzenVar2.zzd());
        zzenVar2.zzL(0);
        zzajpVar.zzo = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:294:0x06bd, code lost:
    
        zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x06c0, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzl(long r55) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 1729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajb.zzl(long):void");
    }

    private static final zzaiw zzm(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (zzaiw) sparseArray.valueAt(0);
        }
        zzaiw zzaiwVar = (zzaiw) sparseArray.get(i10);
        zzaiwVar.getClass();
        return zzaiwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f4, code lost:
    
        if (java.util.Objects.equals(r2, "video/hevc") != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fc, code lost:
    
        if (com.google.android.gms.internal.ads.zzay.zzg(r9.zzk, "video/hevc") == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ff, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0207, code lost:
    
        if (((r10 & 126) >> 1) != 39) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0209, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020c, code lost:
    
        r21 = r6;
        r33 = r8;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0212, code lost:
    
        r31.zzG = r2;
        r7.zzr(r15, r4);
        r31.zzD += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021c, code lost:
    
        if (r4 <= 0) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0220, code lost:
    
        if (r31.zzF != false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0229, code lost:
    
        if (com.google.android.gms.internal.ads.zzfv.zzj(r13, 4, r4, r3.zzg) == false) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x022b, code lost:
    
        r31.zzF = r19;
        r8 = r33;
        r6 = r21;
        r2 = r28;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0239, code lost:
    
        r8 = r33;
        r6 = r21;
        r2 = r28;
        r10 = 0;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024c, code lost:
    
        throw com.google.android.gms.internal.ads.zzaz.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024d, code lost:
    
        r28 = r2;
        r21 = r6;
        r33 = r8;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0256, code lost:
    
        if (r31.zzG == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0258, code lost:
    
        r2 = r31.zzi;
        r2.zzI(r4);
        r32.zzi(r2.zzN(), 0, r31.zzE);
        r7.zzr(r2, r31.zzE);
        r4 = r31.zzE;
        r8 = com.google.android.gms.internal.ads.zzfv.zzc(r2.zzN(), r2.zzd());
        r2.zzL(0);
        r2.zzK(r8);
        r8 = r3.zzg.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0285, code lost:
    
        if (r8 != (-1)) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0287, code lost:
    
        r8 = r31.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x028d, code lost:
    
        if (r8.zza() == 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x028f, code lost:
    
        r8.zze(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0293, code lost:
    
        r9 = r31.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0299, code lost:
    
        if (r9.zza() == r8) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x029b, code lost:
    
        r9.zze(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x029e, code lost:
    
        r8 = r31.zzp;
        r8.zzb(r11, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ab, code lost:
    
        if ((r28.zza() & 4) == 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ad, code lost:
    
        r8.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b1, code lost:
    
        r4 = r7.zzf(r32, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b6, code lost:
    
        r31.zzD += r4;
        r31.zzE -= r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c2, code lost:
    
        r1 = r28.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c8, code lost:
    
        if (r31.zzF != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ca, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cd, code lost:
    
        r22 = r1;
        r1 = r28.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d3, code lost:
    
        if (r1 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d5, code lost:
    
        r25 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02da, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02dc, code lost:
    
        r7.zzt(r11, r22, r31.zzC, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e9, code lost:
    
        r1 = r31.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ef, code lost:
    
        if (r1.isEmpty() != false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f1, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzaiz) r1.removeFirst();
        r2 = r31.zzx;
        r7 = r1.zzc;
        r31.zzx = r2 - r7;
        r2 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0302, code lost:
    
        if (r1.zzb == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0304, code lost:
    
        r2 = r2 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0306, code lost:
    
        r4 = r2;
        r1 = r31.zzI;
        r2 = r1.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x030b, code lost:
    
        if (r10 >= r2) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x030d, code lost:
    
        r1[r10].zzt(r4, 1, r7, r31.zzx, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x031d, code lost:
    
        if (r28.zzl() != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x031f, code lost:
    
        r31.zzB = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0322, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0323, code lost:
    
        r31.zzr = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0327, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        r6 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r31.zzr != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        r31.zzC = r2.zzb();
        r3 = r2.zzd.zza.zzg.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (java.util.Objects.equals(r3, "video/avc") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        java.util.Objects.equals(r3, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bd, code lost:
    
        r31.zzF = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        if (r2.zzf >= r2.zzi) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        r32.zzk(r31.zzC);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        r3 = r2.zzb;
        r5 = r3.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
    
        if (r1 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        r5.zzM(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
    
        if (r3.zzb(r2.zzf) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e4, code lost:
    
        r5.zzM(r5.zzq() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        if (r2.zzl() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f2, code lost:
    
        r31.zzB = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f4, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
    
        if (r2.zzd.zza.zzh != 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ff, code lost:
    
        r31.zzC -= 8;
        r32.zzk(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0116, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzg.zzo) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0118, code lost:
    
        r31.zzD = r2.zzc(r31.zzC, 7);
        r3 = r31.zzC;
        r11 = r31.zzk;
        com.google.android.gms.internal.ads.zzacx.zzc(r3, r11);
        r2.zza.zzr(r11, 7);
        r3 = r31.zzD + 7;
        r31.zzD = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0133, code lost:
    
        r3 = r2.zzc(r31.zzC, 0);
        r31.zzD = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013b, code lost:
    
        r31.zzC += r3;
        r31.zzr = 4;
        r31.zzE = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0145, code lost:
    
        r3 = r2.zzd.zza;
        r7 = r2.zza;
        r11 = r2.zze();
        r14 = r3.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0151, code lost:
    
        if (r14 != 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0153, code lost:
    
        r3 = r31.zzD;
        r4 = r31.zzC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0157, code lost:
    
        if (r3 >= r4) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0159, code lost:
    
        r31.zzD += r7.zzf(r32, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0164, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0168, code lost:
    
        r15 = r31.zzh;
        r13 = r15.zzN();
        r13[0] = 0;
        r13[1] = 0;
        r13[r33] = 0;
        r8 = 4 - r14;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017c, code lost:
    
        if (r31.zzD >= r31.zzC) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017e, code lost:
    
        r4 = r31.zzE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0180, code lost:
    
        if (r4 != 0) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        if (r31.zzJ.length > 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0189, code lost:
    
        if (r31.zzF != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018c, code lost:
    
        r28 = r2;
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0190, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzfv.zzb(r3.zzg);
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019f, code lost:
    
        if ((r14 + r4) <= (r31.zzC - r31.zzD)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a1, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a2, code lost:
    
        r32.zzi(r13, r8, r14 + r4);
        r15.zzL(0);
        r9 = r15.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01af, code lost:
    
        if (r9 < 0) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b1, code lost:
    
        r31.zzE = r9 - r4;
        r9 = r31.zzg;
        r9.zzL(0);
        r7.zzr(r9, 4);
        r31.zzD += 4;
        r31.zzC += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ca, code lost:
    
        if (r31.zzJ.length <= 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cc, code lost:
    
        if (r4 <= 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ce, code lost:
    
        r9 = r3.zzg;
        r10 = r13[4];
        r2 = r9.zzo;
        r33 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (java.util.Objects.equals(r2, r6) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e2, code lost:
    
        if (com.google.android.gms.internal.ads.zzay.zzg(r9.zzk, r6) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e5, code lost:
    
        r21 = r6;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e9, code lost:
    
        r21 = r6;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ee, code lost:
    
        if ((r10 & 31) == 6) goto L107;
     */
    @Override // com.google.android.gms.internal.ads.zzadt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadu r32, com.google.android.gms.internal.ads.zzaep r33) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 1965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajb.zzb(com.google.android.gms.internal.ads.zzadu, com.google.android.gms.internal.ads.zzaep):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        int i10;
        int i11 = this.zzd;
        if ((i11 & 32) == 0) {
            zzadwVar = new zzaks(zzadwVar, this.zzc);
        }
        this.zzH = zzadwVar;
        zzj();
        zzaez[] zzaezVarArr = new zzaez[2];
        this.zzI = zzaezVarArr;
        int i12 = 100;
        int i13 = 0;
        if ((i11 & 4) != 0) {
            zzaezVarArr[0] = this.zzH.zzw(100, 5);
            i10 = 1;
            i12 = 101;
        } else {
            i10 = 0;
        }
        zzaez[] zzaezVarArr2 = (zzaez[]) zzex.zzQ(this.zzI, i10);
        this.zzI = zzaezVarArr2;
        for (zzaez zzaezVar : zzaezVarArr2) {
            zzaezVar.zzm(zzb);
        }
        List list = this.zze;
        this.zzJ = new zzaez[list.size()];
        while (i13 < this.zzJ.length) {
            zzaez zzaezVarZzw = this.zzH.zzw(i12, 3);
            zzaezVarZzw.zzm((zzz) list.get(i13));
            this.zzJ[i13] = zzaezVarZzw;
            i13++;
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j, long j4) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzaja) sparseArray.valueAt(i10)).zzi();
        }
        this.zzo.clear();
        this.zzx = 0;
        this.zzp.zzc();
        this.zzy = j4;
        this.zzn.clear();
        zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) {
        zzaew zzaewVarZza = zzajm.zza(zzaduVar);
        this.zzq = zzaewVarZza != null ? zzfyf.zzo(zzaewVarZza) : zzfyf.zzn();
        return zzaewVarZza == null;
    }

    public zzajb(zzakp zzakpVar, int i10, zzeu zzeuVar, zzajn zzajnVar, List list, zzaez zzaezVar) {
        this.zzc = zzakpVar;
        this.zzd = i10;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzagq();
        this.zzm = new zzen(16);
        this.zzg = new zzen(zzfv.zza);
        this.zzh = new zzen(6);
        this.zzi = new zzen();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzen(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzq = zzfyf.zzn();
        this.zzz = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzH = zzadw.zza;
        this.zzI = new zzaez[0];
        this.zzJ = new zzaez[0];
        this.zzp = new zzfz(new zzfy() { // from class: com.google.android.gms.internal.ads.zzaiy
            @Override // com.google.android.gms.internal.ads.zzfy
            public final void zza(long j, zzen zzenVar) {
                zzadg.zza(j, zzenVar, this.zza.zzJ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
