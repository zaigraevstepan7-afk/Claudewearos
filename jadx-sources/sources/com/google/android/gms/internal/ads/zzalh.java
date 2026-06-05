package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzalh implements zzakr {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzalg zzc;
    private final zzen zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzalh() {
        this(null);
    }

    private static float zzb(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zzc(long j, List list, List list2) {
        int i10;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i10 = size + 1;
                break;
            }
        }
        list.add(i10, Long.valueOf(j));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i10 - 1)));
        return i10;
    }

    private static long zzd(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = zzex.zza;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j4 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j4 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private final void zze(zzen zzenVar, Charset charset) throws NumberFormatException {
        while (true) {
            String strZzz = zzenVar.zzz(charset);
            if (strZzz == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strZzz)) {
                while (true) {
                    String strZzz2 = zzenVar.zzz(charset);
                    if (strZzz2 == null || (zzenVar.zza() != 0 && zzenVar.zze(charset) == 91)) {
                        break;
                    }
                    String[] strArrSplit = strZzz2.split(":");
                    if (strArrSplit.length == 2) {
                        String strZza = zzfuk.zza(strArrSplit[0].trim());
                        switch (strZza.hashCode()) {
                            case 1879649548:
                                if (!strZza.equals("playresx")) {
                                    break;
                                } else {
                                    this.zzf = Float.parseFloat(strArrSplit[1].trim());
                                    break;
                                }
                            case 1879649549:
                                if (!strZza.equals("playresy")) {
                                    break;
                                } else {
                                    try {
                                        this.zzg = Float.parseFloat(strArrSplit[1].trim());
                                        break;
                                    } catch (NumberFormatException unused) {
                                        break;
                                    }
                                }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strZzz)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zzali zzaliVarZza = null;
                while (true) {
                    String strZzz3 = zzenVar.zzz(charset);
                    if (strZzz3 != null && (zzenVar.zza() == 0 || zzenVar.zze(charset) != 91)) {
                        if (strZzz3.startsWith("Format:")) {
                            zzaliVarZza = zzali.zza(strZzz3);
                        } else if (strZzz3.startsWith("Style:")) {
                            if (zzaliVarZza == null) {
                                zzea.zzf("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strZzz3));
                            } else {
                                zzalk zzalkVarZzb = zzalk.zzb(strZzz3, zzaliVarZza);
                                if (zzalkVarZzb != null) {
                                    linkedHashMap.put(zzalkVarZzb.zza, zzalkVarZzb);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strZzz)) {
                zzea.zze("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strZzz)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    @Override // com.google.android.gms.internal.ads.zzakr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(byte[] r23, int r24, int r25, com.google.android.gms.internal.ads.zzakq r26, com.google.android.gms.internal.ads.zzdn r27) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalh.zza(byte[], int, int, com.google.android.gms.internal.ads.zzakq, com.google.android.gms.internal.ads.zzdn):void");
    }

    public zzalh(List list) throws NumberFormatException {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzen();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String strZzB = zzex.zzB((byte[]) list.get(0));
        zzdd.zzd(strZzB.startsWith("Format:"));
        zzalg zzalgVarZza = zzalg.zza(strZzB);
        zzalgVarZza.getClass();
        this.zzc = zzalgVarZza;
        zze(new zzen((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
