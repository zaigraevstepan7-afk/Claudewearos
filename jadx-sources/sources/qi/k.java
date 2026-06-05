package qi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class k extends x8.a {
    public static List c0(Object[] objArr) {
        fj.l.f(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        fj.l.e(listAsList, "asList(...)");
        return listAsList;
    }

    public static boolean d0(Object[] objArr, Object obj) {
        fj.l.f(objArr, "<this>");
        return r0(objArr, obj) >= 0;
    }

    public static void e0(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        fj.l.f(iArr, "<this>");
        fj.l.f(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
    }

    public static void f0(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        fj.l.f(bArr, "<this>");
        fj.l.f(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
    }

    public static void g0(char[] cArr, char[] cArr2, int i10, int i11, int i12) {
        fj.l.f(cArr, "<this>");
        System.arraycopy(cArr, i11, cArr2, i10, i12 - i11);
    }

    public static void h0(long[] jArr, long[] jArr2, int i10, int i11, int i12) {
        fj.l.f(jArr, "<this>");
        fj.l.f(jArr2, "destination");
        System.arraycopy(jArr, i11, jArr2, i10, i12 - i11);
    }

    public static void i0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        fj.l.f(objArr, "<this>");
        fj.l.f(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }

    public static /* synthetic */ void j0(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = iArr.length;
        }
        e0(i10, 0, i11, iArr, iArr2);
    }

    public static /* synthetic */ void k0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        i0(objArr, 0, objArr2, i10, i11);
    }

    public static Object[] l0(Object[] objArr, int i10, int i11) {
        fj.l.f(objArr, "<this>");
        x8.a.r(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        fj.l.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void m0(int i10, int i11, Object obj, Object[] objArr) {
        fj.l.f(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static void n0(long[] jArr, long j) {
        int length = jArr.length;
        fj.l.f(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    public static Float o0(float[] fArr) {
        fj.l.f(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static kj.h p0(int[] iArr) {
        return new kj.h(0, iArr.length - 1, 1);
    }

    public static int q0(long[] jArr) {
        fj.l.f(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int r0(Object[] objArr, Object obj) {
        fj.l.f(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static String s0(Object[] objArr, String str, String str2, int i10) {
        String str3 = (i10 & 1) != 0 ? ", " : ",";
        if ((i10 & 2) != 0) {
            str = "";
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        fj.l.f(objArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                sb2.append((CharSequence) str3);
            }
            yd.f.f(sb2, obj, null);
        }
        sb2.append((CharSequence) str2);
        return sb2.toString();
    }

    public static Float t0(float[] fArr) {
        fj.l.f(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static List u0(long[] jArr) {
        fj.l.f(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return s.f13520a;
        }
        if (length == 1) {
            return yd.f.K(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List v0(Object[] objArr) {
        fj.l.f(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new i(objArr, false)) : yd.f.K(objArr[0]) : s.f13520a;
    }
}
