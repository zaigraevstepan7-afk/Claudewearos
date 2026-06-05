package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbch;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzex {
    private static HashMap zzd;
    public static final String zza = Build.DEVICE + ", " + Build.MODEL + ", " + Build.MANUFACTURER + ", " + Build.VERSION.SDK_INT;
    public static final byte[] zzb = new byte[0];
    private static final Pattern zzc = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
    private static final String[] zze = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
    private static final String[] zzf = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
    private static final int[] zzg = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    private static final int[] zzh = {0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
    private static final int[] zzi = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    public static zzz zzA(int i10, int i11, int i12) {
        zzx zzxVar = new zzx();
        zzxVar.zzah("audio/raw");
        zzxVar.zzD(i11);
        zzxVar.zzai(i12);
        zzxVar.zzab(i10);
        return zzxVar.zzan();
    }

    public static String zzB(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String zzC(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, StandardCharsets.UTF_8);
    }

    public static String zzD(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String zzE(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strZza = zzfuk.zza(str);
        int i10 = 0;
        String str2 = strZza.split("-", 2)[0];
        if (zzd == null) {
            zzd = zzU();
        }
        String str3 = (String) zzd.get(str2);
        if (str3 != null) {
            strZza = str3.concat(String.valueOf(strZza.substring(str2.length())));
            str2 = str3;
        }
        if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = zzf;
                int length = strArr.length;
                if (i10 >= 18) {
                    break;
                }
                if (strZza.startsWith(strArr[i10])) {
                    return String.valueOf(strArr[i10 + 1]).concat(String.valueOf(strZza.substring(strArr[i10].length())));
                }
                i10 += 2;
            }
        }
        return strZza;
    }

    public static ExecutorService zzF(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzev
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                String str2 = zzex.zza;
                return new Thread(runnable, str);
            }
        });
    }

    public static void zzG(long[] jArr, long j, long j4) {
        long j10;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i10 = 0;
        if (j4 >= 1000000 && j4 % 1000000 == 0) {
            long jZzb = zzgbd.zzb(j4, 1000000L, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = zzgbd.zzb(jArr[i10], jZzb, roundingMode);
                i10++;
            }
            return;
        }
        if (j4 < 1000000 && 1000000 % j4 == 0) {
            long jZzb2 = zzgbd.zzb(1000000L, j4, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = zzgbd.zzd(jArr[i10], jZzb2);
                i10++;
            }
            return;
        }
        int i11 = 0;
        while (i11 < jArr.length) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                if (j4 >= j11 && j4 % j11 == 0) {
                    jArr[i11] = zzgbd.zzb(1000000L, zzgbd.zzb(j4, j11, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j4 >= j11 || j11 % j4 != 0) {
                    j10 = j4;
                    jArr[i11] = zzS(j11, 1000000L, j10, roundingMode);
                } else {
                    jArr[i11] = zzgbd.zzd(1000000L, zzgbd.zzb(j11, j4, RoundingMode.UNNECESSARY));
                }
                j10 = j4;
            } else {
                j10 = j4;
            }
            i11++;
            j4 = j10;
        }
    }

    public static boolean zzH(SparseArray sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r4.zzK(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzI(com.google.android.gms.internal.ads.zzen r3, com.google.android.gms.internal.ads.zzen r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.zza()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r4.zzb()
            int r2 = r3.zza()
            if (r0 >= r2) goto L1a
            int r0 = r3.zza()
            int r0 = r0 + r0
            r4.zzF(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.zzN()
            int r2 = r3.zzc()
            int r3 = r3.zza()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L31:
            byte[] r0 = r4.zzN()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r4.zzb()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L4c
            r4.zzK(r3)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            r1 = 1
            goto L6c
        L4a:
            r3 = move-exception
            goto L68
        L4c:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 != 0) goto L6c
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L59
            goto L6c
        L59:
            int r0 = r4.zzb()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r3 != r0) goto L31
            int r0 = r4.zzb()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r0 = r0 + r0
            r4.zzF(r0)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            goto L31
        L68:
            r5.reset()
            throw r3
        L6c:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzex.zzI(com.google.android.gms.internal.ads.zzen, com.google.android.gms.internal.ads.zzen, java.util.zip.Inflater):boolean");
    }

    public static boolean zzJ(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean zzK(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static boolean zzL(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i10 == 30) {
            String str = Build.MODEL;
            if (zzfuk.zzc(str, "moto g(20)") || zzfuk.zzc(str, "rmx3231")) {
                return true;
            }
        }
        return i10 == 34 && zzfuk.zzc(Build.MODEL, "sm-x200");
    }

    public static boolean zzM(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static boolean zzN(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzO(zzen zzenVar, zzen zzenVar2, Inflater inflater) {
        return zzenVar.zza() > 0 && zzenVar.zzf() == 120 && zzI(zzenVar, zzenVar2, inflater);
    }

    public static boolean zzP(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Object[] zzQ(Object[] objArr, int i10) {
        zzdd.zzd(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    private static int zzR(int i10, int i11) {
        return (char) (zzh[i10 ^ (i11 >> 12)] ^ ((char) (i11 << 4)));
    }

    private static long zzS(long j, long j4, long j10, RoundingMode roundingMode) {
        long jZzd = zzgbd.zzd(j, j4);
        if (jZzd != Long.MAX_VALUE && jZzd != Long.MIN_VALUE) {
            return zzgbd.zzb(jZzd, j10, roundingMode);
        }
        long jZzc = zzgbd.zzc(Math.abs(j4), Math.abs(j10));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jZzb = zzgbd.zzb(j4, jZzc, roundingMode2);
        long jZzb2 = zzgbd.zzb(j10, jZzc, roundingMode2);
        long jZzc2 = zzgbd.zzc(Math.abs(j), Math.abs(jZzb2));
        long jZzb3 = zzgbd.zzb(j, jZzc2, roundingMode2);
        long jZzb4 = zzgbd.zzb(jZzb2, jZzc2, roundingMode2);
        long jZzd2 = zzgbd.zzd(jZzb3, jZzb);
        if (jZzd2 != Long.MAX_VALUE && jZzd2 != Long.MIN_VALUE) {
            return zzgbd.zzb(jZzd2, jZzb4, roundingMode);
        }
        double d10 = (jZzb / jZzb4) * jZzb3;
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgay.zzb(d10, roundingMode);
    }

    private static String zzT(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            zzea.zzd("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    private static HashMap zzU() throws MissingResourceException {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zze.length;
        HashMap map = new HashMap(length + 88);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zze;
            int length3 = strArr.length;
            if (i10 >= 88) {
                return map;
            }
            map.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static int zza(long[] jArr, long j, boolean z2, boolean z10) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i10 = iBinarySearch + 1;
            if (i10 >= jArr.length || jArr[i10] != j) {
                break;
            }
            iBinarySearch = i10;
        }
        return !z2 ? i10 : iBinarySearch;
    }

    public static int zzb(zzeb zzebVar, long j, boolean z2, boolean z10) {
        int iZza = zzebVar.zza() - 1;
        int i10 = 0;
        while (i10 <= iZza) {
            int i11 = (i10 + iZza) >>> 1;
            if (zzebVar.zzb(i11) < j) {
                i10 = i11 + 1;
            } else {
                iZza = i11 - 1;
            }
        }
        int i12 = iZza + 1;
        if (i12 < zzebVar.zza() && zzebVar.zzb(i12) == j) {
            return i12;
        }
        if (iZza == -1) {
            return 0;
        }
        return iZza;
    }

    public static int zzc(int[] iArr, int i10, boolean z2, boolean z10) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z2 ? iBinarySearch : i11;
        }
        return z10 ? Math.max(0, i12) : i12;
    }

    public static int zzd(long[] jArr, long j, boolean z2, boolean z10) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i11 = iBinarySearch - 1;
                if (i11 < 0 || jArr[i11] != j) {
                    break;
                }
                iBinarySearch = i11;
            }
            i10 = iBinarySearch;
        }
        return z10 ? Math.max(0, i10) : i10;
    }

    public static int zze(byte[] bArr, int i10, int i11, int i12) {
        int iZzR = 65535;
        for (int i13 = 0; i13 < i11; i13++) {
            byte b10 = bArr[i13];
            iZzR = zzR(b10 & 15, zzR((b10 & 255) >> 4, iZzR));
        }
        return iZzR;
    }

    public static int zzf(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = zzg[(i12 >>> 24) ^ (bArr[i10] & 255)] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static int zzg(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i10 < i11) {
            i13 = zzi[i13 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i13;
    }

    public static int zzh(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 == 22) {
            return 31;
        }
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return f.API_PRIORITY_OTHER;
                }
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int zzi(int i10) {
        int i11;
        int i12 = 6396;
        if (i10 == 10) {
            i11 = 737532;
        } else {
            if (i10 == 12) {
                return 743676;
            }
            if (i10 != 24) {
                switch (i10) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        return 0;
                }
            }
            i11 = 67108860;
            i12 = 0;
        }
        return Build.VERSION.SDK_INT >= 32 ? i11 : i12;
    }

    public static int zzj(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static int zzk(int i10) {
        if (i10 != 2) {
            if (i10 == 3) {
                return 1;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int zzl(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case zzbch.zzt.zzm /* 21 */:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int zzm(String str) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z2 = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int i10 = Integer.parseInt(str2);
            return z2 ? -i10 : i10;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static int zzn(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 22;
        }
        return 21;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzo(android.net.Uri r6) {
        /*
            java.lang.String r0 = r6.getScheme()
            if (r0 == 0) goto L19
            java.lang.String r1 = "rtsp"
            boolean r1 = com.google.android.gms.internal.ads.zzfuk.zzc(r1, r0)
            if (r1 != 0) goto L17
            java.lang.String r1 = "rtspt"
            boolean r0 = com.google.android.gms.internal.ads.zzfuk.zzc(r1, r0)
            if (r0 != 0) goto L17
            goto L19
        L17:
            r6 = 3
            return r6
        L19:
            java.lang.String r0 = r6.getLastPathSegment()
            r1 = 4
            if (r0 != 0) goto L21
            return r1
        L21:
            r2 = 46
            int r2 = r0.lastIndexOf(r2)
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 < 0) goto L69
            int r2 = r2 + r5
            java.lang.String r0 = r0.substring(r2)
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfuk.zza(r0)
            int r2 = r0.hashCode()
            switch(r2) {
                case 104579: goto L5a;
                case 108321: goto L50;
                case 3242057: goto L47;
                case 3299913: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L64
        L3d:
            java.lang.String r2 = "m3u8"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            r0 = r4
            goto L65
        L47:
            java.lang.String r2 = "isml"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            goto L62
        L50:
            java.lang.String r2 = "mpd"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            r0 = r3
            goto L65
        L5a:
            java.lang.String r2 = "ism"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
        L62:
            r0 = r5
            goto L65
        L64:
            r0 = r1
        L65:
            if (r0 != r1) goto L68
            goto L69
        L68:
            return r0
        L69:
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzex.zzc
            java.lang.String r6 = r6.getPath()
            r6.getClass()
            java.util.regex.Matcher r6 = r0.matcher(r6)
            boolean r0 = r6.matches()
            if (r0 == 0) goto L95
            java.lang.String r6 = r6.group(r4)
            if (r6 == 0) goto L94
            java.lang.String r0 = "format=mpd-time-csf"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L8b
            return r3
        L8b:
            java.lang.String r0 = "format=m3u8-aapl"
            boolean r6 = r6.contains(r0)
            if (r6 == 0) goto L94
            return r4
        L94:
            return r5
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzex.zzo(android.net.Uri):int");
    }

    public static long zzp(long j, int i10) {
        return zzu(j, i10, 1000000L, RoundingMode.UP);
    }

    public static long zzq(long j, float f10) {
        return f10 == 1.0f ? j : Math.round(j * f10);
    }

    public static long zzr(long j, float f10) {
        return f10 == 1.0f ? j : Math.round(j / f10);
    }

    public static long zzs(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long zzt(long j, int i10) {
        return zzu(j, 1000000L, i10, RoundingMode.DOWN);
    }

    public static long zzu(long j, long j4, long j10, RoundingMode roundingMode) {
        if (j == 0 || j4 == 0) {
            return 0L;
        }
        return (j10 < j4 || j10 % j4 != 0) ? (j10 >= j4 || j4 % j10 != 0) ? (j10 < j || j10 % j != 0) ? (j10 >= j || j % j10 != 0) ? zzS(j, j4, j10, roundingMode) : zzgbd.zzd(j4, zzgbd.zzb(j, j10, RoundingMode.UNNECESSARY)) : zzgbd.zzb(j4, zzgbd.zzb(j10, j, RoundingMode.UNNECESSARY), roundingMode) : zzgbd.zzd(j, zzgbd.zzb(j4, j10, RoundingMode.UNNECESSARY)) : zzgbd.zzb(j, zzgbd.zzb(j10, j4, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long zzv(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static Point zzw(Context context) throws NumberFormatException {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzN(context)) {
            String strZzT = Build.VERSION.SDK_INT < 28 ? zzT("sys.display-size") : zzT("vendor.display-size");
            if (!TextUtils.isEmpty(strZzT)) {
                try {
                    String[] strArrSplit = strZzT.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i10 = Integer.parseInt(strArrSplit[0]);
                        int i11 = Integer.parseInt(strArrSplit[1]);
                        if (i10 > 0 && i11 > 0) {
                            return new Point(i10, i11);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzea.zzc("Util", "Invalid display size: ".concat(String.valueOf(strZzT)));
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static AudioFormat zzx(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static Handler zzy(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        zzdd.zzb(looperMyLooper);
        return new Handler(looperMyLooper, null);
    }

    public static Looper zzz() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }
}
