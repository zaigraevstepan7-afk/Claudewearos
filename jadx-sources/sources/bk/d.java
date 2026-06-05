package bk;

import ak.a0;
import ak.j;
import ak.l;
import ak.n;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kk.c0;
import kk.f;
import kk.s;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1785a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1786b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    public static final l f1787c;

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f1788d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f1789e;

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f1790f;

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f1791g;

    /* renamed from: h, reason: collision with root package name */
    public static final TimeZone f1792h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f1793i;
    public static final Method j;

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f1794k;

    /* JADX WARN: Code restructure failed: missing block: B:72:0x014d, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.d.<clinit>():void");
    }

    public static String a(String str) {
        int i10 = -1;
        int i11 = 0;
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                while (i11 < lowerCase.length()) {
                    char cCharAt = lowerCase.charAt(i11);
                    if (cCharAt <= 31 || cCharAt >= '\u007f' || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                        return null;
                    }
                    i11++;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressF = (str.startsWith("[") && str.endsWith("]")) ? f(1, str.length() - 1, str) : f(0, str.length(), str);
        if (inetAddressF == null) {
            return null;
        }
        byte[] address = inetAddressF.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressF.getHostAddress();
            }
            throw new AssertionError(m1.j("Invalid IPv6 address: '", str, "'"));
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < address.length) {
            int i14 = i12;
            while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        f fVar = new f();
        while (i11 < address.length) {
            if (i11 == i10) {
                fVar.W(58);
                i11 += i13;
                if (i11 == 16) {
                    fVar.W(58);
                }
            } else {
                if (i11 > 0) {
                    fVar.W(58);
                }
                fVar.Z(((address[i11] & 255) << 8) | (address[i11 + 1] & 255));
                i11 += 2;
            }
        }
        return fVar.F(fVar.f9695b, nj.a.f12342a);
    }

    public static int b(TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(70L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.");
        }
        if (millis != 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small.");
    }

    public static void c(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static void d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e10) {
                if (!l(e10)) {
                    throw e10;
                }
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static int e(char c6) {
        if (c6 >= '0' && c6 <= '9') {
            return c6 - '0';
        }
        if (c6 >= 'a' && c6 <= 'f') {
            return c6 - 'W';
        }
        if (c6 < 'A' || c6 > 'F') {
            return -1;
        }
        return c6 - '7';
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c6, code lost:
    
        if (r7 == 16) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c8, code lost:
    
        if (r8 != (-1)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cc, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00dc, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e2, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.InetAddress f(int r16, int r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.d.f(int, int, java.lang.String):java.net.InetAddress");
    }

    public static int g(int i10, int i11, String str, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int h(String str, int i10, int i11, char c6) {
        while (i10 < i11) {
            if (str.charAt(i10) == c6) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static String i(n nVar, boolean z2) {
        String strJ = nVar.f676d;
        int i10 = nVar.f677e;
        if (strJ.contains(":")) {
            strJ = m1.j("[", strJ, "]");
        }
        if (!z2 && i10 == n.b(nVar.f673a)) {
            return strJ;
        }
        return strJ + ":" + i10;
    }

    public static List j(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static String[] k(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean l(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean m(Comparator comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean n(n nVar, n nVar2) {
        return nVar.f676d.equals(nVar2.f676d) && nVar.f677e == nVar2.f677e && nVar.f673a.equals(nVar2.f673a);
    }

    public static boolean o(c0 c0Var, int i10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jNanoTime = System.nanoTime();
        long jC = c0Var.a().e() ? c0Var.a().c() - jNanoTime : Long.MAX_VALUE;
        c0Var.a().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            f fVar = new f();
            while (c0Var.A(8192L, fVar) != -1) {
                fVar.skip(fVar.f9695b);
            }
            if (jC == Long.MAX_VALUE) {
                c0Var.a().a();
                return true;
            }
            c0Var.a().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                c0Var.a().a();
                return false;
            }
            c0Var.a().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                c0Var.a().a();
            } else {
                c0Var.a().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static int p(int i10, int i11, String str) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int q(int i10, int i11, String str) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char cCharAt = str.charAt(i12);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    public static l r(ArrayList arrayList) {
        yh.c cVar = new yh.c(2);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            gk.c cVar2 = (gk.c) obj;
            j jVar = j.f658c;
            String strD = cVar2.f7445a.D();
            String strD2 = cVar2.f7446b.D();
            jVar.getClass();
            cVar.a(strD, strD2);
        }
        return new l(cVar);
    }
}
