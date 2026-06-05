package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzamj {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString zza(java.lang.String r13, java.lang.String r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamj.zza(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static zzcs zzb(String str) {
        zzamh zzamhVar = new zzamh();
        zzh(str, zzamhVar);
        return zzamhVar.zza();
    }

    public static zzamc zzc(zzen zzenVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String strZzz = zzenVar.zzz(charset);
        if (strZzz != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzz);
            if (matcher.matches()) {
                return zze(null, matcher, zzenVar, list);
            }
            String strZzz2 = zzenVar.zzz(charset);
            if (strZzz2 != null) {
                Matcher matcher2 = pattern.matcher(strZzz2);
                if (matcher2.matches()) {
                    return zze(strZzz.trim(), matcher2, zzenVar, list);
                }
            }
        }
        return null;
    }

    private static int zzd(List list, String str, zzamf zzamfVar) {
        List listZzf = zzf(list, str, zzamfVar);
        for (int i10 = 0; i10 < listZzf.size(); i10++) {
            zzamb zzambVar = ((zzamg) listZzf.get(i10)).zzb;
            if (zzambVar.zze() != -1) {
                return zzambVar.zze();
            }
        }
        return -1;
    }

    private static zzamc zze(String str, Matcher matcher, zzen zzenVar, List list) {
        zzamh zzamhVar = new zzamh();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            zzamhVar.zza = zzaml.zzb(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            zzamhVar.zzb = zzaml.zzb(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zzh(strGroup3, zzamhVar);
            StringBuilder sb2 = new StringBuilder();
            String strZzz = zzenVar.zzz(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzz)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strZzz.trim());
                strZzz = zzenVar.zzz(StandardCharsets.UTF_8);
            }
            zzamhVar.zzc = zza(str, sb2.toString(), list);
            return new zzamc(zzamhVar.zza().zzq(), zzamhVar.zza, zzamhVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzea.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, String str, zzamf zzamfVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzamb zzambVar = (zzamb) list.get(i10);
            int iZzf = zzambVar.zzf(str, zzamfVar.zza, zzamfVar.zzd, zzamfVar.zzc);
            if (iZzf > 0) {
                arrayList.add(new zzamg(iZzf, zzambVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zzg(String str, zzamf zzamfVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10 = zzamfVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzamfVar.zza;
        int iHashCode = str2.hashCode();
        int i11 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int iZzd = zzd(list2, str, zzamfVar);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        Collections.sort(arrayList, zzame.zza);
                        int i12 = i10;
                        int i13 = 0;
                        int length2 = 0;
                        while (i13 < arrayList.size()) {
                            if ("rt".equals(((zzame) arrayList.get(i13)).zzb.zza)) {
                                zzame zzameVar = (zzame) arrayList.get(i13);
                                int iZzd2 = zzd(list2, str, zzameVar.zzb);
                                if (iZzd2 == i11) {
                                    iZzd2 = iZzd != i11 ? iZzd : 1;
                                }
                                int i14 = zzameVar.zzb.zzb - length2;
                                int i15 = zzameVar.zzc - length2;
                                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i14, i15);
                                spannableStringBuilder.delete(i14, i15);
                                spannableStringBuilder.setSpan(new zzcz(charSequenceSubSequence.toString(), iZzd2), i12, i14, 33);
                                length2 += charSequenceSubSequence.length();
                                i12 = i14;
                            }
                            i13++;
                            i11 = -1;
                        }
                    } else if (iHashCode != 98) {
                        if (iHashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : zzamfVar.zzd) {
                                Map map = zzc;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i10, length, 33);
                                } else {
                                    Map map2 = zzd;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i10, length, 33);
                                    }
                                }
                            }
                        } else if (iHashCode != 117) {
                            if (iHashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new zzdc(zzamfVar.zzc), i10, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        List listZzf = zzf(list2, str, zzamfVar);
        for (int i16 = 0; i16 < listZzf.size(); i16++) {
            zzamb zzambVar = ((zzamg) listZzf.get(i16)).zzb;
            if (zzambVar != null) {
                if (zzambVar.zzg() != -1) {
                    zzda.zzb(spannableStringBuilder, new StyleSpan(zzambVar.zzg()), i10, length, 33);
                }
                if (zzambVar.zzz()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                }
                if (zzambVar.zzy()) {
                    zzda.zzb(spannableStringBuilder, new ForegroundColorSpan(zzambVar.zzc()), i10, length, 33);
                }
                if (zzambVar.zzx()) {
                    zzda.zzb(spannableStringBuilder, new BackgroundColorSpan(zzambVar.zzb()), i10, length, 33);
                }
                if (zzambVar.zzr() != null) {
                    zzda.zzb(spannableStringBuilder, new TypefaceSpan(zzambVar.zzr()), i10, length, 33);
                }
                int iZzd3 = zzambVar.zzd();
                if (iZzd3 == 1) {
                    zzda.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zzambVar.zza(), true), i10, length, 33);
                } else if (iZzd3 == 2) {
                    zzda.zzb(spannableStringBuilder, new RelativeSizeSpan(zzambVar.zza()), i10, length, 33);
                } else if (iZzd3 == 3) {
                    zzda.zzb(spannableStringBuilder, new RelativeSizeSpan(zzambVar.zza() / 100.0f), i10, length, 33);
                }
                if (zzambVar.zzw()) {
                    spannableStringBuilder.setSpan(new zzcy(), i10, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0112, code lost:
    
        if (r6.equals("start") != false) goto L81;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0 A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0140 A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0181 A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzh(java.lang.String r16, com.google.android.gms.internal.ads.zzamh r17) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamj.zzh(java.lang.String, com.google.android.gms.internal.ads.zzamh):void");
    }
}
