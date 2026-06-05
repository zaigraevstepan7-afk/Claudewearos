package u6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import b0.k1;
import com.google.android.gms.internal.ads.zzbul;
import f1.t1;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import m.m1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q.o0;
import t.u0;
import v.l1;
import w2.f1;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class v {

    /* renamed from: a, reason: collision with root package name */
    public static i2.f f16797a;

    public static String A(int i10, int i11, String str) {
        if (i10 < 0) {
            return uk.c.h("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return uk.c.h("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(m6.a.d(i11, "negative size: "));
    }

    public static final void C(e2.d dVar, f2.b bVar) {
        boolean z2;
        boolean z10;
        Canvas canvas;
        boolean z11;
        float f10;
        c2.u uVarH = dVar.C0().h();
        f2.b bVar2 = (f2.b) dVar.C0().f374c;
        f2.d dVar2 = bVar.f6514a;
        if (bVar.f6531s) {
            return;
        }
        bVar.a();
        if (!dVar2.C()) {
            try {
                bVar.f6514a.J(bVar.f6515b, bVar.f6516c, bVar, bVar.f6518e);
            } catch (Throwable unused) {
            }
        }
        boolean z12 = dVar2.P() > 0.0f;
        if (z12) {
            uVarH.t();
        }
        Canvas canvasA = c2.c.a(uVarH);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = bVar.f6532t;
            float f11 = (int) (j >> 32);
            float f12 = (int) (j & 4294967295L);
            long j4 = bVar.f6533u;
            float f13 = ((int) (j4 >> 32)) + f11;
            float f14 = ((int) (j4 & 4294967295L)) + f12;
            float fE = dVar2.e();
            c2.n nVarA = dVar2.A();
            int iF = dVar2.f();
            if (fE < 1.0f || iF != 3 || nVarA != null || dVar2.z() == 1) {
                c2.h hVarG = bVar.f6528p;
                if (hVarG == null) {
                    hVarG = c2.e0.g();
                    bVar.f6528p = hVarG;
                }
                hVarG.c(fE);
                hVarG.d(iF);
                hVarG.f(nVarA);
                canvasA = canvasA;
                f10 = f11;
                canvasA.saveLayer(f10, f12, f13, f14, c2.e0.p(hVarG));
            } else {
                canvasA.save();
                canvasA = canvasA;
                f10 = f11;
            }
            canvasA.translate(f10, f12);
            canvasA.concat(dVar2.O());
        }
        boolean z13 = !zIsHardwareAccelerated && bVar.f6535w;
        if (z13) {
            uVarH.f();
            c2.e0 e0VarD = bVar.d();
            if (e0VarD instanceof c2.m0) {
                c2.u.d(uVarH, ((c2.m0) e0VarD).f3018f);
            } else if (e0VarD instanceof c2.n0) {
                c2.j jVarA = bVar.f6525m;
                if (jVarA != null) {
                    jVarA.k();
                } else {
                    jVarA = c2.l.a();
                    bVar.f6525m = jVarA;
                }
                c2.j.c(jVarA, ((c2.n0) e0VarD).f3022f);
                uVarH.m(jVarA);
            } else {
                if (!(e0VarD instanceof c2.l0)) {
                    throw new b3.e();
                }
                uVarH.m(((c2.l0) e0VarD).f3016f);
            }
        }
        if (bVar2 != null) {
            b1.i iVar = bVar2.f6530r;
            if (!iVar.f1487a) {
                c2.i0.a("Only add dependencies during a tracking");
            }
            q.h0 h0Var = (q.h0) iVar.f1490d;
            if (h0Var != null) {
                h0Var.a(bVar);
            } else if (((f2.b) iVar.f1488b) != null) {
                q.h0 h0Var2 = o0.f13110a;
                q.h0 h0Var3 = new q.h0();
                f2.b bVar3 = (f2.b) iVar.f1488b;
                fj.l.c(bVar3);
                h0Var3.a(bVar3);
                h0Var3.a(bVar);
                iVar.f1490d = h0Var3;
                iVar.f1488b = null;
            } else {
                iVar.f1488b = bVar;
            }
            q.h0 h0Var4 = (q.h0) iVar.f1491e;
            if (h0Var4 != null) {
                z11 = !h0Var4.l(bVar);
            } else if (((f2.b) iVar.f1489c) != bVar) {
                z11 = true;
            } else {
                iVar.f1489c = null;
                z11 = false;
            }
            if (z11) {
                bVar.f6529q++;
            }
        }
        if (c2.c.a(uVarH).isHardwareAccelerated()) {
            z2 = z12;
            z10 = z13;
            canvas = canvasA;
            dVar2.G(uVarH);
        } else {
            e2.b bVar4 = bVar.f6527o;
            if (bVar4 == null) {
                bVar4 = new e2.b();
                bVar.f6527o = bVar4;
            }
            ac.d dVar3 = bVar4.f5738b;
            s3.c cVar = bVar.f6515b;
            s3.m mVar = bVar.f6516c;
            long jS = cg.b.S(bVar.f6533u);
            s3.c cVarK = dVar3.k();
            s3.m mVarS = dVar3.s();
            c2.u uVarH2 = dVar3.h();
            z10 = z13;
            canvas = canvasA;
            long jY = dVar3.y();
            z2 = z12;
            f2.b bVar5 = (f2.b) dVar3.f374c;
            dVar3.O(cVar);
            dVar3.P(mVar);
            dVar3.N(uVarH);
            dVar3.Q(jS);
            dVar3.f374c = bVar;
            uVarH.f();
            try {
                bVar.c(bVar4);
            } finally {
                uVarH.q();
                dVar3.O(cVarK);
                dVar3.P(mVarS);
                dVar3.N(uVarH2);
                dVar3.Q(jY);
                dVar3.f374c = bVar5;
            }
        }
        if (z10) {
            uVarH.q();
        }
        if (z2) {
            uVarH.g();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    public static void F(int i10, Parcel parcel) {
        if (parcel.dataPosition() != i10) {
            throw new b3.e(m6.a.d(i10, "Overread allowed size end="), parcel);
        }
    }

    public static Drawable G(Context context, int i10) {
        return m1.b().c(context, i10);
    }

    public static Object H(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return p4.b.a(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (g.a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final Bundle I(Bundle bundle, String str) {
        fj.l.f(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(t.m1.j("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static int K(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(m6.a.e(i10, "Could not convert ", " to BackoffPolicy"));
    }

    public static int L(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 4;
        }
        if (i10 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i10 != 5) {
            throw new IllegalArgumentException(m6.a.e(i10, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static int M(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(m6.a.e(i10, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static int N(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 4;
        }
        if (i10 == 4) {
            return 5;
        }
        if (i10 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(m6.a.e(i10, "Could not convert ", " to State"));
    }

    public static pi.e P(pi.f fVar, ej.a aVar) {
        pi.n nVar = pi.n.f13010a;
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            return new pi.m(aVar);
        }
        if (iOrdinal == 1) {
            pi.l lVar = new pi.l();
            lVar.f13005a = aVar;
            lVar.f13006b = nVar;
            return lVar;
        }
        if (iOrdinal != 2) {
            throw new b3.e();
        }
        pi.p pVar = new pi.p();
        pVar.f13012a = aVar;
        pVar.f13013b = nVar;
        return pVar;
    }

    public static pi.m Q(ej.a aVar) {
        fj.l.f(aVar, "initializer");
        return new pi.m(aVar);
    }

    public static void R(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static boolean U(int i10, Parcel parcel) {
        o0(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Double V(int i10, Parcel parcel) {
        int iD0 = d0(i10, parcel);
        if (iD0 == 0) {
            return null;
        }
        n0(parcel, iD0, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float W(int i10, Parcel parcel) {
        o0(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static IBinder X(int i10, Parcel parcel) {
        int iD0 = d0(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iD0 == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iD0);
        return strongBinder;
    }

    public static final ri.g Y(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ri.g gVar = new ri.g();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2 && fj.l.b(xmlPullParser.getName(), "item")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "component");
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "drawable");
                String strX0 = attributeValue != null ? nj.e.X0(nj.e.V0(attributeValue, "ComponentInfo{", attributeValue), "/") : null;
                if (strX0 != null && !nj.e.K0(strX0) && attributeValue2 != null && !nj.e.K0(attributeValue2)) {
                    gVar.put(strX0, attributeValue2);
                }
            }
            eventType = xmlPullParser.next();
        }
        return gVar.b();
    }

    public static int Z(int i10, Parcel parcel) {
        o0(parcel, i10, 4);
        return parcel.readInt();
    }

    public static sj.c a(int i10, int i11, sj.a aVar) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = sj.a.f15039a;
        }
        if (i10 == -2) {
            if (aVar != sj.a.f15039a) {
                return new sj.n(1, aVar);
            }
            sj.g.f15073q.getClass();
            return new sj.c(sj.f.f15072b);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? aVar == sj.a.f15039a ? new sj.c(i10) : new sj.n(i10, aVar) : new sj.c(com.google.android.gms.common.api.f.API_PRIORITY_OTHER) : aVar == sj.a.f15039a ? new sj.c(0) : new sj.n(1, aVar);
        }
        if (aVar == sj.a.f15039a) {
            return new sj.n(1, sj.a.f15040b);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static Integer a0(int i10, Parcel parcel) {
        int iD0 = d0(i10, parcel);
        if (iD0 == 0) {
            return null;
        }
        n0(parcel, iD0, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static final s3.e b(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        t3.a aVarA = t3.b.a(f10);
        if (aVarA == null) {
            aVarA = new s3.n(f10);
        }
        return new s3.e(f11, f10, aVarA);
    }

    public static long b0(int i10, Parcel parcel) {
        o0(parcel, i10, 8);
        return parcel.readLong();
    }

    public static k3.y c(int i10, k3.s sVar, int i11) {
        if ((i11 & 2) != 0) {
            sVar = k3.s.f9399f;
        }
        return new k3.y(i10, sVar, new k3.r(new k3.q[0]));
    }

    public static Long c0(int i10, Parcel parcel) {
        int iD0 = d0(i10, parcel);
        if (iD0 == 0) {
            return null;
        }
        n0(parcel, iD0, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static final void d(v1.o oVar, ej.a aVar, ej.a aVar2, p1.e eVar, f1.i0 i0Var, int i10) {
        fj.l.f(aVar, "canOverscrollStart");
        fj.l.f(aVar2, "canOverscrollEnd");
        i0Var.c0(858722781);
        int i11 = i10 | (i0Var.h(aVar) ? 32 : 16) | (i0Var.h(aVar2) ? 256 : 128);
        if (i0Var.T(i11 & 1, (i11 & 1171) != 1170)) {
            k2.a aVar3 = (k2.a) i0Var.j(f1.f18265l);
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = f1.s.o(i0Var);
                i0Var.l0(objQ);
            }
            qj.z zVar = (qj.z) objQ;
            Object objQ2 = i0Var.Q();
            if (objQ2 == obj) {
                objQ2 = t.d.a(0.0f, 0.01f);
                i0Var.l0(objQ2);
            }
            t.c cVar = (t.c) objQ2;
            Object objQ3 = i0Var.Q();
            if (objQ3 == obj) {
                objQ3 = y8.f.a(0.0f, i0Var);
            }
            f1.f1 f1Var = (f1.f1) objQ3;
            Object objQ4 = i0Var.Q();
            if (objQ4 == obj) {
                objQ4 = y8.f.a(1.0f, i0Var);
            }
            f1.f1 f1Var2 = (f1.f1) objQ4;
            Object objQ5 = i0Var.Q();
            if (objQ5 == obj) {
                objQ5 = new t.s(0.5f, 0.5f, 1.0f, 0.25f);
                i0Var.l0(objQ5);
            }
            t.s sVar = (t.s) objQ5;
            Object objQ6 = i0Var.Q();
            if (objQ6 == obj) {
                objQ6 = t.d.s(0.0f, 200.0f, null, 5);
                i0Var.l0(objQ6);
            }
            u0 u0Var = (u0) objQ6;
            s3.c cVar2 = (s3.c) i0Var.j(f1.f18262h);
            boolean zF = i0Var.f(cVar2);
            Object objQ7 = i0Var.Q();
            if (zF || objQ7 == obj) {
                objQ7 = Float.valueOf(cVar2.w0(250));
                i0Var.l0(objQ7);
            }
            float fFloatValue = ((Number) objQ7).floatValue();
            boolean zH = i0Var.h(cVar);
            Object objQ8 = i0Var.Q();
            if (zH || objQ8 == obj) {
                objQ8 = new bb.f(cVar, sVar, f1Var2, f1Var, null, 0);
                i0Var.l0(objQ8);
            }
            f1.s.f((ej.e) objQ8, i0Var, pi.o.f13011a);
            boolean zF2 = ((i11 & 112) == 32) | i0Var.f(zVar) | i0Var.c(fFloatValue) | ((i11 & 896) == 256);
            Object objQ9 = i0Var.Q();
            if (zF2 || objQ9 == obj) {
                Object lVar = new bb.l(fFloatValue, cVar, aVar, aVar2, zVar, u0Var, aVar3);
                i0Var.l0(lVar);
                objQ9 = lVar;
            }
            f1.s.a(l1.f17243a.a(null), p1.j.d(-299141859, new bb.a(eVar, oVar, (bb.l) objQ9, f1Var2, f1Var, 1), i0Var), i0Var, 56);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new bb.c(oVar, aVar, aVar2, eVar, i10);
        }
    }

    public static int d0(int i10, Parcel parcel) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static final void e(final g0.h0 h0Var, final v1.o oVar, final k1 k1Var, final g0.l lVar, final int i10, final float f10, v1.f fVar, y.g gVar, boolean z2, o2.a aVar, y.m mVar, v.i iVar, final p1.e eVar, f1.i0 i0Var, final int i11, final int i12, final int i13) {
        int i14;
        v1.o oVar2;
        k1 k1Var2;
        g0.l lVar2;
        int i15;
        float f11;
        v1.f fVar2;
        y.g gVar2;
        boolean z10;
        final o2.a aVar2;
        final y.m mVar2;
        final v.i iVar2;
        final v1.f fVar3;
        final y.g gVar3;
        final boolean z11;
        y.g gVarR;
        int i16;
        int i17;
        o2.a aVar3;
        int i18;
        boolean z12;
        v.i iVarA;
        y.g gVar4;
        i0Var.c0(1860873769);
        if ((i11 & 6) == 0) {
            i14 = (i0Var.f(h0Var) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            oVar2 = oVar;
            i14 |= i0Var.f(oVar2) ? 32 : 16;
        } else {
            oVar2 = oVar;
        }
        if ((i11 & 384) == 0) {
            k1Var2 = k1Var;
            i14 |= i0Var.f(k1Var2) ? 256 : 128;
        } else {
            k1Var2 = k1Var;
        }
        if ((i11 & 3072) == 0) {
            lVar2 = lVar;
            i14 |= i0Var.f(lVar2) ? 2048 : 1024;
        } else {
            lVar2 = lVar;
        }
        if ((i11 & 24576) == 0) {
            i15 = i10;
            i14 |= i0Var.d(i15) ? 16384 : 8192;
        } else {
            i15 = i10;
        }
        if ((i11 & 196608) == 0) {
            f11 = f10;
            i14 |= i0Var.c(f11) ? 131072 : 65536;
        } else {
            f11 = f10;
        }
        int i19 = i13 & 64;
        if (i19 != 0) {
            i14 |= 1572864;
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            if ((i11 & 1572864) == 0) {
                i14 |= i0Var.f(fVar2) ? 1048576 : 524288;
            }
        }
        if ((i11 & 12582912) == 0) {
            if ((i13 & 128) == 0) {
                gVar2 = gVar;
                int i20 = i0Var.f(gVar2) ? 8388608 : 4194304;
                i14 |= i20;
            } else {
                gVar2 = gVar;
            }
            i14 |= i20;
        } else {
            gVar2 = gVar;
        }
        int i21 = i13 & 256;
        if (i21 != 0) {
            i14 |= 100663296;
            z10 = z2;
        } else {
            z10 = z2;
            if ((i11 & 100663296) == 0) {
                i14 |= i0Var.g(z10) ? 67108864 : 33554432;
            }
        }
        int i22 = i14 | 805306368;
        int i23 = i12 | 22;
        int i24 = i13 & 4096;
        if (i24 != 0) {
            i23 = 24982;
        } else if ((i12 & 384) == 0) {
            i23 |= i0Var.f(mVar) ? 256 : 128;
        }
        int i25 = i23 | 1024;
        boolean z13 = true;
        if (i0Var.T(i22 & 1, ((306783379 & i22) == 306783378 && (i25 & 9363) == 9362) ? false : true)) {
            i0Var.Y();
            if ((i11 & 1) == 0 || i0Var.C()) {
                v1.f fVar4 = i19 != 0 ? v1.b.D : fVar2;
                if ((i13 & 128) != 0) {
                    gVarR = mk.b.r(h0Var, i0Var, (i22 & 14) | 196608, 30);
                    i16 = i22 & (-29360129);
                } else {
                    gVarR = gVar2;
                    i16 = i22;
                }
                if (i21 != 0) {
                    z10 = true;
                }
                o1 o1Var = o1.f19664a;
                int i26 = (i16 & 14) | 432;
                v1.f fVar5 = fVar4;
                if ((((i26 & 14) ^ 6) <= 4 || !i0Var.f(h0Var)) && (i26 & 6) != 4) {
                    z13 = false;
                }
                Object objQ = i0Var.Q();
                if (z13 || objQ == f1.m.f6385a) {
                    objQ = new g0.a(h0Var);
                    i0Var.l0(objQ);
                }
                g0.a aVar4 = (g0.a) objQ;
                i17 = i25 & (-7281);
                y.m mVar3 = i24 != 0 ? y.l.f20153c : mVar;
                aVar3 = aVar4;
                i18 = i16;
                z12 = z10;
                iVarA = v.m1.a(i0Var);
                mVar2 = mVar3;
                gVar4 = gVarR;
                fVar2 = fVar5;
            } else {
                i0Var.W();
                i17 = i25 & (-7281);
                mVar2 = mVar;
                i18 = (i13 & 128) != 0 ? i22 & (-29360129) : i22;
                z12 = z10;
                gVar4 = gVar2;
                aVar3 = aVar;
                iVarA = iVar;
            }
            i0Var.q();
            o1 o1Var2 = o1.f19664a;
            int i27 = i17;
            int i28 = i18 >> 6;
            int i29 = i18 << 12;
            int i30 = (i18 & 896) | ((i18 >> 3) & 14) | 24576 | ((i18 << 3) & 112) | ((i18 >> 18) & 7168) | (i28 & 458752) | (i28 & 3670016) | (i29 & 234881024) | (i29 & 1879048192);
            int i31 = ((i18 >> 9) & 14) | 3456 | (i28 & 57344) | ((i27 << 9) & 458752) | 1572864;
            g0.l lVar3 = lVar2;
            v1.f fVar6 = fVar2;
            hj.a.e(oVar2, h0Var, k1Var2, gVar4, z12, iVarA, i15, f11, lVar3, aVar3, fVar6, mVar2, eVar, i0Var, i30, i31);
            gVar3 = gVar4;
            iVar2 = iVarA;
            fVar3 = fVar6;
            aVar2 = aVar3;
            z11 = z12;
        } else {
            i0Var.W();
            aVar2 = aVar;
            mVar2 = mVar;
            iVar2 = iVar;
            fVar3 = fVar2;
            gVar3 = gVar2;
            z11 = z10;
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: g0.s
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(i11 | 1);
                    int iO2 = f1.s.O(i12);
                    u6.v.e(h0Var, oVar, k1Var, lVar, i10, f10, fVar3, gVar3, z11, aVar2, mVar2, iVar2, eVar, (f1.i0) obj, iO, iO2, i13);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final kk.c e0(Socket socket) throws IOException {
        fj.l.f(socket, "<this>");
        lk.g gVar = new lk.g(socket);
        OutputStream outputStream = socket.getOutputStream();
        fj.l.e(outputStream, "getOutputStream(...)");
        return new kk.c(0, gVar, new kk.c(1, outputStream, gVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(v1.o r20, ej.c r21, p1.e r22, f1.i0 r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.v.f(v1.o, ej.c, p1.e, f1.i0, int, int):void");
    }

    public static void f0(int i10, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + d0(i10, parcel));
    }

    public static void g(int i10, int i11) {
        String strH;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strH = uk.c.h("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(m6.a.d(i11, "negative size: "));
                }
                strH = uk.c.h("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strH);
        }
    }

    public static final kk.d g0(InputStream inputStream) {
        fj.l.f(inputStream, "<this>");
        return new kk.d(inputStream, new kk.e0());
    }

    public static final String h(u9.e eVar) {
        if (eVar instanceof u9.c) {
            return ((u9.c) eVar).f16873a;
        }
        if (eVar instanceof u9.d) {
            return "com.anonlab.voidlauncher.".concat(((u9.d) eVar).f16874a);
        }
        throw new b3.e();
    }

    public static final kk.d h0(Socket socket) throws IOException {
        fj.l.f(socket, "<this>");
        lk.g gVar = new lk.g(socket);
        InputStream inputStream = socket.getInputStream();
        fj.l.e(inputStream, "getInputStream(...)");
        return new kk.d(gVar, new kk.d(inputStream, gVar));
    }

    public static final kk.v i(kk.b0 b0Var) {
        fj.l.f(b0Var, "<this>");
        return new kk.v(b0Var);
    }

    public static int i0(int i10) {
        int iB = y3.e.b(i10);
        if (iB == 0) {
            return 0;
        }
        int i11 = 1;
        if (iB != 1) {
            i11 = 2;
            if (iB != 2) {
                i11 = 3;
                if (iB != 3) {
                    i11 = 4;
                    if (iB != 4) {
                        if (iB == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + t.m1.y(i10) + " to int");
                    }
                }
            }
        }
        return i11;
    }

    public static final kk.x j(kk.c0 c0Var) {
        fj.l.f(c0Var, "<this>");
        return new kk.x(c0Var);
    }

    public static final String j0(float f10) {
        if (Float.isNaN(f10)) {
            return "NaN";
        }
        if (Float.isInfinite(f10)) {
            return f10 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f11 = f10 * fPow;
        int i10 = (int) f11;
        if (f11 - i10 >= 0.5f) {
            i10++;
        }
        float f12 = i10 / fPow;
        return iMax > 0 ? String.valueOf(f12) : String.valueOf((int) f12);
    }

    public static void k(StringBuilder sb2, Object obj) {
        int iLastIndexOf;
        if (obj == null) {
            sb2.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static int k0(Parcel parcel) {
        int i10 = parcel.readInt();
        int iD0 = d0(i10, parcel);
        char c6 = (char) i10;
        int iDataPosition = parcel.dataPosition();
        if (c6 != '\u4f45') {
            throw new b3.e("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i10))), parcel);
        }
        int i11 = iD0 + iDataPosition;
        if (i11 < iDataPosition || i11 > parcel.dataSize()) {
            throw new b3.e(gk.b.l(iDataPosition, i11, "Size read is invalid start=", " end="), parcel);
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static t7.e l(byte[] r7) throws java.lang.Throwable {
        /*
            t7.e r0 = new t7.e
            r0.<init>()
            if (r7 != 0) goto L8
            goto L55
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            t7.d r5 = new t7.d     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.f16112a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L56
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L55
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L55
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L56
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L3e
            goto L36
        L55:
            return r0
        L56:
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r0.printStackTrace()
        L60:
            r1.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r0 = move-exception
            r0.printStackTrace()
        L68:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.v.l(byte[]):t7.e");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    public static final int l0(boolean z2, e0.l lVar, int i10) {
        return z2 ? ((e0.m) lVar.f5268m.get(i10)).f5289p : ((e0.m) lVar.f5268m.get(i10)).f5290q;
    }

    public static void m(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? A(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? A(i11, i12, "end index") : uk.c.h("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static Object m0(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th2) {
            rc.k.e("Unexpected exception.", th2);
            zzbul.zza(context).zzh(th2, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }

    public static final void n(Closeable closeable, Throwable th2) throws IOException {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                mk.b.i(th2, th3);
            }
        }
    }

    public static void n0(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        throw new b3.e(m6.a.j(gk.b.q("Expected size ", i11, " got ", i10, " (0x"), Integer.toHexString(i10), ")"), parcel);
    }

    public static r5.t o(Context context) {
        ProviderInfo providerInfo;
        q4.c cVar;
        ApplicationInfo applicationInfo;
        ef.f cVar2 = Build.VERSION.SDK_INT >= 28 ? new r5.c() : new ef.f();
        PackageManager packageManager = context.getPackageManager();
        uk.c.p(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            cVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrH = cVar2.h(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrH) {
                    arrayList.add(signature.toByteArray());
                }
                cVar = new q4.c(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
            }
        }
        if (cVar == null) {
            return null;
        }
        return new r5.t(new r5.s(context, cVar));
    }

    public static void o0(Parcel parcel, int i10, int i11) {
        int iD0 = d0(i10, parcel);
        if (iD0 == i11) {
            return;
        }
        throw new b3.e(m6.a.j(gk.b.q("Expected size ", i11, " got ", iD0, " (0x"), Integer.toHexString(iD0), ")"), parcel);
    }

    public static BigDecimal p(int i10, Parcel parcel) {
        int iD0 = d0(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iD0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i11 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iD0);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i11);
    }

    public static Bundle q(int i10, Parcel parcel) {
        int iD0 = d0(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iD0 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iD0);
        return bundle;
    }

    public static byte[] r(int i10, Parcel parcel) {
        int iD0 = d0(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iD0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iD0);
        return bArrCreateByteArray;
    }

    public static int[] s(int i10, Parcel parcel) {
        int iD0 = d0(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iD0 == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iD0);
        return iArrCreateIntArray;
    }

    public static Parcelable u(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iD0 = d0(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iD0 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iD0);
        return parcelable;
    }

    public static String v(int i10, Parcel parcel) {
        int iD0 = d0(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iD0 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iD0);
        return string;
    }

    public static String[] w(int i10, Parcel parcel) {
        int iD0 = d0(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iD0 == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iD0);
        return strArrCreateStringArray;
    }

    public static ArrayList x(int i10, Parcel parcel) {
        int iD0 = d0(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iD0 == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iD0);
        return arrayListCreateStringArrayList;
    }

    public static Object[] y(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iD0 = d0(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iD0 == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iD0);
        return objArrCreateTypedArray;
    }

    public static ArrayList z(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iD0 = d0(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iD0 == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iD0);
        return arrayListCreateTypedArrayList;
    }

    public abstract String B(int i10, byte[] bArr, int i11);

    public abstract int D(String str, byte[] bArr, int i10, int i11);

    public void E(t7.n nVar) {
        List listSingletonList = Collections.singletonList(nVar);
        u7.k kVar = (u7.k) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        u7.e eVar = new u7.e(kVar, listSingletonList);
        if (eVar.f16824f) {
            t7.m.g().m(u7.e.f16819g, t.m1.j("Already enqueued work ids (", TextUtils.join(", ", eVar.f16822d), ")"), new Throwable[0]);
        } else {
            kVar.f16843e.f(new d8.c(eVar));
        }
    }

    public h.a J(Context context, Object obj) {
        return null;
    }

    public boolean O(int i10, byte[] bArr, int i11) {
        return T(i10, bArr, i11) == 0;
    }

    public abstract Object S(int i10, Intent intent);

    public abstract int T(int i10, byte[] bArr, int i11);

    public abstract Intent t(Context context, Object obj);
}
