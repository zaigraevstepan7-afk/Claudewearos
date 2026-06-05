package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.ads.zzbch;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class s0 implements b1 {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f4222o = new int[0];

    /* renamed from: p, reason: collision with root package name */
    public static final Unsafe f4223p = n1.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4224a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f4225b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4226c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4227d;

    /* renamed from: e, reason: collision with root package name */
    public final a f4228e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4229f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4230g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f4231h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4232i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final u0 f4233k;

    /* renamed from: l, reason: collision with root package name */
    public final i0 f4234l;

    /* renamed from: m, reason: collision with root package name */
    public final f1 f4235m;

    /* renamed from: n, reason: collision with root package name */
    public final n0 f4236n;

    public s0(int[] iArr, Object[] objArr, int i10, int i11, a aVar, boolean z2, int[] iArr2, int i12, int i13, u0 u0Var, i0 i0Var, f1 f1Var, p pVar, n0 n0Var) {
        this.f4224a = iArr;
        this.f4225b = objArr;
        this.f4226c = i10;
        this.f4227d = i11;
        this.f4229f = aVar instanceof w;
        this.f4230g = z2;
        this.f4231h = iArr2;
        this.f4232i = i12;
        this.j = i13;
        this.f4233k = u0Var;
        this.f4234l = i0Var;
        this.f4235m = f1Var;
        this.f4228e = aVar;
        this.f4236n = n0Var;
    }

    public static s0 B(a1 a1Var, u0 u0Var, i0 i0Var, f1 f1Var, p pVar, n0 n0Var) {
        if (a1Var instanceof a1) {
            return C(a1Var, u0Var, i0Var, f1Var, pVar, n0Var);
        }
        a1Var.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.crypto.tink.shaded.protobuf.s0 C(com.google.crypto.tink.shaded.protobuf.a1 r34, com.google.crypto.tink.shaded.protobuf.u0 r35, com.google.crypto.tink.shaded.protobuf.i0 r36, com.google.crypto.tink.shaded.protobuf.f1 r37, com.google.crypto.tink.shaded.protobuf.p r38, com.google.crypto.tink.shaded.protobuf.n0 r39) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.s0.C(com.google.crypto.tink.shaded.protobuf.a1, com.google.crypto.tink.shaded.protobuf.u0, com.google.crypto.tink.shaded.protobuf.i0, com.google.crypto.tink.shaded.protobuf.f1, com.google.crypto.tink.shaded.protobuf.p, com.google.crypto.tink.shaded.protobuf.n0):com.google.crypto.tink.shaded.protobuf.s0");
    }

    public static long D(int i10) {
        return i10 & 1048575;
    }

    public static int E(long j, Object obj) {
        return ((Integer) n1.f4203c.i(j, obj)).intValue();
    }

    public static long F(long j, Object obj) {
        return ((Long) n1.f4203c.i(j, obj)).longValue();
    }

    public static Field O(Class cls, String str) {
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

    public static int U(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void X(int i10, Object obj, l0 l0Var) throws androidx.datastore.preferences.protobuf.l {
        if (!(obj instanceof String)) {
            l0Var.a(i10, (i) obj);
            return;
        }
        String str = (String) obj;
        l lVar = (l) l0Var.f4196a;
        lVar.r0(i10, 2);
        int i11 = lVar.f4193f;
        byte[] bArr = lVar.f4192e;
        int i12 = lVar.f4194g;
        try {
            int iI0 = l.i0(str.length() * 3);
            int iI02 = l.i0(str.length());
            if (iI02 != iI0) {
                lVar.s0(q1.b(str));
                int i13 = lVar.f4194g;
                lVar.f4194g = q1.f4215a.D(str, bArr, i13, i11 - i13);
                return;
            }
            int i14 = i12 + iI02;
            lVar.f4194g = i14;
            int iD = q1.f4215a.D(str, bArr, i14, i11 - i14);
            lVar.f4194g = i12;
            lVar.s0((iD - i12) - iI02);
            lVar.f4194g = iD;
        } catch (p1 e10) {
            lVar.f4194g = i12;
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

    public static void l(Object obj) {
        if (t(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof w) {
            return ((w) obj).n();
        }
        return true;
    }

    public static List v(w wVar, long j) {
        return (List) n1.f4203c.i(j, wVar);
    }

    public final Object A(int i10, int i11, Object obj) {
        b1 b1VarP = p(i11);
        if (!u(i10, i11, obj)) {
            return b1VarP.d();
        }
        Object object = f4223p.getObject(obj, V(i11) & 1048575);
        if (t(object)) {
            return object;
        }
        Object objD = b1VarP.d();
        if (object != null) {
            b1VarP.a(objD, object);
        }
        return objD;
    }

    public final void G(Object obj, int i10, long j) {
        Unsafe unsafe = f4223p;
        Object objO = o(i10);
        Object object = unsafe.getObject(obj, j);
        this.f4236n.getClass();
        if (!((m0) object).f4198a) {
            m0 m0VarC = m0.f4197b.c();
            n0.b(m0VarC, object);
            unsafe.putObject(obj, j, m0VarC);
        }
        m6.a.q(objO);
        throw null;
    }

    public final int H(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j, int i17, d dVar) throws c0 {
        int i18;
        Unsafe unsafe = f4223p;
        long j4 = this.f4224a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(a.a.o(i10, bArr))));
                int i19 = i10 + 8;
                unsafe.putInt(obj, j4, i13);
                return i19;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(a.a.n(i10, bArr))));
                int i20 = i10 + 4;
                unsafe.putInt(obj, j4, i13);
                return i20;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iX = a.a.x(bArr, i10, dVar);
                unsafe.putObject(obj, j, Long.valueOf(dVar.f4148b));
                unsafe.putInt(obj, j4, i13);
                return iX;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iV = a.a.v(bArr, i10, dVar);
                unsafe.putObject(obj, j, Integer.valueOf(dVar.f4147a));
                unsafe.putInt(obj, j4, i13);
                return iV;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j, Long.valueOf(a.a.o(i10, bArr)));
                int i21 = i10 + 8;
                unsafe.putInt(obj, j4, i13);
                return i21;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j, Integer.valueOf(a.a.n(i10, bArr)));
                int i22 = i10 + 4;
                unsafe.putInt(obj, j4, i13);
                return i22;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iX2 = a.a.x(bArr, i10, dVar);
                unsafe.putObject(obj, j, Boolean.valueOf(dVar.f4148b != 0));
                unsafe.putInt(obj, j4, i13);
                return iX2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iV2 = a.a.v(bArr, i10, dVar);
                int i23 = dVar.f4147a;
                if (i23 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i15 & 536870912) != 0) {
                        if (!q1.f4215a.O(iV2, bArr, iV2 + i23)) {
                            throw c0.b();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iV2, i23, a0.f4133a));
                    iV2 += i23;
                }
                unsafe.putInt(obj, j4, i13);
                return iV2;
            case 60:
                i18 = i10;
                if (i14 == 2) {
                    Object objA = A(i13, i17, obj);
                    int iN = a.a.N(objA, p(i17), bArr, i18, i11, dVar);
                    T(obj, i13, i17, objA);
                    return iN;
                }
                break;
            case 61:
                i18 = i10;
                if (i14 == 2) {
                    int iM = a.a.m(bArr, i18, dVar);
                    unsafe.putObject(obj, j, dVar.f4149c);
                    unsafe.putInt(obj, j4, i13);
                    return iM;
                }
                break;
            case 63:
                i18 = i10;
                if (i14 == 0) {
                    int iV3 = a.a.v(bArr, i18, dVar);
                    int i24 = dVar.f4147a;
                    n(i17);
                    unsafe.putObject(obj, j, Integer.valueOf(i24));
                    unsafe.putInt(obj, j4, i13);
                    return iV3;
                }
                break;
            case 66:
                i18 = i10;
                if (i14 == 0) {
                    int iV4 = a.a.v(bArr, i18, dVar);
                    unsafe.putObject(obj, j, Integer.valueOf(androidx.datastore.preferences.protobuf.j.d(dVar.f4147a)));
                    unsafe.putInt(obj, j4, i13);
                    return iV4;
                }
                break;
            case 67:
                i18 = i10;
                if (i14 == 0) {
                    int iX3 = a.a.x(bArr, i18, dVar);
                    unsafe.putObject(obj, j, Long.valueOf(androidx.datastore.preferences.protobuf.j.e(dVar.f4148b)));
                    unsafe.putInt(obj, j4, i13);
                    return iX3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object objA2 = A(i13, i17, obj);
                    int I = ((s0) p(i17)).I(objA2, bArr, i10, i11, (i12 & (-8)) | 4, dVar);
                    dVar.f4149c = objA2;
                    T(obj, i13, i17, objA2);
                    return I;
                }
            default:
                return i10;
        }
        return i18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0142, code lost:
    
        r4 = r9;
        r9 = r25 | r23;
        r3 = r7;
        r7 = r13;
        r13 = r4;
        r4 = r33;
        r5 = r2;
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x025a, code lost:
    
        r4 = r9;
        r9 = r25 | r23;
        r3 = r4;
        r4 = r13;
        r13 = r7;
        r7 = r4;
        r4 = r33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int I(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.crypto.tink.shaded.protobuf.d r35) throws com.google.crypto.tink.shaded.protobuf.c0 {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.s0.I(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.d):int");
    }

    public final void J(Object obj, byte[] bArr, int i10, int i11, d dVar) throws c0 {
        int i12;
        int iR;
        Object obj2;
        int i13;
        Unsafe unsafe;
        int i14;
        int i15;
        int i16;
        int i17;
        char c6;
        Unsafe unsafe2;
        Object obj3;
        byte[] bArr2;
        int i18;
        byte[] bArr3;
        Object obj4;
        byte[] bArr4;
        Unsafe unsafe3;
        int i19;
        Object obj5;
        Object obj6;
        int i20;
        int i21;
        int i22;
        s0 s0Var = this;
        Object obj7 = obj;
        byte[] bArr5 = bArr;
        int i23 = i11;
        d dVar2 = dVar;
        l(obj7);
        Unsafe unsafe4 = f4223p;
        int iX = i10;
        int i24 = -1;
        int i25 = 0;
        int i26 = 1048575;
        int i27 = 0;
        while (iX < i23) {
            int iU = iX + 1;
            int i28 = bArr5[iX];
            if (i28 < 0) {
                iU = a.a.u(i28, bArr5, iU, dVar2);
                i28 = dVar2.f4147a;
            }
            int i29 = i28 >>> 3;
            int i30 = i28 & 7;
            int i31 = s0Var.f4227d;
            int i32 = s0Var.f4226c;
            if (i29 > i24) {
                iR = (i29 < i32 || i29 > i31) ? -1 : s0Var.R(i29, i25 / 3);
                i12 = 0;
            } else if (i29 < i32 || i29 > i31) {
                i12 = 0;
                iR = -1;
            } else {
                i12 = 0;
                iR = s0Var.R(i29, 0);
            }
            int i33 = iR;
            if (i33 == -1) {
                int i34 = iU;
                obj2 = obj7;
                i13 = i34;
                unsafe = unsafe4;
                i14 = i28;
                i15 = i29;
                i16 = i12;
            } else {
                int[] iArr = s0Var.f4224a;
                int i35 = iArr[i33 + 1];
                int iU2 = U(i35);
                int i36 = i28;
                long j = i35 & 1048575;
                if (iU2 <= 17) {
                    int i37 = iArr[i33 + 2];
                    int i38 = 1 << (i37 >>> 20);
                    int i39 = i37 & 1048575;
                    if (i39 != i26) {
                        int i40 = 1048575;
                        i17 = i35;
                        if (i26 != 1048575) {
                            unsafe4.putInt(obj7, i26, i27);
                            i40 = 1048575;
                        }
                        if (i39 != i40) {
                            i27 = unsafe4.getInt(obj7, i39);
                        }
                        i26 = i39;
                    } else {
                        i17 = i35;
                    }
                    switch (iU2) {
                        case 0:
                            unsafe2 = unsafe4;
                            bArr2 = bArr5;
                            c6 = '\uffff';
                            i18 = iU;
                            if (i30 != 1) {
                                obj3 = obj7;
                                i14 = i36;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i29;
                                i16 = i33;
                                break;
                            } else {
                                n1.f4203c.m(obj7, j, Double.longBitsToDouble(a.a.o(i18, bArr2)));
                                iX = i18 + 8;
                                i27 |= i38;
                                bArr5 = bArr2;
                                i25 = i33;
                                i24 = i29;
                                unsafe4 = unsafe2;
                                i23 = i11;
                                break;
                            }
                        case 1:
                            unsafe2 = unsafe4;
                            bArr2 = bArr5;
                            c6 = '\uffff';
                            i18 = iU;
                            if (i30 != 5) {
                                obj3 = obj7;
                                i14 = i36;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i29;
                                i16 = i33;
                                break;
                            } else {
                                n1.f4203c.n(obj7, j, Float.intBitsToFloat(a.a.n(i18, bArr2)));
                                iX = i18 + 4;
                                i27 |= i38;
                                bArr5 = bArr2;
                                i25 = i33;
                                i24 = i29;
                                unsafe4 = unsafe2;
                                i23 = i11;
                                break;
                            }
                        case 2:
                        case 3:
                            bArr3 = bArr5;
                            c6 = '\uffff';
                            i18 = iU;
                            if (i30 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj7;
                                i14 = i36;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i29;
                                i16 = i33;
                                break;
                            } else {
                                int iX2 = a.a.x(bArr3, i18, dVar2);
                                unsafe4.putLong(obj7, j, dVar2.f4148b);
                                i27 |= i38;
                                iX = iX2;
                                bArr5 = bArr3;
                                i25 = i33;
                                i24 = i29;
                                i23 = i11;
                                break;
                            }
                        case 4:
                        case 11:
                            bArr3 = bArr5;
                            c6 = '\uffff';
                            i18 = iU;
                            if (i30 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj7;
                                i14 = i36;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i29;
                                i16 = i33;
                                break;
                            } else {
                                int iV = a.a.v(bArr3, i18, dVar2);
                                unsafe4.putInt(obj7, j, dVar2.f4147a);
                                i27 |= i38;
                                iX = iV;
                                bArr5 = bArr3;
                                i25 = i33;
                                i24 = i29;
                                i23 = i11;
                                break;
                            }
                        case 5:
                        case 14:
                            Object obj8 = obj7;
                            bArr3 = bArr5;
                            c6 = '\uffff';
                            Unsafe unsafe5 = unsafe4;
                            int i41 = iU;
                            if (i30 != 1) {
                                i18 = i41;
                                unsafe2 = unsafe5;
                                obj3 = obj8;
                                i14 = i36;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i29;
                                i16 = i33;
                                break;
                            } else {
                                long jO = a.a.o(i41, bArr3);
                                unsafe4 = unsafe5;
                                obj7 = obj8;
                                unsafe4.putLong(obj7, j, jO);
                                iX = i41 + 8;
                                i27 |= i38;
                                bArr5 = bArr3;
                                i25 = i33;
                                i24 = i29;
                                i23 = i11;
                                break;
                            }
                        case 6:
                        case 13:
                            obj4 = obj7;
                            bArr4 = bArr5;
                            c6 = '\uffff';
                            unsafe3 = unsafe4;
                            i19 = iU;
                            if (i30 != 5) {
                                Unsafe unsafe6 = unsafe3;
                                i18 = i19;
                                obj3 = obj4;
                                unsafe2 = unsafe6;
                                i14 = i36;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i29;
                                i16 = i33;
                                break;
                            } else {
                                unsafe3.putInt(obj4, j, a.a.n(i19, bArr4));
                                iX = i19 + 4;
                                i27 |= i38;
                                unsafe4 = unsafe3;
                                bArr5 = bArr4;
                                i25 = i33;
                                i24 = i29;
                                obj7 = obj4;
                                i23 = i11;
                                break;
                            }
                        case 7:
                            obj4 = obj7;
                            bArr4 = bArr5;
                            c6 = '\uffff';
                            unsafe3 = unsafe4;
                            i19 = iU;
                            if (i30 != 0) {
                                Unsafe unsafe62 = unsafe3;
                                i18 = i19;
                                obj3 = obj4;
                                unsafe2 = unsafe62;
                                i14 = i36;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i29;
                                i16 = i33;
                                break;
                            } else {
                                iX = a.a.x(bArr4, i19, dVar2);
                                n1.f4203c.k(obj4, j, dVar2.f4148b != 0);
                                i27 |= i38;
                                unsafe4 = unsafe3;
                                bArr5 = bArr4;
                                i25 = i33;
                                i24 = i29;
                                obj7 = obj4;
                                i23 = i11;
                                break;
                            }
                        case 8:
                            obj4 = obj7;
                            bArr4 = bArr5;
                            c6 = '\uffff';
                            unsafe3 = unsafe4;
                            i19 = iU;
                            if (i30 != 2) {
                                Unsafe unsafe622 = unsafe3;
                                i18 = i19;
                                obj3 = obj4;
                                unsafe2 = unsafe622;
                                i14 = i36;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i29;
                                i16 = i33;
                                break;
                            } else {
                                iX = (i17 & 536870912) == 0 ? a.a.q(bArr4, i19, dVar2) : a.a.r(bArr4, i19, dVar2);
                                unsafe3.putObject(obj4, j, dVar2.f4149c);
                                i27 |= i38;
                                unsafe4 = unsafe3;
                                bArr5 = bArr4;
                                i25 = i33;
                                i24 = i29;
                                obj7 = obj4;
                                i23 = i11;
                                break;
                            }
                        case 9:
                            obj4 = obj7;
                            c6 = '\uffff';
                            if (i30 != 2) {
                                Unsafe unsafe7 = unsafe4;
                                obj3 = obj4;
                                unsafe2 = unsafe7;
                                i18 = iU;
                                i14 = i36;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i29;
                                i16 = i33;
                                break;
                            } else {
                                Unsafe unsafe8 = unsafe4;
                                Object objZ = s0Var.z(i33, obj4);
                                byte[] bArr6 = bArr5;
                                unsafe3 = unsafe8;
                                int iN = a.a.N(objZ, s0Var.p(i33), bArr6, iU, i23, dVar2);
                                bArr4 = bArr6;
                                s0Var.S(i33, obj4, objZ);
                                i27 |= i38;
                                iX = iN;
                                unsafe4 = unsafe3;
                                bArr5 = bArr4;
                                i25 = i33;
                                i24 = i29;
                                obj7 = obj4;
                                i23 = i11;
                                break;
                            }
                        case 10:
                            obj5 = obj7;
                            c6 = '\uffff';
                            if (i30 != 2) {
                                Object obj9 = obj5;
                                unsafe2 = unsafe4;
                                obj3 = obj9;
                                i18 = iU;
                                i14 = i36;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i29;
                                i16 = i33;
                                break;
                            } else {
                                iX = a.a.m(bArr5, iU, dVar2);
                                unsafe4.putObject(obj5, j, dVar2.f4149c);
                                i27 |= i38;
                                i25 = i33;
                                i24 = i29;
                                obj7 = obj5;
                                break;
                            }
                        case 12:
                            obj5 = obj7;
                            c6 = '\uffff';
                            if (i30 != 0) {
                                Object obj92 = obj5;
                                unsafe2 = unsafe4;
                                obj3 = obj92;
                                i18 = iU;
                                i14 = i36;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i29;
                                i16 = i33;
                                break;
                            } else {
                                iX = a.a.v(bArr5, iU, dVar2);
                                unsafe4.putInt(obj5, j, dVar2.f4147a);
                                i27 |= i38;
                                i25 = i33;
                                i24 = i29;
                                obj7 = obj5;
                                break;
                            }
                        case 15:
                            obj5 = obj7;
                            c6 = '\uffff';
                            if (i30 != 0) {
                                Object obj922 = obj5;
                                unsafe2 = unsafe4;
                                obj3 = obj922;
                                i18 = iU;
                                i14 = i36;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i29;
                                i16 = i33;
                                break;
                            } else {
                                iX = a.a.v(bArr5, iU, dVar2);
                                unsafe4.putInt(obj5, j, androidx.datastore.preferences.protobuf.j.d(dVar2.f4147a));
                                i27 |= i38;
                                i25 = i33;
                                i24 = i29;
                                obj7 = obj5;
                                break;
                            }
                        case 16:
                            if (i30 != 0) {
                                c6 = '\uffff';
                                unsafe2 = unsafe4;
                                obj3 = obj7;
                                i18 = iU;
                                i14 = i36;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i29;
                                i16 = i33;
                                break;
                            } else {
                                int iX3 = a.a.x(bArr5, iU, dVar2);
                                unsafe4.putLong(obj7, j, androidx.datastore.preferences.protobuf.j.e(dVar2.f4148b));
                                i27 |= i38;
                                i25 = i33;
                                i24 = i29;
                                iX = iX3;
                                break;
                            }
                        default:
                            unsafe2 = unsafe4;
                            obj3 = obj7;
                            c6 = '\uffff';
                            i18 = iU;
                            i14 = i36;
                            obj2 = obj3;
                            i13 = i18;
                            unsafe = unsafe2;
                            i15 = i29;
                            i16 = i33;
                            break;
                    }
                } else {
                    Object obj10 = obj7;
                    Unsafe unsafe9 = unsafe4;
                    byte[] bArr7 = bArr5;
                    int i42 = iU;
                    if (iU2 != 27) {
                        i14 = i36;
                        i20 = i42;
                        if (iU2 <= 49) {
                            unsafe = unsafe9;
                            i15 = i29;
                            int i43 = i26;
                            int i44 = i27;
                            int iK = s0Var.K(obj, bArr, i20, i11, i14, i30, i33, i35, iU2, j, dVar);
                            i16 = i33;
                            if (iK != i20) {
                                bArr5 = bArr;
                                i23 = i11;
                                dVar2 = dVar;
                                obj7 = obj;
                                iX = iK;
                                i25 = i16;
                                i26 = i43;
                                i27 = i44;
                                i24 = i15;
                                unsafe4 = unsafe;
                            } else {
                                i13 = iK;
                                i26 = i43;
                                i27 = i44;
                                obj2 = obj;
                            }
                        } else {
                            unsafe = unsafe9;
                            i21 = i26;
                            i15 = i29;
                            obj6 = obj;
                            i16 = i33;
                            i22 = i27;
                            if (iU2 != 50) {
                                int iH = s0Var.H(obj6, bArr, i20, i11, i14, i15, i30, i35, iU2, j, i16, dVar);
                                obj2 = obj6;
                                if (iH != i20) {
                                    s0Var = this;
                                    i23 = i11;
                                    dVar2 = dVar;
                                    obj7 = obj2;
                                    iX = iH;
                                    i25 = i16;
                                    i26 = i21;
                                    i27 = i22;
                                    i24 = i15;
                                    unsafe4 = unsafe;
                                    bArr5 = bArr;
                                } else {
                                    i13 = iH;
                                    i26 = i21;
                                    i27 = i22;
                                }
                            } else if (i30 == 2) {
                                s0Var.G(obj6, i16, j);
                                throw null;
                            }
                        }
                    } else if (i30 == 2) {
                        z zVarF = (z) unsafe9.getObject(obj10, j);
                        if (!((b) zVarF).f4139a) {
                            int size = zVarF.size();
                            zVarF = zVarF.f(size == 0 ? 10 : size * 2);
                            unsafe9.putObject(obj10, j, zVarF);
                        }
                        int iP = a.a.p(s0Var.p(i33), i36, bArr7, i42, i11, zVarF, dVar2);
                        obj7 = obj;
                        bArr5 = bArr;
                        dVar2 = dVar;
                        iX = iP;
                        unsafe4 = unsafe9;
                        i25 = i33;
                        i24 = i29;
                        i23 = i11;
                    } else {
                        obj6 = obj;
                        i14 = i36;
                        unsafe = unsafe9;
                        i20 = i42;
                        i21 = i26;
                        i22 = i27;
                        i15 = i29;
                        i16 = i33;
                    }
                    i13 = i20;
                    obj2 = obj6;
                    i26 = i21;
                    i27 = i22;
                }
            }
            w wVar = (w) obj2;
            e1 e1VarC = wVar.unknownFields;
            if (e1VarC == e1.f4158f) {
                e1VarC = e1.c();
                wVar.unknownFields = e1VarC;
            }
            int iS = a.a.s(i14, bArr, i13, i11, e1VarC, dVar);
            bArr5 = bArr;
            dVar2 = dVar;
            i23 = i11;
            obj7 = obj2;
            i25 = i16;
            i24 = i15;
            unsafe4 = unsafe;
            iX = iS;
            s0Var = this;
        }
        Unsafe unsafe10 = unsafe4;
        Object obj11 = obj7;
        int i45 = i23;
        int i46 = i26;
        int i47 = i27;
        if (i46 != 1048575) {
            unsafe10.putInt(obj11, i46, i47);
        }
        if (iX != i45) {
            throw c0.f();
        }
    }

    public final int K(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, long j, int i15, long j4, d dVar) throws c0 {
        int i16;
        int i17;
        int i18;
        int i19;
        int iW;
        Unsafe unsafe = f4223p;
        z zVarF = (z) unsafe.getObject(obj, j4);
        if (!((b) zVarF).f4139a) {
            int size = zVarF.size();
            zVarF = zVarF.f(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j4, zVarF);
        }
        z zVar = zVarF;
        switch (i15) {
            case 18:
            case 35:
                int iV = i10;
                if (i13 == 2) {
                    m mVar = (m) zVar;
                    int iV2 = a.a.v(bArr, iV, dVar);
                    int i20 = dVar.f4147a + iV2;
                    while (iV2 < i20) {
                        mVar.e(Double.longBitsToDouble(a.a.o(iV2, bArr)));
                        iV2 += 8;
                    }
                    if (iV2 == i20) {
                        return iV2;
                    }
                    throw c0.g();
                }
                if (i13 != 1) {
                    return iV;
                }
                m mVar2 = (m) zVar;
                mVar2.e(Double.longBitsToDouble(a.a.o(iV, bArr)));
                while (true) {
                    i16 = iV + 8;
                    if (i16 < i11) {
                        iV = a.a.v(bArr, i16, dVar);
                        if (i12 == dVar.f4147a) {
                            mVar2.e(Double.longBitsToDouble(a.a.o(iV, bArr)));
                        }
                    }
                }
                return i16;
            case 19:
            case 36:
                int iV3 = i10;
                if (i13 == 2) {
                    s sVar = (s) zVar;
                    int iV4 = a.a.v(bArr, iV3, dVar);
                    int i21 = dVar.f4147a + iV4;
                    while (iV4 < i21) {
                        sVar.e(Float.intBitsToFloat(a.a.n(iV4, bArr)));
                        iV4 += 4;
                    }
                    if (iV4 == i21) {
                        return iV4;
                    }
                    throw c0.g();
                }
                if (i13 != 5) {
                    return iV3;
                }
                s sVar2 = (s) zVar;
                sVar2.e(Float.intBitsToFloat(a.a.n(iV3, bArr)));
                while (true) {
                    i17 = iV3 + 4;
                    if (i17 < i11) {
                        iV3 = a.a.v(bArr, i17, dVar);
                        if (i12 == dVar.f4147a) {
                            sVar2.e(Float.intBitsToFloat(a.a.n(iV3, bArr)));
                        }
                    }
                }
                return i17;
            case 20:
            case zzbch.zzt.zzm /* 21 */:
            case 37:
            case 38:
                if (i13 == 2) {
                    j0 j0Var = (j0) zVar;
                    int iV5 = a.a.v(bArr, i10, dVar);
                    int i22 = dVar.f4147a + iV5;
                    while (iV5 < i22) {
                        iV5 = a.a.x(bArr, iV5, dVar);
                        j0Var.e(dVar.f4148b);
                    }
                    if (iV5 == i22) {
                        return iV5;
                    }
                    throw c0.g();
                }
                if (i13 != 0) {
                    return i10;
                }
                j0 j0Var2 = (j0) zVar;
                int iX = a.a.x(bArr, i10, dVar);
                j0Var2.e(dVar.f4148b);
                while (iX < i11) {
                    int iV6 = a.a.v(bArr, iX, dVar);
                    if (i12 != dVar.f4147a) {
                        return iX;
                    }
                    iX = a.a.x(bArr, iV6, dVar);
                    j0Var2.e(dVar.f4148b);
                }
                return iX;
            case 22:
            case 29:
            case 39:
            case 43:
                i18 = i10;
                if (i13 != 2) {
                    if (i13 == 0) {
                        return a.a.w(i12, bArr, i18, i11, zVar, dVar);
                    }
                    return i18;
                }
                x xVar = (x) zVar;
                int iV7 = a.a.v(bArr, i18, dVar);
                int i23 = dVar.f4147a + iV7;
                while (iV7 < i23) {
                    iV7 = a.a.v(bArr, iV7, dVar);
                    xVar.e(dVar.f4147a);
                }
                if (iV7 == i23) {
                    return iV7;
                }
                throw c0.g();
            case 23:
            case 32:
            case 40:
            case 46:
                i18 = i10;
                if (i13 == 2) {
                    j0 j0Var3 = (j0) zVar;
                    int iV8 = a.a.v(bArr, i18, dVar);
                    int i24 = dVar.f4147a + iV8;
                    while (iV8 < i24) {
                        j0Var3.e(a.a.o(iV8, bArr));
                        iV8 += 8;
                    }
                    if (iV8 == i24) {
                        return iV8;
                    }
                    throw c0.g();
                }
                if (i13 == 1) {
                    j0 j0Var4 = (j0) zVar;
                    j0Var4.e(a.a.o(i18, bArr));
                    int i25 = i18 + 8;
                    while (i25 < i11) {
                        int iV9 = a.a.v(bArr, i25, dVar);
                        if (i12 != dVar.f4147a) {
                            return i25;
                        }
                        j0Var4.e(a.a.o(iV9, bArr));
                        i25 = iV9 + 8;
                    }
                    return i25;
                }
                return i18;
            case 24:
            case 31:
            case 41:
            case 45:
                i18 = i10;
                if (i13 == 2) {
                    x xVar2 = (x) zVar;
                    int iV10 = a.a.v(bArr, i18, dVar);
                    int i26 = dVar.f4147a + iV10;
                    while (iV10 < i26) {
                        xVar2.e(a.a.n(iV10, bArr));
                        iV10 += 4;
                    }
                    if (iV10 == i26) {
                        return iV10;
                    }
                    throw c0.g();
                }
                if (i13 == 5) {
                    x xVar3 = (x) zVar;
                    xVar3.e(a.a.n(i18, bArr));
                    int i27 = i18 + 4;
                    while (i27 < i11) {
                        int iV11 = a.a.v(bArr, i27, dVar);
                        if (i12 != dVar.f4147a) {
                            return i27;
                        }
                        xVar3.e(a.a.n(iV11, bArr));
                        i27 = iV11 + 4;
                    }
                    return i27;
                }
                return i18;
            case 25:
            case 42:
                i18 = i10;
                if (i13 == 2) {
                    e eVar = (e) zVar;
                    int iV12 = a.a.v(bArr, i18, dVar);
                    int i28 = dVar.f4147a + iV12;
                    while (iV12 < i28) {
                        iV12 = a.a.x(bArr, iV12, dVar);
                        eVar.e(dVar.f4148b != 0);
                    }
                    if (iV12 == i28) {
                        return iV12;
                    }
                    throw c0.g();
                }
                if (i13 == 0) {
                    e eVar2 = (e) zVar;
                    int iX2 = a.a.x(bArr, i18, dVar);
                    eVar2.e(dVar.f4148b != 0);
                    while (iX2 < i11) {
                        int iV13 = a.a.v(bArr, iX2, dVar);
                        if (i12 != dVar.f4147a) {
                            return iX2;
                        }
                        iX2 = a.a.x(bArr, iV13, dVar);
                        eVar2.e(dVar.f4148b != 0);
                    }
                    return iX2;
                }
                return i18;
            case 26:
                i18 = i10;
                if (i13 == 2) {
                    if ((j & 536870912) == 0) {
                        int iV14 = a.a.v(bArr, i18, dVar);
                        int i29 = dVar.f4147a;
                        if (i29 < 0) {
                            throw c0.e();
                        }
                        if (i29 == 0) {
                            zVar.add("");
                        } else {
                            zVar.add(new String(bArr, iV14, i29, a0.f4133a));
                            iV14 += i29;
                        }
                        while (iV14 < i11) {
                            int iV15 = a.a.v(bArr, iV14, dVar);
                            if (i12 != dVar.f4147a) {
                                return iV14;
                            }
                            iV14 = a.a.v(bArr, iV15, dVar);
                            int i30 = dVar.f4147a;
                            if (i30 < 0) {
                                throw c0.e();
                            }
                            if (i30 == 0) {
                                zVar.add("");
                            } else {
                                zVar.add(new String(bArr, iV14, i30, a0.f4133a));
                                iV14 += i30;
                            }
                        }
                        return iV14;
                    }
                    int iV16 = a.a.v(bArr, i18, dVar);
                    int i31 = dVar.f4147a;
                    if (i31 < 0) {
                        throw c0.e();
                    }
                    if (i31 == 0) {
                        zVar.add("");
                    } else {
                        int i32 = iV16 + i31;
                        if (!q1.f4215a.O(iV16, bArr, i32)) {
                            throw c0.b();
                        }
                        zVar.add(new String(bArr, iV16, i31, a0.f4133a));
                        iV16 = i32;
                    }
                    while (iV16 < i11) {
                        int iV17 = a.a.v(bArr, iV16, dVar);
                        if (i12 != dVar.f4147a) {
                            return iV16;
                        }
                        iV16 = a.a.v(bArr, iV17, dVar);
                        int i33 = dVar.f4147a;
                        if (i33 < 0) {
                            throw c0.e();
                        }
                        if (i33 == 0) {
                            zVar.add("");
                        } else {
                            int i34 = iV16 + i33;
                            if (!q1.f4215a.O(iV16, bArr, i34)) {
                                throw c0.b();
                            }
                            zVar.add(new String(bArr, iV16, i33, a0.f4133a));
                            iV16 = i34;
                        }
                    }
                    return iV16;
                }
                return i18;
            case 27:
                return i13 == 2 ? a.a.p(p(i14), i12, bArr, i10, i11, zVar, dVar) : i10;
            case 28:
                if (i13 != 2) {
                    return i10;
                }
                int iV18 = a.a.v(bArr, i10, dVar);
                int i35 = dVar.f4147a;
                if (i35 < 0) {
                    throw c0.e();
                }
                if (i35 > bArr.length - iV18) {
                    throw c0.g();
                }
                if (i35 == 0) {
                    zVar.add(i.f4171b);
                } else {
                    zVar.add(i.i(iV18, bArr, i35));
                    iV18 += i35;
                }
                while (iV18 < i11) {
                    int iV19 = a.a.v(bArr, iV18, dVar);
                    if (i12 != dVar.f4147a) {
                        return iV18;
                    }
                    iV18 = a.a.v(bArr, iV19, dVar);
                    int i36 = dVar.f4147a;
                    if (i36 < 0) {
                        throw c0.e();
                    }
                    if (i36 > bArr.length - iV18) {
                        throw c0.g();
                    }
                    if (i36 == 0) {
                        zVar.add(i.f4171b);
                    } else {
                        zVar.add(i.i(iV18, bArr, i36));
                        iV18 += i36;
                    }
                }
                return iV18;
            case 30:
            case 44:
                i19 = i10;
                if (i13 != 2) {
                    if (i13 == 0) {
                        iW = a.a.w(i12, bArr, i19, i11, zVar, dVar);
                    }
                    return i19;
                }
                x xVar4 = (x) zVar;
                iW = a.a.v(bArr, i19, dVar);
                int i37 = dVar.f4147a + iW;
                while (iW < i37) {
                    iW = a.a.v(bArr, iW, dVar);
                    xVar4.e(dVar.f4147a);
                }
                if (iW != i37) {
                    throw c0.g();
                }
                n(i14);
                Class cls = c1.f4143a;
                return iW;
            case 33:
            case 47:
                i19 = i10;
                if (i13 == 2) {
                    x xVar5 = (x) zVar;
                    int iV20 = a.a.v(bArr, i19, dVar);
                    int i38 = dVar.f4147a + iV20;
                    while (iV20 < i38) {
                        iV20 = a.a.v(bArr, iV20, dVar);
                        xVar5.e(androidx.datastore.preferences.protobuf.j.d(dVar.f4147a));
                    }
                    if (iV20 == i38) {
                        return iV20;
                    }
                    throw c0.g();
                }
                if (i13 == 0) {
                    x xVar6 = (x) zVar;
                    int iV21 = a.a.v(bArr, i19, dVar);
                    xVar6.e(androidx.datastore.preferences.protobuf.j.d(dVar.f4147a));
                    while (iV21 < i11) {
                        int iV22 = a.a.v(bArr, iV21, dVar);
                        if (i12 != dVar.f4147a) {
                            return iV21;
                        }
                        iV21 = a.a.v(bArr, iV22, dVar);
                        xVar6.e(androidx.datastore.preferences.protobuf.j.d(dVar.f4147a));
                    }
                    return iV21;
                }
                return i19;
            case 34:
            case 48:
                i19 = i10;
                if (i13 == 2) {
                    j0 j0Var5 = (j0) zVar;
                    int iV23 = a.a.v(bArr, i19, dVar);
                    int i39 = dVar.f4147a + iV23;
                    while (iV23 < i39) {
                        iV23 = a.a.x(bArr, iV23, dVar);
                        j0Var5.e(androidx.datastore.preferences.protobuf.j.e(dVar.f4148b));
                    }
                    if (iV23 == i39) {
                        return iV23;
                    }
                    throw c0.g();
                }
                if (i13 == 0) {
                    j0 j0Var6 = (j0) zVar;
                    int iX3 = a.a.x(bArr, i19, dVar);
                    j0Var6.e(androidx.datastore.preferences.protobuf.j.e(dVar.f4148b));
                    while (iX3 < i11) {
                        int iV24 = a.a.v(bArr, iX3, dVar);
                        if (i12 != dVar.f4147a) {
                            return iX3;
                        }
                        iX3 = a.a.x(bArr, iV24, dVar);
                        j0Var6.e(androidx.datastore.preferences.protobuf.j.e(dVar.f4148b));
                    }
                    return iX3;
                }
                return i19;
            case 49:
                if (i13 == 3) {
                    b1 b1VarP = p(i14);
                    int i40 = (i12 & (-8)) | 4;
                    Object objD = b1VarP.d();
                    s0 s0Var = (s0) b1VarP;
                    int I = s0Var.I(objD, bArr, i10, i11, i40, dVar);
                    dVar.f4149c = objD;
                    b1VarP.b(objD);
                    dVar.f4149c = objD;
                    zVar.add(objD);
                    while (I < i11) {
                        int iV25 = a.a.v(bArr, I, dVar);
                        if (i12 != dVar.f4147a) {
                            return I;
                        }
                        Object objD2 = b1VarP.d();
                        I = s0Var.I(objD2, bArr, iV25, i11, i40, dVar);
                        dVar.f4149c = objD2;
                        b1VarP.b(objD2);
                        dVar.f4149c = objD2;
                        zVar.add(objD2);
                    }
                    return I;
                }
            default:
                return i10;
        }
    }

    public final void L(Object obj, long j, androidx.datastore.preferences.protobuf.k kVar, b1 b1Var, o oVar) throws b0 {
        int iH;
        List listC = this.f4234l.c(j, obj);
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) kVar.f957e;
        int i10 = kVar.f954b;
        if ((i10 & 7) != 3) {
            throw c0.c();
        }
        do {
            Object objD = b1Var.d();
            kVar.i(objD, b1Var, oVar);
            b1Var.b(objD);
            listC.add(objD);
            if (jVar.g() || kVar.f956d != 0) {
                return;
            } else {
                iH = jVar.H();
            }
        } while (iH == i10);
        kVar.f956d = iH;
    }

    public final void M(Object obj, int i10, androidx.datastore.preferences.protobuf.k kVar, b1 b1Var, o oVar) throws c0 {
        int iH;
        List listC = this.f4234l.c(i10 & 1048575, obj);
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) kVar.f957e;
        int i11 = kVar.f954b;
        if ((i11 & 7) != 2) {
            throw c0.c();
        }
        do {
            Object objD = b1Var.d();
            kVar.k(objD, b1Var, oVar);
            b1Var.b(objD);
            listC.add(objD);
            if (jVar.g() || kVar.f956d != 0) {
                return;
            } else {
                iH = jVar.H();
            }
        } while (iH == i11);
        kVar.f956d = iH;
    }

    public final void N(int i10, androidx.datastore.preferences.protobuf.k kVar, Object obj) throws androidx.datastore.preferences.protobuf.z, b0 {
        if ((536870912 & i10) != 0) {
            kVar.V(2);
            n1.p(obj, i10 & 1048575, ((androidx.datastore.preferences.protobuf.j) kVar.f957e).G());
        } else if (!this.f4229f) {
            n1.p(obj, i10 & 1048575, kVar.o());
        } else {
            kVar.V(2);
            n1.p(obj, i10 & 1048575, ((androidx.datastore.preferences.protobuf.j) kVar.f957e).F());
        }
    }

    public final void P(int i10, Object obj) {
        int i11 = this.f4224a[i10 + 2];
        long j = 1048575 & i11;
        if (j == 1048575) {
            return;
        }
        n1.n(obj, (1 << (i11 >>> 20)) | n1.f4203c.g(j, obj), j);
    }

    public final void Q(int i10, int i11, Object obj) {
        n1.n(obj, i10, this.f4224a[i11 + 2] & 1048575);
    }

    public final int R(int i10, int i11) {
        int[] iArr = this.f4224a;
        int length = (iArr.length / 3) - 1;
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
        return -1;
    }

    public final void S(int i10, Object obj, Object obj2) {
        f4223p.putObject(obj, V(i10) & 1048575, obj2);
        P(i10, obj);
    }

    public final void T(Object obj, int i10, int i11, Object obj2) {
        f4223p.putObject(obj, V(i11) & 1048575, obj2);
        Q(i10, i11, obj);
    }

    public final int V(int i10) {
        return this.f4224a[i10 + 1];
    }

    public final void W(Object obj, l0 l0Var) throws androidx.datastore.preferences.protobuf.l {
        int i10;
        int i11;
        int i12;
        int[] iArr = this.f4224a;
        int length = iArr.length;
        Unsafe unsafe = f4223p;
        int i13 = 1048575;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 = i12 + 3) {
            int iV = V(i15);
            int i16 = iArr[i15];
            int iU = U(iV);
            if (iU <= 17) {
                int i17 = iArr[i15 + 2];
                i10 = 1048575;
                int i18 = i17 & 1048575;
                if (i18 != i13) {
                    i14 = unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i11 = 1 << (i17 >>> 20);
            } else {
                i10 = 1048575;
                i11 = 0;
            }
            int i19 = i15;
            long j = iV & i10;
            switch (iU) {
                case 0:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        double dE = n1.f4203c.e(j, obj);
                        l lVar = (l) l0Var.f4196a;
                        lVar.getClass();
                        lVar.o0(i16, Double.doubleToRawLongBits(dE));
                        continue;
                    }
                case 1:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        float f10 = n1.f4203c.f(j, obj);
                        l lVar2 = (l) l0Var.f4196a;
                        lVar2.getClass();
                        lVar2.m0(i16, Float.floatToRawIntBits(f10));
                    } else {
                        continue;
                    }
                case 2:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        ((l) l0Var.f4196a).t0(i16, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                case 3:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        ((l) l0Var.f4196a).t0(i16, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                case 4:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        int i20 = unsafe.getInt(obj, j);
                        l lVar3 = (l) l0Var.f4196a;
                        lVar3.r0(i16, 0);
                        lVar3.q0(i20);
                    }
                    break;
                case 5:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        ((l) l0Var.f4196a).o0(i16, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 6:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        ((l) l0Var.f4196a).m0(i16, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 7:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        boolean zC = n1.f4203c.c(j, obj);
                        l lVar4 = (l) l0Var.f4196a;
                        lVar4.r0(i16, 0);
                        lVar4.k0(zC ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 8:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        X(i16, unsafe.getObject(obj, j), l0Var);
                        break;
                    }
                    break;
                case 9:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        l0Var.c(i16, unsafe.getObject(obj, j), p(i12));
                        break;
                    }
                    break;
                case 10:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        l0Var.a(i16, (i) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 11:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        int i21 = unsafe.getInt(obj, j);
                        l lVar5 = (l) l0Var.f4196a;
                        lVar5.r0(i16, 0);
                        lVar5.s0(i21);
                        break;
                    }
                    break;
                case 12:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        int i22 = unsafe.getInt(obj, j);
                        l lVar6 = (l) l0Var.f4196a;
                        lVar6.r0(i16, 0);
                        lVar6.q0(i22);
                    }
                    break;
                case 13:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        ((l) l0Var.f4196a).m0(i16, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 14:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        ((l) l0Var.f4196a).o0(i16, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 15:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        int i23 = unsafe.getInt(obj, j);
                        l lVar7 = (l) l0Var.f4196a;
                        lVar7.r0(i16, 0);
                        lVar7.s0((i23 >> 31) ^ (i23 << 1));
                        break;
                    }
                    break;
                case 16:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        ((l) l0Var.f4196a).t0(i16, (j4 << 1) ^ (j4 >> 63));
                        break;
                    }
                    break;
                case 17:
                    i12 = i19;
                    if ((i11 & i14) != 0) {
                        l0Var.b(i16, unsafe.getObject(obj, j), p(i12));
                        break;
                    }
                    break;
                case 18:
                    i12 = i19;
                    c1.A(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 19:
                    i12 = i19;
                    c1.E(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, false);
                    continue;
                case 20:
                    i12 = i19;
                    c1.H(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, false);
                    continue;
                case zzbch.zzt.zzm /* 21 */:
                    i12 = i19;
                    c1.P(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, false);
                    continue;
                case 22:
                    i12 = i19;
                    c1.G(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, false);
                    continue;
                case 23:
                    i12 = i19;
                    c1.D(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, false);
                    continue;
                case 24:
                    i12 = i19;
                    c1.C(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, false);
                    continue;
                case 25:
                    i12 = i19;
                    c1.y(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, false);
                    continue;
                case 26:
                    i12 = i19;
                    c1.N(iArr[i12], (List) unsafe.getObject(obj, j), l0Var);
                    break;
                case 27:
                    i12 = i19;
                    c1.I(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, p(i12));
                    break;
                case 28:
                    i12 = i19;
                    c1.z(iArr[i12], (List) unsafe.getObject(obj, j), l0Var);
                    break;
                case 29:
                    i12 = i19;
                    c1.O(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, false);
                    break;
                case 30:
                    i12 = i19;
                    c1.B(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, false);
                    continue;
                case 31:
                    i12 = i19;
                    c1.J(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, false);
                    continue;
                case 32:
                    i12 = i19;
                    c1.K(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, false);
                    continue;
                case 33:
                    i12 = i19;
                    c1.L(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, false);
                    continue;
                case 34:
                    i12 = i19;
                    c1.M(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, false);
                    continue;
                case 35:
                    i12 = i19;
                    c1.A(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 36:
                    i12 = i19;
                    c1.E(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 37:
                    i12 = i19;
                    c1.H(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 38:
                    i12 = i19;
                    c1.P(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 39:
                    i12 = i19;
                    c1.G(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 40:
                    i12 = i19;
                    c1.D(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 41:
                    i12 = i19;
                    c1.C(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 42:
                    i12 = i19;
                    c1.y(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 43:
                    i12 = i19;
                    c1.O(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 44:
                    i12 = i19;
                    c1.B(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 45:
                    i12 = i19;
                    c1.J(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 46:
                    i12 = i19;
                    c1.K(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 47:
                    i12 = i19;
                    c1.L(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 48:
                    i12 = i19;
                    c1.M(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, true);
                    break;
                case 49:
                    i12 = i19;
                    c1.F(iArr[i12], (List) unsafe.getObject(obj, j), l0Var, p(i12));
                    break;
                case 50:
                    i12 = i19;
                    if (unsafe.getObject(obj, j) != null) {
                        Object objO = o(i12);
                        this.f4236n.getClass();
                        m6.a.q(objO);
                        throw null;
                    }
                    break;
                case 51:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        double dDoubleValue = ((Double) n1.f4203c.i(j, obj)).doubleValue();
                        l lVar8 = (l) l0Var.f4196a;
                        lVar8.getClass();
                        lVar8.o0(i16, Double.doubleToRawLongBits(dDoubleValue));
                        break;
                    }
                    break;
                case 52:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        float fFloatValue = ((Float) n1.f4203c.i(j, obj)).floatValue();
                        l lVar9 = (l) l0Var.f4196a;
                        lVar9.getClass();
                        lVar9.m0(i16, Float.floatToRawIntBits(fFloatValue));
                        break;
                    }
                    break;
                case 53:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        ((l) l0Var.f4196a).t0(i16, F(j, obj));
                        break;
                    }
                    break;
                case 54:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        ((l) l0Var.f4196a).t0(i16, F(j, obj));
                        break;
                    }
                    break;
                case 55:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        int iE = E(j, obj);
                        l lVar10 = (l) l0Var.f4196a;
                        lVar10.r0(i16, 0);
                        lVar10.q0(iE);
                        break;
                    }
                    break;
                case 56:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        ((l) l0Var.f4196a).o0(i16, F(j, obj));
                        break;
                    }
                    break;
                case 57:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        ((l) l0Var.f4196a).m0(i16, E(j, obj));
                        break;
                    }
                    break;
                case 58:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        boolean zBooleanValue = ((Boolean) n1.f4203c.i(j, obj)).booleanValue();
                        l lVar11 = (l) l0Var.f4196a;
                        lVar11.r0(i16, 0);
                        lVar11.k0(zBooleanValue ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 59:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        X(i16, unsafe.getObject(obj, j), l0Var);
                        break;
                    }
                    break;
                case 60:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        l0Var.c(i16, unsafe.getObject(obj, j), p(i12));
                        break;
                    }
                    break;
                case 61:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        l0Var.a(i16, (i) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        int iE2 = E(j, obj);
                        l lVar12 = (l) l0Var.f4196a;
                        lVar12.r0(i16, 0);
                        lVar12.s0(iE2);
                        break;
                    }
                    break;
                case 63:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        int iE3 = E(j, obj);
                        l lVar13 = (l) l0Var.f4196a;
                        lVar13.r0(i16, 0);
                        lVar13.q0(iE3);
                    }
                    break;
                case 64:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        ((l) l0Var.f4196a).m0(i16, E(j, obj));
                        break;
                    }
                    break;
                case 65:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        ((l) l0Var.f4196a).o0(i16, F(j, obj));
                        break;
                    }
                    break;
                case 66:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        int iE4 = E(j, obj);
                        l lVar14 = (l) l0Var.f4196a;
                        lVar14.r0(i16, 0);
                        lVar14.s0((iE4 >> 31) ^ (iE4 << 1));
                        break;
                    }
                    break;
                case 67:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        long jF = F(j, obj);
                        ((l) l0Var.f4196a).t0(i16, (jF << 1) ^ (jF >> 63));
                        break;
                    }
                    break;
                case 68:
                    i12 = i19;
                    if (u(i16, i12, obj)) {
                        l0Var.b(i16, unsafe.getObject(obj, j), p(i12));
                        break;
                    }
                    break;
                default:
                    i12 = i19;
                    break;
            }
        }
        this.f4235m.getClass();
        ((w) obj).unknownFields.e(l0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.crypto.tink.shaded.protobuf.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.s0.a(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    @Override // com.google.crypto.tink.shaded.protobuf.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = t(r9)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r9 instanceof com.google.crypto.tink.shaded.protobuf.w
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r9
            com.google.crypto.tink.shaded.protobuf.w r0 = (com.google.crypto.tink.shaded.protobuf.w) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.u(r2)
            r0.memoizedHashCode = r1
            r0.o()
        L1a:
            int[] r0 = r8.f4224a
            int r0 = r0.length
            r2 = r1
        L1e:
            if (r2 >= r0) goto L67
            int r3 = r8.V(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            int r3 = U(r3)
            r6 = 9
            if (r3 == r6) goto L51
            switch(r3) {
                case 17: goto L51;
                case 18: goto L4b;
                case 19: goto L4b;
                case 20: goto L4b;
                case 21: goto L4b;
                case 22: goto L4b;
                case 23: goto L4b;
                case 24: goto L4b;
                case 25: goto L4b;
                case 26: goto L4b;
                case 27: goto L4b;
                case 28: goto L4b;
                case 29: goto L4b;
                case 30: goto L4b;
                case 31: goto L4b;
                case 32: goto L4b;
                case 33: goto L4b;
                case 34: goto L4b;
                case 35: goto L4b;
                case 36: goto L4b;
                case 37: goto L4b;
                case 38: goto L4b;
                case 39: goto L4b;
                case 40: goto L4b;
                case 41: goto L4b;
                case 42: goto L4b;
                case 43: goto L4b;
                case 44: goto L4b;
                case 45: goto L4b;
                case 46: goto L4b;
                case 47: goto L4b;
                case 48: goto L4b;
                case 49: goto L4b;
                case 50: goto L35;
                default: goto L34;
            }
        L34:
            goto L64
        L35:
            sun.misc.Unsafe r3 = com.google.crypto.tink.shaded.protobuf.s0.f4223p
            java.lang.Object r6 = r3.getObject(r9, r4)
            if (r6 == 0) goto L64
            com.google.crypto.tink.shaded.protobuf.n0 r7 = r8.f4236n
            r7.getClass()
            r7 = r6
            com.google.crypto.tink.shaded.protobuf.m0 r7 = (com.google.crypto.tink.shaded.protobuf.m0) r7
            r7.f4198a = r1
            r3.putObject(r9, r4, r6)
            goto L64
        L4b:
            com.google.crypto.tink.shaded.protobuf.i0 r3 = r8.f4234l
            r3.a(r4, r9)
            goto L64
        L51:
            boolean r3 = r8.s(r2, r9)
            if (r3 == 0) goto L64
            com.google.crypto.tink.shaded.protobuf.b1 r3 = r8.p(r2)
            sun.misc.Unsafe r6 = com.google.crypto.tink.shaded.protobuf.s0.f4223p
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.b(r4)
        L64:
            int r2 = r2 + 3
            goto L1e
        L67:
            com.google.crypto.tink.shaded.protobuf.f1 r0 = r8.f4235m
            r0.getClass()
            com.google.crypto.tink.shaded.protobuf.w r9 = (com.google.crypto.tink.shaded.protobuf.w) r9
            com.google.crypto.tink.shaded.protobuf.e1 r9 = r9.unknownFields
            r9.f4163e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.s0.b(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    @Override // com.google.crypto.tink.shaded.protobuf.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.s0.c(java.lang.Object):boolean");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final Object d() {
        this.f4233k.getClass();
        return ((w) this.f4228e).q();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.google.crypto.tink.shaded.protobuf.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(com.google.crypto.tink.shaded.protobuf.w r12, com.google.crypto.tink.shaded.protobuf.w r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.s0.e(com.google.crypto.tink.shaded.protobuf.w, com.google.crypto.tink.shaded.protobuf.w):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.crypto.tink.shaded.protobuf.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(com.google.crypto.tink.shaded.protobuf.w r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.s0.f(com.google.crypto.tink.shaded.protobuf.w):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final int g(w wVar) {
        return this.f4230g ? r(wVar) : q(wVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final void h(Object obj, byte[] bArr, int i10, int i11, d dVar) throws c0 {
        if (this.f4230g) {
            J(obj, bArr, i10, i11, dVar);
        } else {
            I(obj, bArr, i10, i11, 0, dVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final void i(Object obj, l0 l0Var) throws androidx.datastore.preferences.protobuf.l {
        l0Var.getClass();
        l lVar = (l) l0Var.f4196a;
        if (!this.f4230g) {
            W(obj, l0Var);
            return;
        }
        int[] iArr = this.f4224a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iV = V(i10);
            int i11 = iArr[i10];
            switch (U(iV)) {
                case 0:
                    if (s(i10, obj)) {
                        double dE = n1.f4203c.e(iV & 1048575, obj);
                        lVar.getClass();
                        lVar.o0(i11, Double.doubleToRawLongBits(dE));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (s(i10, obj)) {
                        float f10 = n1.f4203c.f(iV & 1048575, obj);
                        lVar.getClass();
                        lVar.m0(i11, Float.floatToRawIntBits(f10));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (s(i10, obj)) {
                        lVar.t0(i11, n1.f4203c.h(iV & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (s(i10, obj)) {
                        lVar.t0(i11, n1.f4203c.h(iV & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (s(i10, obj)) {
                        int iG = n1.f4203c.g(iV & 1048575, obj);
                        lVar.r0(i11, 0);
                        lVar.q0(iG);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (s(i10, obj)) {
                        lVar.o0(i11, n1.f4203c.h(iV & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (s(i10, obj)) {
                        lVar.m0(i11, n1.f4203c.g(iV & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (s(i10, obj)) {
                        boolean zC = n1.f4203c.c(iV & 1048575, obj);
                        lVar.r0(i11, 0);
                        lVar.k0(zC ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (s(i10, obj)) {
                        X(i11, n1.f4203c.i(iV & 1048575, obj), l0Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (s(i10, obj)) {
                        l0Var.c(i11, n1.f4203c.i(iV & 1048575, obj), p(i10));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (s(i10, obj)) {
                        l0Var.a(i11, (i) n1.f4203c.i(iV & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (s(i10, obj)) {
                        int iG2 = n1.f4203c.g(iV & 1048575, obj);
                        lVar.r0(i11, 0);
                        lVar.s0(iG2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (s(i10, obj)) {
                        int iG3 = n1.f4203c.g(iV & 1048575, obj);
                        lVar.r0(i11, 0);
                        lVar.q0(iG3);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (s(i10, obj)) {
                        lVar.m0(i11, n1.f4203c.g(iV & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (s(i10, obj)) {
                        lVar.o0(i11, n1.f4203c.h(iV & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (s(i10, obj)) {
                        int iG4 = n1.f4203c.g(iV & 1048575, obj);
                        lVar.r0(i11, 0);
                        lVar.s0((iG4 >> 31) ^ (iG4 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (s(i10, obj)) {
                        long jH = n1.f4203c.h(iV & 1048575, obj);
                        lVar.t0(i11, (jH >> 63) ^ (jH << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (s(i10, obj)) {
                        l0Var.b(i11, n1.f4203c.i(iV & 1048575, obj), p(i10));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c1.A(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, false);
                    break;
                case 19:
                    c1.E(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, false);
                    break;
                case 20:
                    c1.H(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, false);
                    break;
                case zzbch.zzt.zzm /* 21 */:
                    c1.P(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, false);
                    break;
                case 22:
                    c1.G(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, false);
                    break;
                case 23:
                    c1.D(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, false);
                    break;
                case 24:
                    c1.C(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, false);
                    break;
                case 25:
                    c1.y(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, false);
                    break;
                case 26:
                    c1.N(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var);
                    break;
                case 27:
                    c1.I(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, p(i10));
                    break;
                case 28:
                    c1.z(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var);
                    break;
                case 29:
                    c1.O(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, false);
                    break;
                case 30:
                    c1.B(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, false);
                    break;
                case 31:
                    c1.J(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, false);
                    break;
                case 32:
                    c1.K(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, false);
                    break;
                case 33:
                    c1.L(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, false);
                    break;
                case 34:
                    c1.M(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, false);
                    break;
                case 35:
                    c1.A(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, true);
                    break;
                case 36:
                    c1.E(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, true);
                    break;
                case 37:
                    c1.H(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, true);
                    break;
                case 38:
                    c1.P(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, true);
                    break;
                case 39:
                    c1.G(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, true);
                    break;
                case 40:
                    c1.D(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, true);
                    break;
                case 41:
                    c1.C(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, true);
                    break;
                case 42:
                    c1.y(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, true);
                    break;
                case 43:
                    c1.O(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, true);
                    break;
                case 44:
                    c1.B(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, true);
                    break;
                case 45:
                    c1.J(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, true);
                    break;
                case 46:
                    c1.K(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, true);
                    break;
                case 47:
                    c1.L(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, true);
                    break;
                case 48:
                    c1.M(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, true);
                    break;
                case 49:
                    c1.F(iArr[i10], (List) n1.f4203c.i(iV & 1048575, obj), l0Var, p(i10));
                    break;
                case 50:
                    if (n1.f4203c.i(iV & 1048575, obj) != null) {
                        Object objO = o(i10);
                        this.f4236n.getClass();
                        m6.a.q(objO);
                        throw null;
                    }
                    break;
                case 51:
                    if (u(i11, i10, obj)) {
                        double dDoubleValue = ((Double) n1.f4203c.i(iV & 1048575, obj)).doubleValue();
                        lVar.getClass();
                        lVar.o0(i11, Double.doubleToRawLongBits(dDoubleValue));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (u(i11, i10, obj)) {
                        float fFloatValue = ((Float) n1.f4203c.i(iV & 1048575, obj)).floatValue();
                        lVar.getClass();
                        lVar.m0(i11, Float.floatToRawIntBits(fFloatValue));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (u(i11, i10, obj)) {
                        lVar.t0(i11, F(iV & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (u(i11, i10, obj)) {
                        lVar.t0(i11, F(iV & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (u(i11, i10, obj)) {
                        int iE = E(iV & 1048575, obj);
                        lVar.r0(i11, 0);
                        lVar.q0(iE);
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (u(i11, i10, obj)) {
                        lVar.o0(i11, F(iV & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (u(i11, i10, obj)) {
                        lVar.m0(i11, E(iV & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (u(i11, i10, obj)) {
                        boolean zBooleanValue = ((Boolean) n1.f4203c.i(iV & 1048575, obj)).booleanValue();
                        lVar.r0(i11, 0);
                        lVar.k0(zBooleanValue ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (u(i11, i10, obj)) {
                        X(i11, n1.f4203c.i(iV & 1048575, obj), l0Var);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (u(i11, i10, obj)) {
                        l0Var.c(i11, n1.f4203c.i(iV & 1048575, obj), p(i10));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (u(i11, i10, obj)) {
                        l0Var.a(i11, (i) n1.f4203c.i(iV & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (u(i11, i10, obj)) {
                        int iE2 = E(iV & 1048575, obj);
                        lVar.r0(i11, 0);
                        lVar.s0(iE2);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (u(i11, i10, obj)) {
                        int iE3 = E(iV & 1048575, obj);
                        lVar.r0(i11, 0);
                        lVar.q0(iE3);
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (u(i11, i10, obj)) {
                        lVar.m0(i11, E(iV & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (u(i11, i10, obj)) {
                        lVar.o0(i11, F(iV & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (u(i11, i10, obj)) {
                        int iE4 = E(iV & 1048575, obj);
                        lVar.r0(i11, 0);
                        lVar.s0((iE4 >> 31) ^ (iE4 << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (u(i11, i10, obj)) {
                        long jF = F(iV & 1048575, obj);
                        lVar.t0(i11, (jF >> 63) ^ (jF << 1));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (u(i11, i10, obj)) {
                        l0Var.b(i11, n1.f4203c.i(iV & 1048575, obj), p(i10));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f4235m.getClass();
        ((w) obj).unknownFields.e(l0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        ((com.google.crypto.tink.shaded.protobuf.w) r2).unknownFields = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x063b A[Catch: all -> 0x0469, TryCatch #5 {all -> 0x0469, blocks: (B:146:0x0636, B:148:0x063b, B:149:0x0640, B:116:0x045d, B:121:0x0471, B:122:0x048d, B:123:0x04aa, B:124:0x04c7, B:125:0x04e6, B:126:0x0502, B:127:0x0517, B:128:0x0532, B:129:0x053f, B:130:0x055d, B:131:0x057a, B:132:0x0597, B:133:0x05b3, B:134:0x05cf, B:135:0x05eb, B:136:0x0609, B:140:0x0627), top: B:172:0x0636 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0665 A[LOOP:3: B:159:0x0663->B:160:0x0665, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0646 A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.Object r20, androidx.datastore.preferences.protobuf.k r21, com.google.crypto.tink.shaded.protobuf.o r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.s0.j(java.lang.Object, androidx.datastore.preferences.protobuf.k, com.google.crypto.tink.shaded.protobuf.o):void");
    }

    public final boolean k(w wVar, w wVar2, int i10) {
        return s(i10, wVar) == s(i10, wVar2);
    }

    public final void m(int i10, Object obj, Object obj2) {
        int i11 = this.f4224a[i10];
        if (n1.f4203c.i(V(i10) & 1048575, obj) == null) {
            return;
        }
        n(i10);
    }

    public final void n(int i10) {
        if (this.f4225b[((i10 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object o(int i10) {
        return this.f4225b[(i10 / 3) * 2];
    }

    public final b1 p(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f4225b;
        b1 b1Var = (b1) objArr[i11];
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1VarA = y0.f4246c.a((Class) objArr[i11 + 1]);
        objArr[i11] = b1VarA;
        return b1VarA;
    }

    public final int q(w wVar) {
        int i10;
        int iH0;
        int iJ0;
        int iH02;
        int iF0;
        int iD0;
        int iH03;
        int iG0;
        int iW;
        int iE0;
        Unsafe unsafe = f4223p;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int iZ = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f4224a;
            if (i13 >= iArr.length) {
                this.f4235m.getClass();
                return wVar.unknownFields.b() + iZ;
            }
            int iV = V(i13);
            int i15 = iArr[i13];
            int iU = U(iV);
            if (iU <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                i10 = 1 << (i16 >>> 20);
                if (i17 != i12) {
                    i14 = unsafe.getInt(wVar, i17);
                    i12 = i17;
                }
            } else {
                i10 = 0;
            }
            long j = iV & i11;
            switch (iU) {
                case 0:
                    if ((i14 & i10) != 0) {
                        iZ = m6.a.z(i15, 8, iZ);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i14 & i10) != 0) {
                        iZ = m6.a.z(i15, 4, iZ);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i10 & i14) != 0) {
                        long j4 = unsafe.getLong(wVar, j);
                        iH0 = l.h0(i15);
                        iJ0 = l.j0(j4);
                        iD0 = iJ0 + iH0;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i10 & i14) != 0) {
                        long j10 = unsafe.getLong(wVar, j);
                        iH0 = l.h0(i15);
                        iJ0 = l.j0(j10);
                        iD0 = iJ0 + iH0;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i10 & i14) != 0) {
                        int i18 = unsafe.getInt(wVar, j);
                        iH02 = l.h0(i15);
                        iF0 = l.f0(i18);
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i14 & i10) != 0) {
                        iD0 = l.d0(i15);
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i14 & i10) != 0) {
                        iD0 = l.c0(i15);
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i14 & i10) != 0) {
                        iZ = m6.a.z(i15, 1, iZ);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i10 & i14) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(wVar, j);
                        if (object instanceof i) {
                            int iH04 = l.h0(i15);
                            int size = ((i) object).size();
                            iW = m6.a.w(size, size, iH04, iZ);
                            iZ = iW;
                            break;
                        } else {
                            iH03 = l.h0(i15);
                            iG0 = l.g0((String) object);
                            iW = iG0 + iH03 + iZ;
                            iZ = iW;
                        }
                    }
                case 9:
                    if ((i10 & i14) != 0) {
                        Object object2 = unsafe.getObject(wVar, j);
                        b1 b1VarP = p(i13);
                        Class cls = c1.f4143a;
                        int iH05 = l.h0(i15);
                        int iB = ((a) object2).b(b1VarP);
                        iZ = m6.a.w(iB, iB, iH05, iZ);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i10 & i14) != 0) {
                        iD0 = l.a0(i15, (i) unsafe.getObject(wVar, j));
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i10 & i14) != 0) {
                        int i19 = unsafe.getInt(wVar, j);
                        iH02 = l.h0(i15);
                        iF0 = l.i0(i19);
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i10 & i14) != 0) {
                        int i20 = unsafe.getInt(wVar, j);
                        iH02 = l.h0(i15);
                        iF0 = l.f0(i20);
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i14 & i10) != 0) {
                        iZ = m6.a.z(i15, 4, iZ);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i14 & i10) != 0) {
                        iZ = m6.a.z(i15, 8, iZ);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i10 & i14) != 0) {
                        int i21 = unsafe.getInt(wVar, j);
                        iH02 = l.h0(i15);
                        iF0 = l.i0((i21 >> 31) ^ (i21 << 1));
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i10 & i14) != 0) {
                        long j11 = unsafe.getLong(wVar, j);
                        iH0 = l.h0(i15);
                        iJ0 = l.j0((j11 >> 63) ^ (j11 << 1));
                        iD0 = iJ0 + iH0;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i10 & i14) != 0) {
                        iD0 = l.e0(i15, (a) unsafe.getObject(wVar, j), p(i13));
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iD0 = c1.f(i15, (List) unsafe.getObject(wVar, j));
                    iZ += iD0;
                    break;
                case 19:
                    iD0 = c1.d(i15, (List) unsafe.getObject(wVar, j));
                    iZ += iD0;
                    break;
                case 20:
                    iD0 = c1.j(i15, (List) unsafe.getObject(wVar, j));
                    iZ += iD0;
                    break;
                case zzbch.zzt.zzm /* 21 */:
                    iD0 = c1.t(i15, (List) unsafe.getObject(wVar, j));
                    iZ += iD0;
                    break;
                case 22:
                    iD0 = c1.h(i15, (List) unsafe.getObject(wVar, j));
                    iZ += iD0;
                    break;
                case 23:
                    iD0 = c1.f(i15, (List) unsafe.getObject(wVar, j));
                    iZ += iD0;
                    break;
                case 24:
                    iD0 = c1.d(i15, (List) unsafe.getObject(wVar, j));
                    iZ += iD0;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(wVar, j);
                    Class cls2 = c1.f4143a;
                    int size2 = list.size();
                    iZ += size2 == 0 ? 0 : (l.h0(i15) + 1) * size2;
                    break;
                case 26:
                    iD0 = c1.q(i15, (List) unsafe.getObject(wVar, j));
                    iZ += iD0;
                    break;
                case 27:
                    iD0 = c1.l(i15, (List) unsafe.getObject(wVar, j), p(i13));
                    iZ += iD0;
                    break;
                case 28:
                    iD0 = c1.a(i15, (List) unsafe.getObject(wVar, j));
                    iZ += iD0;
                    break;
                case 29:
                    iD0 = c1.r(i15, (List) unsafe.getObject(wVar, j));
                    iZ += iD0;
                    break;
                case 30:
                    iD0 = c1.b(i15, (List) unsafe.getObject(wVar, j));
                    iZ += iD0;
                    break;
                case 31:
                    iD0 = c1.d(i15, (List) unsafe.getObject(wVar, j));
                    iZ += iD0;
                    break;
                case 32:
                    iD0 = c1.f(i15, (List) unsafe.getObject(wVar, j));
                    iZ += iD0;
                    break;
                case 33:
                    iD0 = c1.m(i15, (List) unsafe.getObject(wVar, j));
                    iZ += iD0;
                    break;
                case 34:
                    iD0 = c1.o(i15, (List) unsafe.getObject(wVar, j));
                    iZ += iD0;
                    break;
                case 35:
                    int iG = c1.g((List) unsafe.getObject(wVar, j));
                    if (iG > 0) {
                        iZ = m6.a.w(iG, l.h0(i15), iG, iZ);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int iE = c1.e((List) unsafe.getObject(wVar, j));
                    if (iE > 0) {
                        iZ = m6.a.w(iE, l.h0(i15), iE, iZ);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int iK = c1.k((List) unsafe.getObject(wVar, j));
                    if (iK > 0) {
                        iZ = m6.a.w(iK, l.h0(i15), iK, iZ);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int iU2 = c1.u((List) unsafe.getObject(wVar, j));
                    if (iU2 > 0) {
                        iZ = m6.a.w(iU2, l.h0(i15), iU2, iZ);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i22 = c1.i((List) unsafe.getObject(wVar, j));
                    if (i22 > 0) {
                        iZ = m6.a.w(i22, l.h0(i15), i22, iZ);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int iG2 = c1.g((List) unsafe.getObject(wVar, j));
                    if (iG2 > 0) {
                        iZ = m6.a.w(iG2, l.h0(i15), iG2, iZ);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int iE2 = c1.e((List) unsafe.getObject(wVar, j));
                    if (iE2 > 0) {
                        iZ = m6.a.w(iE2, l.h0(i15), iE2, iZ);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list2 = (List) unsafe.getObject(wVar, j);
                    Class cls3 = c1.f4143a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        iZ = m6.a.w(size3, l.h0(i15), size3, iZ);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int iS = c1.s((List) unsafe.getObject(wVar, j));
                    if (iS > 0) {
                        iZ = m6.a.w(iS, l.h0(i15), iS, iZ);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int iC = c1.c((List) unsafe.getObject(wVar, j));
                    if (iC > 0) {
                        iZ = m6.a.w(iC, l.h0(i15), iC, iZ);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int iE3 = c1.e((List) unsafe.getObject(wVar, j));
                    if (iE3 > 0) {
                        iZ = m6.a.w(iE3, l.h0(i15), iE3, iZ);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int iG3 = c1.g((List) unsafe.getObject(wVar, j));
                    if (iG3 > 0) {
                        iZ = m6.a.w(iG3, l.h0(i15), iG3, iZ);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int iN = c1.n((List) unsafe.getObject(wVar, j));
                    if (iN > 0) {
                        iZ = m6.a.w(iN, l.h0(i15), iN, iZ);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int iP = c1.p((List) unsafe.getObject(wVar, j));
                    if (iP > 0) {
                        iZ = m6.a.w(iP, l.h0(i15), iP, iZ);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list3 = (List) unsafe.getObject(wVar, j);
                    b1 b1VarP2 = p(i13);
                    Class cls4 = c1.f4143a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        iE0 = 0;
                    } else {
                        iE0 = 0;
                        for (int i23 = 0; i23 < size4; i23++) {
                            iE0 += l.e0(i15, (a) list3.get(i23), b1VarP2);
                        }
                    }
                    iZ += iE0;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(wVar, j);
                    Object objO = o(i13);
                    this.f4236n.getClass();
                    n0.a(object3, objO);
                    break;
                case 51:
                    if (u(i15, i13, wVar)) {
                        iZ = m6.a.z(i15, 8, iZ);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (u(i15, i13, wVar)) {
                        iZ = m6.a.z(i15, 4, iZ);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (u(i15, i13, wVar)) {
                        long jF = F(j, wVar);
                        iH0 = l.h0(i15);
                        iJ0 = l.j0(jF);
                        iD0 = iJ0 + iH0;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (u(i15, i13, wVar)) {
                        long jF2 = F(j, wVar);
                        iH0 = l.h0(i15);
                        iJ0 = l.j0(jF2);
                        iD0 = iJ0 + iH0;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (u(i15, i13, wVar)) {
                        int iE4 = E(j, wVar);
                        iH02 = l.h0(i15);
                        iF0 = l.f0(iE4);
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (u(i15, i13, wVar)) {
                        iD0 = l.d0(i15);
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (u(i15, i13, wVar)) {
                        iD0 = l.c0(i15);
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (u(i15, i13, wVar)) {
                        iZ = m6.a.z(i15, 1, iZ);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!u(i15, i13, wVar)) {
                        break;
                    } else {
                        Object object4 = unsafe.getObject(wVar, j);
                        if (object4 instanceof i) {
                            int iH06 = l.h0(i15);
                            int size5 = ((i) object4).size();
                            iW = m6.a.w(size5, size5, iH06, iZ);
                            iZ = iW;
                            break;
                        } else {
                            iH03 = l.h0(i15);
                            iG0 = l.g0((String) object4);
                            iW = iG0 + iH03 + iZ;
                            iZ = iW;
                        }
                    }
                case 60:
                    if (u(i15, i13, wVar)) {
                        Object object5 = unsafe.getObject(wVar, j);
                        b1 b1VarP3 = p(i13);
                        Class cls5 = c1.f4143a;
                        int iH07 = l.h0(i15);
                        int iB2 = ((a) object5).b(b1VarP3);
                        iZ = m6.a.w(iB2, iB2, iH07, iZ);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (u(i15, i13, wVar)) {
                        iD0 = l.a0(i15, (i) unsafe.getObject(wVar, j));
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (u(i15, i13, wVar)) {
                        int iE5 = E(j, wVar);
                        iH02 = l.h0(i15);
                        iF0 = l.i0(iE5);
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (u(i15, i13, wVar)) {
                        int iE6 = E(j, wVar);
                        iH02 = l.h0(i15);
                        iF0 = l.f0(iE6);
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (u(i15, i13, wVar)) {
                        iZ = m6.a.z(i15, 4, iZ);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (u(i15, i13, wVar)) {
                        iZ = m6.a.z(i15, 8, iZ);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (u(i15, i13, wVar)) {
                        int iE7 = E(j, wVar);
                        iH02 = l.h0(i15);
                        iF0 = l.i0((iE7 >> 31) ^ (iE7 << 1));
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (u(i15, i13, wVar)) {
                        long jF3 = F(j, wVar);
                        iH0 = l.h0(i15);
                        iJ0 = l.j0((jF3 >> 63) ^ (jF3 << 1));
                        iD0 = iJ0 + iH0;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (u(i15, i13, wVar)) {
                        iD0 = l.e0(i15, (a) unsafe.getObject(wVar, j), p(i13));
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
            }
            i13 += 3;
            i11 = 1048575;
        }
    }

    public final int r(w wVar) {
        int iH0;
        int iJ0;
        int iH02;
        int iF0;
        int iD0;
        int iH03;
        int iG0;
        int iH04;
        int iJ02;
        int iE0;
        Unsafe unsafe = f4223p;
        int i10 = 0;
        int iZ = 0;
        while (true) {
            int[] iArr = this.f4224a;
            if (i10 >= iArr.length) {
                this.f4235m.getClass();
                return wVar.unknownFields.b() + iZ;
            }
            int iV = V(i10);
            int iU = U(iV);
            int i11 = iArr[i10];
            long j = iV & 1048575;
            if (iU >= r.f4216b.f4220a && iU <= r.f4217c.f4220a) {
                int i12 = iArr[i10 + 2];
            }
            switch (iU) {
                case 0:
                    if (s(i10, wVar)) {
                        iZ = m6.a.z(i11, 8, iZ);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (s(i10, wVar)) {
                        iZ = m6.a.z(i11, 4, iZ);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (s(i10, wVar)) {
                        long jH = n1.f4203c.h(j, wVar);
                        iH0 = l.h0(i11);
                        iJ0 = l.j0(jH);
                        iD0 = iJ0 + iH0;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (s(i10, wVar)) {
                        long jH2 = n1.f4203c.h(j, wVar);
                        iH0 = l.h0(i11);
                        iJ0 = l.j0(jH2);
                        iD0 = iJ0 + iH0;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (s(i10, wVar)) {
                        int iG = n1.f4203c.g(j, wVar);
                        iH02 = l.h0(i11);
                        iF0 = l.f0(iG);
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (s(i10, wVar)) {
                        iD0 = l.d0(i11);
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (s(i10, wVar)) {
                        iD0 = l.c0(i11);
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (s(i10, wVar)) {
                        iZ = m6.a.z(i11, 1, iZ);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (s(i10, wVar)) {
                        Object objI = n1.f4203c.i(j, wVar);
                        if (objI instanceof i) {
                            int iH05 = l.h0(i11);
                            int size = ((i) objI).size();
                            iZ = m6.a.w(size, size, iH05, iZ);
                            break;
                        } else {
                            iH03 = l.h0(i11);
                            iG0 = l.g0((String) objI);
                            iZ = iG0 + iH03 + iZ;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (s(i10, wVar)) {
                        Object objI2 = n1.f4203c.i(j, wVar);
                        b1 b1VarP = p(i10);
                        Class cls = c1.f4143a;
                        int iH06 = l.h0(i11);
                        int iB = ((a) objI2).b(b1VarP);
                        iZ = m6.a.w(iB, iB, iH06, iZ);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (s(i10, wVar)) {
                        iD0 = l.a0(i11, (i) n1.f4203c.i(j, wVar));
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (s(i10, wVar)) {
                        int iG2 = n1.f4203c.g(j, wVar);
                        iH02 = l.h0(i11);
                        iF0 = l.i0(iG2);
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (s(i10, wVar)) {
                        int iG3 = n1.f4203c.g(j, wVar);
                        iH02 = l.h0(i11);
                        iF0 = l.f0(iG3);
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (s(i10, wVar)) {
                        iZ = m6.a.z(i11, 4, iZ);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (s(i10, wVar)) {
                        iZ = m6.a.z(i11, 8, iZ);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (s(i10, wVar)) {
                        int iG4 = n1.f4203c.g(j, wVar);
                        iH02 = l.h0(i11);
                        iF0 = l.i0((iG4 >> 31) ^ (iG4 << 1));
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (s(i10, wVar)) {
                        long jH3 = n1.f4203c.h(j, wVar);
                        iH04 = l.h0(i11);
                        iJ02 = l.j0((jH3 >> 63) ^ (jH3 << 1));
                        iD0 = iJ02 + iH04;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (s(i10, wVar)) {
                        iD0 = l.e0(i11, (a) n1.f4203c.i(j, wVar), p(i10));
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iD0 = c1.f(i11, v(wVar, j));
                    iZ += iD0;
                    break;
                case 19:
                    iD0 = c1.d(i11, v(wVar, j));
                    iZ += iD0;
                    break;
                case 20:
                    iD0 = c1.j(i11, v(wVar, j));
                    iZ += iD0;
                    break;
                case zzbch.zzt.zzm /* 21 */:
                    iD0 = c1.t(i11, v(wVar, j));
                    iZ += iD0;
                    break;
                case 22:
                    iD0 = c1.h(i11, v(wVar, j));
                    iZ += iD0;
                    break;
                case 23:
                    iD0 = c1.f(i11, v(wVar, j));
                    iZ += iD0;
                    break;
                case 24:
                    iD0 = c1.d(i11, v(wVar, j));
                    iZ += iD0;
                    break;
                case 25:
                    List listV = v(wVar, j);
                    Class cls2 = c1.f4143a;
                    int size2 = listV.size();
                    iZ += size2 == 0 ? 0 : (l.h0(i11) + 1) * size2;
                    break;
                case 26:
                    iD0 = c1.q(i11, v(wVar, j));
                    iZ += iD0;
                    break;
                case 27:
                    iD0 = c1.l(i11, v(wVar, j), p(i10));
                    iZ += iD0;
                    break;
                case 28:
                    iD0 = c1.a(i11, v(wVar, j));
                    iZ += iD0;
                    break;
                case 29:
                    iD0 = c1.r(i11, v(wVar, j));
                    iZ += iD0;
                    break;
                case 30:
                    iD0 = c1.b(i11, v(wVar, j));
                    iZ += iD0;
                    break;
                case 31:
                    iD0 = c1.d(i11, v(wVar, j));
                    iZ += iD0;
                    break;
                case 32:
                    iD0 = c1.f(i11, v(wVar, j));
                    iZ += iD0;
                    break;
                case 33:
                    iD0 = c1.m(i11, v(wVar, j));
                    iZ += iD0;
                    break;
                case 34:
                    iD0 = c1.o(i11, v(wVar, j));
                    iZ += iD0;
                    break;
                case 35:
                    int iG5 = c1.g((List) unsafe.getObject(wVar, j));
                    if (iG5 > 0) {
                        iZ = m6.a.w(iG5, l.h0(i11), iG5, iZ);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int iE = c1.e((List) unsafe.getObject(wVar, j));
                    if (iE > 0) {
                        iZ = m6.a.w(iE, l.h0(i11), iE, iZ);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int iK = c1.k((List) unsafe.getObject(wVar, j));
                    if (iK > 0) {
                        iZ = m6.a.w(iK, l.h0(i11), iK, iZ);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int iU2 = c1.u((List) unsafe.getObject(wVar, j));
                    if (iU2 > 0) {
                        iZ = m6.a.w(iU2, l.h0(i11), iU2, iZ);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i13 = c1.i((List) unsafe.getObject(wVar, j));
                    if (i13 > 0) {
                        iZ = m6.a.w(i13, l.h0(i11), i13, iZ);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int iG6 = c1.g((List) unsafe.getObject(wVar, j));
                    if (iG6 > 0) {
                        iZ = m6.a.w(iG6, l.h0(i11), iG6, iZ);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int iE2 = c1.e((List) unsafe.getObject(wVar, j));
                    if (iE2 > 0) {
                        iZ = m6.a.w(iE2, l.h0(i11), iE2, iZ);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(wVar, j);
                    Class cls3 = c1.f4143a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        iZ = m6.a.w(size3, l.h0(i11), size3, iZ);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int iS = c1.s((List) unsafe.getObject(wVar, j));
                    if (iS > 0) {
                        iZ = m6.a.w(iS, l.h0(i11), iS, iZ);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int iC = c1.c((List) unsafe.getObject(wVar, j));
                    if (iC > 0) {
                        iZ = m6.a.w(iC, l.h0(i11), iC, iZ);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int iE3 = c1.e((List) unsafe.getObject(wVar, j));
                    if (iE3 > 0) {
                        iZ = m6.a.w(iE3, l.h0(i11), iE3, iZ);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int iG7 = c1.g((List) unsafe.getObject(wVar, j));
                    if (iG7 > 0) {
                        iZ = m6.a.w(iG7, l.h0(i11), iG7, iZ);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int iN = c1.n((List) unsafe.getObject(wVar, j));
                    if (iN > 0) {
                        iZ = m6.a.w(iN, l.h0(i11), iN, iZ);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int iP = c1.p((List) unsafe.getObject(wVar, j));
                    if (iP > 0) {
                        iZ = m6.a.w(iP, l.h0(i11), iP, iZ);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List listV2 = v(wVar, j);
                    b1 b1VarP2 = p(i10);
                    Class cls4 = c1.f4143a;
                    int size4 = listV2.size();
                    if (size4 == 0) {
                        iE0 = 0;
                    } else {
                        iE0 = 0;
                        for (int i14 = 0; i14 < size4; i14++) {
                            iE0 += l.e0(i11, (a) listV2.get(i14), b1VarP2);
                        }
                    }
                    iZ += iE0;
                    break;
                case 50:
                    Object objI3 = n1.f4203c.i(j, wVar);
                    Object objO = o(i10);
                    this.f4236n.getClass();
                    n0.a(objI3, objO);
                    break;
                case 51:
                    if (u(i11, i10, wVar)) {
                        iZ = m6.a.z(i11, 8, iZ);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (u(i11, i10, wVar)) {
                        iZ = m6.a.z(i11, 4, iZ);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (u(i11, i10, wVar)) {
                        long jF = F(j, wVar);
                        iH0 = l.h0(i11);
                        iJ0 = l.j0(jF);
                        iD0 = iJ0 + iH0;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (u(i11, i10, wVar)) {
                        long jF2 = F(j, wVar);
                        iH0 = l.h0(i11);
                        iJ0 = l.j0(jF2);
                        iD0 = iJ0 + iH0;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (u(i11, i10, wVar)) {
                        int iE4 = E(j, wVar);
                        iH02 = l.h0(i11);
                        iF0 = l.f0(iE4);
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (u(i11, i10, wVar)) {
                        iD0 = l.d0(i11);
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (u(i11, i10, wVar)) {
                        iD0 = l.c0(i11);
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (u(i11, i10, wVar)) {
                        iZ = m6.a.z(i11, 1, iZ);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (u(i11, i10, wVar)) {
                        Object objI4 = n1.f4203c.i(j, wVar);
                        if (objI4 instanceof i) {
                            int iH07 = l.h0(i11);
                            int size5 = ((i) objI4).size();
                            iZ = m6.a.w(size5, size5, iH07, iZ);
                            break;
                        } else {
                            iH03 = l.h0(i11);
                            iG0 = l.g0((String) objI4);
                            iZ = iG0 + iH03 + iZ;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (u(i11, i10, wVar)) {
                        Object objI5 = n1.f4203c.i(j, wVar);
                        b1 b1VarP3 = p(i10);
                        Class cls5 = c1.f4143a;
                        int iH08 = l.h0(i11);
                        int iB2 = ((a) objI5).b(b1VarP3);
                        iZ = m6.a.w(iB2, iB2, iH08, iZ);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (u(i11, i10, wVar)) {
                        iD0 = l.a0(i11, (i) n1.f4203c.i(j, wVar));
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (u(i11, i10, wVar)) {
                        int iE5 = E(j, wVar);
                        iH02 = l.h0(i11);
                        iF0 = l.i0(iE5);
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (u(i11, i10, wVar)) {
                        int iE6 = E(j, wVar);
                        iH02 = l.h0(i11);
                        iF0 = l.f0(iE6);
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (u(i11, i10, wVar)) {
                        iZ = m6.a.z(i11, 4, iZ);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (u(i11, i10, wVar)) {
                        iZ = m6.a.z(i11, 8, iZ);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (u(i11, i10, wVar)) {
                        int iE7 = E(j, wVar);
                        iH02 = l.h0(i11);
                        iF0 = l.i0((iE7 >> 31) ^ (iE7 << 1));
                        iD0 = iF0 + iH02;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (u(i11, i10, wVar)) {
                        long jF3 = F(j, wVar);
                        iH04 = l.h0(i11);
                        iJ02 = l.j0((jF3 >> 63) ^ (jF3 << 1));
                        iD0 = iJ02 + iH04;
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (u(i11, i10, wVar)) {
                        iD0 = l.e0(i11, (a) n1.f4203c.i(j, wVar), p(i10));
                        iZ += iD0;
                        break;
                    } else {
                        break;
                    }
            }
            i10 += 3;
        }
    }

    public final boolean s(int i10, Object obj) {
        int i11 = this.f4224a[i10 + 2];
        long j = i11 & 1048575;
        if (j == 1048575) {
            int iV = V(i10);
            long j4 = iV & 1048575;
            switch (U(iV)) {
                case 0:
                    if (Double.doubleToRawLongBits(n1.f4203c.e(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(n1.f4203c.f(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (n1.f4203c.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (n1.f4203c.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (n1.f4203c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (n1.f4203c.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (n1.f4203c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return n1.f4203c.c(j4, obj);
                case 8:
                    Object objI = n1.f4203c.i(j4, obj);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof i) {
                        return !i.f4171b.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (n1.f4203c.i(j4, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !i.f4171b.equals(n1.f4203c.i(j4, obj));
                case 11:
                    if (n1.f4203c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (n1.f4203c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (n1.f4203c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (n1.f4203c.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (n1.f4203c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (n1.f4203c.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (n1.f4203c.i(j4, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & n1.f4203c.g(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean u(int i10, int i11, Object obj) {
        return n1.f4203c.g((long) (this.f4224a[i11 + 2] & 1048575), obj) == i10;
    }

    public final void w(int i10, Object obj, Object obj2) {
        long jV = V(i10) & 1048575;
        Object objI = n1.f4203c.i(jV, obj);
        n0 n0Var = this.f4236n;
        if (objI != null) {
            n0Var.getClass();
            if (!((m0) objI).f4198a) {
                m0 m0VarC = m0.f4197b.c();
                n0.b(m0VarC, objI);
                n1.p(obj, jV, m0VarC);
                objI = m0VarC;
            }
        } else {
            n0Var.getClass();
            objI = m0.f4197b.c();
            n1.p(obj, jV, objI);
        }
        n0Var.getClass();
        m6.a.q(obj2);
        throw null;
    }

    public final void x(int i10, Object obj, Object obj2) {
        if (s(i10, obj2)) {
            long jV = V(i10) & 1048575;
            Unsafe unsafe = f4223p;
            Object object = unsafe.getObject(obj2, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f4224a[i10] + " is present but null: " + obj2);
            }
            b1 b1VarP = p(i10);
            if (!s(i10, obj)) {
                if (t(object)) {
                    Object objD = b1VarP.d();
                    b1VarP.a(objD, object);
                    unsafe.putObject(obj, jV, objD);
                } else {
                    unsafe.putObject(obj, jV, object);
                }
                P(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jV);
            if (!t(object2)) {
                Object objD2 = b1VarP.d();
                b1VarP.a(objD2, object2);
                unsafe.putObject(obj, jV, objD2);
                object2 = objD2;
            }
            b1VarP.a(object2, object);
        }
    }

    public final void y(int i10, Object obj, Object obj2) {
        int[] iArr = this.f4224a;
        int i11 = iArr[i10];
        if (u(i11, i10, obj2)) {
            long jV = V(i10) & 1048575;
            Unsafe unsafe = f4223p;
            Object object = unsafe.getObject(obj2, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            b1 b1VarP = p(i10);
            if (!u(i11, i10, obj)) {
                if (t(object)) {
                    Object objD = b1VarP.d();
                    b1VarP.a(objD, object);
                    unsafe.putObject(obj, jV, objD);
                } else {
                    unsafe.putObject(obj, jV, object);
                }
                Q(i11, i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jV);
            if (!t(object2)) {
                Object objD2 = b1VarP.d();
                b1VarP.a(objD2, object2);
                unsafe.putObject(obj, jV, objD2);
                object2 = objD2;
            }
            b1VarP.a(object2, object);
        }
    }

    public final Object z(int i10, Object obj) {
        b1 b1VarP = p(i10);
        long jV = V(i10) & 1048575;
        if (!s(i10, obj)) {
            return b1VarP.d();
        }
        Object object = f4223p.getObject(obj, jV);
        if (t(object)) {
            return object;
        }
        Object objD = b1VarP.d();
        if (object != null) {
            b1VarP.a(objD, object);
        }
        return objD;
    }
}
