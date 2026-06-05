package com.google.android.gms.internal.ads;

import android.text.Layout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzalr implements zzakr {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzalp zzh = new zzalp(30.0f, 1, 1);

    public zzalr() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static long zzc(String str, zzalp zzalpVar) throws zzakn, NumberFormatException {
        double d10;
        double d11;
        Matcher matcher = zzc.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j4 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d12 = j + j4;
            double d13 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d14 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d15 = d12 + d13;
            return (long) ((d15 + d14 + (matcher.group(5) != null ? Long.parseLong(r12) / zzalpVar.zza : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r12) / zzalpVar.zzb) / zzalpVar.zza : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzakn("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup5 = matcher2.group(1);
        strGroup5.getClass();
        double d16 = Double.parseDouble(strGroup5);
        String strGroup6 = matcher2.group(2);
        strGroup6.getClass();
        int iHashCode = strGroup6.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode == 115) {
                            strGroup6.equals("s");
                        } else if (iHashCode == 116 && strGroup6.equals("t")) {
                            d10 = zzalpVar.zzc;
                            d16 /= d10;
                        }
                    } else if (strGroup6.equals("ms")) {
                        d10 = 1000.0d;
                        d16 /= d10;
                    }
                } else if (strGroup6.equals("m")) {
                    d11 = 60.0d;
                    d16 *= d11;
                }
            } else if (strGroup6.equals("h")) {
                d11 = 3600.0d;
                d16 *= d11;
            }
        } else if (strGroup6.equals("f")) {
            d10 = zzalpVar.zza;
            d16 /= d10;
        }
        return (long) (d16 * 1000000.0d);
    }

    private static Layout.Alignment zzd(String str) {
        String strZza = zzfuk.zza(str);
        switch (strZza.hashCode()) {
            case -1364013995:
                if (strZza.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!strZza.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!strZza.equals("left")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!strZza.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!strZza.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    private static zzalu zze(zzalu zzaluVar) {
        return zzaluVar == null ? new zzalu() : zzaluVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118 A[Catch: zzakn -> 0x0173, TryCatch #1 {zzakn -> 0x0173, blocks: (B:34:0x00ab, B:36:0x00bb, B:39:0x00d1, B:42:0x00d9, B:44:0x00df, B:53:0x00f7, B:62:0x0112, B:64:0x0118, B:65:0x0121, B:66:0x0122, B:67:0x013b, B:57:0x0103, B:61:0x010f, B:68:0x013c, B:69:0x013d, B:70:0x0156, B:38:0x00c4, B:71:0x0157, B:72:0x0172), top: B:173:0x00ab }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzalu zzf(org.xmlpull.v1.XmlPullParser r14, com.google.android.gms.internal.ads.zzalu r15) throws com.google.android.gms.internal.ads.zzakn {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalr.zzf(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzalu):com.google.android.gms.internal.ads.zzalu");
    }

    private static String[] zzg(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzex.zza;
        return strTrim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i10, int i11, zzakq zzakqVar, zzdn zzdnVar) {
        zzakl.zza(zzb(bArr, i10, i11), zzakqVar, zzdnVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:54|(1:(9:57|402|61|62|408|63|72|(2:74|88)(4:75|(1:77)(4:79|401|80|(2:82|(2:84|88)(2:430|85))(2:429|86))|74|88)|389)(1:58))(1:60)|59|402|61|62|408|63|72|(0)(0)|389) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0168, code lost:
    
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017f, code lost:
    
        com.google.android.gms.internal.ads.zzea.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(r0));
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:278:0x055c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04ca A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TRY_LEAVE, TryCatch #17 {IOException -> 0x008c, XmlPullParserException -> 0x008f, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007f, B:16:0x0087, B:22:0x0094, B:25:0x00a0, B:29:0x00b4, B:31:0x00cd, B:33:0x00d9, B:34:0x00dd, B:36:0x00e9, B:37:0x00ed, B:72:0x0188, B:91:0x01e5, B:94:0x01f5, B:96:0x01fb, B:98:0x0203, B:100:0x020b, B:102:0x0213, B:104:0x021b, B:106:0x0223, B:108:0x0229, B:110:0x0231, B:112:0x0239, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0253, B:123:0x025c, B:389:0x06df, B:124:0x027f, B:126:0x0285, B:128:0x028e, B:130:0x029d, B:132:0x02aa, B:134:0x02be, B:136:0x02c4, B:269:0x0516, B:139:0x02cf, B:142:0x02db, B:144:0x02e1, B:146:0x02ea, B:148:0x02f0, B:149:0x02f7, B:152:0x02fe, B:268:0x050f, B:155:0x030c, B:157:0x0314, B:159:0x031a, B:161:0x0322, B:164:0x032a, B:168:0x0345, B:170:0x034b, B:172:0x0358, B:194:0x03c0, B:196:0x03c6, B:198:0x03cc, B:200:0x03d4, B:202:0x03da, B:206:0x03f1, B:208:0x03f7, B:210:0x0404, B:230:0x047e, B:232:0x0486, B:246:0x04c0, B:248:0x04ca, B:266:0x0502, B:211:0x0410, B:212:0x0411, B:213:0x0412, B:214:0x041f, B:217:0x0427, B:220:0x0435, B:222:0x043b, B:224:0x0446, B:225:0x045a, B:226:0x045b, B:227:0x045c, B:228:0x0469, B:174:0x0361, B:175:0x0362, B:176:0x0363, B:178:0x036e, B:181:0x0378, B:184:0x0381, B:186:0x0387, B:188:0x0392, B:189:0x03a2, B:190:0x03a3, B:191:0x03a4, B:192:0x03ac, B:274:0x052d, B:277:0x0550, B:321:0x05fa, B:282:0x056b, B:285:0x0574, B:364:0x0677, B:297:0x0596, B:303:0x05b0, B:310:0x05ca, B:314:0x05df, B:318:0x05f2, B:326:0x060f, B:330:0x061b, B:334:0x0624, B:342:0x0637, B:351:0x064f, B:353:0x065b, B:355:0x0660, B:346:0x0640, B:75:0x0191, B:77:0x019d, B:80:0x01a8, B:82:0x01ae, B:84:0x01b9, B:85:0x01c5, B:86:0x01c6, B:87:0x01c7, B:42:0x0109, B:45:0x0119, B:48:0x0123, B:50:0x0129, B:52:0x0130, B:54:0x0136, B:61:0x014b, B:63:0x0152, B:71:0x017f, B:67:0x0172, B:70:0x017e, B:368:0x0695, B:370:0x06a2, B:373:0x06a6, B:375:0x06b0, B:377:0x06ba, B:381:0x06c2, B:379:0x06bf, B:384:0x06d4, B:388:0x06dc, B:394:0x06f8), top: B:425:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0522 A[LOOP:1: B:126:0x0285->B:272:0x0522, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0660 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, zzakn -> 0x0664, TRY_LEAVE, TryCatch #13 {zzakn -> 0x0664, blocks: (B:353:0x065b, B:355:0x0660), top: B:417:0x065b }] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x051c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0191 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TryCatch #17 {IOException -> 0x008c, XmlPullParserException -> 0x008f, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007f, B:16:0x0087, B:22:0x0094, B:25:0x00a0, B:29:0x00b4, B:31:0x00cd, B:33:0x00d9, B:34:0x00dd, B:36:0x00e9, B:37:0x00ed, B:72:0x0188, B:91:0x01e5, B:94:0x01f5, B:96:0x01fb, B:98:0x0203, B:100:0x020b, B:102:0x0213, B:104:0x021b, B:106:0x0223, B:108:0x0229, B:110:0x0231, B:112:0x0239, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0253, B:123:0x025c, B:389:0x06df, B:124:0x027f, B:126:0x0285, B:128:0x028e, B:130:0x029d, B:132:0x02aa, B:134:0x02be, B:136:0x02c4, B:269:0x0516, B:139:0x02cf, B:142:0x02db, B:144:0x02e1, B:146:0x02ea, B:148:0x02f0, B:149:0x02f7, B:152:0x02fe, B:268:0x050f, B:155:0x030c, B:157:0x0314, B:159:0x031a, B:161:0x0322, B:164:0x032a, B:168:0x0345, B:170:0x034b, B:172:0x0358, B:194:0x03c0, B:196:0x03c6, B:198:0x03cc, B:200:0x03d4, B:202:0x03da, B:206:0x03f1, B:208:0x03f7, B:210:0x0404, B:230:0x047e, B:232:0x0486, B:246:0x04c0, B:248:0x04ca, B:266:0x0502, B:211:0x0410, B:212:0x0411, B:213:0x0412, B:214:0x041f, B:217:0x0427, B:220:0x0435, B:222:0x043b, B:224:0x0446, B:225:0x045a, B:226:0x045b, B:227:0x045c, B:228:0x0469, B:174:0x0361, B:175:0x0362, B:176:0x0363, B:178:0x036e, B:181:0x0378, B:184:0x0381, B:186:0x0387, B:188:0x0392, B:189:0x03a2, B:190:0x03a3, B:191:0x03a4, B:192:0x03ac, B:274:0x052d, B:277:0x0550, B:321:0x05fa, B:282:0x056b, B:285:0x0574, B:364:0x0677, B:297:0x0596, B:303:0x05b0, B:310:0x05ca, B:314:0x05df, B:318:0x05f2, B:326:0x060f, B:330:0x061b, B:334:0x0624, B:342:0x0637, B:351:0x064f, B:353:0x065b, B:355:0x0660, B:346:0x0640, B:75:0x0191, B:77:0x019d, B:80:0x01a8, B:82:0x01ae, B:84:0x01b9, B:85:0x01c5, B:86:0x01c6, B:87:0x01c7, B:42:0x0109, B:45:0x0119, B:48:0x0123, B:50:0x0129, B:52:0x0130, B:54:0x0136, B:61:0x014b, B:63:0x0152, B:71:0x017f, B:67:0x0172, B:70:0x017e, B:368:0x0695, B:370:0x06a2, B:373:0x06a6, B:375:0x06b0, B:377:0x06ba, B:381:0x06c2, B:379:0x06bf, B:384:0x06d4, B:388:0x06dc, B:394:0x06f8), top: B:425:0x0006 }] */
    /* JADX WARN: Type inference failed for: r42v1, types: [com.google.android.gms.internal.ads.zzalu, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzakm zzb(byte[] r40, int r41, int r42) throws org.xmlpull.v1.XmlPullParserException, com.google.android.gms.internal.ads.zzakn, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalr.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzakm");
    }
}
