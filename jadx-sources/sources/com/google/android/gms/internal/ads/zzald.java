package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzald implements zzakr {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzakw zzg;
    private final zzakv zzh;
    private final zzalc zzi;
    private Bitmap zzj;

    public zzald(List list) {
        zzen zzenVar = new zzen((byte[]) list.get(0));
        int iZzq = zzenVar.zzq();
        int iZzq2 = zzenVar.zzq();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzakw(719, 575, 0, 719, 0, 575);
        this.zzh = new zzakv(0, zzg(), zzh(), zzi());
        this.zzi = new zzalc(iZzq, iZzq2);
    }

    private static int zzb(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static zzakv zzc(zzem zzemVar, int i10) {
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i11 = 8;
        int iZzd5 = zzemVar.zzd(8);
        zzemVar.zzn(8);
        int[] iArrZzg = zzg();
        int[] iArrZzh = zzh();
        int[] iArrZzi = zzi();
        int i12 = i10 - 2;
        while (i12 > 0) {
            int iZzd6 = zzemVar.zzd(i11);
            int iZzd7 = zzemVar.zzd(i11);
            int[] iArr = (iZzd7 & 128) != 0 ? iArrZzg : (iZzd7 & 64) != 0 ? iArrZzh : iArrZzi;
            if ((iZzd7 & 1) != 0) {
                iZzd3 = zzemVar.zzd(i11);
                iZzd4 = zzemVar.zzd(i11);
                iZzd = zzemVar.zzd(i11);
                iZzd2 = zzemVar.zzd(i11);
                i12 -= 6;
            } else {
                int iZzd8 = zzemVar.zzd(6) << 2;
                int iZzd9 = zzemVar.zzd(4) << 4;
                i12 -= 4;
                iZzd = zzemVar.zzd(4) << 4;
                iZzd2 = zzemVar.zzd(2) << 6;
                iZzd3 = iZzd8;
                iZzd4 = iZzd9;
            }
            if (iZzd3 == 0) {
                iZzd2 = 255;
            }
            if (iZzd3 == 0) {
                iZzd = 0;
            }
            if (iZzd3 == 0) {
                iZzd4 = 0;
            }
            double d10 = iZzd3;
            String str = zzex.zza;
            double d11 = iZzd4 - 128;
            double d12 = iZzd - 128;
            iArr[iZzd6] = zzb((byte) (255 - (iZzd2 & 255)), Math.max(0, Math.min((int) ((1.402d * d11) + d10), 255)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), 255)));
            iZzd5 = iZzd5;
            i11 = 8;
        }
        return new zzakv(iZzd5, iArrZzg, iArrZzh, iArrZzi);
    }

    private static zzakx zzd(zzem zzemVar) {
        byte[] bArr;
        int iZzd = zzemVar.zzd(16);
        zzemVar.zzn(4);
        int iZzd2 = zzemVar.zzd(2);
        boolean zZzp = zzemVar.zzp();
        zzemVar.zzn(1);
        byte[] bArr2 = zzex.zzb;
        if (iZzd2 != 1) {
            if (iZzd2 == 0) {
                int iZzd3 = zzemVar.zzd(16);
                int iZzd4 = zzemVar.zzd(16);
                if (iZzd3 > 0) {
                    bArr2 = new byte[iZzd3];
                    zzemVar.zzi(bArr2, 0, iZzd3);
                }
                if (iZzd4 > 0) {
                    bArr = new byte[iZzd4];
                    zzemVar.zzi(bArr, 0, iZzd4);
                }
            }
            return new zzakx(iZzd, zZzp, bArr2, bArr);
        }
        zzemVar.zzn(zzemVar.zzd(8) * 16);
        bArr = bArr2;
        return new zzakx(iZzd, zZzp, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zze(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzald.zze(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzf(int i10, int i11, zzem zzemVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zzemVar.zzd(i11);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zzh() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            int i11 = i10 & 4;
            int i12 = i10 & 2;
            int i13 = i10 & 1;
            if (i10 < 8) {
                iArr[i10] = zzb(255, 1 != i13 ? 0 : 255, i12 != 0 ? 255 : 0, i11 != 0 ? 255 : 0);
            } else {
                iArr[i10] = zzb(255, 1 != i13 ? 0 : 127, i12 != 0 ? 127 : 0, i11 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = zzb(63, 1 != (i10 & 1) ? 0 : 255, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = zzb(255, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = zzb(127, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = zzb(255, (1 != (i10 & 1) ? 0 : 43) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = zzb(255, (1 != (i10 & 1) ? 0 : 43) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i10, int i11, zzakq zzakqVar, zzdn zzdnVar) {
        boolean z2;
        zzakj zzakjVar;
        Canvas canvas;
        char c6;
        char c10;
        char c11;
        int i12;
        zzalc zzalcVar;
        Canvas canvas2;
        int i13;
        int i14;
        int i15;
        zzala zzalaVar;
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i16;
        int iZzd5;
        zzem zzemVar = new zzem(bArr, i10 + i11);
        zzemVar.zzl(i10);
        while (true) {
            z2 = true;
            if (zzemVar.zza() >= 48 && zzemVar.zzd(8) == 15) {
                zzalc zzalcVar2 = this.zzi;
                int iZzd6 = zzemVar.zzd(8);
                int iZzd7 = zzemVar.zzd(16);
                int iZzd8 = zzemVar.zzd(16);
                int iZzb = zzemVar.zzb() + iZzd8;
                if (iZzd8 * 8 > zzemVar.zza()) {
                    zzea.zzf("DvbParser", "Data field length exceeds limit");
                    zzemVar.zzn(zzemVar.zza());
                } else {
                    switch (iZzd6) {
                        case 16:
                            if (iZzd7 == zzalcVar2.zza) {
                                zzaky zzakyVar = zzalcVar2.zzi;
                                int iZzd9 = zzemVar.zzd(8);
                                int iZzd10 = zzemVar.zzd(4);
                                int iZzd11 = zzemVar.zzd(2);
                                zzemVar.zzn(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i17 = iZzd8 - 2; i17 > 0; i17 -= 6) {
                                    int iZzd12 = zzemVar.zzd(8);
                                    zzemVar.zzn(8);
                                    sparseArray.put(iZzd12, new zzakz(zzemVar.zzd(16), zzemVar.zzd(16)));
                                }
                                zzaky zzakyVar2 = new zzaky(iZzd9, iZzd10, iZzd11, sparseArray);
                                if (zzakyVar2.zzb != 0) {
                                    zzalcVar2.zzi = zzakyVar2;
                                    zzalcVar2.zzc.clear();
                                    zzalcVar2.zzd.clear();
                                    zzalcVar2.zze.clear();
                                    break;
                                } else if (zzakyVar != null) {
                                    if (zzakyVar.zza != zzakyVar2.zza) {
                                        zzalcVar2.zzi = zzakyVar2;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzaky zzakyVar3 = zzalcVar2.zzi;
                            if (iZzd7 == zzalcVar2.zza && zzakyVar3 != null) {
                                int iZzd13 = zzemVar.zzd(8);
                                zzemVar.zzn(4);
                                boolean zZzp = zzemVar.zzp();
                                zzemVar.zzn(3);
                                int iZzd14 = zzemVar.zzd(16);
                                int iZzd15 = zzemVar.zzd(16);
                                int iZzd16 = zzemVar.zzd(3);
                                int iZzd17 = zzemVar.zzd(3);
                                zzemVar.zzn(2);
                                int iZzd18 = zzemVar.zzd(8);
                                int iZzd19 = zzemVar.zzd(8);
                                int iZzd20 = zzemVar.zzd(4);
                                int iZzd21 = zzemVar.zzd(2);
                                zzemVar.zzn(2);
                                int i18 = iZzd8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i18 > 0) {
                                    int iZzd22 = zzemVar.zzd(16);
                                    int iZzd23 = zzemVar.zzd(2);
                                    int iZzd24 = zzemVar.zzd(2);
                                    int iZzd25 = zzemVar.zzd(12);
                                    zzemVar.zzn(4);
                                    int iZzd26 = zzemVar.zzd(12);
                                    int i19 = i18 - 6;
                                    if (iZzd23 == 1) {
                                        i18 -= 8;
                                        iZzd = zzemVar.zzd(8);
                                        iZzd2 = zzemVar.zzd(8);
                                    } else if (iZzd23 == 2) {
                                        iZzd23 = 2;
                                        i18 -= 8;
                                        iZzd = zzemVar.zzd(8);
                                        iZzd2 = zzemVar.zzd(8);
                                    } else {
                                        i18 = i19;
                                        iZzd = 0;
                                        iZzd2 = 0;
                                    }
                                    sparseArray2.put(iZzd22, new zzalb(iZzd23, iZzd24, iZzd25, iZzd26, iZzd, iZzd2));
                                }
                                zzala zzalaVar2 = new zzala(iZzd13, zZzp, iZzd14, iZzd15, iZzd16, iZzd17, iZzd18, iZzd19, iZzd20, iZzd21, sparseArray2);
                                if (zzakyVar3.zzb == 0 && (zzalaVar = (zzala) zzalcVar2.zzc.get(zzalaVar2.zza)) != null) {
                                    int i20 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzalaVar.zzj;
                                        if (i20 < sparseArray3.size()) {
                                            zzalaVar2.zzj.put(sparseArray3.keyAt(i20), (zzalb) sparseArray3.valueAt(i20));
                                            i20++;
                                        }
                                    }
                                }
                                zzalcVar2.zzc.put(zzalaVar2.zza, zzalaVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (iZzd7 == zzalcVar2.zza) {
                                zzakv zzakvVarZzc = zzc(zzemVar, iZzd8);
                                zzalcVar2.zzd.put(zzakvVarZzc.zza, zzakvVarZzc);
                                break;
                            } else if (iZzd7 == zzalcVar2.zzb) {
                                zzakv zzakvVarZzc2 = zzc(zzemVar, iZzd8);
                                zzalcVar2.zzf.put(zzakvVarZzc2.zza, zzakvVarZzc2);
                                break;
                            }
                            break;
                        case 19:
                            if (iZzd7 == zzalcVar2.zza) {
                                zzakx zzakxVarZzd = zzd(zzemVar);
                                zzalcVar2.zze.put(zzakxVarZzd.zza, zzakxVarZzd);
                                break;
                            } else if (iZzd7 == zzalcVar2.zzb) {
                                zzakx zzakxVarZzd2 = zzd(zzemVar);
                                zzalcVar2.zzg.put(zzakxVarZzd2.zza, zzakxVarZzd2);
                                break;
                            }
                            break;
                        case 20:
                            if (iZzd7 == zzalcVar2.zza) {
                                zzemVar.zzn(4);
                                boolean zZzp2 = zzemVar.zzp();
                                zzemVar.zzn(3);
                                int iZzd27 = zzemVar.zzd(16);
                                int iZzd28 = zzemVar.zzd(16);
                                if (zZzp2) {
                                    int iZzd29 = zzemVar.zzd(16);
                                    iZzd3 = zzemVar.zzd(16);
                                    iZzd5 = zzemVar.zzd(16);
                                    iZzd4 = zzemVar.zzd(16);
                                    i16 = iZzd29;
                                } else {
                                    iZzd3 = iZzd27;
                                    iZzd4 = iZzd28;
                                    i16 = 0;
                                    iZzd5 = 0;
                                }
                                zzalcVar2.zzh = new zzakw(iZzd27, iZzd28, i16, iZzd3, iZzd5, iZzd4);
                                break;
                            }
                            break;
                    }
                    zzemVar.zzo(iZzb - zzemVar.zzb());
                }
            }
        }
        zzalc zzalcVar3 = this.zzi;
        zzaky zzakyVar4 = zzalcVar3.zzi;
        if (zzakyVar4 == null) {
            zzakjVar = new zzakj(zzfyf.zzn(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzakw zzakwVar = zzalcVar3.zzh;
            if (zzakwVar == null) {
                zzakwVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzakwVar.zza + 1 != bitmap.getWidth() || zzakwVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzakwVar.zza + 1, zzakwVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzakyVar4.zzc;
            int i21 = 0;
            while (i21 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzakz zzakzVar = (zzakz) sparseArray4.valueAt(i21);
                zzala zzalaVar3 = (zzala) zzalcVar3.zzc.get(sparseArray4.keyAt(i21));
                int i22 = zzakzVar.zza + zzakwVar.zzc;
                int i23 = zzakzVar.zzb + zzakwVar.zze;
                int i24 = zzalaVar3.zzc;
                int i25 = i22 + i24;
                boolean z10 = z2;
                int iMin = Math.min(i25, zzakwVar.zzd);
                int i26 = zzalaVar3.zzd;
                int i27 = i23 + i26;
                canvas3.clipRect(i22, i23, iMin, Math.min(i27, zzakwVar.zzf));
                int i28 = zzalaVar3.zzf;
                zzakv zzakvVar = (zzakv) zzalcVar3.zzd.get(i28);
                if (zzakvVar == null && (zzakvVar = (zzakv) zzalcVar3.zzf.get(i28)) == null) {
                    zzakvVar = this.zzh;
                }
                SparseArray sparseArray5 = zzalaVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i29 = i21;
                int i30 = 0;
                while (i30 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i30);
                    int i31 = i30;
                    zzalb zzalbVar = (zzalb) sparseArray5.valueAt(i30);
                    SparseArray sparseArray7 = sparseArray5;
                    zzakx zzakxVar = (zzakx) zzalcVar3.zze.get(iKeyAt);
                    if (zzakxVar == null) {
                        zzakxVar = (zzakx) zzalcVar3.zzg.get(iKeyAt);
                    }
                    if (zzakxVar != null) {
                        Paint paint = zzakxVar.zzb ? null : this.zzd;
                        i14 = i24;
                        int i32 = zzalaVar3.zze;
                        zzalcVar = zzalcVar3;
                        int i33 = zzalbVar.zza + i22;
                        int i34 = i23 + zzalbVar.zzb;
                        canvas2 = canvas3;
                        i13 = i22;
                        int[] iArr = i32 == 3 ? zzakvVar.zzd : i32 == 2 ? zzakvVar.zzc : zzakvVar.zzb;
                        i15 = i25;
                        zze(zzakxVar.zzc, iArr, i32, i33, i34, paint, canvas2);
                        zze(zzakxVar.zzd, iArr, i32, i33, i34 + 1, paint, canvas2);
                    } else {
                        zzalcVar = zzalcVar3;
                        canvas2 = canvas3;
                        i13 = i22;
                        i14 = i24;
                        i15 = i25;
                    }
                    i22 = i13;
                    i25 = i15;
                    i30 = i31 + 1;
                    i24 = i14;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzalcVar3 = zzalcVar;
                }
                zzalc zzalcVar4 = zzalcVar3;
                Canvas canvas4 = canvas3;
                int i35 = i22;
                int i36 = i24;
                int i37 = i25;
                float f10 = i23;
                float f11 = i35;
                if (zzalaVar3.zzb) {
                    int i38 = zzalaVar3.zze;
                    if (i38 == 3) {
                        i12 = zzakvVar.zzd[zzalaVar3.zzg];
                        c11 = 2;
                    } else {
                        c11 = 2;
                        i12 = i38 == 2 ? zzakvVar.zzc[zzalaVar3.zzh] : zzakvVar.zzb[zzalaVar3.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i12);
                    float f12 = i37;
                    c10 = c11;
                    c6 = 3;
                    canvas = canvas4;
                    canvas.drawRect(f11, f10, f12, i27, paint2);
                } else {
                    canvas = canvas4;
                    c6 = 3;
                    c10 = 2;
                }
                zzcs zzcsVar = new zzcs();
                zzcsVar.zzc(Bitmap.createBitmap(this.zzj, i35, i23, i36, i26));
                float f13 = zzakwVar.zza;
                zzcsVar.zzh(f11 / f13);
                zzcsVar.zzi(0);
                float f14 = zzakwVar.zzb;
                zzcsVar.zze(f10 / f14, 0);
                zzcsVar.zzf(0);
                zzcsVar.zzk(i36 / f13);
                zzcsVar.zzd(i26 / f14);
                arrayList.add(zzcsVar.zzq());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i21 = i29 + 1;
                z2 = z10;
                zzalcVar3 = zzalcVar4;
                sparseArray4 = sparseArray6;
            }
            zzakjVar = new zzakj(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdnVar.zza(zzakjVar);
    }
}
