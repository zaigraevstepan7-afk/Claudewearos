package u2;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c1.u6;
import c2.w;
import c2.z0;
import f1.i0;
import f1.m;
import f1.t1;
import fk.g;
import g3.e0;
import g3.j0;
import g3.k0;
import g3.m0;
import g3.o;
import g3.q;
import i2.f;
import i2.h0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import k0.b1;
import k0.s1;
import k0.t0;
import r3.j;
import v0.e;
import v0.q0;
import v0.u0;
import v0.v0;
import v1.l;
import w8.h;
import zg.i;
import zg.n;
import zg.p;
import zg.r;
import zg.u;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static f f16587a;

    /* renamed from: b, reason: collision with root package name */
    public static f f16588b;

    /* renamed from: c, reason: collision with root package name */
    public static f f16589c;

    public static final void a(boolean z2, j jVar, u0 u0Var, i0 i0Var, int i10) {
        int i11;
        s1 s1VarD;
        i0Var.c0(-1344558920);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.g(z2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.d(jVar.ordinal()) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(u0Var) ? 256 : 128;
        }
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            int i12 = i11 & 14;
            boolean zF = (i12 == 4) | i0Var.f(u0Var);
            Object objQ = i0Var.Q();
            f1.f fVar = m.f6385a;
            if (zF || objQ == fVar) {
                objQ = new q0(u0Var, z2);
                i0Var.l0(objQ);
            }
            b1 b1Var = (b1) objQ;
            boolean zH = (i12 == 4) | i0Var.h(u0Var);
            Object objQ2 = i0Var.Q();
            if (zH || objQ2 == fVar) {
                objQ2 = new v0(u0Var, z2);
                i0Var.l0(objQ2);
            }
            v0.m mVar = (v0.m) objQ2;
            boolean zG = m0.g(u0Var.n().f9938b);
            int i13 = (int) (z2 ? u0Var.n().f9938b >> 32 : u0Var.n().f9938b & 4294967295L);
            t0 t0Var = u0Var.f17489d;
            float fE = 0.0f;
            if (t0Var != null && (s1VarD = t0Var.d()) != null) {
                k0 k0Var = s1VarD.f9254a;
                if (i13 >= 0) {
                    j0 j0Var = k0Var.f7128a;
                    o oVar = k0Var.f7129b;
                    if (j0Var.f7117a.f7081b.length() != 0) {
                        int iMin = Math.min(oVar.d(i13), Math.min(oVar.f7155b - 1, oVar.f7159f - 1));
                        if (i13 <= oVar.c(iMin, false)) {
                            oVar.m(iMin);
                            ArrayList arrayList = oVar.f7161h;
                            q qVar = (q) arrayList.get(e0.e(iMin, arrayList));
                            g gVar = qVar.f7166a;
                            int i14 = iMin - qVar.f7169d;
                            h3.j jVar2 = (h3.j) gVar.f6828d;
                            fE = jVar2.e(i14) - jVar2.g(i14);
                        }
                    }
                }
            }
            float f10 = fE;
            boolean zH2 = i0Var.h(b1Var);
            Object objQ3 = i0Var.Q();
            if (zH2 || objQ3 == fVar) {
                objQ3 = new u6(b1Var, 9);
                i0Var.l0(objQ3);
            }
            u3.c.d(mVar, z2, jVar, zG, 0L, f10, p2.k0.a(l.f17564b, b1Var, (PointerInputEventHandler) objQ3), i0Var, (i11 << 3) & 1008);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new e(z2, jVar, u0Var, i10);
        }
    }

    public static byte[] e(ArrayDeque arrayDeque, int i10) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i10 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static long f(n nVar) {
        long length = 8;
        if (!(nVar instanceof i) && !(nVar instanceof zg.o)) {
            if (nVar instanceof zg.a) {
                length = 4;
            } else {
                if (!(nVar instanceof u)) {
                    throw new IllegalArgumentException("Unknown leaf node type: " + nVar.getClass());
                }
                length = ((u) nVar).f20621c.length() + 2;
            }
        }
        if (nVar.f20609a.isEmpty()) {
            return length;
        }
        return f((n) nVar.f20609a) + length + 24;
    }

    public static long g(r rVar) {
        if (rVar.isEmpty()) {
            return 4L;
        }
        if (rVar.n()) {
            return f((n) rVar);
        }
        ug.l.b("Unexpected node type: " + rVar.getClass(), rVar instanceof zg.f);
        Iterator it = rVar.iterator();
        long length = 1;
        while (it.hasNext()) {
            length = length + r5.f20614a.f20592a.length() + 4 + g(((p) it.next()).f20615b);
        }
        if (rVar.c().isEmpty()) {
            return length;
        }
        return f((n) rVar.c()) + length + 12;
    }

    public static final f h() {
        f fVar = f16587a;
        if (fVar != null) {
            return fVar;
        }
        i2.e eVar = new i2.e("Outlined.ArrowBackIosNew", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f8270a;
        z0 z0Var = new z0(w.f3052b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new i2.n(17.77f, 3.77f));
        arrayList.add(new i2.u(-1.77f, -1.77f));
        arrayList.add(new i2.u(-10.0f, 10.0f));
        arrayList.add(new i2.u(10.0f, 10.0f));
        arrayList.add(new i2.u(1.77f, -1.77f));
        arrayList.add(new i2.u(-8.23f, -8.23f));
        arrayList.add(i2.j.f8278c);
        i2.e.a(eVar, arrayList, z0Var);
        f fVarB = eVar.b();
        f16587a = fVarB;
        return fVarB;
    }

    public static int i(Context context, int i10, int i11) {
        Integer numValueOf;
        TypedValue typedValueN = uk.c.N(context, i10);
        if (typedValueN != null) {
            int i12 = typedValueN.resourceId;
            numValueOf = Integer.valueOf(i12 != 0 ? i4.c.getColor(context, i12) : typedValueN.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11;
    }

    public static int j(View view, int i10) {
        Context context = view.getContext();
        TypedValue typedValueO = uk.c.O(view.getContext(), view.getClass().getCanonicalName(), i10);
        int i11 = typedValueO.resourceId;
        return i11 != 0 ? i4.c.getColor(context, i11) : typedValueO.data;
    }

    public static final long k(h hVar) {
        DragEvent dragEvent = (DragEvent) hVar.f18959a;
        float x2 = dragEvent.getX();
        float y2 = dragEvent.getY();
        return (Float.floatToRawIntBits(x2) << 32) | (Float.floatToRawIntBits(y2) & 4294967295L);
    }

    public static boolean l(int i10) {
        if (i10 == 0) {
            return false;
        }
        ThreadLocal threadLocal = l4.a.f9965a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = iRed / 255.0d;
        double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = iGreen / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = iBlue / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d13 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d13;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d13 / 100.0d > 0.5d;
    }

    public static int m(float f10, int i10, int i11) {
        return l4.a.b(l4.a.d(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e2, code lost:
    
        r0 = cg.b.i(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e6, code lost:
    
        uk.c.q(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static z6.e p(e7.a r31, java.lang.String r32) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.b.p(e7.a, java.lang.String):z6.e");
    }

    public static byte[] q(wh.d dVar) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i10);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < iMin2) {
                int i12 = dVar.read(bArr, i11, iMin2 - i11);
                if (i12 == -1) {
                    return e(arrayDeque, i10);
                }
                i11 += i12;
                i10 += i12;
            }
            long j = iMin * (iMin < 4096 ? 4 : 2);
            iMin = j > 2147483647L ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (dVar.read() == -1) {
            return e(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public abstract boolean b(x3.g gVar, x3.c cVar, x3.c cVar2);

    public abstract boolean c(x3.g gVar, Object obj, Object obj2);

    public abstract boolean d(x3.g gVar, x3.f fVar, x3.f fVar2);

    public abstract void n(x3.f fVar, x3.f fVar2);

    public abstract void o(x3.f fVar, Thread thread);
}
