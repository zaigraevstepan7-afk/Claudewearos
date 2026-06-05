package uk;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.SQLException;
import android.graphics.Typeface;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.x0;
import b3.e;
import b6.j;
import c2.w;
import c2.z0;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzcag;
import d.i;
import f1.i0;
import f1.m;
import f1.r1;
import f1.s;
import f1.t1;
import fj.l;
import g.g;
import g0.z;
import i1.k;
import i2.f;
import i2.h0;
import ib.q0;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import qc.l0;
import rc.h;
import t.m1;
import t4.k0;
import u6.v;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class c implements i3.d {

    /* renamed from: a, reason: collision with root package name */
    public static f f17137a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f17138b = false;

    /* renamed from: c, reason: collision with root package name */
    public static Method f17139c;

    public c() {
        new ConcurrentHashMap();
    }

    public static long A(int i10, int i11, int i12, int i13) {
        int i14 = 262142;
        int iMin = Math.min(i12, 262142);
        int iMin2 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        int iMin3 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i13, 262142);
        int i15 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i15 >= 8191) {
            if (i15 < 32767) {
                i14 = 65534;
            } else if (i15 < 65535) {
                i14 = 32766;
            } else {
                if (i15 >= 262143) {
                    s3.b.l(i15);
                    throw new e();
                }
                i14 = 8190;
            }
        }
        if (i11 != Integer.MAX_VALUE) {
            iMin2 = Math.min(i14, i11);
        }
        return s3.b.a(Math.min(i14, i10), iMin2, iMin, iMin3);
    }

    public static long B(int i10, int i11, int i12, int i13) {
        int i14 = 262142;
        int iMin = Math.min(i10, 262142);
        int iMin2 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        int iMin3 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
        int i15 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i15 >= 8191) {
            if (i15 < 32767) {
                i14 = 65534;
            } else if (i15 < 65535) {
                i14 = 32766;
            } else {
                if (i15 >= 262143) {
                    s3.b.l(i15);
                    throw new e();
                }
                i14 = 8190;
            }
        }
        if (i13 != Integer.MAX_VALUE) {
            iMin2 = Math.min(i14, i13);
        }
        return s3.b.a(iMin, iMin3, Math.min(i14, i12), iMin2);
    }

    public static final a7.f C(View view) {
        l.f(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            a7.f fVar = tag instanceof a7.f ? (a7.f) tag : null;
            if (fVar != null) {
                return fVar;
            }
            Object objF = u3.a.f(view);
            view = objF instanceof View ? (View) objF : null;
        }
        return null;
    }

    public static final int D(z zVar) {
        return (int) (zVar.f6998e == o1.f19664a ? zVar.b() & 4294967295L : zVar.b() >> 32);
    }

    public static final f E() {
        f fVar = f17137a;
        if (fVar != null) {
            return fVar;
        }
        i2.e eVar = new i2.e("Rounded.Mic", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f8270a;
        z0 z0Var = new z0(w.f3052b);
        d8.e eVar2 = new d8.e(9);
        eVar2.x(12.0f, 14.0f);
        eVar2.o(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        eVar2.v(15.0f, 5.0f);
        eVar2.o(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        eVar2.C(9.0f, 3.34f, 9.0f, 5.0f);
        eVar2.H(6.0f);
        eVar2.o(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        eVar2.k();
        eVar2.x(17.91f, 11.0f);
        eVar2.o(-0.49f, 0.0f, -0.9f, 0.36f, -0.98f, 0.85f);
        eVar2.n(16.52f, 14.2f, 14.47f, 16.0f, 12.0f, 16.0f);
        eVar2.D(-4.52f, -1.8f, -4.93f, -4.15f);
        eVar2.o(-0.08f, -0.49f, -0.49f, -0.85f, -0.98f, -0.85f);
        eVar2.o(-0.61f, 0.0f, -1.09f, 0.54f, -1.0f, 1.14f);
        eVar2.o(0.49f, 3.0f, 2.89f, 5.35f, 5.91f, 5.78f);
        eVar2.v(11.0f, 20.0f);
        eVar2.o(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        eVar2.D(1.0f, -0.45f, 1.0f, -1.0f);
        eVar2.H(-2.08f);
        eVar2.o(3.02f, -0.43f, 5.42f, -2.78f, 5.91f, -5.78f);
        eVar2.o(0.1f, -0.6f, -0.39f, -1.14f, -1.0f, -1.14f);
        eVar2.k();
        i2.e.a(eVar, (ArrayList) eVar2.f5001a, z0Var);
        f fVarB = eVar.b();
        f17137a = fVarB;
        return fVarB;
    }

    public static final int F(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final void J(k kVar, f1.a aVar, int i10) {
        while (true) {
            int i11 = kVar.f8156v;
            if (i10 > i11 && i10 < kVar.f8155u) {
                return;
            }
            if (i11 == 0 && i10 == 0) {
                return;
            }
            kVar.M();
            if (kVar.y(kVar.f8156v)) {
                aVar.i();
            }
            kVar.j();
        }
    }

    public static final String L(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i10 = reader.read(cArr);
        while (i10 >= 0) {
            stringWriter.write(cArr, 0, i10);
            i10 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        l.e(string, "toString(...)");
        return string;
    }

    public static final d.k M(v vVar, ej.c cVar, i0 i0Var) {
        Object bVar;
        Object obj;
        s.K(vVar, i0Var);
        Object objK = s.K(cVar, i0Var);
        Object[] objArr = new Object[0];
        Object objQ = i0Var.Q();
        Object obj2 = m.f6385a;
        if (objQ == obj2) {
            objQ = new j(18);
            i0Var.l0(objQ);
        }
        Object obj3 = (String) s1.k.c(objArr, (ej.a) objQ, i0Var);
        g gVar = (g) i0Var.j(i.f4334a);
        if (gVar == null) {
            i0Var.b0(1213380307);
            Object baseContext = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof g) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            gVar = (g) baseContext;
        } else {
            i0Var.b0(1213379439);
        }
        i0Var.p(false);
        if (gVar == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        Object objD = gVar.d();
        Object objQ2 = i0Var.Q();
        if (objQ2 == obj2) {
            objQ2 = new d.a();
            i0Var.l0(objQ2);
        }
        d.a aVar = (d.a) objQ2;
        Object objQ3 = i0Var.Q();
        if (objQ3 == obj2) {
            objQ3 = new d.k(aVar);
            i0Var.l0(objQ3);
        }
        d.k kVar = (d.k) objQ3;
        boolean zH = i0Var.h(aVar) | i0Var.h(objD) | i0Var.f(obj3) | i0Var.h(vVar) | i0Var.f(objK);
        Object objQ4 = i0Var.Q();
        if (zH || objQ4 == obj2) {
            obj = vVar;
            bVar = new d.b(aVar, objD, obj3, obj, objK, 0);
            i0Var.l0(bVar);
        } else {
            bVar = objQ4;
            obj = vVar;
        }
        ej.c cVar2 = (ej.c) bVar;
        boolean zF = i0Var.f(objD) | i0Var.f(obj3) | i0Var.f(obj);
        Object objQ5 = i0Var.Q();
        if (zF || objQ5 == obj2) {
            objQ5 = new f1.z(cVar2);
            i0Var.l0(objQ5);
        }
        return kVar;
    }

    public static TypedValue N(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue O(Context context, String str, int i10) {
        TypedValue typedValueN = N(context, i10);
        if (typedValueN != null) {
            return typedValueN;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    public static final void P(View view, a7.f fVar) {
        l.f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(int r6, java.lang.Object r7, k3.y r8, k3.s r9, int r10) {
        /*
            boolean r0 = r7 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r7
        L5:
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            k3.s r0 = r8.f9407b
            boolean r0 = fj.l.b(r0, r9)
            if (r0 != 0) goto L29
            k3.s r0 = k3.s.f9397d
            int r3 = r9.compareTo(r0)
            if (r3 < 0) goto L29
            k3.s r3 = r8.f9407b
            int r3 = r3.f9401a
            int r0 = r0.f9401a
            int r0 = fj.l.h(r3, r0)
            if (r0 >= 0) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            r3 = 2
            r6 = r6 & r3
            if (r6 == 0) goto L36
            r8.getClass()
            if (r10 != 0) goto L34
            goto L36
        L34:
            r6 = r2
            goto L37
        L36:
            r6 = r1
        L37:
            if (r6 != 0) goto L3c
            if (r0 != 0) goto L3c
            return r7
        L3c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L5d
            if (r6 == 0) goto L48
            if (r10 != r2) goto L48
            r6 = r2
            goto L49
        L48:
            r6 = r1
        L49:
            if (r6 == 0) goto L4f
            if (r0 == 0) goto L4f
            r1 = 3
            goto L56
        L4f:
            if (r0 == 0) goto L53
            r1 = r2
            goto L56
        L53:
            if (r6 == 0) goto L56
            r1 = r3
        L56:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r7, r1)
            return r6
        L5d:
            if (r0 == 0) goto L62
            int r9 = r9.f9401a
            goto L66
        L62:
            k3.s r9 = r8.f9407b
            int r9 = r9.f9401a
        L66:
            if (r6 == 0) goto L6c
            if (r10 != r2) goto L6f
            r1 = r2
            goto L6f
        L6c:
            r8.getClass()
        L6f:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = bf.e.h(r7, r9, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.c.Q(int, java.lang.Object, k3.y, k3.s, int):java.lang.Object");
    }

    public static final void R(Object obj) {
        if (obj instanceof pi.j) {
            throw ((pi.j) obj).f13002a;
        }
    }

    public static final void S(int i10, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i10);
        if (str != null) {
            sb2.append(", message: ".concat(str));
        }
        throw new SQLException(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final n8.a T(n8.a r10, r8.g r11, r8.n r12, h8.f r13, vi.c r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.c.T(n8.a, r8.g, r8.n, h8.f, vi.c):n8.a");
    }

    public static void U(Parcel parcel, int i10, Bundle bundle, boolean z2) {
        if (bundle == null) {
            if (z2) {
                k0(parcel, i10, 0);
            }
        } else {
            int iH0 = h0(i10, parcel);
            parcel.writeBundle(bundle);
            j0(iH0, parcel);
        }
    }

    public static void V(Parcel parcel, int i10, byte[] bArr, boolean z2) {
        if (bArr == null) {
            if (z2) {
                k0(parcel, i10, 0);
            }
        } else {
            int iH0 = h0(i10, parcel);
            parcel.writeByteArray(bArr);
            j0(iH0, parcel);
        }
    }

    public static void W(Parcel parcel, int i10, Double d10) {
        if (d10 == null) {
            return;
        }
        k0(parcel, i10, 8);
        parcel.writeDouble(d10.doubleValue());
    }

    public static void X(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iH0 = h0(i10, parcel);
        parcel.writeStrongBinder(iBinder);
        j0(iH0, parcel);
    }

    public static void Y(Parcel parcel, int i10, int[] iArr, boolean z2) {
        if (iArr == null) {
            if (z2) {
                k0(parcel, i10, 0);
            }
        } else {
            int iH0 = h0(i10, parcel);
            parcel.writeIntArray(iArr);
            j0(iH0, parcel);
        }
    }

    public static void Z(Parcel parcel, int i10, Integer num) {
        if (num == null) {
            return;
        }
        k0(parcel, i10, 4);
        parcel.writeInt(num.intValue());
    }

    public static void a0(Parcel parcel, int i10, Long l10) {
        if (l10 == null) {
            return;
        }
        k0(parcel, i10, 8);
        parcel.writeLong(l10.longValue());
    }

    public static void b0(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z2) {
        if (parcelable == null) {
            if (z2) {
                k0(parcel, i10, 0);
            }
        } else {
            int iH0 = h0(i10, parcel);
            parcelable.writeToParcel(parcel, i11);
            j0(iH0, parcel);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final v1.o r29, final java.util.List r30, final mi.p r31, final boolean r32, c2.w0 r33, java.util.Set r34, ej.c r35, final ej.e r36, f1.i0 r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.c.c(v1.o, java.util.List, mi.p, boolean, c2.w0, java.util.Set, ej.c, ej.e, f1.i0, int, int):void");
    }

    public static void c0(Parcel parcel, int i10, String str, boolean z2) {
        if (str == null) {
            if (z2) {
                k0(parcel, i10, 0);
            }
        } else {
            int iH0 = h0(i10, parcel);
            parcel.writeString(str);
            j0(iH0, parcel);
        }
    }

    public static void d0(Parcel parcel, int i10, String[] strArr, boolean z2) {
        if (strArr == null) {
            if (z2) {
                k0(parcel, i10, 0);
            }
        } else {
            int iH0 = h0(i10, parcel);
            parcel.writeStringArray(strArr);
            j0(iH0, parcel);
        }
    }

    public static void e0(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iH0 = h0(i10, parcel);
        parcel.writeStringList(list);
        j0(iH0, parcel);
    }

    public static final void f(float f10, q0 q0Var, float f11, boolean z2, boolean z10, lb.b bVar, p1.e eVar, i0 i0Var, int i10) {
        p1.e eVar2;
        i0Var.c0(216350405);
        int i11 = i10 | (i0Var.c(f10) ? 4 : 2) | (i0Var.f(q0Var) ? 32 : 16) | (i0Var.c(f11) ? 256 : 128) | (i0Var.g(z2) ? 2048 : 1024) | (i0Var.g(z10) ? 16384 : 8192) | (i0Var.d(bVar.ordinal()) ? 131072 : 65536);
        if (i0Var.T(i11 & 1, (599187 & i11) != 599186)) {
            eVar2 = eVar;
            s.b(new r1[]{jb.f.f8821a.a(new s3.f(f10)), jb.f.f8822b.a(q0Var), jb.f.f8823c.a(Float.valueOf(f11)), jb.f.f8824d.a(Boolean.valueOf(z2)), jb.f.f8825e.a(Boolean.valueOf(z10)), jb.f.f8826f.a(bVar)}, eVar2, i0Var, 56);
        } else {
            eVar2 = eVar;
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new jb.g(f10, q0Var, f11, z2, z10, bVar, eVar2, i10);
        }
    }

    public static void f0(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int iH0 = h0(i10, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i11);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        j0(iH0, parcel);
    }

    public static final b2.c g(long j, long j4) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        return new b2.c(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j4 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j4 & 4294967295L)) + Float.intBitsToFloat(i11));
    }

    public static void g0(Parcel parcel, int i10, List list, boolean z2) {
        if (list == null) {
            if (z2) {
                k0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iH0 = h0(i10, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        j0(iH0, parcel);
    }

    public static String h(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strK;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                strK = "null";
            } else {
                try {
                    strK = obj.toString();
                } catch (Exception e10) {
                    String strW = m1.w(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strW), (Throwable) e10);
                    strK = m1.k("<", strW, " threw ", e10.getClass().getName(), ">");
                }
            }
            objArr[i11] = strK;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i10++;
            i12 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static int h0(int i10, Parcel parcel) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final Object[] i(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        qi.k.k0(objArr, 0, objArr2, i10, 6);
        qi.k.i0(objArr, i10 + 2, objArr2, i10, objArr.length);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    public static void i0(Context context) {
        boolean z2;
        Object obj = h.f14340b;
        if (((Boolean) zzbey.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (h.f14340b) {
                        z2 = h.f14341c;
                    }
                    if (z2) {
                        return;
                    }
                    mf.a aVarZzb = new pc.h(context).zzb();
                    int i10 = l0.f13401b;
                    rc.k.f("Updating ad debug logging enablement.");
                    zzcag.zza(aVarZzb, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e10) {
                rc.k.h("Fail to determine debug setting.", e10);
            }
        }
    }

    public static final Object[] j(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        qi.k.k0(objArr, 0, objArr2, i10, 6);
        qi.k.i0(objArr, i10, objArr2, i10 + 2, objArr.length);
        return objArr2;
    }

    public static void j0(int i10, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    public static final Object[] k(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        qi.k.k0(objArr, 0, objArr2, i10, 6);
        qi.k.i0(objArr, i10, objArr2, i10 + 1, objArr.length);
        return objArr2;
    }

    public static void k0(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    public static void l(long j, kk.f fVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
        int i13;
        int i14;
        ArrayList arrayList3;
        long j4;
        int i15;
        int i16 = i10;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i11 >= i12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i17 = i11; i17 < i12; i17++) {
            if (((kk.i) arrayList4.get(i17)).e() < i16) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        kk.i iVar = (kk.i) arrayList.get(i11);
        kk.i iVar2 = (kk.i) arrayList4.get(i12 - 1);
        if (i16 == iVar.e()) {
            int iIntValue = ((Number) arrayList5.get(i11)).intValue();
            int i18 = i11 + 1;
            kk.i iVar3 = (kk.i) arrayList4.get(i18);
            i13 = i18;
            i14 = iIntValue;
            iVar = iVar3;
        } else {
            i13 = i11;
            i14 = -1;
        }
        if (iVar.r(i16) == iVar2.r(i16)) {
            int iMin = Math.min(iVar.e(), iVar2.e());
            int i19 = 0;
            for (int i20 = i16; i20 < iMin && iVar.r(i20) == iVar2.r(i20); i20++) {
                i19++;
            }
            long j10 = 4;
            long j11 = (fVar.f9695b / j10) + j + 2 + i19 + 1;
            fVar.e0(-i19);
            fVar.e0(i14);
            int i21 = i16 + i19;
            while (i16 < i21) {
                fVar.e0(iVar.r(i16) & 255);
                i16++;
            }
            if (i13 + 1 == i12) {
                if (i21 != ((kk.i) arrayList4.get(i13)).e()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.e0(((Number) arrayList5.get(i13)).intValue());
                return;
            } else {
                kk.f fVar2 = new kk.f();
                fVar.e0(((int) ((fVar2.f9695b / j10) + j11)) * (-1));
                l(j11, fVar2, i21, arrayList4, i13, i12, arrayList5);
                fVar.V(fVar2);
                return;
            }
        }
        int i22 = 1;
        for (int i23 = i13 + 1; i23 < i12; i23++) {
            if (((kk.i) arrayList4.get(i23 - 1)).r(i16) != ((kk.i) arrayList4.get(i23)).r(i16)) {
                i22++;
            }
        }
        long j12 = 4;
        long j13 = (fVar.f9695b / j12) + j + 2 + (i22 * 2);
        fVar.e0(i22);
        fVar.e0(i14);
        for (int i24 = i13; i24 < i12; i24++) {
            int iR = ((kk.i) arrayList4.get(i24)).r(i16);
            if (i24 == i13 || iR != ((kk.i) arrayList4.get(i24 - 1)).r(i16)) {
                fVar.e0(iR & 255);
            }
        }
        kk.f fVar3 = new kk.f();
        int i25 = i13;
        while (i25 < i12) {
            byte bR = ((kk.i) arrayList4.get(i25)).r(i16);
            int i26 = i25 + 1;
            int i27 = i26;
            while (true) {
                if (i27 >= i12) {
                    i27 = i12;
                    break;
                } else if (bR != ((kk.i) arrayList4.get(i27)).r(i16)) {
                    break;
                } else {
                    i27++;
                }
            }
            if (i26 == i27 && i16 + 1 == ((kk.i) arrayList4.get(i25)).e()) {
                fVar.e0(((Number) arrayList5.get(i25)).intValue());
                arrayList3 = arrayList5;
                j4 = j13;
                i15 = i27;
            } else {
                fVar.e0(((int) ((fVar3.f9695b / j12) + j13)) * (-1));
                arrayList3 = arrayList5;
                j4 = j13;
                i15 = i27;
                l(j4, fVar3, i16 + 1, arrayList, i25, i15, arrayList3);
                arrayList4 = arrayList;
            }
            j13 = j4;
            i25 = i15;
            arrayList5 = arrayList3;
        }
        fVar.V(fVar3);
    }

    public static final Bundle m(pi.h... hVarArr) {
        Bundle bundle = new Bundle(hVarArr.length);
        for (pi.h hVar : hVarArr) {
            String str = (String) hVar.f13000a;
            Object obj = hVar.f13001b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                l.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void n(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void o(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void q(AutoCloseable autoCloseable, Throwable th2) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th2 != null) {
                try {
                    m6.a.p(autoCloseable);
                    return;
                } catch (Throwable th3) {
                    mk.b.i(th2, th3);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) autoCloseable).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z2 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z2) {
                        executorService.shutdownNow();
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final pi.j r(Throwable th2) {
        l.f(th2, "exception");
        return new pi.j(th2);
    }

    public static x0 w(Class cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                l.c(objNewInstance);
                return (x0) objNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }

    public static boolean x(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        Field field = t4.l0.f15744a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = k0.f15740d;
        k0 k0Var = (k0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (k0Var == null) {
            k0Var = new k0();
            k0Var.f15741a = null;
            k0Var.f15742b = null;
            k0Var.f15743c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, k0Var);
        }
        WeakReference weakReference2 = k0Var.f15743c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        k0Var.f15743c = new WeakReference(keyEvent);
        if (k0Var.f15742b == null) {
            k0Var.f15742b = new SparseArray();
        }
        SparseArray sparseArray = k0Var.f15742b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static final void y(e7.a aVar, String str) throws Exception {
        l.f(aVar, "<this>");
        l.f(str, "sql");
        e7.c cVarD0 = aVar.d0(str);
        try {
            cVarD0.a0();
            q(cVarD0, null);
        } finally {
        }
    }

    public abstract int G(int i10);

    public abstract void H(Throwable th2);

    public abstract void I(a8.j jVar);

    public abstract int K(int i10);

    @Override // i3.d
    public int a(int i10) {
        int iG = G(i10);
        if (iG == -1 || G(iG) == -1) {
            return -1;
        }
        return iG;
    }

    @Override // i3.d
    public int b(int i10) {
        int iK = K(i10);
        if (iK == -1 || K(iK) == -1) {
            return -1;
        }
        return iK;
    }

    @Override // i3.d
    public int d(int i10) {
        return K(i10);
    }

    @Override // i3.d
    public int e(int i10) {
        return G(i10);
    }

    public abstract Typeface s(Context context, k4.f fVar, Resources resources, int i10);

    public abstract Typeface t(Context context, q4.h[] hVarArr, int i10);

    public Typeface u(Context context, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface v(Context context, Resources resources, int i10, String str, int i11) {
        File fileE = wd.a.E(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (wd.a.s(fileE, resources, i10)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public q4.h z(q4.h[] hVarArr, int i10) {
        new p9.a(7);
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z2 = (i10 & 2) != 0;
        q4.h hVar = null;
        int i12 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (q4.h hVar2 : hVarArr) {
            int iAbs = (Math.abs(hVar2.f13228c - i11) * 2) + (hVar2.f13229d == z2 ? 0 : 1);
            if (hVar == null || i12 > iAbs) {
                hVar = hVar2;
                i12 = iAbs;
            }
        }
        return hVar;
    }
}
