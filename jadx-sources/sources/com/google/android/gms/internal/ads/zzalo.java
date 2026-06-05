package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzalo {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzalu zzf;
    public final String zzg;
    public final String zzh;
    public final zzalo zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzalo(String str, String str2, long j, long j4, zzalu zzaluVar, String[] strArr, String str3, String str4, zzalo zzaloVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaluVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j4;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzaloVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzalo zzb(String str, long j, long j4, zzalu zzaluVar, String[] strArr, String str2, String str3, zzalo zzaloVar) {
        return new zzalo(str, null, j, j4, zzaluVar, strArr, str2, str3, zzaloVar);
    }

    public static zzalo zzc(String str) {
        return new zzalo(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcs zzcsVar = new zzcs();
            zzcsVar.zzl(new SpannableStringBuilder());
            map.put(str, zzcsVar);
        }
        CharSequence charSequenceZzr = ((zzcs) map.get(str)).zzr();
        charSequenceZzr.getClass();
        return (SpannableStringBuilder) charSequenceZzr;
    }

    private final void zzj(TreeSet treeSet, boolean z2) {
        String str = this.zza;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z2 || zEquals || (zEquals2 && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j4 = this.zze;
            if (j4 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j4));
            }
        }
        if (this.zzm != null) {
            for (int i10 = 0; i10 < this.zzm.size(); i10++) {
                zzalo zzaloVar = (zzalo) this.zzm.get(i10);
                boolean z10 = true;
                if (!z2 && !zEquals) {
                    z10 = false;
                }
                zzaloVar.zzj(treeSet, z10);
            }
        }
    }

    private final void zzk(long j, String str, List list) {
        String str2;
        String str3 = this.zzg;
        if (true != "".equals(str3)) {
            str = str3;
        }
        if (zzg(j) && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < zza(); i10++) {
            zzd(i10).zzk(j, str, list);
        }
    }

    private final void zzl(long j, Map map, Map map2, String str, Map map3) {
        Iterator it;
        zzalo zzaloVar;
        zzalu zzaluVarZza;
        int i10;
        boolean z2;
        int i11;
        Map map4 = map;
        if (zzg(j)) {
            String str2 = this.zzg;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it2 = this.zzl.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map5 = this.zzk;
                int iIntValue = map5.containsKey(str4) ? ((Integer) map5.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    zzcs zzcsVar = (zzcs) map3.get(str4);
                    zzcsVar.getClass();
                    zzals zzalsVar = (zzals) map2.get(str3);
                    zzalsVar.getClass();
                    int i12 = zzalsVar.zzj;
                    zzalu zzaluVarZza2 = zzalt.zza(this.zzf, this.zzj, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcsVar.zzr();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcsVar.zzl(spannableStringBuilder);
                    }
                    if (zzaluVarZza2 != null) {
                        zzalo zzaloVar2 = this.zzi;
                        if (zzaluVarZza2.zzh() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zzaluVarZza2.zzh()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaluVarZza2.zzM()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaluVarZza2.zzN()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaluVarZza2.zzL()) {
                            zzda.zzb(spannableStringBuilder, new ForegroundColorSpan(zzaluVarZza2.zzd()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaluVarZza2.zzK()) {
                            zzda.zzb(spannableStringBuilder, new BackgroundColorSpan(zzaluVarZza2.zzc()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaluVarZza2.zzG() != null) {
                            zzda.zzb(spannableStringBuilder, new TypefaceSpan(zzaluVarZza2.zzG()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaluVarZza2.zzk() != null) {
                            zzaln zzalnVarZzk = zzaluVarZza2.zzk();
                            zzalnVarZzk.getClass();
                            int i13 = zzalnVarZzk.zza;
                            it = it2;
                            if (i13 == -1) {
                                i13 = (i12 == 2 || i12 == 1) ? 3 : 1;
                                i11 = 1;
                            } else {
                                i11 = zzalnVarZzk.zzb;
                            }
                            int i14 = zzalnVarZzk.zzc;
                            if (i14 == -2) {
                                i14 = 1;
                            }
                            zzda.zzb(spannableStringBuilder, new zzdb(i13, i11, i14), iIntValue, iIntValue2, 33);
                        } else {
                            it = it2;
                        }
                        int iZzg = zzaluVarZza2.zzg();
                        if (iZzg == 2) {
                            while (true) {
                                if (zzaloVar2 == null) {
                                    zzaloVar2 = null;
                                    break;
                                }
                                zzalu zzaluVarZza3 = zzalt.zza(zzaloVar2.zzf, zzaloVar2.zzj, map4);
                                if (zzaluVarZza3 != null && zzaluVarZza3.zzg() == 1) {
                                    break;
                                } else {
                                    zzaloVar2 = zzaloVar2.zzi;
                                }
                            }
                            if (zzaloVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzaloVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzaloVar = null;
                                        break;
                                    }
                                    zzalo zzaloVar3 = (zzalo) arrayDeque.pop();
                                    zzalu zzaluVarZza4 = zzalt.zza(zzaloVar3.zzf, zzaloVar3.zzj, map4);
                                    if (zzaluVarZza4 != null && zzaluVarZza4.zzg() == 3) {
                                        zzaloVar = zzaloVar3;
                                        break;
                                    }
                                    for (int iZza = zzaloVar3.zza() - 1; iZza >= 0; iZza--) {
                                        arrayDeque.push(zzaloVar3.zzd(iZza));
                                    }
                                }
                                if (zzaloVar != null) {
                                    if (zzaloVar.zza() != 1 || zzaloVar.zzd(0).zzb == null) {
                                        zzea.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = zzaloVar.zzd(0).zzb;
                                        String str6 = zzex.zza;
                                        zzalu zzaluVarZza5 = zzalt.zza(zzaloVar.zzf, zzaloVar.zzj, map4);
                                        int iZzf = zzaluVarZza5 != null ? zzaluVarZza5.zzf() : -1;
                                        if (iZzf == -1 && (zzaluVarZza = zzalt.zza(zzaloVar2.zzf, zzaloVar2.zzj, map4)) != null) {
                                            iZzf = zzaluVarZza.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new zzcz(str5, iZzf), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iZzg == 3 || iZzg == 4) {
                            spannableStringBuilder.setSpan(new zzalm(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaluVarZza2.zzJ()) {
                            i10 = 33;
                            zzda.zzb(spannableStringBuilder, new zzcy(), iIntValue, iIntValue2, 33);
                        } else {
                            i10 = 33;
                        }
                        int iZze = zzaluVarZza2.zze();
                        if (iZze != 1) {
                            if (iZze == 2) {
                                zzda.zzb(spannableStringBuilder, new RelativeSizeSpan(zzaluVarZza2.zza()), iIntValue, iIntValue2, i10);
                            } else if (iZze == 3) {
                                zzda.zza(spannableStringBuilder, zzaluVarZza2.zza() / 100.0f, iIntValue, iIntValue2, i10);
                            }
                            z2 = true;
                        } else {
                            z2 = true;
                            zzda.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zzaluVarZza2.zza(), true), iIntValue, iIntValue2, i10);
                        }
                        if ("p".equals(this.zza)) {
                            if (zzaluVarZza2.zzb() != Float.MAX_VALUE) {
                                zzcsVar.zzj((zzaluVarZza2.zzb() * (-90.0f)) / 100.0f);
                            }
                            if (zzaluVarZza2.zzj() != null) {
                                zzcsVar.zzm(zzaluVarZza2.zzj());
                            }
                            if (zzaluVarZza2.zzi() != null) {
                                zzcsVar.zzg(zzaluVarZza2.zzi());
                            }
                        }
                        it2 = it;
                    }
                }
            }
            int i15 = 0;
            while (i15 < zza()) {
                zzd(i15).zzl(j, map4, map2, str3, map3);
                i15++;
                map4 = map;
            }
        }
    }

    private final void zzm(long j, boolean z2, String str, Map map) {
        long j4;
        boolean z10;
        HashMap map2 = this.zzk;
        map2.clear();
        HashMap map3 = this.zzl;
        map3.clear();
        String str2 = this.zza;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.zzg;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.zzc && z2) {
            SpannableStringBuilder spannableStringBuilderZzi = zzi(str4, map);
            String str5 = this.zzb;
            str5.getClass();
            spannableStringBuilderZzi.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z2) {
            zzi(str4, map).append('\n');
            return;
        }
        if (zzg(j)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceZzr = ((zzcs) entry.getValue()).zzr();
                charSequenceZzr.getClass();
                map2.put(str6, Integer.valueOf(charSequenceZzr.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i10 = 0; i10 < zza(); i10++) {
                zzalo zzaloVarZzd = zzd(i10);
                if (z2 || zEquals) {
                    j4 = j;
                    z10 = true;
                } else {
                    j4 = j;
                    z10 = false;
                }
                zzaloVarZzd.zzm(j4, z10, str4, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzi2 = zzi(str4, map);
                int length = spannableStringBuilderZzi2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzi2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzi2.charAt(length) != '\n') {
                    spannableStringBuilderZzi2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceZzr2 = ((zzcs) entry2.getValue()).zzr();
                charSequenceZzr2.getClass();
                map3.put(str7, Integer.valueOf(charSequenceZzr2.length()));
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzalo zzd(int i10) {
        List list = this.zzm;
        if (list != null) {
            return (zzalo) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        String str = this.zzg;
        zzk(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j, false, str, treeMap);
        zzl(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzals zzalsVar = (zzals) map2.get(pair.first);
                zzalsVar.getClass();
                zzcs zzcsVar = new zzcs();
                zzcsVar.zzc(bitmapDecodeByteArray);
                zzcsVar.zzh(zzalsVar.zzb);
                zzcsVar.zzi(0);
                zzcsVar.zze(zzalsVar.zzc, 0);
                zzcsVar.zzf(zzalsVar.zze);
                zzcsVar.zzk(zzalsVar.zzf);
                zzcsVar.zzd(zzalsVar.zzg);
                zzcsVar.zzo(zzalsVar.zzj);
                arrayList2.add(zzcsVar.zzq());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzals zzalsVar2 = (zzals) map2.get(entry.getKey());
            zzalsVar2.getClass();
            zzcs zzcsVar2 = (zzcs) entry.getValue();
            CharSequence charSequenceZzr = zzcsVar2.zzr();
            charSequenceZzr.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzr;
            for (zzalm zzalmVar : (zzalm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzalm.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzalmVar), spannableStringBuilder.getSpanEnd(zzalmVar), (CharSequence) "");
            }
            int i11 = 0;
            while (i11 < spannableStringBuilder.length()) {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i13 = i12;
                    while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                        i13++;
                    }
                    int i14 = i13 - i12;
                    if (i14 > 0) {
                        spannableStringBuilder.delete(i11, i14 + i11);
                    }
                }
                i11 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i15 = 0;
            while (i15 < spannableStringBuilder.length() - 1) {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i15) == '\n' && spannableStringBuilder.charAt(i16) == ' ') {
                    spannableStringBuilder.delete(i16, i15 + 2);
                }
                i15 = i16;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i17 = 0;
            while (i17 < spannableStringBuilder.length() - 1) {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i17) == ' ' && spannableStringBuilder.charAt(i18) == '\n') {
                    spannableStringBuilder.delete(i17, i18);
                }
                i17 = i18;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcsVar2.zze(zzalsVar2.zzc, zzalsVar2.zzd);
            zzcsVar2.zzf(zzalsVar2.zze);
            zzcsVar2.zzh(zzalsVar2.zzb);
            zzcsVar2.zzk(zzalsVar2.zzf);
            zzcsVar2.zzn(zzalsVar2.zzi, zzalsVar2.zzh);
            zzcsVar2.zzo(zzalsVar2.zzj);
            arrayList2.add(zzcsVar2.zzq());
        }
        return arrayList2;
    }

    public final void zzf(zzalo zzaloVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzaloVar);
    }

    public final boolean zzg(long j) {
        long j4 = this.zzd;
        if (j4 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j4 = -9223372036854775807L;
        }
        if (j4 <= j && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j4 != -9223372036854775807L || j >= this.zze) {
            return j4 <= j && j < this.zze;
        }
        return true;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }
}
