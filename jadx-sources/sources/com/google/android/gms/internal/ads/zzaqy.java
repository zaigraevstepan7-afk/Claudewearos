package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaqy {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e10) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzaqn.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzaqn.zzc(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static zzapk zzb(zzapx zzapxVar) throws NumberFormatException {
        long j;
        boolean z2;
        long j4;
        long j10;
        long j11;
        long jZza;
        long j12;
        long j13;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzapxVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZza2 = str != null ? zza(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z2 = false;
            j4 = 0;
            j10 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j10 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j4 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z2 = true;
                }
                i10++;
            }
            j = 0;
            i10 = 1;
        } else {
            j = 0;
            z2 = false;
            j4 = 0;
            j10 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZza3 = str3 != null ? zza(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j11 = jCurrentTimeMillis;
            jZza = zza(str4);
        } else {
            j11 = jCurrentTimeMillis;
            jZza = j;
        }
        String str5 = (String) map.get("ETag");
        if (i10 != 0) {
            long j14 = (j10 * 1000) + j11;
            j13 = z2 ? j14 : (j4 * 1000) + j14;
            j12 = j14;
        } else {
            j12 = (jZza2 <= j || jZza3 < jZza2) ? j : (jZza3 - jZza2) + j11;
            j13 = j12;
        }
        zzapk zzapkVar = new zzapk();
        zzapkVar.zza = zzapxVar.zzb;
        zzapkVar.zzb = str5;
        zzapkVar.zzf = j12;
        zzapkVar.zze = j13;
        zzapkVar.zzc = jZza2;
        zzapkVar.zzd = jZza;
        zzapkVar.zzg = map;
        zzapkVar.zzh = zzapxVar.zzd;
        return zzapkVar;
    }

    public static String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
