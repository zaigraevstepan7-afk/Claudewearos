package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f1037a;

    /* renamed from: b, reason: collision with root package name */
    public static final f1 f1038b;

    /* renamed from: c, reason: collision with root package name */
    public static final f1 f1039c;

    static {
        Class<?> cls;
        Class<?> cls2;
        u0 u0Var = u0.f1025c;
        f1 f1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f1037a = cls;
        try {
            u0 u0Var2 = u0.f1025c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                f1Var = (f1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f1038b = f1Var;
        f1039c = new f1();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iE0 += m.e0(((Integer) list.get(i10)).intValue());
        }
        return iE0;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.c0(i10) + 4) * size;
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.c0(i10) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iE0 += m.e0(((Integer) list.get(i10)).intValue());
        }
        return iE0;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iE0 += m.e0(((Long) list.get(i10)).longValue());
        }
        return iE0;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iD0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iD0 += m.d0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iD0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iE0 += m.e0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iE0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iD0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iD0 += m.d0(((Integer) list.get(i10)).intValue());
        }
        return iD0;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iE0 += m.e0(((Long) list.get(i10)).longValue());
        }
        return iE0;
    }

    public static void k(f1 f1Var, Object obj, Object obj2) {
        f1Var.getClass();
        w wVar = (w) obj;
        e1 e1Var = wVar.unknownFields;
        e1 e1Var2 = ((w) obj2).unknownFields;
        e1 e1Var3 = e1.f918f;
        if (!e1Var3.equals(e1Var2)) {
            if (e1Var3.equals(e1Var)) {
                int i10 = e1Var.f919a + e1Var2.f919a;
                int[] iArrCopyOf = Arrays.copyOf(e1Var.f920b, i10);
                System.arraycopy(e1Var2.f920b, 0, iArrCopyOf, e1Var.f919a, e1Var2.f919a);
                Object[] objArrCopyOf = Arrays.copyOf(e1Var.f921c, i10);
                System.arraycopy(e1Var2.f921c, 0, objArrCopyOf, e1Var.f919a, e1Var2.f919a);
                e1Var = new e1(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                e1Var.getClass();
                if (!e1Var2.equals(e1Var3)) {
                    if (!e1Var.f923e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = e1Var.f919a + e1Var2.f919a;
                    e1Var.a(i11);
                    System.arraycopy(e1Var2.f920b, 0, e1Var.f920b, e1Var.f919a, e1Var2.f919a);
                    System.arraycopy(e1Var2.f921c, 0, e1Var.f921c, e1Var.f919a, e1Var2.f919a);
                    e1Var.f919a = i11;
                }
            }
        }
        wVar.unknownFields = e1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i10, List list, g0 g0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f932a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                mVar.j0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        mVar.v0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = m.f968i;
            i12++;
        }
        mVar.x0(i12);
        while (i11 < list.size()) {
            mVar.h0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void n(int i10, List list, g0 g0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f932a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                mVar.getClass();
                mVar.o0(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        mVar.v0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = m.f968i;
            i12 += 8;
        }
        mVar.x0(i12);
        while (i11 < list.size()) {
            mVar.p0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void o(int i10, List list, g0 g0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f932a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                mVar.q0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        mVar.v0(i10, 2);
        int iE0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE0 += m.e0(((Integer) list.get(i12)).intValue());
        }
        mVar.x0(iE0);
        while (i11 < list.size()) {
            mVar.r0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void p(int i10, List list, g0 g0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f932a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                mVar.m0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        mVar.v0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = m.f968i;
            i12 += 4;
        }
        mVar.x0(i12);
        while (i11 < list.size()) {
            mVar.n0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void q(int i10, List list, g0 g0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f932a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                mVar.o0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        mVar.v0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = m.f968i;
            i12 += 8;
        }
        mVar.x0(i12);
        while (i11 < list.size()) {
            mVar.p0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void r(int i10, List list, g0 g0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f932a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                mVar.getClass();
                mVar.m0(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        mVar.v0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = m.f968i;
            i12 += 4;
        }
        mVar.x0(i12);
        while (i11 < list.size()) {
            mVar.n0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void s(int i10, List list, g0 g0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f932a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                mVar.q0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        mVar.v0(i10, 2);
        int iE0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE0 += m.e0(((Integer) list.get(i12)).intValue());
        }
        mVar.x0(iE0);
        while (i11 < list.size()) {
            mVar.r0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void t(int i10, List list, g0 g0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f932a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                mVar.y0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        mVar.v0(i10, 2);
        int iE0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE0 += m.e0(((Long) list.get(i12)).longValue());
        }
        mVar.x0(iE0);
        while (i11 < list.size()) {
            mVar.z0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void u(int i10, List list, g0 g0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f932a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                mVar.m0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        mVar.v0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = m.f968i;
            i12 += 4;
        }
        mVar.x0(i12);
        while (i11 < list.size()) {
            mVar.n0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void v(int i10, List list, g0 g0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f932a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                mVar.o0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        mVar.v0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = m.f968i;
            i12 += 8;
        }
        mVar.x0(i12);
        while (i11 < list.size()) {
            mVar.p0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void w(int i10, List list, g0 g0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f932a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                mVar.w0(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                i11++;
            }
            return;
        }
        mVar.v0(i10, 2);
        int iD0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iD0 += m.d0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        mVar.x0(iD0);
        while (i11 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            mVar.x0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i11++;
        }
    }

    public static void x(int i10, List list, g0 g0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f932a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                mVar.y0(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                i11++;
            }
            return;
        }
        mVar.v0(i10, 2);
        int iE0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iE0 += m.e0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        mVar.x0(iE0);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            mVar.z0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i11++;
        }
    }

    public static void y(int i10, List list, g0 g0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f932a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                mVar.w0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        mVar.v0(i10, 2);
        int iD0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iD0 += m.d0(((Integer) list.get(i12)).intValue());
        }
        mVar.x0(iD0);
        while (i11 < list.size()) {
            mVar.x0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void z(int i10, List list, g0 g0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f932a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                mVar.y0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        mVar.v0(i10, 2);
        int iE0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE0 += m.e0(((Long) list.get(i12)).longValue());
        }
        mVar.x0(iE0);
        while (i11 < list.size()) {
            mVar.z0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static Object j(Object obj, int i10, x xVar, Object obj2, f1 f1Var) {
        return obj2;
    }
}
