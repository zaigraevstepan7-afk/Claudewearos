package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.ads.zzbch;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 implements x0 {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f979n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f980o = k1.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f981a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f982b;

    /* renamed from: c, reason: collision with root package name */
    public final int f983c;

    /* renamed from: d, reason: collision with root package name */
    public final int f984d;

    /* renamed from: e, reason: collision with root package name */
    public final a f985e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f986f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f987g;

    /* renamed from: h, reason: collision with root package name */
    public final int f988h;

    /* renamed from: i, reason: collision with root package name */
    public final int f989i;
    public final q0 j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f990k;

    /* renamed from: l, reason: collision with root package name */
    public final f1 f991l;

    /* renamed from: m, reason: collision with root package name */
    public final k0 f992m;

    public o0(int[] iArr, Object[] objArr, int i10, int i11, a aVar, int[] iArr2, int i12, int i13, q0 q0Var, d0 d0Var, f1 f1Var, p pVar, k0 k0Var) {
        this.f981a = iArr;
        this.f982b = objArr;
        this.f983c = i10;
        this.f984d = i11;
        this.f986f = aVar instanceof w;
        this.f987g = iArr2;
        this.f988h = i12;
        this.f989i = i13;
        this.j = q0Var;
        this.f990k = d0Var;
        this.f991l = f1Var;
        this.f985e = aVar;
        this.f992m = k0Var;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbK = m6.a.k("Field ", str, " for ");
            sbK.append(cls.getName());
            sbK.append(" not found. Known fields are ");
            sbK.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbK.toString());
        }
    }

    public static int K(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof w) {
            return ((w) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.o0 w(androidx.datastore.preferences.protobuf.w0 r34, androidx.datastore.preferences.protobuf.q0 r35, androidx.datastore.preferences.protobuf.d0 r36, androidx.datastore.preferences.protobuf.f1 r37, androidx.datastore.preferences.protobuf.p r38, androidx.datastore.preferences.protobuf.k0 r39) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.w(androidx.datastore.preferences.protobuf.w0, androidx.datastore.preferences.protobuf.q0, androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.f1, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.k0):androidx.datastore.preferences.protobuf.o0");
    }

    public static long x(int i10) {
        return i10 & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) k1.f960c.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) k1.f960c.h(j, obj)).longValue();
    }

    public final int A(int i10) {
        if (i10 >= this.f983c && i10 <= this.f984d) {
            int[] iArr = this.f981a;
            int length = (iArr.length / 3) - 1;
            int i11 = 0;
            while (i11 <= length) {
                int i12 = (length + i11) >>> 1;
                int i13 = i12 * 3;
                int i14 = iArr[i13];
                if (i10 == i14) {
                    return i13;
                }
                if (i10 < i14) {
                    length = i12 - 1;
                } else {
                    i11 = i12 + 1;
                }
            }
        }
        return -1;
    }

    public final void B(Object obj, long j, k kVar, x0 x0Var, o oVar) throws z {
        int iH;
        this.f990k.getClass();
        x xVarA = d0.a(j, obj);
        j jVar = (j) kVar.f957e;
        int i10 = kVar.f954b;
        if ((i10 & 7) != 3) {
            throw a0.b();
        }
        do {
            w wVarD = x0Var.d();
            kVar.h(wVarD, x0Var, oVar);
            x0Var.b(wVarD);
            ((v0) xVarA).add(wVarD);
            if (jVar.g() || kVar.f956d != 0) {
                return;
            } else {
                iH = jVar.H();
            }
        } while (iH == i10);
        kVar.f956d = iH;
    }

    public final void C(Object obj, int i10, k kVar, x0 x0Var, o oVar) throws a0 {
        int iH;
        this.f990k.getClass();
        x xVarA = d0.a(i10 & 1048575, obj);
        j jVar = (j) kVar.f957e;
        int i11 = kVar.f954b;
        if ((i11 & 7) != 2) {
            throw a0.b();
        }
        do {
            w wVarD = x0Var.d();
            kVar.j(wVarD, x0Var, oVar);
            x0Var.b(wVarD);
            ((v0) xVarA).add(wVarD);
            if (jVar.g() || kVar.f956d != 0) {
                return;
            } else {
                iH = jVar.H();
            }
        } while (iH == i11);
        kVar.f956d = iH;
    }

    public final void D(int i10, k kVar, Object obj) throws z, com.google.crypto.tink.shaded.protobuf.b0 {
        if ((536870912 & i10) != 0) {
            kVar.V(2);
            k1.o(obj, i10 & 1048575, ((j) kVar.f957e).G());
        } else if (!this.f986f) {
            k1.o(obj, i10 & 1048575, kVar.n());
        } else {
            kVar.V(2);
            k1.o(obj, i10 & 1048575, ((j) kVar.f957e).F());
        }
    }

    public final void E(int i10, k kVar, Object obj) throws z, com.google.crypto.tink.shaded.protobuf.b0 {
        int i11 = 536870912 & i10;
        d0 d0Var = this.f990k;
        if (i11 != 0) {
            d0Var.getClass();
            kVar.O(d0.a(i10 & 1048575, obj), true);
        } else {
            d0Var.getClass();
            kVar.O(d0.a(i10 & 1048575, obj), false);
        }
    }

    public final void G(int i10, Object obj) {
        int i11 = this.f981a[i10 + 2];
        long j = 1048575 & i11;
        if (j == 1048575) {
            return;
        }
        k1.m(obj, (1 << (i11 >>> 20)) | k1.f960c.f(j, obj), j);
    }

    public final void H(int i10, int i11, Object obj) {
        k1.m(obj, i10, this.f981a[i11 + 2] & 1048575);
    }

    public final void I(Object obj, int i10, a aVar) {
        f980o.putObject(obj, L(i10) & 1048575, aVar);
        G(i10, obj);
    }

    public final void J(Object obj, int i10, int i11, a aVar) {
        f980o.putObject(obj, L(i11) & 1048575, aVar);
        H(i10, i11, obj);
    }

    public final int L(int i10) {
        return this.f981a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, g0 g0Var) throws IOException {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        o0 o0Var = this;
        int[] iArr = o0Var.f981a;
        int length = iArr.length;
        Unsafe unsafe = f980o;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (i16 < length) {
            int iL = o0Var.L(i16);
            int i18 = iArr[i16];
            int iK = K(iL);
            if (iK <= 17) {
                int i19 = iArr[i16 + 2];
                int i20 = i19 & i14;
                if (i20 != i15) {
                    i17 = i20 == i14 ? 0 : unsafe.getInt(obj, i20);
                    i15 = i20;
                }
                i10 = iL;
                i11 = 1 << (i19 >>> 20);
            } else {
                i10 = iL;
                i11 = 0;
            }
            long j = i10 & i14;
            switch (iK) {
                case 0:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        double d10 = k1.f960c.d(j, obj);
                        m mVar = (m) g0Var.f932a;
                        mVar.getClass();
                        mVar.o0(i18, Double.doubleToRawLongBits(d10));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        float fE = k1.f960c.e(j, obj);
                        m mVar2 = (m) g0Var.f932a;
                        mVar2.getClass();
                        mVar2.m0(i18, Float.floatToRawIntBits(fE));
                    }
                    o0Var = this;
                    break;
                case 2:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        ((m) g0Var.f932a).y0(i18, unsafe.getLong(obj, j));
                    }
                    o0Var = this;
                    break;
                case 3:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        ((m) g0Var.f932a).y0(i18, unsafe.getLong(obj, j));
                    }
                    o0Var = this;
                    break;
                case 4:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        ((m) g0Var.f932a).q0(i18, unsafe.getInt(obj, j));
                    }
                    o0Var = this;
                    break;
                case 5:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        ((m) g0Var.f932a).o0(i18, unsafe.getLong(obj, j));
                    }
                    o0Var = this;
                    break;
                case 6:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        ((m) g0Var.f932a).m0(i18, unsafe.getInt(obj, j));
                    }
                    o0Var = this;
                    break;
                case 7:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        ((m) g0Var.f932a).j0(i18, k1.f960c.c(j, obj));
                    }
                    o0Var = this;
                    break;
                case 8:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((m) g0Var.f932a).t0(i18, (String) object);
                        } else {
                            ((m) g0Var.f932a).k0(i18, (g) object);
                        }
                    }
                    o0Var = this;
                    break;
                case 9:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        ((m) g0Var.f932a).s0(i18, (a) unsafe.getObject(obj, j), o0Var.m(i16));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        ((m) g0Var.f932a).k0(i18, (g) unsafe.getObject(obj, j));
                    }
                    o0Var = this;
                    break;
                case 11:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        ((m) g0Var.f932a).w0(i18, unsafe.getInt(obj, j));
                    }
                    o0Var = this;
                    break;
                case 12:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        ((m) g0Var.f932a).q0(i18, unsafe.getInt(obj, j));
                    }
                    o0Var = this;
                    break;
                case 13:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        ((m) g0Var.f932a).m0(i18, unsafe.getInt(obj, j));
                    }
                    o0Var = this;
                    break;
                case 14:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        ((m) g0Var.f932a).o0(i18, unsafe.getLong(obj, j));
                    }
                    o0Var = this;
                    break;
                case 15:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        int i21 = unsafe.getInt(obj, j);
                        ((m) g0Var.f932a).w0(i18, (i21 >> 31) ^ (i21 << 1));
                    }
                    o0Var = this;
                    break;
                case 16:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        long j4 = unsafe.getLong(obj, j);
                        ((m) g0Var.f932a).y0(i18, (j4 >> 63) ^ (j4 << 1));
                    }
                    o0Var = this;
                    break;
                case 17:
                    if (o0Var.o(obj, i16, i15, i17, i11)) {
                        g0Var.a(i18, unsafe.getObject(obj, j), o0Var.m(i16));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i12 = i15;
                    y0.n(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, false);
                    i15 = i12;
                    break;
                case 19:
                    i12 = i15;
                    y0.r(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, false);
                    i15 = i12;
                    break;
                case 20:
                    i12 = i15;
                    y0.t(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, false);
                    i15 = i12;
                    break;
                case zzbch.zzt.zzm /* 21 */:
                    i12 = i15;
                    y0.z(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, false);
                    i15 = i12;
                    break;
                case 22:
                    i12 = i15;
                    y0.s(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, false);
                    i15 = i12;
                    break;
                case 23:
                    i12 = i15;
                    y0.q(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, false);
                    i15 = i12;
                    break;
                case 24:
                    i12 = i15;
                    y0.p(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, false);
                    i15 = i12;
                    break;
                case 25:
                    i12 = i15;
                    y0.m(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, false);
                    i15 = i12;
                    break;
                case 26:
                    i13 = i15;
                    int i22 = iArr[i16];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = y0.f1037a;
                    if (list != null && !list.isEmpty()) {
                        g0Var.getClass();
                        for (int i23 = 0; i23 < list.size(); i23++) {
                            ((m) g0Var.f932a).t0(i22, (String) list.get(i23));
                        }
                    }
                    i15 = i13;
                    break;
                case 27:
                    i13 = i15;
                    int i24 = iArr[i16];
                    List list2 = (List) unsafe.getObject(obj, j);
                    x0 x0VarM = o0Var.m(i16);
                    Class cls2 = y0.f1037a;
                    if (list2 != null && !list2.isEmpty()) {
                        g0Var.getClass();
                        for (int i25 = 0; i25 < list2.size(); i25++) {
                            ((m) g0Var.f932a).s0(i24, (a) list2.get(i25), x0VarM);
                        }
                    }
                    i15 = i13;
                    break;
                case 28:
                    i13 = i15;
                    int i26 = iArr[i16];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = y0.f1037a;
                    if (list3 != null && !list3.isEmpty()) {
                        g0Var.getClass();
                        for (int i27 = 0; i27 < list3.size(); i27++) {
                            ((m) g0Var.f932a).k0(i26, (g) list3.get(i27));
                        }
                    }
                    i15 = i13;
                    break;
                case 29:
                    i12 = i15;
                    z2 = false;
                    y0.y(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, false);
                    i15 = i12;
                    break;
                case 30:
                    i12 = i15;
                    z2 = false;
                    y0.o(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, false);
                    i15 = i12;
                    break;
                case 31:
                    i12 = i15;
                    z2 = false;
                    y0.u(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, false);
                    i15 = i12;
                    break;
                case 32:
                    i12 = i15;
                    z2 = false;
                    y0.v(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, false);
                    i15 = i12;
                    break;
                case 33:
                    i12 = i15;
                    z2 = false;
                    y0.w(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, false);
                    i15 = i12;
                    break;
                case 34:
                    i12 = i15;
                    z2 = false;
                    y0.x(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, false);
                    i15 = i12;
                    break;
                case 35:
                    i13 = i15;
                    y0.n(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, true);
                    i15 = i13;
                    break;
                case 36:
                    i13 = i15;
                    y0.r(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, true);
                    i15 = i13;
                    break;
                case 37:
                    i13 = i15;
                    y0.t(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, true);
                    i15 = i13;
                    break;
                case 38:
                    i13 = i15;
                    y0.z(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, true);
                    i15 = i13;
                    break;
                case 39:
                    i13 = i15;
                    y0.s(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, true);
                    i15 = i13;
                    break;
                case 40:
                    i13 = i15;
                    y0.q(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, true);
                    i15 = i13;
                    break;
                case 41:
                    i13 = i15;
                    y0.p(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, true);
                    i15 = i13;
                    break;
                case 42:
                    i13 = i15;
                    y0.m(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, true);
                    i15 = i13;
                    break;
                case 43:
                    i13 = i15;
                    y0.y(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, true);
                    i15 = i13;
                    break;
                case 44:
                    i13 = i15;
                    y0.o(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, true);
                    i15 = i13;
                    break;
                case 45:
                    i13 = i15;
                    y0.u(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, true);
                    i15 = i13;
                    break;
                case 46:
                    i13 = i15;
                    y0.v(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, true);
                    i15 = i13;
                    break;
                case 47:
                    i13 = i15;
                    y0.w(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, true);
                    i15 = i13;
                    break;
                case 48:
                    i13 = i15;
                    y0.x(iArr[i16], (List) unsafe.getObject(obj, j), g0Var, true);
                    i15 = i13;
                    break;
                case 49:
                    i13 = i15;
                    int i28 = iArr[i16];
                    List list4 = (List) unsafe.getObject(obj, j);
                    x0 x0VarM2 = o0Var.m(i16);
                    Class cls4 = y0.f1037a;
                    if (list4 != null && !list4.isEmpty()) {
                        g0Var.getClass();
                        for (int i29 = 0; i29 < list4.size(); i29++) {
                            g0Var.a(i28, list4.get(i29), x0VarM2);
                        }
                    }
                    i15 = i13;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i30 = 2;
                        Object obj2 = o0Var.f982b[(i16 / 3) * 2];
                        o0Var.f992m.getClass();
                        h0 h0Var = ((i0) obj2).f947a;
                        m mVar3 = (m) g0Var.f932a;
                        mVar3.getClass();
                        for (Map.Entry entry : ((j0) object2).entrySet()) {
                            mVar3.v0(i18, i30);
                            mVar3.x0(i0.a(h0Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            r.b(mVar3, h0Var.f938a, 1, key);
                            i30 = 2;
                            r.b(mVar3, h0Var.f939b, 2, value);
                            i15 = i15;
                        }
                    }
                    i13 = i15;
                    i15 = i13;
                    break;
                case 51:
                    if (o0Var.q(i18, i16, obj)) {
                        double dDoubleValue = ((Double) k1.f960c.h(j, obj)).doubleValue();
                        m mVar4 = (m) g0Var.f932a;
                        mVar4.getClass();
                        mVar4.o0(i18, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (o0Var.q(i18, i16, obj)) {
                        float fFloatValue = ((Float) k1.f960c.h(j, obj)).floatValue();
                        m mVar5 = (m) g0Var.f932a;
                        mVar5.getClass();
                        mVar5.m0(i18, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (o0Var.q(i18, i16, obj)) {
                        ((m) g0Var.f932a).y0(i18, z(j, obj));
                    }
                    break;
                case 54:
                    if (o0Var.q(i18, i16, obj)) {
                        ((m) g0Var.f932a).y0(i18, z(j, obj));
                    }
                    break;
                case 55:
                    if (o0Var.q(i18, i16, obj)) {
                        ((m) g0Var.f932a).q0(i18, y(j, obj));
                    }
                    break;
                case 56:
                    if (o0Var.q(i18, i16, obj)) {
                        ((m) g0Var.f932a).o0(i18, z(j, obj));
                    }
                    break;
                case 57:
                    if (o0Var.q(i18, i16, obj)) {
                        ((m) g0Var.f932a).m0(i18, y(j, obj));
                    }
                    break;
                case 58:
                    if (o0Var.q(i18, i16, obj)) {
                        ((m) g0Var.f932a).j0(i18, ((Boolean) k1.f960c.h(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (o0Var.q(i18, i16, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((m) g0Var.f932a).t0(i18, (String) object3);
                        } else {
                            ((m) g0Var.f932a).k0(i18, (g) object3);
                        }
                    }
                    break;
                case 60:
                    if (o0Var.q(i18, i16, obj)) {
                        ((m) g0Var.f932a).s0(i18, (a) unsafe.getObject(obj, j), o0Var.m(i16));
                    }
                    break;
                case 61:
                    if (o0Var.q(i18, i16, obj)) {
                        ((m) g0Var.f932a).k0(i18, (g) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (o0Var.q(i18, i16, obj)) {
                        ((m) g0Var.f932a).w0(i18, y(j, obj));
                    }
                    break;
                case 63:
                    if (o0Var.q(i18, i16, obj)) {
                        ((m) g0Var.f932a).q0(i18, y(j, obj));
                    }
                    break;
                case 64:
                    if (o0Var.q(i18, i16, obj)) {
                        ((m) g0Var.f932a).m0(i18, y(j, obj));
                    }
                    break;
                case 65:
                    if (o0Var.q(i18, i16, obj)) {
                        ((m) g0Var.f932a).o0(i18, z(j, obj));
                    }
                    break;
                case 66:
                    if (o0Var.q(i18, i16, obj)) {
                        int iY = y(j, obj);
                        ((m) g0Var.f932a).w0(i18, (iY >> 31) ^ (iY << 1));
                    }
                    break;
                case 67:
                    if (o0Var.q(i18, i16, obj)) {
                        long jZ = z(j, obj);
                        ((m) g0Var.f932a).y0(i18, (jZ << 1) ^ (jZ >> 63));
                    }
                    break;
                case 68:
                    if (o0Var.q(i18, i16, obj)) {
                        g0Var.a(i18, unsafe.getObject(obj, j), o0Var.m(i16));
                    }
                    break;
            }
            i16 += 3;
            i14 = 1048575;
        }
        o0Var.f991l.getClass();
        ((w) obj).unknownFields.d(g0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // androidx.datastore.preferences.protobuf.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.a(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // androidx.datastore.preferences.protobuf.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = p(r10)
            if (r0 != 0) goto L8
            goto La5
        L8:
            boolean r0 = r10 instanceof androidx.datastore.preferences.protobuf.w
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r10
            androidx.datastore.preferences.protobuf.w r0 = (androidx.datastore.preferences.protobuf.w) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.k(r2)
            r0.memoizedHashCode = r1
            r0.h()
        L1b:
            int[] r0 = r9.f981a
            int r2 = r0.length
            r3 = r1
        L1f:
            if (r3 >= r2) goto L96
            int r4 = r9.L(r3)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r4
            long r5 = (long) r5
            int r4 = K(r4)
            r7 = 9
            if (r4 == r7) goto L80
            r7 = 60
            if (r4 == r7) goto L6a
            r7 = 68
            if (r4 == r7) goto L6a
            switch(r4) {
                case 17: goto L80;
                case 18: goto L54;
                case 19: goto L54;
                case 20: goto L54;
                case 21: goto L54;
                case 22: goto L54;
                case 23: goto L54;
                case 24: goto L54;
                case 25: goto L54;
                case 26: goto L54;
                case 27: goto L54;
                case 28: goto L54;
                case 29: goto L54;
                case 30: goto L54;
                case 31: goto L54;
                case 32: goto L54;
                case 33: goto L54;
                case 34: goto L54;
                case 35: goto L54;
                case 36: goto L54;
                case 37: goto L54;
                case 38: goto L54;
                case 39: goto L54;
                case 40: goto L54;
                case 41: goto L54;
                case 42: goto L54;
                case 43: goto L54;
                case 44: goto L54;
                case 45: goto L54;
                case 46: goto L54;
                case 47: goto L54;
                case 48: goto L54;
                case 49: goto L54;
                case 50: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L93
        L3e:
            sun.misc.Unsafe r4 = androidx.datastore.preferences.protobuf.o0.f980o
            java.lang.Object r7 = r4.getObject(r10, r5)
            if (r7 == 0) goto L93
            androidx.datastore.preferences.protobuf.k0 r8 = r9.f992m
            r8.getClass()
            r8 = r7
            androidx.datastore.preferences.protobuf.j0 r8 = (androidx.datastore.preferences.protobuf.j0) r8
            r8.f951a = r1
            r4.putObject(r10, r5, r7)
            goto L93
        L54:
            androidx.datastore.preferences.protobuf.d0 r4 = r9.f990k
            r4.getClass()
            androidx.datastore.preferences.protobuf.j1 r4 = androidx.datastore.preferences.protobuf.k1.f960c
            java.lang.Object r4 = r4.h(r5, r10)
            androidx.datastore.preferences.protobuf.x r4 = (androidx.datastore.preferences.protobuf.x) r4
            androidx.datastore.preferences.protobuf.b r4 = (androidx.datastore.preferences.protobuf.b) r4
            boolean r5 = r4.f895a
            if (r5 == 0) goto L93
            r4.f895a = r1
            goto L93
        L6a:
            r4 = r0[r3]
            boolean r4 = r9.q(r4, r3, r10)
            if (r4 == 0) goto L93
            androidx.datastore.preferences.protobuf.x0 r4 = r9.m(r3)
            sun.misc.Unsafe r7 = androidx.datastore.preferences.protobuf.o0.f980o
            java.lang.Object r5 = r7.getObject(r10, r5)
            r4.b(r5)
            goto L93
        L80:
            boolean r4 = r9.n(r3, r10)
            if (r4 == 0) goto L93
            androidx.datastore.preferences.protobuf.x0 r4 = r9.m(r3)
            sun.misc.Unsafe r7 = androidx.datastore.preferences.protobuf.o0.f980o
            java.lang.Object r5 = r7.getObject(r10, r5)
            r4.b(r5)
        L93:
            int r3 = r3 + 3
            goto L1f
        L96:
            androidx.datastore.preferences.protobuf.f1 r0 = r9.f991l
            r0.getClass()
            androidx.datastore.preferences.protobuf.w r10 = (androidx.datastore.preferences.protobuf.w) r10
            androidx.datastore.preferences.protobuf.e1 r10 = r10.unknownFields
            boolean r0 = r10.f923e
            if (r0 == 0) goto La5
            r10.f923e = r1
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.b(java.lang.Object):void");
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final boolean c(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.f988h) {
            int i16 = this.f987g[i15];
            int[] iArr = this.f981a;
            int i17 = iArr[i16];
            int iL = L(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = f980o.getInt(obj, i19);
                }
                i11 = i16;
                i12 = i14;
                i10 = i19;
            } else {
                int i21 = i14;
                i10 = i13;
                i11 = i16;
                i12 = i21;
            }
            if ((268435456 & iL) == 0 || o(obj, i11, i10, i12, i20)) {
                int iK = K(iL);
                if (iK == 9 || iK == 17) {
                    if (o(obj, i11, i10, i12, i20)) {
                        if (!m(i11).c(k1.f960c.h(iL & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                } else {
                    if (iK != 27) {
                        if (iK == 60 || iK == 68) {
                            if (q(i17, i11, obj)) {
                                if (!m(i11).c(k1.f960c.h(iL & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i15++;
                            i13 = i10;
                            i14 = i12;
                        } else if (iK != 49) {
                            if (iK != 50) {
                                continue;
                            } else {
                                Object objH = k1.f960c.h(iL & 1048575, obj);
                                this.f992m.getClass();
                                j0 j0Var = (j0) objH;
                                if (j0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((i0) this.f982b[(i11 / 3) * 2]).f947a.f939b.f1012a != t1.B) {
                                        continue;
                                    } else {
                                        x0 x0VarA = null;
                                        for (Object obj2 : j0Var.values()) {
                                            if (x0VarA == null) {
                                                x0VarA = u0.f1025c.a(obj2.getClass());
                                            }
                                            if (!x0VarA.c(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i15++;
                            i13 = i10;
                            i14 = i12;
                        }
                    }
                    List list = (List) k1.f960c.h(iL & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        x0 x0VarM = m(i11);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (x0VarM.c(list.get(i22))) {
                            }
                        }
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final w d() {
        this.j.getClass();
        return ((w) this.f985e).i();
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void e(Object obj, g0 g0Var) throws IOException {
        g0Var.getClass();
        M(obj, g0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cd  */
    @Override // androidx.datastore.preferences.protobuf.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(androidx.datastore.preferences.protobuf.w r17) {
        /*
            Method dump skipped, instructions count: 1850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.f(androidx.datastore.preferences.protobuf.w):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(androidx.datastore.preferences.protobuf.w r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.g(androidx.datastore.preferences.protobuf.w):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(androidx.datastore.preferences.protobuf.w r12, androidx.datastore.preferences.protobuf.w r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.h(androidx.datastore.preferences.protobuf.w, androidx.datastore.preferences.protobuf.w):boolean");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // androidx.datastore.preferences.protobuf.x0
    public final void i(java.lang.Object r19, androidx.datastore.preferences.protobuf.k r20, androidx.datastore.preferences.protobuf.o r21) {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.i(java.lang.Object, androidx.datastore.preferences.protobuf.k, androidx.datastore.preferences.protobuf.o):void");
    }

    public final boolean j(w wVar, w wVar2, int i10) {
        return n(i10, wVar) == n(i10, wVar2);
    }

    public final void k(int i10, Object obj, Object obj2) {
        int i11 = this.f981a[i10];
        if (k1.f960c.h(L(i10) & 1048575, obj) == null) {
            return;
        }
        l(i10);
    }

    public final void l(int i10) {
        if (this.f982b[((i10 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final x0 m(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f982b;
        x0 x0Var = (x0) objArr[i11];
        if (x0Var != null) {
            return x0Var;
        }
        x0 x0VarA = u0.f1025c.a((Class) objArr[i11 + 1]);
        objArr[i11] = x0VarA;
        return x0VarA;
    }

    public final boolean n(int i10, Object obj) {
        int i11 = this.f981a[i10 + 2];
        long j = i11 & 1048575;
        if (j == 1048575) {
            int iL = L(i10);
            long j4 = iL & 1048575;
            switch (K(iL)) {
                case 0:
                    if (Double.doubleToRawLongBits(k1.f960c.d(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(k1.f960c.e(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (k1.f960c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (k1.f960c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (k1.f960c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (k1.f960c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (k1.f960c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return k1.f960c.c(j4, obj);
                case 8:
                    Object objH = k1.f960c.h(j4, obj);
                    if (objH instanceof String) {
                        return !((String) objH).isEmpty();
                    }
                    if (objH instanceof g) {
                        return !g.f927c.equals(objH);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (k1.f960c.h(j4, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !g.f927c.equals(k1.f960c.h(j4, obj));
                case 11:
                    if (k1.f960c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (k1.f960c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (k1.f960c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (k1.f960c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (k1.f960c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (k1.f960c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (k1.f960c.h(j4, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & k1.f960c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? n(i10, obj) : (i12 & i13) != 0;
    }

    public final boolean q(int i10, int i11, Object obj) {
        return k1.f960c.f((long) (this.f981a[i11 + 2] & 1048575), obj) == i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r0.o(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.o r12, androidx.datastore.preferences.protobuf.k r13) throws androidx.datastore.preferences.protobuf.z, com.google.crypto.tink.shaded.protobuf.b0 {
        /*
            r8 = this;
            int r10 = r8.L(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.j1 r10 = androidx.datastore.preferences.protobuf.k1.f960c
            java.lang.Object r10 = r10.h(r0, r9)
            androidx.datastore.preferences.protobuf.k0 r2 = r8.f992m
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.j0 r10 = androidx.datastore.preferences.protobuf.j0.f950b
            androidx.datastore.preferences.protobuf.j0 r10 = r10.b()
            androidx.datastore.preferences.protobuf.k1.o(r9, r0, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.j0 r3 = (androidx.datastore.preferences.protobuf.j0) r3
            boolean r3 = r3.f951a
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.j0 r3 = androidx.datastore.preferences.protobuf.j0.f950b
            androidx.datastore.preferences.protobuf.j0 r3 = r3.b()
            androidx.datastore.preferences.protobuf.k0.a(r3, r10)
            androidx.datastore.preferences.protobuf.k1.o(r9, r0, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.j0 r10 = (androidx.datastore.preferences.protobuf.j0) r10
            androidx.datastore.preferences.protobuf.i0 r11 = (androidx.datastore.preferences.protobuf.i0) r11
            androidx.datastore.preferences.protobuf.h0 r9 = r11.f947a
            r11 = 2
            r13.V(r11)
            java.lang.Object r0 = r13.f957e
            androidx.datastore.preferences.protobuf.j r0 = (androidx.datastore.preferences.protobuf.j) r0
            int r1 = r0.I()
            int r1 = r0.q(r1)
            java.lang.Object r2 = r9.f940c
            java.lang.String r3 = ""
            r4 = r2
        L55:
            int r5 = r13.e()     // Catch: java.lang.Throwable -> L79
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L9b
            boolean r6 = r0.g()     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L65
            goto L9b
        L65:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L86
            if (r5 == r11) goto L7b
            boolean r5 = r13.W()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            if (r5 == 0) goto L73
            goto L55
        L73:
            androidx.datastore.preferences.protobuf.a0 r5 = new androidx.datastore.preferences.protobuf.a0     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            throw r5     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
        L79:
            r9 = move-exception
            goto La2
        L7b:
            androidx.datastore.preferences.protobuf.s1 r5 = r9.f939b     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            java.lang.Class r6 = r2.getClass()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            java.lang.Object r4 = r13.v(r5, r6, r12)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            goto L55
        L86:
            androidx.datastore.preferences.protobuf.s1 r5 = r9.f938a     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            r6 = 0
            java.lang.Object r3 = r13.v(r5, r6, r6)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.z -> L8e
            goto L55
        L8e:
            boolean r5 = r13.W()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L95
            goto L55
        L95:
            androidx.datastore.preferences.protobuf.a0 r9 = new androidx.datastore.preferences.protobuf.a0     // Catch: java.lang.Throwable -> L79
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L79
            throw r9     // Catch: java.lang.Throwable -> L79
        L9b:
            r10.put(r3, r4)     // Catch: java.lang.Throwable -> L79
            r0.o(r1)
            return
        La2:
            r0.o(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.r(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.k):void");
    }

    public final void s(int i10, Object obj, Object obj2) {
        if (n(i10, obj2)) {
            long jL = L(i10) & 1048575;
            Unsafe unsafe = f980o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f981a[i10] + " is present but null: " + obj2);
            }
            x0 x0VarM = m(i10);
            if (!n(i10, obj)) {
                if (p(object)) {
                    w wVarD = x0VarM.d();
                    x0VarM.a(wVarD, object);
                    unsafe.putObject(obj, jL, wVarD);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                G(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                w wVarD2 = x0VarM.d();
                x0VarM.a(wVarD2, object2);
                unsafe.putObject(obj, jL, wVarD2);
                object2 = wVarD2;
            }
            x0VarM.a(object2, object);
        }
    }

    public final void t(int i10, Object obj, Object obj2) {
        int[] iArr = this.f981a;
        int i11 = iArr[i10];
        if (q(i11, i10, obj2)) {
            long jL = L(i10) & 1048575;
            Unsafe unsafe = f980o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            x0 x0VarM = m(i10);
            if (!q(i11, i10, obj)) {
                if (p(object)) {
                    w wVarD = x0VarM.d();
                    x0VarM.a(wVarD, object);
                    unsafe.putObject(obj, jL, wVarD);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                H(i11, i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                w wVarD2 = x0VarM.d();
                x0VarM.a(wVarD2, object2);
                unsafe.putObject(obj, jL, wVarD2);
                object2 = wVarD2;
            }
            x0VarM.a(object2, object);
        }
    }

    public final Object u(int i10, Object obj) {
        x0 x0VarM = m(i10);
        long jL = L(i10) & 1048575;
        if (!n(i10, obj)) {
            return x0VarM.d();
        }
        Object object = f980o.getObject(obj, jL);
        if (p(object)) {
            return object;
        }
        w wVarD = x0VarM.d();
        if (object != null) {
            x0VarM.a(wVarD, object);
        }
        return wVarD;
    }

    public final Object v(int i10, int i11, Object obj) {
        x0 x0VarM = m(i11);
        if (!q(i10, i11, obj)) {
            return x0VarM.d();
        }
        Object object = f980o.getObject(obj, L(i11) & 1048575);
        if (p(object)) {
            return object;
        }
        w wVarD = x0VarM.d();
        if (object != null) {
            x0VarM.a(wVarD, object);
        }
        return wVarD;
    }
}
