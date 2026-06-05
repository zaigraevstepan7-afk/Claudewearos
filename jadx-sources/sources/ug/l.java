package ug;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f17082a = "0123456789abcdef".toCharArray();

    public static String a(double d10) {
        StringBuilder sb2 = new StringBuilder(16);
        long jDoubleToLongBits = Double.doubleToLongBits(d10);
        for (int i10 = 7; i10 >= 0; i10--) {
            int i11 = (int) ((jDoubleToLongBits >>> (i10 * 8)) & 255);
            char[] cArr = f17082a;
            sb2.append(cArr[(i11 >> 4) & 15]);
            sb2.append(cArr[i11 & 15]);
        }
        return sb2.toString();
    }

    public static void b(String str, boolean z2) {
        if (z2) {
            return;
        }
        Log.w("FirebaseDatabase", "Assertion failed: " + str);
    }

    public static void c(boolean z2) {
        b("", z2);
    }

    public static h d(String str) {
        String strSubstring;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (scheme == null) {
                throw new IllegalArgumentException("Database URL does not specify a URL scheme");
            }
            String host = uri.getHost();
            if (host == null) {
                throw new IllegalArgumentException("Database URL does not specify a valid host");
            }
            String queryParameter = uri.getQueryParameter("ns");
            if (queryParameter == null) {
                queryParameter = host.split("\\.", -1)[0].toLowerCase(Locale.US);
            }
            rg.l lVar = new rg.l();
            lVar.f14444a = host.toLowerCase(Locale.US);
            int port = uri.getPort();
            if (port != -1) {
                lVar.f14445b = scheme.equals("https") || scheme.equals("wss");
                lVar.f14444a += ":" + port;
            } else {
                lVar.f14445b = true;
            }
            lVar.f14446c = queryParameter;
            int iIndexOf = str.indexOf("//");
            if (iIndexOf == -1) {
                throw new mg.c("Firebase Database URL is missing URL scheme");
            }
            String strSubstring2 = str.substring(iIndexOf + 2);
            int iIndexOf2 = strSubstring2.indexOf("/");
            if (iIndexOf2 != -1) {
                int iIndexOf3 = strSubstring2.indexOf("?");
                strSubstring = iIndexOf3 != -1 ? strSubstring2.substring(iIndexOf2 + 1, iIndexOf3) : strSubstring2.substring(iIndexOf2 + 1);
            } else {
                strSubstring = "";
            }
            String strReplace = strSubstring.replace("+", " ");
            m.b(strReplace);
            h hVar = new h();
            hVar.f17078b = new rg.h(strReplace);
            hVar.f17077a = lVar;
            return hVar;
        } catch (Exception e10) {
            throw new mg.c(m1.i("Invalid Firebase Database url specified: ", str), e10);
        }
    }

    public static String e(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e10);
        }
    }

    public static String f(String str) {
        String strReplace = str.indexOf(92) != -1 ? str.replace("\\", "\\\\") : str;
        if (str.indexOf(34) != -1) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        return "\"" + strReplace + '\"';
    }

    public static Integer g(String str) {
        boolean z2;
        if (str.length() > 11 || str.length() == 0) {
            return null;
        }
        int i10 = 0;
        if (str.charAt(0) == '-') {
            z2 = true;
            if (str.length() == 1) {
                return null;
            }
            i10 = 1;
        } else {
            z2 = false;
        }
        long j = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                return null;
            }
            j = (j * 10) + (cCharAt - '0');
            i10++;
        }
        if (!z2) {
            if (j > 2147483647L) {
                return null;
            }
            return Integer.valueOf((int) j);
        }
        long j4 = -j;
        if (j4 < -2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j4);
    }
}
