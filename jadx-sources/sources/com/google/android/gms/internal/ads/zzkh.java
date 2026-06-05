package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzkh extends zzg implements zziy {
    public static final /* synthetic */ int zzd = 0;
    private final zzdi zzA;
    private int zzB;
    private int zzC;
    private boolean zzD;
    private zzmh zzE;
    private zzmi zzF;
    private zzix zzG;
    private zzbd zzH;
    private zzat zzI;
    private Object zzJ;
    private Surface zzK;
    private int zzL;
    private zzeo zzM;
    private zze zzN;
    private float zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzat zzT;
    private zzls zzU;
    private int zzV;
    private long zzW;
    private final zzjj zzX;
    private zzxc zzY;
    final zzze zzb;
    final zzbd zzc;
    private final zzdm zze = new zzdm(zzdj.zza);
    private final Context zzf;
    private final zzbh zzg;
    private final zzma[] zzh;
    private final zzma[] zzi;
    private final zzzd zzj;
    private final zzdt zzk;
    private final zzkt zzl;
    private final zzdz zzm;
    private final CopyOnWriteArraySet zzn;
    private final zzbj zzo;
    private final List zzp;
    private final boolean zzq;
    private final zzmo zzr;
    private final Looper zzs;
    private final zzzl zzt;
    private final zzdj zzu;
    private final zzkd zzv;
    private final zzke zzw;
    private final zzmm zzx;
    private final zzmn zzy;
    private final long zzz;

    static {
        zzaq.zzb("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public zzkh(zziw zziwVar, zzbh zzbhVar) {
        try {
            zzea.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0-alpha01] [" + zzex.zza + "]");
            this.zzf = zziwVar.zza.getApplicationContext();
            this.zzr = (zzmo) zziwVar.zzh.apply(zziwVar.zzb);
            this.zzS = zziwVar.zzj;
            this.zzN = zziwVar.zzk;
            this.zzL = zziwVar.zzl;
            this.zzP = false;
            this.zzz = zziwVar.zzq;
            zzkg zzkgVar = null;
            zzkd zzkdVar = new zzkd(this, zzkgVar);
            this.zzv = zzkdVar;
            this.zzw = new zzke(zzkgVar);
            zzma[] zzmaVarArrZzac = zzcem.zzac(((zzip) zziwVar.zzc).zza.zza, new Handler(zziwVar.zzi), zzkdVar, zzkdVar, zzkdVar, zzkdVar);
            this.zzh = zzmaVarArrZzac;
            int length = zzmaVarArrZzac.length;
            this.zzi = new zzma[2];
            int i10 = 0;
            while (true) {
                zzma[] zzmaVarArr = this.zzi;
                int length2 = zzmaVarArr.length;
                if (i10 >= 2) {
                    break;
                }
                zzma zzmaVar = this.zzh[i10];
                zzmaVarArr[i10] = null;
                i10++;
            }
            zzzd zzzdVar = (zzzd) zziwVar.zze.zza();
            this.zzj = zzzdVar;
            zziw.zza(((zziq) zziwVar.zzd).zza);
            zzzp zzzpVarZzh = zzzp.zzh(((zzit) zziwVar.zzg).zza);
            this.zzt = zzzpVarZzh;
            this.zzq = zziwVar.zzm;
            this.zzF = zziwVar.zzn;
            this.zzE = zziwVar.zzo;
            Looper looper = zziwVar.zzi;
            this.zzs = looper;
            zzdj zzdjVar = zziwVar.zzb;
            this.zzu = zzdjVar;
            this.zzg = zzbhVar;
            zzdz zzdzVar = new zzdz(looper, zzdjVar, new zzdx(this) { // from class: com.google.android.gms.internal.ads.zzji
                @Override // com.google.android.gms.internal.ads.zzdx
                public final void zza(Object obj, zzv zzvVar) {
                }
            });
            this.zzm = zzdzVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzn = copyOnWriteArraySet;
            this.zzp = new ArrayList();
            this.zzY = new zzxc(0);
            this.zzG = zzix.zza;
            int length3 = this.zzh.length;
            zzze zzzeVar = new zzze(new zzme[2], new zzyw[2], zzbt.zza, null);
            this.zzb = zzzeVar;
            this.zzo = new zzbj();
            zzbc zzbcVar = new zzbc();
            zzbcVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzzdVar.zzn();
            zzbcVar.zzd(29, true);
            zzbcVar.zzd(23, false);
            zzbcVar.zzd(25, false);
            zzbcVar.zzd(33, false);
            zzbcVar.zzd(26, false);
            zzbcVar.zzd(34, false);
            zzbd zzbdVarZze = zzbcVar.zze();
            this.zzc = zzbdVarZze;
            zzbc zzbcVar2 = new zzbc();
            zzbcVar2.zzb(zzbdVarZze);
            zzbcVar2.zza(4);
            zzbcVar2.zza(10);
            this.zzH = zzbcVar2.zze();
            this.zzk = zzdjVar.zzd(looper, null);
            zzjj zzjjVar = new zzjj(this);
            this.zzX = zzjjVar;
            this.zzU = zzls.zzh(zzzeVar);
            this.zzr.zzT(zzbhVar, looper);
            final zzph zzphVar = new zzph(zziwVar.zzt);
            zzkt zzktVar = new zzkt(this.zzf, this.zzh, this.zzi, zzzdVar, zzzeVar, (zzkx) zziwVar.zzf.zza(), zzzpVarZzh, 0, false, this.zzr, this.zzF, zziwVar.zzu, zziwVar.zzp, false, false, looper, zzdjVar, zzjjVar, zzphVar, null, this.zzG, this.zzw);
            this.zzl = zzktVar;
            Looper looperZze = zzktVar.zze();
            this.zzO = 1.0f;
            zzat zzatVar = zzat.zza;
            this.zzI = zzatVar;
            this.zzT = zzatVar;
            this.zzV = -1;
            int i11 = zzcw.zza;
            this.zzQ = true;
            zzmo zzmoVar = this.zzr;
            if (zzmoVar == null) {
                throw null;
            }
            zzdzVar.zzb(zzmoVar);
            zzzpVarZzh.zzf(new Handler(looper), this.zzr);
            copyOnWriteArraySet.add(this.zzv);
            if (Build.VERSION.SDK_INT >= 31) {
                final Context context = this.zzf;
                final boolean z2 = zziwVar.zzr;
                zzdjVar.zzd(zzktVar.zze(), null).zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpd zzpdVarZzb = zzpd.zzb(context);
                        if (zzpdVarZzb == null) {
                            zzea.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z2) {
                            this.zzz(zzpdVarZzb);
                        }
                        zzphVar.zzb(zzpdVarZzb.zza());
                    }
                });
            }
            zzdi zzdiVar = new zzdi(0, looperZze, looper, zzdjVar, new zzjk(this));
            this.zzA = zzdiVar;
            zzdiVar.zzd(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjl
                @Override // java.lang.Runnable
                public final void run() {
                    zzkh.zzJ(this.zza);
                }
            });
            new zzhx(zziwVar.zza, looperZze, zziwVar.zzi, this.zzv, zzdjVar);
            this.zzx = new zzmm(zziwVar.zza, looperZze, zzdjVar);
            this.zzy = new zzmn(zziwVar.zza, looperZze, zzdjVar);
            int i12 = zzo.zza;
            zzcd zzcdVar = zzcd.zza;
            this.zzM = zzeo.zza;
            zzktVar.zzr(this.zzE);
            zzktVar.zzp(this.zzN, false);
            zzad(1, 3, this.zzN);
            zzad(2, 4, Integer.valueOf(this.zzL));
            zzad(2, 5, 0);
            zzad(1, 9, Boolean.valueOf(this.zzP));
            zzad(6, 8, this.zzw);
            zzad(-1, 16, Integer.valueOf(this.zzS));
            this.zze.zzf();
        } catch (Throwable th2) {
            this.zze.zzf();
            throw th2;
        }
    }

    public static /* synthetic */ void zzJ(zzkh zzkhVar) {
        String str = zzex.zza;
        zzkhVar.zzA.zze(Integer.valueOf(zzcj.zzc(zzkhVar.zzf).generateAudioSessionId()));
    }

    public static /* synthetic */ void zzK(zzkh zzkhVar, zzkq zzkqVar) {
        boolean z2;
        int i10 = zzkhVar.zzB - zzkqVar.zzb;
        zzkhVar.zzB = i10;
        boolean z10 = true;
        if (zzkqVar.zzc) {
            zzkhVar.zzC = zzkqVar.zzd;
            zzkhVar.zzD = true;
        }
        if (i10 == 0) {
            zzbl zzblVar = zzkqVar.zza.zza;
            if (!zzkhVar.zzU.zza.zzo() && zzblVar.zzo()) {
                zzkhVar.zzV = -1;
                zzkhVar.zzW = 0L;
            }
            if (!zzblVar.zzo()) {
                List listZzw = ((zzly) zzblVar).zzw();
                int size = listZzw.size();
                List list = zzkhVar.zzp;
                zzdd.zzf(size == list.size());
                for (int i11 = 0; i11 < listZzw.size(); i11++) {
                    ((zzkf) list.get(i11)).zzc((zzbl) listZzw.get(i11));
                }
            }
            long j = -9223372036854775807L;
            if (zzkhVar.zzD) {
                if (zzkqVar.zza.zzb.equals(zzkhVar.zzU.zzb) && zzkqVar.zza.zzd == zzkhVar.zzU.zzs) {
                    z10 = false;
                }
                if (z10) {
                    if (zzblVar.zzo() || zzkqVar.zza.zzb.zzb()) {
                        j = zzkqVar.zza.zzd;
                    } else {
                        zzls zzlsVar = zzkqVar.zza;
                        zzvh zzvhVar = zzlsVar.zzb;
                        long j4 = zzlsVar.zzd;
                        zzkhVar.zzW(zzblVar, zzvhVar, j4);
                        j = j4;
                    }
                }
                z2 = z10;
            } else {
                z2 = false;
            }
            zzkhVar.zzD = false;
            zzkhVar.zzag(zzkqVar.zza, 1, z2, zzkhVar.zzC, j, -1, false);
        }
    }

    public static /* synthetic */ void zzL(zzkh zzkhVar, int i10, final int i11) {
        zzkhVar.zzai();
        Integer numValueOf = Integer.valueOf(i11);
        zzkhVar.zzad(1, 10, numValueOf);
        zzkhVar.zzad(2, 10, numValueOf);
        zzdw zzdwVar = new zzdw() { // from class: com.google.android.gms.internal.ads.zzjm
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i12 = zzkh.zzd;
                ((zzbe) obj).zza(i11);
            }
        };
        zzdz zzdzVar = zzkhVar.zzm;
        zzdzVar.zzd(21, zzdwVar);
        zzdzVar.zzc();
    }

    public static /* bridge */ /* synthetic */ void zzP(zzkh zzkhVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkhVar.zzae(surface);
        zzkhVar.zzK = surface;
    }

    private final int zzS(zzls zzlsVar) {
        zzbl zzblVar = zzlsVar.zza;
        return zzblVar.zzo() ? this.zzV : zzblVar.zzn(zzlsVar.zzb.zza, this.zzo).zzc;
    }

    private final long zzT(zzls zzlsVar) {
        zzvh zzvhVar = zzlsVar.zzb;
        if (!zzvhVar.zzb()) {
            return zzex.zzv(zzU(zzlsVar));
        }
        zzbl zzblVar = zzlsVar.zza;
        zzblVar.zzn(zzvhVar.zza, this.zzo);
        long j = zzlsVar.zzc;
        if (j == -9223372036854775807L) {
            long j4 = zzblVar.zze(zzS(zzlsVar), this.zza, 0L).zzl;
            return zzex.zzv(0L);
        }
        return zzex.zzv(j) + zzex.zzv(0L);
    }

    private final long zzU(zzls zzlsVar) {
        zzbl zzblVar = zzlsVar.zza;
        if (zzblVar.zzo()) {
            return zzex.zzs(this.zzW);
        }
        long j = zzlsVar.zzs;
        zzvh zzvhVar = zzlsVar.zzb;
        if (zzvhVar.zzb()) {
            return j;
        }
        zzW(zzblVar, zzvhVar, j);
        return j;
    }

    private static long zzV(zzls zzlsVar) {
        zzbk zzbkVar = new zzbk();
        zzbj zzbjVar = new zzbj();
        zzbl zzblVar = zzlsVar.zza;
        zzblVar.zzn(zzlsVar.zzb.zza, zzbjVar);
        long j = zzlsVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j4 = zzblVar.zze(zzbjVar.zzc, zzbkVar, 0L).zzl;
        return 0L;
    }

    private final long zzW(zzbl zzblVar, zzvh zzvhVar, long j) {
        zzblVar.zzn(zzvhVar.zza, this.zzo);
        return j;
    }

    private final Pair zzX(zzbl zzblVar, int i10, long j) {
        if (zzblVar.zzo()) {
            this.zzV = i10;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzW = j;
            return null;
        }
        if (i10 == -1 || i10 >= zzblVar.zzc()) {
            i10 = zzblVar.zzg(false);
            long j4 = zzblVar.zze(i10, this.zza, 0L).zzl;
            j = zzex.zzv(0L);
        }
        return zzblVar.zzl(this.zza, this.zzo, i10, zzex.zzs(j));
    }

    private static zzls zzY(zzls zzlsVar, int i10) {
        zzls zzlsVarZzf = zzlsVar.zzf(i10);
        return (i10 == 1 || i10 == 4) ? zzlsVarZzf.zza(false) : zzlsVarZzf;
    }

    private final zzls zzZ(zzls zzlsVar, zzbl zzblVar, Pair pair) {
        zzdd.zzd(zzblVar.zzo() || pair != null);
        zzbl zzblVar2 = zzlsVar.zza;
        long jZzT = zzT(zzlsVar);
        zzls zzlsVarZzg = zzlsVar.zzg(zzblVar);
        if (zzblVar.zzo()) {
            zzvh zzvhVarZzi = zzls.zzi();
            long jZzs = zzex.zzs(this.zzW);
            zzls zzlsVarZzb = zzlsVarZzg.zzc(zzvhVarZzi, jZzs, jZzs, jZzs, 0L, zzxk.zza, this.zzb, zzfyf.zzn()).zzb(zzvhVarZzi);
            zzlsVarZzb.zzq = zzlsVarZzb.zzs;
            return zzlsVarZzb;
        }
        zzvh zzvhVar = zzlsVarZzg.zzb;
        Object obj = zzvhVar.zza;
        String str = zzex.zza;
        boolean zEquals = obj.equals(pair.first);
        zzvh zzvhVar2 = !zEquals ? new zzvh(pair.first, -1L) : zzvhVar;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzs2 = zzex.zzs(jZzT);
        if (!zzblVar2.zzo()) {
            zzblVar2.zzn(obj, this.zzo);
        }
        if (!zEquals || jLongValue < jZzs2) {
            zzvh zzvhVar3 = zzvhVar2;
            zzdd.zzf(!zzvhVar3.zzb());
            zzls zzlsVarZzb2 = zzlsVarZzg.zzc(zzvhVar3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? zzxk.zza : zzlsVarZzg.zzh, !zEquals ? this.zzb : zzlsVarZzg.zzi, !zEquals ? zzfyf.zzn() : zzlsVarZzg.zzj).zzb(zzvhVar3);
            zzlsVarZzb2.zzq = jLongValue;
            return zzlsVarZzb2;
        }
        if (jLongValue != jZzs2) {
            zzvh zzvhVar4 = zzvhVar2;
            zzdd.zzf(!zzvhVar4.zzb());
            long jMax = Math.max(0L, zzlsVarZzg.zzr - (jLongValue - jZzs2));
            long j = zzlsVarZzg.zzq;
            if (zzlsVarZzg.zzk.equals(zzvhVar)) {
                j = jLongValue + jMax;
            }
            zzls zzlsVarZzc = zzlsVarZzg.zzc(zzvhVar4, jLongValue, jLongValue, jLongValue, jMax, zzlsVarZzg.zzh, zzlsVarZzg.zzi, zzlsVarZzg.zzj);
            zzlsVarZzc.zzq = j;
            return zzlsVarZzc;
        }
        int iZza = zzblVar.zza(zzlsVarZzg.zzk.zza);
        if (iZza != -1) {
            zzbj zzbjVar = this.zzo;
            if (zzblVar.zzd(iZza, zzbjVar, false).zzc == zzblVar.zzn(zzvhVar2.zza, zzbjVar).zzc) {
                return zzlsVarZzg;
            }
        }
        Object obj2 = zzvhVar2.zza;
        zzbj zzbjVar2 = this.zzo;
        zzblVar.zzn(obj2, zzbjVar2);
        long jZzf = zzvhVar2.zzb() ? zzbjVar2.zzf(zzvhVar2.zzb, zzvhVar2.zzc) : zzbjVar2.zzd;
        zzvh zzvhVar5 = zzvhVar2;
        zzls zzlsVarZzb3 = zzlsVarZzg.zzc(zzvhVar5, zzlsVarZzg.zzs, zzlsVarZzg.zzs, zzlsVarZzg.zzd, jZzf - zzlsVarZzg.zzs, zzlsVarZzg.zzh, zzlsVarZzg.zzi, zzlsVarZzg.zzj).zzb(zzvhVar5);
        zzlsVarZzb3.zzq = jZzf;
        return zzlsVarZzb3;
    }

    private final zzlw zzaa(zzlv zzlvVar) {
        int iZzS = zzS(this.zzU);
        zzbl zzblVar = this.zzU.zza;
        if (iZzS == -1) {
            iZzS = 0;
        }
        zzdj zzdjVar = this.zzu;
        zzkt zzktVar = this.zzl;
        return new zzlw(zzktVar, zzlvVar, zzblVar, iZzS, zzdjVar, zzktVar.zze());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ void zzab(final zzkq zzkqVar) {
        this.zzk.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjo
            @Override // java.lang.Runnable
            public final void run() {
                zzkh.zzK(this.zza, zzkqVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(final int i10, final int i11) {
        if (i10 == this.zzM.zzb() && i11 == this.zzM.zza()) {
            return;
        }
        this.zzM = new zzeo(i10, i11);
        zzdz zzdzVar = this.zzm;
        zzdzVar.zzd(24, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjf
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i12 = zzkh.zzd;
                ((zzbe) obj).zzp(i10, i11);
            }
        });
        zzdzVar.zzc();
        zzad(2, 14, new zzeo(i10, i11));
    }

    private final void zzad(int i10, int i11, Object obj) {
        zzma[] zzmaVarArr = this.zzh;
        int length = zzmaVarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zzma zzmaVar = zzmaVarArr[i12];
            if (i10 == -1 || zzmaVar.zzb() == i10) {
                zzlw zzlwVarZzaa = zzaa(zzmaVar);
                zzlwVarZzaa.zzf(i11);
                zzlwVarZzaa.zze(obj);
                zzlwVarZzaa.zzd();
            }
        }
        zzma[] zzmaVarArr2 = this.zzi;
        int length2 = zzmaVarArr2.length;
        for (int i13 = 0; i13 < 2; i13++) {
            zzma zzmaVar2 = zzmaVarArr2[i13];
            if (zzmaVar2 != null && (i10 == -1 || zzmaVar2.zzb() == i10)) {
                zzlw zzlwVarZzaa2 = zzaa(zzmaVar2);
                zzlwVarZzaa2.zzf(i11);
                zzlwVarZzaa2.zze(obj);
                zzlwVarZzaa2.zzd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzae(Object obj) {
        Object obj2 = this.zzJ;
        boolean z2 = false;
        if (obj2 != null && obj2 != obj) {
            z2 = true;
        }
        boolean zZzv = this.zzl.zzv(obj, z2 ? this.zzz : -9223372036854775807L);
        if (z2) {
            Object obj3 = this.zzJ;
            Surface surface = this.zzK;
            if (obj3 == surface) {
                surface.release();
                this.zzK = null;
            }
        }
        this.zzJ = obj;
        if (zZzv) {
            return;
        }
        zzaf(zzin.zzd(new zzku(3), 1003));
    }

    private final void zzaf(zzin zzinVar) {
        zzls zzlsVar = this.zzU;
        zzls zzlsVarZzb = zzlsVar.zzb(zzlsVar.zzb);
        zzlsVarZzb.zzq = zzlsVarZzb.zzs;
        zzlsVarZzb.zzr = 0L;
        zzls zzlsVarZzY = zzY(zzlsVarZzb, 1);
        if (zzinVar != null) {
            zzlsVarZzY = zzlsVarZzY.zze(zzinVar);
        }
        this.zzB++;
        this.zzl.zzt();
        zzag(zzlsVarZzY, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0470 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x047a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0285  */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzag(final com.google.android.gms.internal.ads.zzls r33, final int r34, boolean r35, int r36, long r37, int r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.zzag(com.google.android.gms.internal.ads.zzls, int, boolean, int, long, int, boolean):void");
    }

    private final void zzah() {
        int iZzg = zzg();
        if (iZzg != 2 && iZzg != 3) {
            this.zzx.zza(false);
            this.zzy.zza(false);
        } else {
            zzai();
            boolean z2 = this.zzU.zzp;
            this.zzx.zza(zzv());
            this.zzy.zza(zzv());
        }
    }

    private final void zzai() {
        this.zze.zzb();
        Looper looper = this.zzs;
        if (Thread.currentThread() != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = zzex.zza;
            Locale locale = Locale.US;
            String strK = m1.k("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.zzQ) {
                throw new IllegalStateException(strK);
            }
            zzea.zzg("ExoPlayerImpl", strK, this.zzR ? null : new IllegalStateException());
            this.zzR = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzA() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzex.zza;
        String strZza = zzaq.zza();
        StringBuilder sbM = m1.m("Release ", hexString, " [AndroidXMedia3/1.8.0-alpha01] [", str, "] [");
        sbM.append(strZza);
        sbM.append("]");
        zzea.zze("ExoPlayerImpl", sbM.toString());
        zzai();
        this.zzx.zza(false);
        this.zzy.zza(false);
        if (!this.zzl.zzu()) {
            zzdz zzdzVar = this.zzm;
            zzdzVar.zzd(10, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjg
                @Override // com.google.android.gms.internal.ads.zzdw
                public final void zza(Object obj) {
                    int i10 = zzkh.zzd;
                    ((zzbe) obj).zzk(zzin.zzd(new zzku(1), 1003));
                }
            });
            zzdzVar.zzc();
        }
        this.zzm.zze();
        this.zzk.zzf(null);
        zzzl zzzlVar = this.zzt;
        zzmo zzmoVar = this.zzr;
        zzzlVar.zzg(zzmoVar);
        zzls zzlsVar = this.zzU;
        boolean z2 = zzlsVar.zzp;
        zzls zzlsVarZzY = zzY(zzlsVar, 1);
        this.zzU = zzlsVarZzY;
        zzls zzlsVarZzb = zzlsVarZzY.zzb(zzlsVarZzY.zzb);
        this.zzU = zzlsVarZzb;
        zzlsVarZzb.zzq = zzlsVarZzb.zzs;
        this.zzU.zzr = 0L;
        zzmoVar.zzR();
        Surface surface = this.zzK;
        if (surface != null) {
            surface.release();
            this.zzK = null;
        }
        int i10 = zzcw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzB(zzmr zzmrVar) {
        zzai();
        this.zzr.zzS(zzmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzC(zzvj zzvjVar) {
        zzai();
        List listSingletonList = Collections.singletonList(zzvjVar);
        zzai();
        zzai();
        zzS(this.zzU);
        zzl();
        this.zzB++;
        List list = this.zzp;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                list.remove(i10);
            }
            this.zzY = this.zzY.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < listSingletonList.size(); i11++) {
            zzlp zzlpVar = new zzlp((zzvj) listSingletonList.get(i11), this.zzq);
            arrayList.add(zzlpVar);
            list.add(i11, new zzkf(zzlpVar.zzb, zzlpVar.zza));
        }
        this.zzY = this.zzY.zzg(0, arrayList.size());
        zzly zzlyVar = new zzly(list, this.zzY);
        if (!zzlyVar.zzo() && zzlyVar.zzc() < 0) {
            throw new zzaa(zzlyVar, -1, -9223372036854775807L);
        }
        int iZzg = zzlyVar.zzg(false);
        zzls zzlsVarZzZ = zzZ(this.zzU, zzlyVar, zzX(zzlyVar, iZzg, -9223372036854775807L));
        int i12 = zzlsVarZzZ.zze;
        if (iZzg != -1 && i12 != 1) {
            i12 = 4;
            if (!zzlyVar.zzo() && iZzg < zzlyVar.zzc()) {
                i12 = 2;
            }
        }
        zzls zzlsVarZzY = zzY(zzlsVarZzZ, i12);
        this.zzl.zzw(arrayList, iZzg, zzex.zzs(-9223372036854775807L), this.zzY);
        zzag(zzlsVarZzY, 0, (this.zzU.zzb.zza.equals(zzlsVarZzY.zzb.zza) || this.zzU.zza.zzo()) ? false : true, 4, zzU(zzlsVarZzY), -1, false);
    }

    public final zzin zzF() {
        zzai();
        return this.zzU.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzg
    public final void zzb(int i10, long j, int i11, boolean z2) {
        zzai();
        if (i10 == -1) {
            return;
        }
        zzdd.zzd(i10 >= 0);
        zzbl zzblVar = this.zzU.zza;
        if (zzblVar.zzo() || i10 < zzblVar.zzc()) {
            this.zzr.zzv();
            this.zzB++;
            if (zzx()) {
                zzea.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkq zzkqVar = new zzkq(this.zzU);
                zzkqVar.zza(1);
                this.zzX.zza.zzab(zzkqVar);
                return;
            }
            zzls zzlsVarZzY = this.zzU;
            int i12 = zzlsVarZzY.zze;
            if (i12 == 3 || (i12 == 4 && !zzblVar.zzo())) {
                zzlsVarZzY = zzY(this.zzU, 2);
            }
            int iZze = zze();
            zzls zzlsVarZzZ = zzZ(zzlsVarZzY, zzblVar, zzX(zzblVar, i10, j));
            this.zzl.zzn(zzblVar, i10, zzex.zzs(j));
            zzag(zzlsVarZzZ, 0, true, 1, zzU(zzlsVarZzZ), iZze, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzc() {
        zzai();
        if (zzx()) {
            return this.zzU.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzd() {
        zzai();
        if (zzx()) {
            return this.zzU.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zze() {
        zzai();
        int iZzS = zzS(this.zzU);
        if (iZzS == -1) {
            return 0;
        }
        return iZzS;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzf() {
        zzai();
        if (this.zzU.zza.zzo()) {
            return 0;
        }
        zzls zzlsVar = this.zzU;
        return zzlsVar.zza.zza(zzlsVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzg() {
        zzai();
        return this.zzU.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzh() {
        zzai();
        return this.zzU.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzi() {
        zzai();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzj() {
        zzai();
        if (zzx()) {
            zzls zzlsVar = this.zzU;
            return zzlsVar.zzk.equals(zzlsVar.zzb) ? zzex.zzv(this.zzU.zzq) : zzm();
        }
        zzai();
        if (this.zzU.zza.zzo()) {
            return this.zzW;
        }
        zzls zzlsVar2 = this.zzU;
        long j = 0;
        if (zzlsVar2.zzk.zzd != zzlsVar2.zzb.zzd) {
            return zzex.zzv(zzlsVar2.zza.zze(zze(), this.zza, 0L).zzm);
        }
        long j4 = zzlsVar2.zzq;
        if (this.zzU.zzk.zzb()) {
            zzls zzlsVar3 = this.zzU;
            zzlsVar3.zza.zzn(zzlsVar3.zzk.zza, this.zzo).zzg(this.zzU.zzk.zzb);
        } else {
            j = j4;
        }
        zzls zzlsVar4 = this.zzU;
        zzW(zzlsVar4.zza, zzlsVar4.zzk, j);
        return zzex.zzv(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzk() {
        zzai();
        return zzT(this.zzU);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzl() {
        zzai();
        return zzex.zzv(zzU(this.zzU));
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzm() {
        zzai();
        if (!zzx()) {
            zzbl zzblVarZzo = zzo();
            if (zzblVarZzo.zzo()) {
                return -9223372036854775807L;
            }
            return zzex.zzv(zzblVarZzo.zze(zze(), this.zza, 0L).zzm);
        }
        zzls zzlsVar = this.zzU;
        zzvh zzvhVar = zzlsVar.zzb;
        zzbl zzblVar = zzlsVar.zza;
        Object obj = zzvhVar.zza;
        zzbj zzbjVar = this.zzo;
        zzblVar.zzn(obj, zzbjVar);
        return zzex.zzv(zzbjVar.zzf(zzvhVar.zzb, zzvhVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzn() {
        zzai();
        return zzex.zzv(this.zzU.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final zzbl zzo() {
        zzai();
        return this.zzU.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final zzbt zzp() {
        zzai();
        return this.zzU.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzq() {
        zzai();
        zzls zzlsVar = this.zzU;
        if (zzlsVar.zze != 1) {
            return;
        }
        zzls zzlsVarZze = zzlsVar.zze(null);
        zzls zzlsVarZzY = zzY(zzlsVarZze, true != zzlsVarZze.zza.zzo() ? 2 : 4);
        this.zzB++;
        this.zzl.zzm();
        zzag(zzlsVarZzY, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzr(boolean z2) {
        zzai();
        zzls zzlsVar = this.zzU;
        int i10 = zzlsVar.zzn;
        int i11 = 0;
        if (i10 == 1) {
            if (z2) {
                i10 = 1;
            } else {
                i10 = 1;
                i11 = 1;
            }
        }
        if (zzlsVar.zzl == z2 && i10 == i11 && zzlsVar.zzm == 1) {
            return;
        }
        this.zzB++;
        zzls zzlsVarZzd = zzlsVar.zzd(z2, 1, i11);
        this.zzl.zzq(z2, 1, i11);
        zzag(zzlsVarZzd, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzs(Surface surface) {
        zzai();
        zzae(surface);
        int i10 = surface == null ? 0 : -1;
        zzac(i10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzt(float f10) {
        zzai();
        String str = zzex.zza;
        final float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.zzO == fMax) {
            return;
        }
        this.zzO = fMax;
        this.zzl.zzs(fMax);
        zzdz zzdzVar = this.zzm;
        zzdzVar.zzd(22, new zzdw() { // from class: com.google.android.gms.internal.ads.zzje
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i10 = zzkh.zzd;
                ((zzbe) obj).zzt(fMax);
            }
        });
        zzdzVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzu() {
        zzai();
        zzaf(null);
        new zzcw(zzfyf.zzn(), this.zzU.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean zzv() {
        zzai();
        return this.zzU.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean zzw() {
        zzai();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean zzx() {
        zzai();
        return this.zzU.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final int zzy() {
        zzai();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzz(zzmr zzmrVar) {
        this.zzr.zzu(zzmrVar);
    }
}
