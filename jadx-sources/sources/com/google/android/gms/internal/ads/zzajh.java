package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzajh implements zzadt, zzaes {
    private long zzA;
    private int zzB;
    private zzahk zzC;
    private final zzakp zza;
    private final int zzb;
    private final zzen zzc;
    private final zzen zzd;
    private final zzen zze;
    private final zzen zzf;
    private final ArrayDeque zzg;
    private final zzajl zzh;
    private final List zzi;
    private zzfyf zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;
    private zzen zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private long zzv;
    private zzadw zzw;
    private zzajg[] zzx;
    private long[][] zzy;
    private int zzz;

    @Deprecated
    public zzajh() {
        this(zzakp.zza, 16);
    }

    private static int zzj(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzk(zzajq zzajqVar, long j) {
        int iZza = zzajqVar.zza(j);
        return iZza == -1 ? zzajqVar.zzb(j) : iZza;
    }

    private static long zzl(zzajq zzajqVar, long j, long j4) {
        int iZzk = zzk(zzajqVar, j);
        return iZzk == -1 ? j4 : Math.min(zzajqVar.zzc[iZzk], j4);
    }

    private final void zzm() {
        this.zzk = 0;
        this.zzn = 0;
    }

    private final void zzn(long j) {
        zzav zzavVarZzc;
        ArrayDeque arrayDeque;
        int i10;
        List list;
        zzav zzavVar;
        int i11;
        zzav[] zzavVarArr;
        zzav zzavVar2;
        zzav zzavVar3;
        ArrayList arrayList;
        while (true) {
            ArrayDeque arrayDeque2 = this.zzg;
            if (arrayDeque2.isEmpty() || ((zzfc) arrayDeque2.peek()).zza != j) {
                break;
            }
            zzfc zzfcVar = (zzfc) arrayDeque2.pop();
            if (zzfcVar.zzd == 1836019574) {
                zzfc zzfcVarZza = zzfcVar.zza(1835365473);
                new ArrayList();
                zzav zzavVarZzb = zzfcVarZza != null ? zzaiv.zzb(zzfcVarZza) : null;
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                boolean z2 = this.zzB == 1;
                zzaeh zzaehVar = new zzaeh();
                zzfd zzfdVarZzb = zzfcVar.zzb(1969517665);
                if (zzfdVarZzb != null) {
                    zzavVarZzc = zzaiv.zzc(zzfdVarZzb);
                    zzaehVar.zzb(zzavVarZzc);
                } else {
                    zzavVarZzc = null;
                }
                zzfd zzfdVarZzb2 = zzfcVar.zzb(1836476516);
                zzfdVarZzb2.getClass();
                ArrayList arrayList3 = arrayList2;
                zzav zzavVar4 = new zzav(-9223372036854775807L, zzaiv.zzd(zzfdVarZzb2.zza));
                int i13 = this.zzb;
                long j4 = -9223372036854775807L;
                zzav zzavVar5 = zzavVarZzc;
                zzav zzavVar6 = zzavVar4;
                List listZzf = zzaiv.zzf(zzfcVar, zzaehVar, -9223372036854775807L, null, 1 == (i13 & 1), z2, new zzfut() { // from class: com.google.android.gms.internal.ads.zzajf
                    @Override // com.google.android.gms.internal.ads.zzfut
                    public final Object apply(Object obj) {
                        return (zzajn) obj;
                    }
                });
                String strZza = zzaje.zza(listZzf);
                int i14 = 0;
                long jMax = -9223372036854775807L;
                int size = -1;
                while (i14 < listZzf.size()) {
                    zzajq zzajqVar = (zzajq) listZzf.get(i14);
                    if (zzajqVar.zzb == 0) {
                        arrayDeque = arrayDeque2;
                        list = listZzf;
                        i11 = i14;
                        zzavVar2 = zzavVar5;
                        zzavVar3 = zzavVar6;
                        i10 = i12;
                        arrayList = arrayList3;
                        zzavVar = zzavVarZzb;
                    } else {
                        zzajn zzajnVar = zzajqVar.zza;
                        arrayDeque = arrayDeque2;
                        zzadw zzadwVar = this.zzw;
                        i10 = i12 + 1;
                        list = listZzf;
                        int i15 = zzajnVar.zzb;
                        zzajg zzajgVar = new zzajg(zzajnVar, zzajqVar, zzadwVar.zzw(i12, i15));
                        zzavVar = zzavVarZzb;
                        long j10 = zzajnVar.zze;
                        if (j10 == j4) {
                            j10 = zzajqVar.zzh;
                        }
                        i11 = i14;
                        zzaez zzaezVar = zzajgVar.zzc;
                        zzaezVar.zzl(j10);
                        jMax = Math.max(jMax, j10);
                        zzz zzzVar = zzajnVar.zzg;
                        int i16 = "audio/true-hd".equals(zzzVar.zzo) ? zzajqVar.zze * 16 : zzajqVar.zze + 30;
                        zzx zzxVarZzb = zzzVar.zzb();
                        zzxVarZzb.zzX(i16);
                        if (i15 == 2) {
                            int i17 = zzzVar.zzf;
                            if ((i13 & 8) != 0) {
                                i17 |= size == -1 ? 1 : 2;
                            }
                            zzxVarZzb.zzaf(i17);
                            i15 = 2;
                        }
                        if (i15 == 1 && zzaehVar.zza()) {
                            zzxVarZzb.zzM(zzaehVar.zza);
                            zzxVarZzb.zzN(zzaehVar.zzb);
                        }
                        zzav zzavVar7 = zzzVar.zzl;
                        List list2 = this.zzi;
                        zzav[] zzavVarArr2 = {list2.isEmpty() ? null : new zzav(list2), zzavVar5, zzavVar6};
                        if (zzavVar7 != null) {
                            zzavVarArr = zzavVarArr2;
                            zzavVar2 = zzavVar5;
                            zzavVar3 = zzavVar6;
                        } else {
                            zzavVarArr = zzavVarArr2;
                            zzavVar2 = zzavVar5;
                            zzavVar3 = zzavVar6;
                            zzavVar7 = new zzav(j4, new zzau[0]);
                        }
                        if (zzavVar != null) {
                            for (int i18 = 0; i18 < zzavVar.zza(); i18++) {
                                zzau zzauVarZzb = zzavVar.zzb(i18);
                                if (zzauVarZzb instanceof zzfa) {
                                    zzfa zzfaVar = (zzfa) zzauVarZzb;
                                    if (!zzfaVar.zza.equals("com.android.capture.fps")) {
                                        zzavVar7 = zzavVar7.zzc(zzfaVar);
                                    } else if (i15 == 2) {
                                        zzavVar7 = zzavVar7.zzc(zzfaVar);
                                    }
                                }
                            }
                        }
                        for (int i19 = 0; i19 < 3; i19++) {
                            zzavVar7 = zzavVar7.zzd(zzavVarArr[i19]);
                        }
                        if (zzavVar7.zza() > 0) {
                            zzxVarZzb.zzaa(zzavVar7);
                        }
                        zzxVarZzb.zzG(strZza);
                        zzaezVar.zzm(zzxVarZzb.zzan());
                        if (i15 == 2 && size == -1) {
                            size = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzajgVar);
                    }
                    i14 = i11 + 1;
                    arrayList3 = arrayList;
                    zzavVarZzb = zzavVar;
                    arrayDeque2 = arrayDeque;
                    i12 = i10;
                    listZzf = list;
                    zzavVar5 = zzavVar2;
                    zzavVar6 = zzavVar3;
                    j4 = -9223372036854775807L;
                }
                ArrayDeque arrayDeque3 = arrayDeque2;
                this.zzz = size;
                this.zzA = jMax;
                zzajg[] zzajgVarArr = (zzajg[]) arrayList3.toArray(new zzajg[0]);
                this.zzx = zzajgVarArr;
                int length = zzajgVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i20 = 0; i20 < zzajgVarArr.length; i20++) {
                    jArr[i20] = new long[zzajgVarArr[i20].zzb.zzb];
                    jArr2[i20] = zzajgVarArr[i20].zzb.zzf[0];
                }
                long j11 = 0;
                int i21 = 0;
                while (i21 < zzajgVarArr.length) {
                    long j12 = Long.MAX_VALUE;
                    int i22 = -1;
                    for (int i23 = 0; i23 < zzajgVarArr.length; i23++) {
                        if (!zArr[i23]) {
                            long j13 = jArr2[i23];
                            if (j13 <= j12) {
                                i22 = i23;
                                j12 = j13;
                            }
                        }
                    }
                    int i24 = iArr[i22];
                    long[] jArr3 = jArr[i22];
                    jArr3[i24] = j11;
                    zzajq zzajqVar2 = zzajgVarArr[i22].zzb;
                    j11 += zzajqVar2.zzd[i24];
                    int i25 = i24 + 1;
                    iArr[i22] = i25;
                    if (i25 < jArr3.length) {
                        jArr2[i22] = zzajqVar2.zzf[i25];
                    } else {
                        zArr[i22] = true;
                        i21++;
                    }
                }
                this.zzy = jArr;
                this.zzw.zzG();
                this.zzw.zzP(this);
                arrayDeque3.clear();
                this.zzk = 2;
            } else if (!arrayDeque2.isEmpty()) {
                ((zzfc) arrayDeque2.peek()).zzc(zzfcVar);
            }
        }
        if (this.zzk != 2) {
            zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    @Override // com.google.android.gms.internal.ads.zzadt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadu r35, com.google.android.gms.internal.ads.zzaep r36) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 1231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajh.zzb(com.google.android.gms.internal.ads.zzadu, com.google.android.gms.internal.ads.zzaep):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        if ((this.zzb & 16) == 0) {
            zzadwVar = new zzaks(zzadwVar, this.zza);
        }
        this.zzw = zzadwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j, long j4) {
        this.zzg.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = false;
        if (j == 0) {
            if (this.zzk != 3) {
                zzm();
                return;
            } else {
                this.zzh.zzb();
                this.zzi.clear();
                return;
            }
        }
        for (zzajg zzajgVar : this.zzx) {
            zzajq zzajqVar = zzajgVar.zzb;
            int iZza = zzajqVar.zza(j4);
            if (iZza == -1) {
                iZza = zzajqVar.zzb(j4);
            }
            zzajgVar.zze = iZza;
            zzafa zzafaVar = zzajgVar.zzd;
            if (zzafaVar != null) {
                zzafaVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j) {
        long j4;
        long j10;
        long jZzl;
        long j11;
        int iZzb;
        long j12 = j;
        zzajg[] zzajgVarArr = this.zzx;
        if (zzajgVarArr.length == 0) {
            zzaet zzaetVar = zzaet.zza;
            return new zzaeq(zzaetVar, zzaetVar);
        }
        int i10 = this.zzz;
        if (i10 != -1) {
            zzajq zzajqVar = zzajgVarArr[i10].zzb;
            int iZzk = zzk(zzajqVar, j12);
            if (iZzk == -1) {
                zzaet zzaetVar2 = zzaet.zza;
                return new zzaeq(zzaetVar2, zzaetVar2);
            }
            long[] jArr = zzajqVar.zzf;
            long j13 = jArr[iZzk];
            long[] jArr2 = zzajqVar.zzc;
            j4 = jArr2[iZzk];
            if (j13 >= j12 || iZzk >= zzajqVar.zzb - 1 || (iZzb = zzajqVar.zzb(j12)) == -1 || iZzb == iZzk) {
                j11 = -9223372036854775807L;
                jZzl = -1;
            } else {
                j11 = jArr[iZzb];
                jZzl = jArr2[iZzb];
            }
            j10 = j11;
            j12 = j13;
        } else {
            j4 = Long.MAX_VALUE;
            j10 = -9223372036854775807L;
            jZzl = -1;
        }
        int i11 = 0;
        while (true) {
            zzajg[] zzajgVarArr2 = this.zzx;
            if (i11 >= zzajgVarArr2.length) {
                break;
            }
            if (i11 != this.zzz) {
                zzajq zzajqVar2 = zzajgVarArr2[i11].zzb;
                long jZzl2 = zzl(zzajqVar2, j12, j4);
                if (j10 != -9223372036854775807L) {
                    jZzl = zzl(zzajqVar2, j10, jZzl);
                }
                j4 = jZzl2;
            }
            i11++;
        }
        zzaet zzaetVar3 = new zzaet(j12, j4);
        return j10 == -9223372036854775807L ? new zzaeq(zzaetVar3, zzaetVar3) : new zzaeq(zzaetVar3, new zzaet(j10, jZzl));
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) {
        zzaew zzaewVarZzb = zzajm.zzb(zzaduVar, (this.zzb & 2) != 0);
        this.zzj = zzaewVarZzb != null ? zzfyf.zzo(zzaewVarZzb) : zzfyf.zzn();
        return zzaewVarZzb == null;
    }

    public zzajh(zzakp zzakpVar, int i10) {
        this.zza = zzakpVar;
        this.zzb = i10;
        this.zzj = zzfyf.zzn();
        this.zzk = (i10 & 4) != 0 ? 3 : 0;
        this.zzh = new zzajl();
        this.zzi = new ArrayList();
        this.zzf = new zzen(16);
        this.zzg = new ArrayDeque();
        this.zzc = new zzen(zzfv.zza);
        this.zzd = new zzen(6);
        this.zze = new zzen();
        this.zzp = -1;
        this.zzw = zzadw.zza;
        this.zzx = new zzajg[0];
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
