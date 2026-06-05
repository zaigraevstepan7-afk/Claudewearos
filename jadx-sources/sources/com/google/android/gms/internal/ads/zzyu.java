package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzyu extends zzza implements zzmc {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfzq zzc = zzfzq.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzxu
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i10 = zzyu.zzb;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    public final Context zza;
    private final Object zzd;
    private zzyi zze;
    private Thread zzf;
    private zzym zzg;
    private zze zzh;
    private final zzxq zzi;

    public zzyu(Context context) {
        zzxq zzxqVar = new zzxq();
        zzyi zzyiVar = zzyi.zzF;
        this.zzd = new Object();
        zzyt zzytVar = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzi = zzxqVar;
        if (zzyiVar != null) {
            this.zze = zzyiVar;
        } else {
            zzyh zzyhVar = new zzyh(zzyiVar, zzytVar);
            zzyhVar.zzw(zzyiVar);
            this.zze = new zzyi(zzyhVar);
        }
        this.zzh = zze.zza;
        if (this.zze.zzQ && context == null) {
            zzea.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static /* bridge */ /* synthetic */ int zzb(int i10, int i11) {
        return (i10 == 0 || i10 != i11) ? Integer.bitCount(i10 & i11) : f.API_PRIORITY_OTHER;
    }

    public static int zzc(zzz zzzVar, String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && str.equals(zzzVar.zzd)) {
            return 4;
        }
        String strZzh = zzh(str);
        String strZzh2 = zzh(zzzVar.zzd);
        if (strZzh2 == null || strZzh == null) {
            return (z2 && strZzh2 == null) ? 1 : 0;
        }
        if (strZzh2.startsWith(strZzh) || strZzh.startsWith(strZzh2)) {
            return 3;
        }
        String str2 = zzex.zza;
        return strZzh2.split("-", 2)[0].equals(strZzh.split("-", 2)[0]) ? 2 : 0;
    }

    public static String zzh(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean zzm(com.google.android.gms.internal.ads.zzyu r3, com.google.android.gms.internal.ads.zzyi r4, com.google.android.gms.internal.ads.zzz r5) {
        /*
            boolean r4 = r4.zzQ
            r0 = 1
            if (r4 == 0) goto L77
            int r4 = r5.zzG
            r1 = -1
            if (r4 == r1) goto L77
            r1 = 2
            if (r4 <= r1) goto L77
            java.lang.String r4 = r5.zzo
            r1 = 32
            if (r4 != 0) goto L14
            goto L4e
        L14:
            int r2 = r4.hashCode()
            switch(r2) {
                case -2123537834: goto L37;
                case 187078296: goto L2e;
                case 187078297: goto L25;
                case 1504578661: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L4e
        L1c:
            java.lang.String r2 = "audio/eac3"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L4e
            goto L3f
        L25:
            java.lang.String r2 = "audio/ac4"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L4e
            goto L3f
        L2e:
            java.lang.String r2 = "audio/ac3"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L4e
            goto L3f
        L37:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L4e
        L3f:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r1) goto L4d
            com.google.android.gms.internal.ads.zzym r4 = r3.zzg
            if (r4 == 0) goto L4d
            boolean r4 = r4.zze()
            if (r4 != 0) goto L4e
        L4d:
            return r0
        L4e:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            if (r4 < r1) goto L76
            com.google.android.gms.internal.ads.zzym r4 = r3.zzg
            if (r4 == 0) goto L76
            boolean r1 = r4.zze()
            if (r1 == 0) goto L76
            boolean r4 = r4.zzc()
            if (r4 == 0) goto L76
            com.google.android.gms.internal.ads.zzym r4 = r3.zzg
            boolean r4 = r4.zzd()
            if (r4 == 0) goto L76
            com.google.android.gms.internal.ads.zzym r4 = r3.zzg
            com.google.android.gms.internal.ads.zze r3 = r3.zzh
            boolean r3 = r4.zzb(r3, r5)
            if (r3 == 0) goto L76
            return r0
        L76:
            return r2
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyu.zzm(com.google.android.gms.internal.ads.zzyu, com.google.android.gms.internal.ads.zzyi, com.google.android.gms.internal.ads.zzz):boolean");
    }

    private static void zzt(zzxk zzxkVar, zzbr zzbrVar, Map map) {
        for (int i10 = 0; i10 < zzxkVar.zzb; i10++) {
            if (((zzbn) zzbrVar.zzD.get(zzxkVar.zzb(i10))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        boolean z2;
        zzym zzymVar;
        synchronized (this.zzd) {
            try {
                z2 = false;
                if (this.zze.zzQ && Build.VERSION.SDK_INT >= 32 && (zzymVar = this.zzg) != null && zzymVar.zze()) {
                    z2 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z2) {
            zzs();
        }
    }

    private static final Pair zzv(int i10, zzyz zzyzVar, int[][][] iArr, zzyo zzyoVar, Comparator comparator) {
        RandomAccess randomAccessZzo;
        zzyz zzyzVar2 = zzyzVar;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < 2) {
            if (i10 == zzyzVar2.zzc(i11)) {
                zzxk zzxkVarZzd = zzyzVar2.zzd(i11);
                for (int i12 = 0; i12 < zzxkVarZzd.zzb; i12++) {
                    zzbm zzbmVarZzb = zzxkVarZzd.zzb(i12);
                    List listZza = zzyoVar.zza(i11, zzbmVarZzb, iArr[i11][i12]);
                    int i13 = zzbmVarZzb.zza;
                    boolean[] zArr = new boolean[i13];
                    int i14 = 0;
                    while (i14 < i13) {
                        int i15 = i14 + 1;
                        zzyp zzypVar = (zzyp) listZza.get(i14);
                        int iZzb = zzypVar.zzb();
                        if (!zArr[i14] && iZzb != 0) {
                            if (iZzb == 1) {
                                randomAccessZzo = zzfyf.zzo(zzypVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzypVar);
                                for (int i16 = i15; i16 < i13; i16++) {
                                    zzyp zzypVar2 = (zzyp) listZza.get(i16);
                                    if (zzypVar2.zzb() == 2 && zzypVar.zzc(zzypVar2)) {
                                        arrayList2.add(zzypVar2);
                                        zArr[i16] = true;
                                    }
                                }
                                randomAccessZzo = arrayList2;
                            }
                            arrayList.add(randomAccessZzo);
                        }
                        i14 = i15;
                    }
                }
            }
            i11++;
            zzyzVar2 = zzyzVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((zzyp) list.get(i17)).zzc;
        }
        zzyp zzypVar3 = (zzyp) list.get(0);
        return Pair.create(new zzyv(zzypVar3.zzb, iArr2, 0), Integer.valueOf(zzypVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zza(zzma zzmaVar) {
        synchronized (this.zzd) {
            boolean z2 = this.zze.zzU;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final Pair zzd(zzyz zzyzVar, int[][][] iArr, final int[] iArr2, zzvh zzvhVar, zzbl zzblVar) {
        final zzyi zzyiVar;
        int i10;
        final boolean z2;
        final String str;
        final String languageTag;
        int[] iArr3;
        int length;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzyiVar = this.zze;
        }
        if (zzyiVar.zzQ && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzym(this.zza, this);
        }
        int i11 = 2;
        zzyv[] zzyvVarArr = new zzyv[2];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= 2) {
                z2 = false;
                break;
            }
            if (zzyzVar.zzc(i13) == 2 && zzyzVar.zzd(i13).zzb > 0) {
                z2 = true;
                break;
            }
            i13++;
        }
        Pair pairZzv = zzv(1, zzyzVar, iArr, new zzyo() { // from class: com.google.android.gms.internal.ads.zzxz
            @Override // com.google.android.gms.internal.ads.zzyo
            public final List zza(int i14, zzbm zzbmVar, int[] iArr4) {
                final zzyu zzyuVar = this.zza;
                final zzyi zzyiVar2 = zzyiVar;
                zzfvf zzfvfVar = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzyb
                    @Override // com.google.android.gms.internal.ads.zzfvf
                    public final boolean zza(Object obj) {
                        return zzyu.zzm(zzyuVar, zzyiVar2, (zzz) obj);
                    }
                };
                int i15 = iArr2[i14];
                int i16 = zzfyf.zzd;
                zzfyc zzfycVar = new zzfyc();
                for (int i17 = 0; i17 < zzbmVar.zza; i17++) {
                    zzfycVar.zzf(new zzye(i14, zzbmVar, i17, zzyiVar2, iArr4[i17], z2, zzfvfVar, i15));
                }
                return zzfycVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzya
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzye) Collections.max((List) obj)).zza((zzye) Collections.max((List) obj2));
            }
        });
        if (pairZzv != null) {
            zzyvVarArr[((Integer) pairZzv.second).intValue()] = (zzyv) pairZzv.first;
        }
        if (pairZzv == null) {
            str = null;
        } else {
            Object obj = pairZzv.first;
            str = ((zzyv) obj).zza.zzb(((zzyv) obj).zzb[0]).zzd;
        }
        int i14 = zzyiVar.zzu.zzb;
        final Point pointZzw = (!zzyiVar.zzk || (context2 = this.zza) == null) ? null : zzex.zzw(context2);
        Pair pairZzv2 = zzv(2, zzyzVar, iArr, new zzyo() { // from class: com.google.android.gms.internal.ads.zzxx
            /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
            @Override // com.google.android.gms.internal.ads.zzyo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List zza(int r18, com.google.android.gms.internal.ads.zzbm r19, int[] r20) {
                /*
                    Method dump skipped, instructions count: 207
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxx.zza(int, com.google.android.gms.internal.ads.zzbm, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxy
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                List list = (List) obj2;
                List list2 = (List) obj3;
                return zzfxu.zzj().zzc((zzys) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyq
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzys.zzd((zzys) obj4, (zzys) obj5);
                    }
                }), (zzys) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyq
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzys.zzd((zzys) obj4, (zzys) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzyq
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzys.zzd((zzys) obj4, (zzys) obj5);
                    }
                }).zzb(list.size(), list2.size()).zzc((zzys) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyr
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzys.zza((zzys) obj4, (zzys) obj5);
                    }
                }), (zzys) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyr
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzys.zza((zzys) obj4, (zzys) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzyr
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzys.zza((zzys) obj4, (zzys) obj5);
                    }
                }).zza();
            }
        });
        int i15 = 4;
        Pair pairZzv3 = pairZzv2 == null ? zzv(4, zzyzVar, iArr, new zzyo() { // from class: com.google.android.gms.internal.ads.zzxv
            @Override // com.google.android.gms.internal.ads.zzyo
            public final List zza(int i16, zzbm zzbmVar, int[] iArr4) {
                int i17 = zzyu.zzb;
                int i18 = zzfyf.zzd;
                zzfyc zzfycVar = new zzfyc();
                for (int i19 = 0; i19 < zzbmVar.zza; i19++) {
                    zzfycVar.zzf(new zzyf(i16, zzbmVar, i19, zzyiVar, iArr4[i19]));
                }
                return zzfycVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxw
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzyf) ((List) obj2).get(0)).compareTo((zzyf) ((List) obj3).get(0));
            }
        }) : null;
        if (pairZzv3 != null) {
            zzyvVarArr[((Integer) pairZzv3.second).intValue()] = (zzyv) pairZzv3.first;
        } else if (pairZzv2 != null) {
            zzyvVarArr[((Integer) pairZzv2.second).intValue()] = (zzyv) pairZzv2.first;
        }
        if (!zzyiVar.zzx || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = zzex.zza;
            languageTag = locale.toLanguageTag();
        }
        int i16 = 3;
        Pair pairZzv4 = zzv(3, zzyzVar, iArr, new zzyo() { // from class: com.google.android.gms.internal.ads.zzyc
            @Override // com.google.android.gms.internal.ads.zzyo
            public final List zza(int i17, zzbm zzbmVar, int[] iArr4) {
                int i18 = zzyu.zzb;
                int i19 = zzfyf.zzd;
                zzfyc zzfycVar = new zzfyc();
                for (int i20 = 0; i20 < zzbmVar.zza; i20++) {
                    zzfycVar.zzf(new zzyn(i17, zzbmVar, i20, zzyiVar, iArr4[i20], str, languageTag));
                }
                return zzfycVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyd
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzyn) ((List) obj2).get(0)).zza((zzyn) ((List) obj3).get(0));
            }
        });
        if (pairZzv4 != null) {
            zzyvVarArr[((Integer) pairZzv4.second).intValue()] = (zzyv) pairZzv4.first;
        }
        int i17 = 0;
        while (i17 < i11) {
            int iZzc = zzyzVar.zzc(i17);
            if (iZzc != i11 && iZzc != i10 && iZzc != i16 && iZzc != i15) {
                zzxk zzxkVarZzd = zzyzVar.zzd(i17);
                int[][] iArr4 = iArr[i17];
                int i18 = i12;
                int i19 = i18;
                zzbm zzbmVar = null;
                zzyg zzygVar = null;
                while (i18 < zzxkVarZzd.zzb) {
                    zzbm zzbmVarZzb = zzxkVarZzd.zzb(i18);
                    int[] iArr5 = iArr4[i18];
                    zzyg zzygVar2 = zzygVar;
                    for (int i20 = i12; i20 < zzbmVarZzb.zza; i20++) {
                        if (zzmb.zza(iArr5[i20], zzyiVar.zzR)) {
                            zzyg zzygVar3 = new zzyg(zzbmVarZzb.zzb(i20), iArr5[i20]);
                            if (zzygVar2 == null || zzygVar3.compareTo(zzygVar2) > 0) {
                                zzbmVar = zzbmVarZzb;
                                zzygVar2 = zzygVar3;
                                i19 = i20;
                            }
                        }
                    }
                    i18++;
                    zzygVar = zzygVar2;
                    i12 = 0;
                }
                zzyvVarArr[i17] = zzbmVar == null ? null : new zzyv(zzbmVar, new int[]{i19}, 0);
            }
            i17++;
            i11 = 2;
            i12 = 0;
            i16 = 3;
            i10 = 1;
            i15 = 4;
        }
        HashMap map = new HashMap();
        int i21 = 2;
        for (int i22 = 0; i22 < 2; i22++) {
            zzt(zzyzVar.zzd(i22), zzyiVar, map);
        }
        zzt(zzyzVar.zze(), zzyiVar, map);
        for (int i23 = 0; i23 < 2; i23++) {
            if (((zzbn) map.get(Integer.valueOf(zzyzVar.zzc(i23)))) != null) {
                throw null;
            }
        }
        int i24 = 0;
        while (i24 < i21) {
            zzxk zzxkVarZzd2 = zzyzVar.zzd(i24);
            if (zzyiVar.zzf(i24, zzxkVarZzd2)) {
                if (zzyiVar.zzd(i24, zzxkVarZzd2) != null) {
                    throw null;
                }
                zzyvVarArr[i24] = null;
            }
            i24++;
            i21 = 2;
        }
        int i25 = 0;
        while (i25 < i21) {
            int iZzc2 = zzyzVar.zzc(i25);
            if (zzyiVar.zze(i25) || zzyiVar.zzE.contains(Integer.valueOf(iZzc2))) {
                zzyvVarArr[i25] = null;
            }
            i25++;
            i21 = 2;
        }
        zzxq zzxqVar = this.zzi;
        zzzl zzzlVarZzq = zzq();
        zzfyf zzfyfVarZzd = zzxr.zzd(zzyvVarArr);
        int i26 = 2;
        zzyw[] zzywVarArr = new zzyw[2];
        int i27 = 0;
        while (i27 < i26) {
            zzyv zzyvVar = zzyvVarArr[i27];
            if (zzyvVar != null && (length = (iArr3 = zzyvVar.zzb).length) != 0) {
                zzywVarArr[i27] = length == 1 ? new zzyx(zzyvVar.zza, iArr3[0], 0, 0, null) : zzxqVar.zza(zzyvVar.zza, iArr3, 0, zzzlVarZzq, (zzfyf) zzfyfVarZzd.get(i27));
            }
            i27++;
            i26 = 2;
        }
        zzme[] zzmeVarArr = new zzme[i26];
        for (int i28 = 0; i28 < i26; i28++) {
            zzmeVarArr[i28] = (zzyiVar.zze(i28) || zzyiVar.zzE.contains(Integer.valueOf(zzyzVar.zzc(i28))) || (zzyzVar.zzc(i28) != -2 && zzywVarArr[i28] == null)) ? null : zzme.zza;
        }
        return Pair.create(zzmeVarArr, zzywVarArr);
    }

    public final zzyi zzf() {
        zzyi zzyiVar;
        synchronized (this.zzd) {
            zzyiVar = this.zze;
        }
        return zzyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final void zzj() {
        zzym zzymVar;
        synchronized (this.zzd) {
            try {
                Thread thread = this.zzf;
                if (thread != null) {
                    zzdd.zzg(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzymVar = this.zzg) != null) {
            zzymVar.zza();
            this.zzg = null;
        }
        super.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final void zzk(zze zzeVar) {
        if (this.zzh.equals(zzeVar)) {
            return;
        }
        this.zzh = zzeVar;
        zzu();
    }

    public final void zzl(zzyh zzyhVar) {
        boolean zEquals;
        zzyi zzyiVar = new zzyi(zzyhVar);
        synchronized (this.zzd) {
            zEquals = this.zze.equals(zzyiVar);
            this.zze = zzyiVar;
        }
        if (zEquals) {
            return;
        }
        if (zzyiVar.zzQ && this.zza == null) {
            zzea.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final boolean zzn() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final zzmc zze() {
        return this;
    }
}
