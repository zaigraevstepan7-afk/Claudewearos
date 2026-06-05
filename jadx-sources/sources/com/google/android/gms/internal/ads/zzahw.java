package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbch;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzahw implements zzadt {
    private static final byte[] zza = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final UUID zze;
    private static final Map zzf;
    private long zzA;
    private boolean zzB;
    private zzahu zzC;
    private boolean zzD;
    private int zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private long zzJ;
    private zzeb zzK;
    private zzeb zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private long zzP;
    private long zzQ;
    private int zzR;
    private int zzS;
    private int[] zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private long zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private int zzag;
    private byte zzah;
    private boolean zzai;
    private zzadw zzaj;
    private final zzahr zzak;
    private final zzahy zzg;
    private final SparseArray zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final zzakp zzk;
    private final zzen zzl;
    private final zzen zzm;
    private final zzen zzn;
    private final zzen zzo;
    private final zzen zzp;
    private final zzen zzq;
    private final zzen zzr;
    private final zzen zzs;
    private final zzen zzt;
    private final zzen zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        String str = zzex.zza;
        zzb = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzc = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zzd = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zze = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        zzf = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzahw() {
        this(new zzahr(), 2, zzakp.zza);
    }

    private final int zzp(zzadu zzaduVar, zzahu zzahuVar, int i10, boolean z2) throws zzaz {
        int i11;
        if ("S_TEXT/UTF8".equals(zzahuVar.zzc)) {
            zzx(zzaduVar, zza, i10);
            int i12 = this.zzab;
            zzw();
            return i12;
        }
        if ("S_TEXT/ASS".equals(zzahuVar.zzc) || "S_TEXT/SSA".equals(zzahuVar.zzc)) {
            zzx(zzaduVar, zzc, i10);
            int i13 = this.zzab;
            zzw();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(zzahuVar.zzc)) {
            zzx(zzaduVar, zzd, i10);
            int i14 = this.zzab;
            zzw();
            return i14;
        }
        zzaez zzaezVar = zzahuVar.zzX;
        if (!this.zzad) {
            if (zzahuVar.zzh) {
                this.zzW &= -1073741825;
                if (!this.zzae) {
                    zzen zzenVar = this.zzn;
                    zzaduVar.zzi(zzenVar.zzN(), 0, 1);
                    this.zzaa++;
                    if ((zzenVar.zzN()[0] & 128) == 128) {
                        throw zzaz.zza("Extension bit is set in signal byte", null);
                    }
                    this.zzah = zzenVar.zzN()[0];
                    this.zzae = true;
                }
                byte b10 = this.zzah;
                if ((b10 & 1) == 1) {
                    int i15 = b10 & 2;
                    this.zzW |= 1073741824;
                    if (!this.zzai) {
                        zzen zzenVar2 = this.zzs;
                        zzaduVar.zzi(zzenVar2.zzN(), 0, 8);
                        this.zzaa += 8;
                        this.zzai = true;
                        zzen zzenVar3 = this.zzn;
                        zzenVar3.zzN()[0] = (byte) ((i15 != 2 ? 0 : 128) | 8);
                        zzenVar3.zzL(0);
                        zzaezVar.zzs(zzenVar3, 1, 1);
                        this.zzab++;
                        zzenVar2.zzL(0);
                        zzaezVar.zzs(zzenVar2, 8, 1);
                        this.zzab += 8;
                    }
                    if (i15 == 2) {
                        if (!this.zzaf) {
                            zzen zzenVar4 = this.zzn;
                            zzaduVar.zzi(zzenVar4.zzN(), 0, 1);
                            this.zzaa++;
                            zzenVar4.zzL(0);
                            this.zzag = zzenVar4.zzm();
                            this.zzaf = true;
                        }
                        int i16 = this.zzag * 4;
                        zzen zzenVar5 = this.zzn;
                        zzenVar5.zzI(i16);
                        zzaduVar.zzi(zzenVar5.zzN(), 0, i16);
                        this.zzaa += i16;
                        int i17 = (this.zzag >> 1) + 1;
                        int i18 = (i17 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzv;
                        if (byteBuffer == null || byteBuffer.capacity() < i18) {
                            this.zzv = ByteBuffer.allocate(i18);
                        }
                        this.zzv.position(0);
                        this.zzv.putShort((short) i17);
                        int i19 = 0;
                        int i20 = 0;
                        while (true) {
                            i11 = this.zzag;
                            if (i19 >= i11) {
                                break;
                            }
                            int iZzp = zzenVar5.zzp();
                            int i21 = iZzp - i20;
                            if (i19 % 2 == 0) {
                                this.zzv.putShort((short) i21);
                            } else {
                                this.zzv.putInt(i21);
                            }
                            i19++;
                            i20 = iZzp;
                        }
                        int i22 = (i10 - this.zzaa) - i20;
                        if ((i11 & 1) == 1) {
                            this.zzv.putInt(i22);
                        } else {
                            this.zzv.putShort((short) i22);
                            this.zzv.putInt(0);
                        }
                        zzen zzenVar6 = this.zzt;
                        zzenVar6.zzJ(this.zzv.array(), i18);
                        zzaezVar.zzs(zzenVar6, i18, 1);
                        this.zzab += i18;
                    }
                }
            } else {
                byte[] bArr = zzahuVar.zzi;
                if (bArr != null) {
                    this.zzq.zzJ(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzahuVar.zzc) ? zzahuVar.zzg > 0 : z2) {
                this.zzW |= 268435456;
                this.zzu.zzI(0);
                int iZzd = (this.zzq.zzd() + i10) - this.zzaa;
                zzen zzenVar7 = this.zzn;
                zzenVar7.zzI(4);
                zzenVar7.zzN()[0] = (byte) ((iZzd >> 24) & 255);
                zzenVar7.zzN()[1] = (byte) ((iZzd >> 16) & 255);
                zzenVar7.zzN()[2] = (byte) ((iZzd >> 8) & 255);
                zzenVar7.zzN()[3] = (byte) (iZzd & 255);
                zzaezVar.zzs(zzenVar7, 4, 2);
                this.zzab += 4;
            }
            this.zzad = true;
        }
        zzen zzenVar8 = this.zzq;
        int iZzd2 = zzenVar8.zzd() + i10;
        if (!"V_MPEG4/ISO/AVC".equals(zzahuVar.zzc) && !"V_MPEGH/ISO/HEVC".equals(zzahuVar.zzc)) {
            if (zzahuVar.zzU != null) {
                zzdd.zzf(zzenVar8.zzd() == 0);
                zzahuVar.zzU.zzd(zzaduVar);
            }
            while (true) {
                int i23 = this.zzaa;
                if (i23 >= iZzd2) {
                    break;
                }
                int iZzq = zzq(zzaduVar, zzaezVar, iZzd2 - i23);
                this.zzaa += iZzq;
                this.zzab += iZzq;
            }
        } else {
            zzen zzenVar9 = this.zzm;
            byte[] bArrZzN = zzenVar9.zzN();
            bArrZzN[0] = 0;
            bArrZzN[1] = 0;
            bArrZzN[2] = 0;
            int i24 = zzahuVar.zzY;
            int i25 = 4 - i24;
            while (this.zzaa < iZzd2) {
                int i26 = this.zzac;
                if (i26 == 0) {
                    int iMin = Math.min(i24, zzenVar8.zza());
                    zzaduVar.zzi(bArrZzN, i25 + iMin, i24 - iMin);
                    if (iMin > 0) {
                        zzenVar8.zzH(bArrZzN, i25, iMin);
                    }
                    this.zzaa += i24;
                    zzenVar9.zzL(0);
                    this.zzac = zzenVar9.zzp();
                    zzen zzenVar10 = this.zzl;
                    zzenVar10.zzL(0);
                    zzaezVar.zzr(zzenVar10, 4);
                    this.zzab += 4;
                } else {
                    int iZzq2 = zzq(zzaduVar, zzaezVar, i26);
                    this.zzaa += iZzq2;
                    this.zzab += iZzq2;
                    this.zzac -= iZzq2;
                }
            }
        }
        if ("A_VORBIS".equals(zzahuVar.zzc)) {
            zzen zzenVar11 = this.zzo;
            zzenVar11.zzL(0);
            zzaezVar.zzr(zzenVar11, 4);
            this.zzab += 4;
        }
        int i27 = this.zzab;
        zzw();
        return i27;
    }

    private final int zzq(zzadu zzaduVar, zzaez zzaezVar, int i10) {
        zzen zzenVar = this.zzq;
        int iZza = zzenVar.zza();
        if (iZza <= 0) {
            return zzaezVar.zzf(zzaduVar, i10, false);
        }
        int iMin = Math.min(i10, iZza);
        zzaezVar.zzr(zzenVar, iMin);
        return iMin;
    }

    private final long zzr(long j) throws zzaz {
        long j4 = this.zzy;
        if (j4 != -9223372036854775807L) {
            return zzex.zzu(j, j4, 1000L, RoundingMode.DOWN);
        }
        throw zzaz.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void zzs(int i10) throws zzaz {
        if (this.zzK == null || this.zzL == null) {
            throw zzaz.zza("Element " + i10 + " must be in a Cues", null);
        }
    }

    private final void zzt(int i10) throws zzaz {
        if (this.zzC != null) {
            return;
        }
        throw zzaz.zza("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        r2 = zzy(r10, "%01d:%02d:%02d:%02d", 10000);
        r3 = 21;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzu(com.google.android.gms.internal.ads.zzahu r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahw.zzu(com.google.android.gms.internal.ads.zzahu, long, int, int, int):void");
    }

    private final void zzv(zzadu zzaduVar, int i10) {
        zzen zzenVar = this.zzn;
        if (zzenVar.zzd() >= i10) {
            return;
        }
        if (zzenVar.zzb() < i10) {
            int iZzb = zzenVar.zzb();
            zzenVar.zzF(Math.max(iZzb + iZzb, i10));
        }
        zzaduVar.zzi(zzenVar.zzN(), zzenVar.zzd(), i10 - zzenVar.zzd());
        zzenVar.zzK(i10);
    }

    private final void zzw() {
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = 0;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = false;
        this.zzag = 0;
        this.zzah = (byte) 0;
        this.zzai = false;
        this.zzq.zzI(0);
    }

    private final void zzx(zzadu zzaduVar, byte[] bArr, int i10) {
        int length = bArr.length;
        int i11 = length + i10;
        zzen zzenVar = this.zzr;
        if (zzenVar.zzb() < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + i10);
            zzenVar.zzJ(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzenVar.zzN(), 0, length);
        }
        zzaduVar.zzi(zzenVar.zzN(), length, i10);
        zzenVar.zzL(0);
        zzenVar.zzK(i11);
    }

    private static byte[] zzy(long j, String str, long j4) {
        zzdd.zzd(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i10 = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i10);
        long j10 = j - (i10 * 3600000000L);
        int i11 = (int) (j10 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i11);
        long j11 = j10 - (i11 * 60000000);
        int i12 = (int) (j11 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i12), Integer.valueOf((int) ((j11 - (i12 * 1000000)) / j4)));
        String str3 = zzex.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private static int[] zzz(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzb(zzadu zzaduVar, zzaep zzaepVar) {
        int i10 = 0;
        this.zzN = false;
        while (!this.zzN) {
            if (this.zzak.zzc(zzaduVar)) {
                long jZzf = zzaduVar.zzf();
                if (this.zzG) {
                    this.zzI = jZzf;
                    zzaepVar.zza = this.zzH;
                    this.zzG = false;
                    return 1;
                }
                if (this.zzD) {
                    long j = this.zzI;
                    if (j != -1) {
                        zzaepVar.zza = j;
                        this.zzI = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.zzh;
                    if (i10 >= sparseArray.size()) {
                        return -1;
                    }
                    zzahu zzahuVar = (zzahu) sparseArray.valueAt(i10);
                    zzahuVar.zzX.getClass();
                    zzafa zzafaVar = zzahuVar.zzU;
                    if (zzafaVar != null) {
                        zzafaVar.zza(zzahuVar.zzX, zzahuVar.zzj);
                    }
                    i10++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return zzfyf.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        if (this.zzj) {
            zzadwVar = new zzaks(zzadwVar, this.zzk);
        }
        this.zzaj = zzadwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j, long j4) {
        this.zzJ = -9223372036854775807L;
        int i10 = 0;
        this.zzO = 0;
        this.zzak.zzb();
        this.zzg.zze();
        zzw();
        while (true) {
            SparseArray sparseArray = this.zzh;
            if (i10 >= sparseArray.size()) {
                return;
            }
            zzafa zzafaVar = ((zzahu) sparseArray.valueAt(i10)).zzU;
            if (zzafaVar != null) {
                zzafaVar.zzb();
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzh(int i10, int i11, zzadu zzaduVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = i10;
        int i22 = 1;
        int i23 = 0;
        if (i21 != 161 && i21 != 163) {
            if (i21 == 165) {
                if (this.zzO != 2) {
                    return;
                }
                zzahu zzahuVar = (zzahu) this.zzh.get(this.zzU);
                if (this.zzX != 4 || !"V_VP9".equals(zzahuVar.zzc)) {
                    zzaduVar.zzk(i11);
                    return;
                }
                zzen zzenVar = this.zzu;
                zzenVar.zzI(i11);
                zzaduVar.zzi(zzenVar.zzN(), 0, i11);
                return;
            }
            if (i21 == 16877) {
                zzt(i10);
                zzahu zzahuVar2 = this.zzC;
                if (zzahuVar2.zzZ != 1685485123 && zzahuVar2.zzZ != 1685480259) {
                    zzaduVar.zzk(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                zzahuVar2.zzO = bArr;
                zzaduVar.zzi(bArr, 0, i11);
                return;
            }
            if (i21 == 16981) {
                zzt(i10);
                byte[] bArr2 = new byte[i11];
                this.zzC.zzi = bArr2;
                zzaduVar.zzi(bArr2, 0, i11);
                return;
            }
            if (i21 == 18402) {
                byte[] bArr3 = new byte[i11];
                zzaduVar.zzi(bArr3, 0, i11);
                zzt(i10);
                this.zzC.zzj = new zzaey(1, bArr3, 0, 0);
                return;
            }
            if (i21 == 21419) {
                zzen zzenVar2 = this.zzp;
                Arrays.fill(zzenVar2.zzN(), (byte) 0);
                zzaduVar.zzi(zzenVar2.zzN(), 4 - i11, i11);
                zzenVar2.zzL(0);
                this.zzE = (int) zzenVar2.zzu();
                return;
            }
            if (i21 == 25506) {
                zzt(i10);
                byte[] bArr4 = new byte[i11];
                this.zzC.zzk = bArr4;
                zzaduVar.zzi(bArr4, 0, i11);
                return;
            }
            if (i21 != 30322) {
                throw zzaz.zza("Unexpected id: " + i21, null);
            }
            zzt(i10);
            byte[] bArr5 = new byte[i11];
            this.zzC.zzw = bArr5;
            zzaduVar.zzi(bArr5, 0, i11);
            return;
        }
        int i24 = 8;
        if (this.zzO == 0) {
            zzahy zzahyVar = this.zzg;
            this.zzU = (int) zzahyVar.zzd(zzaduVar, false, true, 8);
            this.zzV = zzahyVar.zza();
            this.zzQ = -9223372036854775807L;
            this.zzO = 1;
            this.zzn.zzI(0);
        }
        zzahu zzahuVar3 = (zzahu) this.zzh.get(this.zzU);
        if (zzahuVar3 == null) {
            zzaduVar.zzk(i11 - this.zzV);
            this.zzO = 0;
            return;
        }
        zzahuVar3.zzX.getClass();
        if (this.zzO == 1) {
            zzv(zzaduVar, 3);
            zzen zzenVar3 = this.zzn;
            int i25 = (zzenVar3.zzN()[2] & 6) >> 1;
            if (i25 == 0) {
                this.zzS = 1;
                int[] iArrZzz = zzz(this.zzT, 1);
                this.zzT = iArrZzz;
                iArrZzz[0] = (i11 - this.zzV) - 3;
            } else {
                zzv(zzaduVar, 4);
                int i26 = (zzenVar3.zzN()[3] & 255) + 1;
                this.zzS = i26;
                int[] iArrZzz2 = zzz(this.zzT, i26);
                this.zzT = iArrZzz2;
                if (i25 == 2) {
                    int i27 = (i11 - this.zzV) - 4;
                    int i28 = this.zzS;
                    Arrays.fill(iArrZzz2, 0, i28, i27 / i28);
                } else {
                    if (i25 != 1) {
                        if (i25 != 3) {
                            throw zzaz.zza("Unexpected lacing value: 2", null);
                        }
                        int i29 = 0;
                        int i30 = 0;
                        int i31 = 4;
                        while (true) {
                            int i32 = this.zzS - 1;
                            if (i29 >= i32) {
                                i12 = i22;
                                i14 = i23;
                                this.zzT[i32] = ((i11 - this.zzV) - i31) - i30;
                                break;
                            }
                            this.zzT[i29] = i23;
                            int i33 = i31 + 1;
                            zzv(zzaduVar, i33);
                            if (zzenVar3.zzN()[i31] == 0) {
                                throw zzaz.zza("No valid varint length mask found", null);
                            }
                            int i34 = i22;
                            int i35 = i23;
                            while (true) {
                                if (i35 >= i24) {
                                    i15 = i23;
                                    i16 = i24;
                                    j = 0;
                                    break;
                                }
                                i16 = i24;
                                int i36 = i34 << (7 - i35);
                                if ((zzenVar3.zzN()[i31] & i36) != 0) {
                                    i33 += i35;
                                    zzv(zzaduVar, i33);
                                    i15 = i23;
                                    j = zzenVar3.zzN()[i31] & 255 & (~i36);
                                    int i37 = i31 + 1;
                                    while (i37 < i33) {
                                        j = (j << i16) | (zzenVar3.zzN()[i37] & 255);
                                        i37++;
                                        i35 = i35;
                                    }
                                    int i38 = i35;
                                    if (i29 > 0) {
                                        j -= (1 << ((i38 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i35++;
                                    i24 = i16;
                                }
                            }
                            i31 = i33;
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.zzT;
                            int i39 = (int) j;
                            if (i29 != 0) {
                                i39 += iArr[i29 - 1];
                            }
                            iArr[i29] = i39;
                            i30 += i39;
                            i29++;
                            i22 = i34;
                            i23 = i15;
                            i24 = i16;
                        }
                        throw zzaz.zza("EBML lacing sample size out of range.", null);
                    }
                    int i40 = 0;
                    int i41 = 0;
                    int i42 = 4;
                    while (true) {
                        i17 = this.zzS - 1;
                        if (i40 >= i17) {
                            break;
                        }
                        this.zzT[i40] = 0;
                        while (true) {
                            i18 = i42 + 1;
                            zzv(zzaduVar, i18);
                            int i43 = zzenVar3.zzN()[i42] & 255;
                            int[] iArr2 = this.zzT;
                            i19 = iArr2[i40] + i43;
                            iArr2[i40] = i19;
                            if (i43 != 255) {
                                break;
                            } else {
                                i42 = i18;
                            }
                        }
                        i41 += i19;
                        i40++;
                        i42 = i18;
                    }
                    this.zzT[i17] = ((i11 - this.zzV) - i42) - i41;
                }
            }
            i12 = 1;
            i14 = 0;
            this.zzP = this.zzJ + zzr((zzenVar3.zzN()[i14] << 8) | (zzenVar3.zzN()[i12] & 255));
            if (zzahuVar3.zze == 2) {
                i20 = i12;
            } else if (i21 == 163) {
                i20 = (zzenVar3.zzN()[2] & 128) == 128 ? i12 : i14;
                i21 = 163;
            } else {
                i20 = i14;
            }
            this.zzW = i20;
            this.zzO = 2;
            this.zzR = i14;
            i13 = 163;
        } else {
            i12 = 1;
            i13 = 163;
        }
        if (i21 == i13) {
            while (true) {
                int i44 = this.zzR;
                if (i44 >= this.zzS) {
                    this.zzO = 0;
                    return;
                }
                int iZzp = zzp(zzaduVar, zzahuVar3, this.zzT[i44], false);
                zzahu zzahuVar4 = zzahuVar3;
                zzu(zzahuVar4, this.zzP + ((this.zzR * zzahuVar3.zzf) / zzbch.zzq.zzf), this.zzW, iZzp, 0);
                this.zzR++;
                zzahuVar3 = zzahuVar4;
            }
        } else {
            while (true) {
                int i45 = this.zzR;
                if (i45 >= this.zzS) {
                    return;
                }
                int[] iArr3 = this.zzT;
                boolean z2 = i12;
                iArr3[i45] = zzp(zzaduVar, zzahuVar3, iArr3[i45], z2);
                this.zzR += z2 ? 1 : 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) {
        return new zzahx().zza(zzaduVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(int r21) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahw.zzj(int):void");
    }

    public final void zzk(int i10, double d10) {
        if (i10 == 181) {
            zzt(i10);
            this.zzC.zzR = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.zzz = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                zzt(i10);
                this.zzC.zzE = (float) d10;
                break;
            case 21970:
                zzt(i10);
                this.zzC.zzF = (float) d10;
                break;
            case 21971:
                zzt(i10);
                this.zzC.zzG = (float) d10;
                break;
            case 21972:
                zzt(i10);
                this.zzC.zzH = (float) d10;
                break;
            case 21973:
                zzt(i10);
                this.zzC.zzI = (float) d10;
                break;
            case 21974:
                zzt(i10);
                this.zzC.zzJ = (float) d10;
                break;
            case 21975:
                zzt(i10);
                this.zzC.zzK = (float) d10;
                break;
            case 21976:
                zzt(i10);
                this.zzC.zzL = (float) d10;
                break;
            case 21977:
                zzt(i10);
                this.zzC.zzM = (float) d10;
                break;
            case 21978:
                zzt(i10);
                this.zzC.zzN = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        zzt(i10);
                        this.zzC.zzt = (float) d10;
                        break;
                    case 30324:
                        zzt(i10);
                        this.zzC.zzu = (float) d10;
                        break;
                    case 30325:
                        zzt(i10);
                        this.zzC.zzv = (float) d10;
                        break;
                }
        }
    }

    public final void zzl(int i10, long j) {
        boolean z2;
        if (i10 == 20529) {
            if (j == 0) {
                return;
            }
            throw zzaz.zza("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i10 == 20530) {
            if (j == 1) {
                return;
            }
            throw zzaz.zza("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i10) {
            case 131:
                zzt(i10);
                this.zzC.zze = (int) j;
                return;
            case 136:
                z2 = j == 1;
                zzt(i10);
                this.zzC.zzW = z2;
                return;
            case 155:
                this.zzQ = zzr(j);
                return;
            case 159:
                zzt(i10);
                this.zzC.zzP = (int) j;
                return;
            case 176:
                zzt(i10);
                this.zzC.zzm = (int) j;
                return;
            case 179:
                zzs(i10);
                this.zzK.zzc(zzr(j));
                return;
            case 186:
                zzt(i10);
                this.zzC.zzn = (int) j;
                return;
            case 215:
                zzt(i10);
                this.zzC.zzd = (int) j;
                return;
            case 231:
                this.zzJ = zzr(j);
                return;
            case 238:
                this.zzX = (int) j;
                return;
            case 241:
                if (this.zzM) {
                    return;
                }
                zzs(i10);
                this.zzL.zzc(j);
                this.zzM = true;
                return;
            case 251:
                this.zzY = true;
                return;
            case 16871:
                zzt(i10);
                this.zzC.zzZ = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw zzaz.zza("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw zzaz.zza("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw zzaz.zza("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw zzaz.zza("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw zzaz.zza("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.zzF = j + this.zzx;
                return;
            case 21432:
                int i11 = (int) j;
                zzt(i10);
                if (i11 == 0) {
                    this.zzC.zzx = 0;
                    return;
                }
                if (i11 == 1) {
                    this.zzC.zzx = 2;
                    return;
                } else if (i11 == 3) {
                    this.zzC.zzx = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.zzC.zzx = 3;
                    return;
                }
            case 21680:
                zzt(i10);
                this.zzC.zzp = (int) j;
                return;
            case 21682:
                zzt(i10);
                this.zzC.zzr = (int) j;
                return;
            case 21690:
                zzt(i10);
                this.zzC.zzq = (int) j;
                return;
            case 21930:
                z2 = j == 1;
                zzt(i10);
                this.zzC.zzV = z2;
                return;
            case 21938:
                zzt(i10);
                zzahu zzahuVar = this.zzC;
                zzahuVar.zzy = true;
                zzahuVar.zzo = (int) j;
                return;
            case 21998:
                zzt(i10);
                this.zzC.zzg = (int) j;
                return;
            case 22186:
                zzt(i10);
                this.zzC.zzS = j;
                return;
            case 22203:
                zzt(i10);
                this.zzC.zzT = j;
                return;
            case 25188:
                zzt(i10);
                this.zzC.zzQ = (int) j;
                return;
            case 30114:
                this.zzZ = j;
                return;
            case 30321:
                int i12 = (int) j;
                zzt(i10);
                if (i12 == 0) {
                    this.zzC.zzs = 0;
                    return;
                }
                if (i12 == 1) {
                    this.zzC.zzs = 1;
                    return;
                } else if (i12 == 2) {
                    this.zzC.zzs = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.zzC.zzs = 3;
                    return;
                }
            case 2352003:
                zzt(i10);
                this.zzC.zzf = (int) j;
                return;
            case 2807729:
                this.zzy = j;
                return;
            default:
                switch (i10) {
                    case 21945:
                        int i13 = (int) j;
                        zzt(i10);
                        if (i13 == 1) {
                            this.zzC.zzB = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.zzC.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzt(i10);
                        int iZzb = zzk.zzb((int) j);
                        if (iZzb != -1) {
                            this.zzC.zzA = iZzb;
                            return;
                        }
                        return;
                    case 21947:
                        zzt(i10);
                        this.zzC.zzy = true;
                        int iZza = zzk.zza((int) j);
                        if (iZza != -1) {
                            this.zzC.zzz = iZza;
                            return;
                        }
                        return;
                    case 21948:
                        zzt(i10);
                        this.zzC.zzC = (int) j;
                        return;
                    case 21949:
                        zzt(i10);
                        this.zzC.zzD = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void zzm(int i10, long j, long j4) {
        zzdd.zzb(this.zzaj);
        if (i10 == 160) {
            this.zzY = false;
            this.zzZ = 0L;
            return;
        }
        if (i10 == 174) {
            zzahu zzahuVar = new zzahu();
            this.zzC = zzahuVar;
            zzahuVar.zza = this.zzB;
            return;
        }
        if (i10 == 187) {
            this.zzM = false;
            return;
        }
        if (i10 == 19899) {
            this.zzE = -1;
            this.zzF = -1L;
            return;
        }
        if (i10 == 20533) {
            zzt(i10);
            this.zzC.zzh = true;
            return;
        }
        if (i10 == 21968) {
            zzt(i10);
            this.zzC.zzy = true;
            return;
        }
        if (i10 == 408125543) {
            long j10 = this.zzx;
            if (j10 != -1 && j10 != j) {
                throw zzaz.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j;
            this.zzw = j4;
            return;
        }
        if (i10 == 475249515) {
            this.zzK = new zzeb(32);
            this.zzL = new zzeb(32);
        } else if (i10 == 524531317 && !this.zzD) {
            if (this.zzi && this.zzH != -1) {
                this.zzG = true;
            } else {
                this.zzaj.zzP(new zzaer(this.zzA, 0L));
                this.zzD = true;
            }
        }
    }

    public final void zzn(int i10, String str) {
        if (i10 == 134) {
            zzt(i10);
            this.zzC.zzc = str;
            return;
        }
        if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                this.zzB = Objects.equals(str, "webm");
                return;
            }
            throw zzaz.zza("DocType " + str + " not supported", null);
        }
        if (i10 == 21358) {
            zzt(i10);
            this.zzC.zzb = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            zzt(i10);
            this.zzC.zzaa = str;
        }
    }

    public zzahw(zzahr zzahrVar, int i10, zzakp zzakpVar) {
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzH = -1L;
        this.zzI = -1L;
        this.zzJ = -9223372036854775807L;
        this.zzak = zzahrVar;
        zzahrVar.zza(new zzaht(this, null));
        this.zzk = zzakpVar;
        this.zzi = 1 == ((i10 & 1) ^ 1);
        this.zzj = (i10 & 2) == 0;
        this.zzg = new zzahy();
        this.zzh = new SparseArray();
        this.zzn = new zzen(4);
        this.zzo = new zzen(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzen(4);
        this.zzl = new zzen(zzfv.zza);
        this.zzm = new zzen(4);
        this.zzq = new zzen();
        this.zzr = new zzen();
        this.zzs = new zzen(8);
        this.zzt = new zzen();
        this.zzu = new zzen();
        this.zzT = new int[1];
    }

    public zzahw(zzakp zzakpVar, int i10) {
        this(new zzahr(), 0, zzakpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
