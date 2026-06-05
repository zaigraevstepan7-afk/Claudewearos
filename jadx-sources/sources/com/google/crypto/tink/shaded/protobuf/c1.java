package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f4143a;

    /* renamed from: b, reason: collision with root package name */
    public static final f1 f4144b;

    /* renamed from: c, reason: collision with root package name */
    public static final f1 f4145c;

    /* renamed from: d, reason: collision with root package name */
    public static final f1 f4146d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f4143a = cls;
        f4144b = v(false);
        f4145c = v(true);
        f4146d = new f1();
    }

    public static void A(int i10, List list, l0 l0Var, boolean z2) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) l0Var.f4196a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                lVar.getClass();
                lVar.o0(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        lVar.r0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = l.f4189h;
            i12 += 8;
        }
        lVar.s0(i12);
        while (i11 < list.size()) {
            lVar.p0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void B(int i10, List list, l0 l0Var, boolean z2) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) l0Var.f4196a;
        if (!z2) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                lVar.r0(i10, 0);
                lVar.q0(iIntValue);
            }
            return;
        }
        lVar.r0(i10, 2);
        int iF0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iF0 += l.f0(((Integer) list.get(i12)).intValue());
        }
        lVar.s0(iF0);
        for (int i13 = 0; i13 < list.size(); i13++) {
            lVar.q0(((Integer) list.get(i13)).intValue());
        }
    }

    public static void C(int i10, List list, l0 l0Var, boolean z2) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) l0Var.f4196a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                lVar.m0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lVar.r0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = l.f4189h;
            i12 += 4;
        }
        lVar.s0(i12);
        while (i11 < list.size()) {
            lVar.n0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void D(int i10, List list, l0 l0Var, boolean z2) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) l0Var.f4196a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                lVar.o0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        lVar.r0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = l.f4189h;
            i12 += 8;
        }
        lVar.s0(i12);
        while (i11 < list.size()) {
            lVar.p0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void E(int i10, List list, l0 l0Var, boolean z2) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) l0Var.f4196a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                lVar.getClass();
                lVar.m0(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        lVar.r0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = l.f4189h;
            i12 += 4;
        }
        lVar.s0(i12);
        while (i11 < list.size()) {
            lVar.n0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void F(int i10, List list, l0 l0Var, b1 b1Var) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            l0Var.b(i10, list.get(i11), b1Var);
        }
    }

    public static void G(int i10, List list, l0 l0Var, boolean z2) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) l0Var.f4196a;
        if (!z2) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                lVar.r0(i10, 0);
                lVar.q0(iIntValue);
            }
            return;
        }
        lVar.r0(i10, 2);
        int iF0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iF0 += l.f0(((Integer) list.get(i12)).intValue());
        }
        lVar.s0(iF0);
        for (int i13 = 0; i13 < list.size(); i13++) {
            lVar.q0(((Integer) list.get(i13)).intValue());
        }
    }

    public static void H(int i10, List list, l0 l0Var, boolean z2) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) l0Var.f4196a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                lVar.t0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        lVar.r0(i10, 2);
        int iJ0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ0 += l.j0(((Long) list.get(i12)).longValue());
        }
        lVar.s0(iJ0);
        while (i11 < list.size()) {
            lVar.u0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void I(int i10, List list, l0 l0Var, b1 b1Var) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            l0Var.c(i10, list.get(i11), b1Var);
        }
    }

    public static void J(int i10, List list, l0 l0Var, boolean z2) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) l0Var.f4196a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                lVar.m0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lVar.r0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = l.f4189h;
            i12 += 4;
        }
        lVar.s0(i12);
        while (i11 < list.size()) {
            lVar.n0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void K(int i10, List list, l0 l0Var, boolean z2) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) l0Var.f4196a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                lVar.o0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        lVar.r0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = l.f4189h;
            i12 += 8;
        }
        lVar.s0(i12);
        while (i11 < list.size()) {
            lVar.p0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void L(int i10, List list, l0 l0Var, boolean z2) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) l0Var.f4196a;
        if (!z2) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                lVar.r0(i10, 0);
                lVar.s0((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        lVar.r0(i10, 2);
        int iI0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iI0 += l.i0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        lVar.s0(iI0);
        for (int i13 = 0; i13 < list.size(); i13++) {
            int iIntValue3 = ((Integer) list.get(i13)).intValue();
            lVar.s0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    public static void M(int i10, List list, l0 l0Var, boolean z2) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) l0Var.f4196a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                lVar.t0(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                i11++;
            }
            return;
        }
        lVar.r0(i10, 2);
        int iJ0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iJ0 += l.j0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        lVar.s0(iJ0);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            lVar.u0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i11++;
        }
    }

    public static void N(int i10, List list, l0 l0Var) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) l0Var.f4196a;
        if (!(list instanceof f0)) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                String str = (String) list.get(i11);
                lVar.r0(i10, 2);
                int i12 = lVar.f4193f;
                byte[] bArr = lVar.f4192e;
                int i13 = lVar.f4194g;
                try {
                    int iI0 = l.i0(str.length() * 3);
                    int iI02 = l.i0(str.length());
                    if (iI02 == iI0) {
                        int i14 = i13 + iI02;
                        lVar.f4194g = i14;
                        int iD = q1.f4215a.D(str, bArr, i14, i12 - i14);
                        lVar.f4194g = i13;
                        lVar.s0((iD - i13) - iI02);
                        lVar.f4194g = iD;
                    } else {
                        lVar.s0(q1.b(str));
                        int i15 = lVar.f4194g;
                        lVar.f4194g = q1.f4215a.D(str, bArr, i15, i12 - i15);
                    }
                } catch (p1 e10) {
                    lVar.f4194g = i13;
                    l.f4189h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
                    byte[] bytes = str.getBytes(a0.f4133a);
                    try {
                        lVar.s0(bytes.length);
                        lVar.l0(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e11) {
                        throw new androidx.datastore.preferences.protobuf.l(e11);
                    }
                } catch (IndexOutOfBoundsException e12) {
                    throw new androidx.datastore.preferences.protobuf.l(e12);
                }
            }
            return;
        }
        f0 f0Var = (f0) list;
        for (int i16 = 0; i16 < list.size(); i16++) {
            Object objR = f0Var.r(i16);
            if (objR instanceof String) {
                String str2 = (String) objR;
                lVar.r0(i10, 2);
                int i17 = lVar.f4193f;
                byte[] bArr2 = lVar.f4192e;
                int i18 = lVar.f4194g;
                try {
                    int iI03 = l.i0(str2.length() * 3);
                    int iI04 = l.i0(str2.length());
                    if (iI04 == iI03) {
                        int i19 = i18 + iI04;
                        lVar.f4194g = i19;
                        int iD2 = q1.f4215a.D(str2, bArr2, i19, i17 - i19);
                        lVar.f4194g = i18;
                        lVar.s0((iD2 - i18) - iI04);
                        lVar.f4194g = iD2;
                    } else {
                        lVar.s0(q1.b(str2));
                        int i20 = lVar.f4194g;
                        lVar.f4194g = q1.f4215a.D(str2, bArr2, i20, i17 - i20);
                    }
                } catch (p1 e13) {
                    lVar.f4194g = i18;
                    l.f4189h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e13);
                    byte[] bytes2 = str2.getBytes(a0.f4133a);
                    try {
                        lVar.s0(bytes2.length);
                        lVar.l0(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e14) {
                        throw new androidx.datastore.preferences.protobuf.l(e14);
                    }
                } catch (IndexOutOfBoundsException e15) {
                    throw new androidx.datastore.preferences.protobuf.l(e15);
                }
            } else {
                i iVar = (i) objR;
                lVar.r0(i10, 2);
                lVar.s0(iVar.size());
                h hVar = (h) iVar;
                lVar.l0(hVar.f4169d, hVar.y(), hVar.size());
            }
        }
    }

    public static void O(int i10, List list, l0 l0Var, boolean z2) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) l0Var.f4196a;
        if (!z2) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                lVar.r0(i10, 0);
                lVar.s0(iIntValue);
            }
            return;
        }
        lVar.r0(i10, 2);
        int iI0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iI0 += l.i0(((Integer) list.get(i12)).intValue());
        }
        lVar.s0(iI0);
        for (int i13 = 0; i13 < list.size(); i13++) {
            lVar.s0(((Integer) list.get(i13)).intValue());
        }
    }

    public static void P(int i10, List list, l0 l0Var, boolean z2) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) l0Var.f4196a;
        int i11 = 0;
        if (!z2) {
            while (i11 < list.size()) {
                lVar.t0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        lVar.r0(i10, 2);
        int iJ0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ0 += l.j0(((Long) list.get(i12)).longValue());
        }
        lVar.s0(iJ0);
        while (i11 < list.size()) {
            lVar.u0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH0 = l.h0(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iH0 += l.b0((i) list.get(i11));
        }
        return iH0;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.h0(i10) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            if (size <= 0) {
                return 0;
            }
            xVar.i(0);
            throw null;
        }
        int iF0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iF0 += l.f0(((Integer) list.get(i10)).intValue());
        }
        return iF0;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l.c0(i10) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l.d0(i10) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.h0(i10) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            if (size <= 0) {
                return 0;
            }
            xVar.i(0);
            throw null;
        }
        int iF0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iF0 += l.f0(((Integer) list.get(i10)).intValue());
        }
        return iF0;
    }

    public static int j(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (l.h0(i10) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            if (size <= 0) {
                return 0;
            }
            j0Var.i(0);
            throw null;
        }
        int iJ0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iJ0 += l.j0(((Long) list.get(i10)).longValue());
        }
        return iJ0;
    }

    public static int l(int i10, List list, b1 b1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH0 = l.h0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            int iB = ((a) list.get(i11)).b(b1Var);
            iH0 += l.i0(iB) + iB;
        }
        return iH0;
    }

    public static int m(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.h0(i10) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            if (size <= 0) {
                return 0;
            }
            xVar.i(0);
            throw null;
        }
        int iI0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iI0 += l.i0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iI0;
    }

    public static int o(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.h0(i10) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            if (size <= 0) {
                return 0;
            }
            j0Var.i(0);
            throw null;
        }
        int iJ0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iJ0 += l.j0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iJ0;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iH0 = l.h0(i10) * size;
        if (!(list instanceof f0)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof i) {
                    int size2 = ((i) obj).size();
                    iH0 = l.i0(size2) + size2 + iH0;
                } else {
                    iH0 = l.g0((String) obj) + iH0;
                }
                i11++;
            }
            return iH0;
        }
        f0 f0Var = (f0) list;
        while (i11 < size) {
            Object objR = f0Var.r(i11);
            if (objR instanceof i) {
                int size3 = ((i) objR).size();
                iH0 = l.i0(size3) + size3 + iH0;
            } else {
                iH0 = l.g0((String) objR) + iH0;
            }
            i11++;
        }
        return iH0;
    }

    public static int r(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.h0(i10) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            if (size <= 0) {
                return 0;
            }
            xVar.i(0);
            throw null;
        }
        int iI0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iI0 += l.i0(((Integer) list.get(i10)).intValue());
        }
        return iI0;
    }

    public static int t(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.h0(i10) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            if (size <= 0) {
                return 0;
            }
            j0Var.i(0);
            throw null;
        }
        int iJ0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iJ0 += l.j0(((Long) list.get(i10)).longValue());
        }
        return iJ0;
    }

    public static f1 v(boolean z2) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (f1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z2));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void w(f1 f1Var, Object obj, Object obj2) {
        f1Var.getClass();
        w wVar = (w) obj;
        e1 e1Var = wVar.unknownFields;
        e1 e1Var2 = ((w) obj2).unknownFields;
        e1 e1Var3 = e1.f4158f;
        if (!e1Var3.equals(e1Var2)) {
            if (e1Var3.equals(e1Var)) {
                int i10 = e1Var.f4159a + e1Var2.f4159a;
                int[] iArrCopyOf = Arrays.copyOf(e1Var.f4160b, i10);
                System.arraycopy(e1Var2.f4160b, 0, iArrCopyOf, e1Var.f4159a, e1Var2.f4159a);
                Object[] objArrCopyOf = Arrays.copyOf(e1Var.f4161c, i10);
                System.arraycopy(e1Var2.f4161c, 0, objArrCopyOf, e1Var.f4159a, e1Var2.f4159a);
                e1Var = new e1(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                e1Var.getClass();
                if (!e1Var2.equals(e1Var3)) {
                    if (!e1Var.f4163e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = e1Var.f4159a + e1Var2.f4159a;
                    e1Var.a(i11);
                    System.arraycopy(e1Var2.f4160b, 0, e1Var.f4160b, e1Var.f4159a, e1Var2.f4159a);
                    System.arraycopy(e1Var2.f4161c, 0, e1Var.f4161c, e1Var.f4159a, e1Var2.f4159a);
                    e1Var.f4159a = i11;
                }
            }
        }
        wVar.unknownFields = e1Var;
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void y(int i10, List list, l0 l0Var, boolean z2) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) l0Var.f4196a;
        if (!z2) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                boolean zBooleanValue = ((Boolean) list.get(i11)).booleanValue();
                lVar.r0(i10, 0);
                lVar.k0(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        lVar.r0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = l.f4189h;
            i12++;
        }
        lVar.s0(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            lVar.k0(((Boolean) list.get(i14)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void z(int i10, List list, l0 l0Var) throws androidx.datastore.preferences.protobuf.l {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            l lVar = (l) l0Var.f4196a;
            i iVar = (i) list.get(i11);
            lVar.r0(i10, 2);
            lVar.s0(iVar.size());
            h hVar = (h) iVar;
            lVar.l0(hVar.f4169d, hVar.y(), hVar.size());
        }
    }
}
