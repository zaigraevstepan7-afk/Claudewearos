package yd;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.Layout;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.lifecycle.b1;
import b0.g2;
import b0.o1;
import b0.q1;
import b0.t1;
import c1.h3;
import c2.j0;
import c2.l0;
import c2.m0;
import c2.n0;
import c2.w;
import c2.w0;
import c2.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.p002firebaseauthapi.zzafn;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import f1.i0;
import f1.m;
import f1.n1;
import fj.l;
import i2.h0;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import mi.p;
import p2.v;
import q.g0;
import qi.k;
import qi.s;
import t.m1;
import v1.o;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f20294a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f20295b;

    /* renamed from: c, reason: collision with root package name */
    public static i2.f f20296c;

    /* renamed from: d, reason: collision with root package name */
    public static long f20297d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f20298e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f20299f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f20300g;

    public static kj.h A(Collection collection) {
        l.f(collection, "<this>");
        return new kj.h(0, collection.size() - 1, 1);
    }

    public static int B(List list) {
        l.f(list, "<this>");
        return list.size() - 1;
    }

    public static float C(int i10, String[] strArr) throws NumberFormatException {
        float f10 = Float.parseFloat(strArr[i10]);
        if (f10 >= 0.0f && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    public static final i2.f D() {
        i2.f fVar = f20296c;
        if (fVar != null) {
            return fVar;
        }
        i2.e eVar = new i2.e("Rounded.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f8270a;
        z0 z0Var = new z0(w.f3052b);
        d8.e eVar2 = new d8.e(9);
        eVar2.x(15.5f, 14.0f);
        eVar2.u(-0.79f);
        eVar2.w(-0.28f, -0.27f);
        eVar2.o(1.2f, -1.4f, 1.82f, -3.31f, 1.48f, -5.34f);
        eVar2.o(-0.47f, -2.78f, -2.79f, -5.0f, -5.59f, -5.34f);
        eVar2.o(-4.23f, -0.52f, -7.79f, 3.04f, -7.27f, 7.27f);
        eVar2.o(0.34f, 2.8f, 2.56f, 5.12f, 5.34f, 5.59f);
        eVar2.o(2.03f, 0.34f, 3.94f, -0.28f, 5.34f, -1.48f);
        eVar2.w(0.27f, 0.28f);
        eVar2.H(0.79f);
        eVar2.w(4.25f, 4.25f);
        eVar2.o(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, 0.0f);
        eVar2.o(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f);
        eVar2.v(15.5f, 14.0f);
        eVar2.k();
        eVar2.x(9.5f, 14.0f);
        eVar2.n(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        eVar2.C(7.01f, 5.0f, 9.5f, 5.0f);
        eVar2.C(14.0f, 7.01f, 14.0f, 9.5f);
        eVar2.C(11.99f, 14.0f, 9.5f, 14.0f);
        eVar2.k();
        i2.e.a(eVar, (ArrayList) eVar2.f5001a, z0Var);
        i2.f fVarB = eVar.b();
        f20296c = fVarB;
        return fVarB;
    }

    public static void G(String str, Exception exc) throws Throwable {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = ((InvocationTargetException) exc).getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw cause;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static final boolean H() throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            return k7.a.d();
        }
        try {
            if (f20298e == null) {
                f20297d = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f20298e = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            Method method = f20298e;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objInvoke = method.invoke(null, Long.valueOf(f20297d));
            l.d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e10) {
            G("isTagEnabled", e10);
            return false;
        }
    }

    public static boolean I(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static boolean J(byte b10) {
        return b10 > -65;
    }

    public static List K(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        l.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List L(Object... objArr) {
        return objArr.length > 0 ? k.c0(objArr) : s.f13520a;
    }

    public static Typeface M(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, hj.a.o(configuration.fontWeightAdjustment + typeface.getWeight(), 1, zzbch.zzq.zzf), typeface.isItalic());
    }

    public static ti.h N(ti.f fVar, ti.g gVar) {
        l.f(gVar, "key");
        return l.b(fVar.getKey(), gVar) ? ti.i.f16336a : fVar;
    }

    public static ArrayList O(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new qi.i(objArr, true));
    }

    public static final List T(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : K(list.get(0)) : s.f13520a;
    }

    public static o U(final float f10, int i10, final w0 w0Var, o oVar) {
        if ((i10 & 16) != 0) {
            f10 = 0.0f;
        }
        final float f11 = 24;
        l.f(oVar, "$this$originOsHighlight");
        l.f(w0Var, "shape");
        return v1.a.a(oVar, new ej.f() { // from class: eb.l
            @Override // ej.f
            public final Object c(Object obj, Object obj2, Object obj3) {
                o oVar2 = (o) obj;
                i0 i0Var = (i0) obj2;
                ((Integer) obj3).getClass();
                fj.l.f(oVar2, "$this$composed");
                i0Var.b0(-1155328550);
                final s3.c cVar = (s3.c) i0Var.j(f1.f18262h);
                final w0 w0Var2 = w0Var;
                boolean zF = i0Var.f(w0Var2) | i0Var.f(cVar);
                final float f12 = f11;
                boolean zC = zF | i0Var.c(f12) | i0Var.c(0.1f);
                final float f13 = f10;
                boolean zC2 = zC | i0Var.c(f13) | i0Var.c(0.18f) | i0Var.c(0.4f);
                Object objQ = i0Var.Q();
                if (zC2 || objQ == f1.m.f6385a) {
                    objQ = new ej.c() { // from class: eb.m
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r13v0, types: [c2.e0] */
                        /* JADX WARN: Type inference failed for: r13v10 */
                        /* JADX WARN: Type inference failed for: r13v11 */
                        /* JADX WARN: Type inference failed for: r13v13 */
                        /* JADX WARN: Type inference failed for: r13v14 */
                        /* JADX WARN: Type inference failed for: r13v15, types: [long] */
                        /* JADX WARN: Type inference failed for: r13v17 */
                        /* JADX WARN: Type inference failed for: r13v4 */
                        /* JADX WARN: Type inference failed for: r13v5 */
                        /* JADX WARN: Type inference failed for: r13v6 */
                        /* JADX WARN: Type inference failed for: r13v9 */
                        /* JADX WARN: Type inference failed for: r1v1 */
                        /* JADX WARN: Type inference failed for: r1v11 */
                        /* JADX WARN: Type inference failed for: r1v14 */
                        /* JADX WARN: Type inference failed for: r1v15, types: [ac.d] */
                        /* JADX WARN: Type inference failed for: r1v16 */
                        /* JADX WARN: Type inference failed for: r1v17 */
                        /* JADX WARN: Type inference failed for: r1v18 */
                        /* JADX WARN: Type inference failed for: r1v2 */
                        /* JADX WARN: Type inference failed for: r1v3, types: [ac.d] */
                        /* JADX WARN: Type inference failed for: r1v4 */
                        /* JADX WARN: Type inference failed for: r1v5 */
                        /* JADX WARN: Type inference failed for: r1v6 */
                        /* JADX WARN: Type inference failed for: r1v7 */
                        /* JADX WARN: Type inference failed for: r1v8 */
                        /* JADX WARN: Type inference failed for: r1v9 */
                        @Override // ej.c
                        public final Object invoke(Object obj4) throws Throwable {
                            c2.j jVarA;
                            long j;
                            ac.d dVar;
                            long j4;
                            ?? r12;
                            ac.d dVar2;
                            long jY;
                            long j10;
                            ac.d dVar3;
                            v2.h0 h0Var = (v2.h0) obj4;
                            fj.l.f(h0Var, "$this$drawWithContent");
                            h0Var.f();
                            e2.b bVar = h0Var.f17669a;
                            long jA = bVar.a();
                            s3.m layoutDirection = h0Var.getLayoutDirection();
                            w0 w0Var3 = w0Var2;
                            s3.c cVar2 = cVar;
                            ?? B = w0Var3.b(jA, layoutDirection, cVar2);
                            if (B instanceof l0) {
                                jVarA = ((l0) B).f3016f;
                            } else if (B instanceof n0) {
                                jVarA = c2.l.a();
                                c2.j.c(jVarA, ((n0) B).f3022f);
                            } else {
                                if (!(B instanceof m0)) {
                                    throw new b3.e();
                                }
                                jVarA = c2.l.a();
                                c2.j.b(jVarA, ((m0) B).f3018f);
                            }
                            float fW0 = cVar2.w0(1);
                            float fW02 = cVar2.w0(f12);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.a() & 4294967295L)) * 0.5f;
                            float f14 = fW02 > fIntBitsToFloat ? fIntBitsToFloat : fW02;
                            float f15 = f13;
                            float f16 = (0.14f * f15) + 0.1f;
                            float f17 = (f15 * 0.18f) + 0.18f;
                            float f18 = (0.24f * f15) + 0.4f;
                            ac.d dVar4 = bVar.f5738b;
                            long jY2 = dVar4.y();
                            dVar4.h().f();
                            try {
                                ((ac.d) ((ld.i) dVar4.f373b).f10924b).h().m(jVarA);
                                try {
                                    j4 = w.f3054d;
                                    long jC = w.c(j4, f16);
                                    j = jY2;
                                    try {
                                        try {
                                            e2.d.F(h0Var, jVarA, jC, e2.g.f5743a, 52);
                                            j0 j0VarL = y9.a.l(qi.k.c0(new w[]{new w(w.c(j4, f17)), new w(w.c(j4, f17 * 0.45f)), new w(w.f3057g)}), f14, 8);
                                            float f19 = f14;
                                            r12 = dVar4;
                                            try {
                                                e2.d.P(h0Var, j0VarL, 0L, 0L, 0.0f, null, null, 0, 126);
                                                float f20 = -fW0;
                                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.a() >> 32)) + fW0;
                                                float f21 = f19 + fW0;
                                                dVar2 = bVar.f5738b;
                                                jY = dVar2.y();
                                                dVar2.h().f();
                                                try {
                                                    ((ld.i) dVar2.f373b).w(f20, 0.0f, fIntBitsToFloat2, f21, 1);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    dVar = r12;
                                                    r12 = dVar2;
                                                    j10 = jY;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                dVar = r12;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            dVar = dVar4;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        dVar = dVar4;
                                        m1.r(dVar, j);
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    j = jY2;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                j = jY2;
                                dVar = dVar4;
                            }
                            if (!(B instanceof l0)) {
                                try {
                                    if (B instanceof n0) {
                                        try {
                                            long jC2 = w.c(j4, f18);
                                            float f22 = ((n0) B).f3022f.f1506a;
                                            long jFloatToRawIntBits = (Float.floatToRawIntBits(((n0) B).f3022f.f1507b) & 4294967295L) | (Float.floatToRawIntBits(f22) << 32);
                                            float fB = ((n0) B).f3022f.b();
                                            dVar3 = r12;
                                            try {
                                                long jFloatToRawIntBits2 = (Float.floatToRawIntBits(((n0) B).f3022f.a()) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                                                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (((n0) B).f3022f.f1510e >> 32));
                                                try {
                                                    long jFloatToRawIntBits3 = (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (((n0) B).f3022f.f1510e & 4294967295L))) & 4294967295L);
                                                    B = jY;
                                                    r12 = dVar2;
                                                    h0Var.f0(jC2, (224 & 2) != 0 ? 0L : jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, new e2.h(0, 0, ((f15 * 0.2f) + 1.0f) * fW0, 0.0f, 30));
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    B = jY;
                                                    r12 = dVar2;
                                                    dVar = dVar3;
                                                    r12 = r12;
                                                    j10 = B;
                                                    j = j;
                                                    try {
                                                        r12.h().q();
                                                        r12.Q(j10);
                                                        throw th;
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                    }
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                r12 = dVar2;
                                                B = jY;
                                                dVar = dVar3;
                                                r12 = r12;
                                                j10 = B;
                                                j = j;
                                                r12.h().q();
                                                r12.Q(j10);
                                                throw th;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            dVar3 = r12;
                                        }
                                    } else {
                                        dVar3 = r12;
                                        r12 = dVar2;
                                        try {
                                            if (!(B instanceof m0)) {
                                                j10 = jY;
                                                dVar = dVar3;
                                                j = j;
                                                try {
                                                    throw new b3.e();
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    r12.h().q();
                                                    r12.Q(j10);
                                                    throw th;
                                                }
                                            }
                                            long jC3 = w.c(j4, f18);
                                            long jD = ((m0) B).f3018f.d();
                                            long jC4 = ((m0) B).f3018f.c();
                                            B = jY;
                                            e2.d.c1(h0Var, jC3, jD, jC4, 0.0f, new e2.h(0, 0, ((f15 * 0.2f) + 1.0f) * fW0, 0.0f, 30), 0, 104);
                                            r12 = r12;
                                        } catch (Throwable th13) {
                                            th = th13;
                                            B = jY;
                                            dVar = dVar3;
                                            r12 = r12;
                                            j10 = B;
                                            j = j;
                                            r12.h().q();
                                            r12.Q(j10);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                }
                                m1.r(dVar, j);
                                throw th;
                            }
                            e2.d.F(h0Var, ((l0) B).f3016f, w.c(j4, f18), new e2.h(0, 0, ((f15 * 0.2f) + 1.0f) * fW0, 0.0f, 30), 52);
                            dVar3 = r12;
                            r12 = dVar2;
                            B = jY;
                            try {
                                r12.h().q();
                                r12.Q(B);
                                m1.r(dVar3, j);
                                return pi.o.f13011a;
                            } catch (Throwable th15) {
                                th = th15;
                                dVar = dVar3;
                                j = j;
                                m1.r(dVar, j);
                                throw th;
                            }
                        }
                    };
                    i0Var.l0(objQ);
                }
                o oVarG = z1.h.g(oVar2, (ej.c) objQ);
                i0Var.p(false);
                return oVarG;
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:85:0x01ec
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final h2.b V(int r45, f1.i0 r46) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.f.V(int, f1.i0):h2.b");
    }

    public static ti.h W(ti.f fVar, ti.h hVar) {
        l.f(hVar, "context");
        return hVar == ti.i.f16336a ? fVar : (ti.h) hVar.F(new ra.a(13, (byte) 0), fVar);
    }

    public static final long X(long j, long j4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j4 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j4 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static final void Y(float[] fArr, float[] fArr2, int i10, float[] fArr3) {
        if (i10 == 0) {
            s2.a.a("At least one point must be provided");
        }
        int i11 = 2 >= i10 ? i10 - 1 : 2;
        int i12 = i11 + 1;
        float[][] fArr4 = new float[i12][];
        for (int i13 = 0; i13 < i12; i13++) {
            fArr4[i13] = new float[i10];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            fArr4[0][i14] = 1.0f;
            for (int i15 = 1; i15 < i12; i15++) {
                fArr4[i15][i14] = fArr4[i15 - 1][i14] * fArr[i14];
            }
        }
        float[][] fArr5 = new float[i12][];
        for (int i16 = 0; i16 < i12; i16++) {
            fArr5[i16] = new float[i10];
        }
        float[][] fArr6 = new float[i12][];
        for (int i17 = 0; i17 < i12; i17++) {
            fArr6[i17] = new float[i12];
        }
        int i18 = 0;
        while (i18 < i12) {
            float[] fArr7 = fArr5[i18];
            float[] fArr8 = fArr4[i18];
            l.f(fArr8, "<this>");
            l.f(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i10);
            for (int i19 = 0; i19 < i18; i19++) {
                float[] fArr9 = fArr5[i19];
                float fT = t(fArr7, fArr9);
                for (int i20 = 0; i20 < i10; i20++) {
                    fArr7[i20] = fArr7[i20] - (fArr9[i20] * fT);
                }
            }
            float fSqrt = (float) Math.sqrt(t(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f10 = 1.0f / fSqrt;
            for (int i21 = 0; i21 < i10; i21++) {
                fArr7[i21] = fArr7[i21] * f10;
            }
            float[] fArr10 = fArr6[i18];
            int i22 = 0;
            while (i22 < i12) {
                fArr10[i22] = i22 < i18 ? 0.0f : t(fArr7, fArr4[i22]);
                i22++;
            }
            i18++;
        }
        for (int i23 = i11; -1 < i23; i23--) {
            float fT2 = t(fArr5[i23], fArr2);
            float[] fArr11 = fArr6[i23];
            int i24 = i23 + 1;
            if (i24 <= i11) {
                int i25 = i11;
                while (true) {
                    fT2 -= fArr11[i25] * fArr3[i25];
                    if (i25 != i24) {
                        i25--;
                    }
                }
            }
            fArr3[i23] = fT2 / fArr11[i23];
        }
    }

    public static final boolean Z(g0 g0Var, Object obj, Object obj2) {
        Object objG = g0Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof q.h0)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            g0Var.k(obj);
            return true;
        }
        q.h0 h0Var = (q.h0) objG;
        boolean zL = h0Var.l(obj2);
        if (zL && h0Var.g()) {
            g0Var.k(obj);
        }
        return zL;
    }

    public static final void a(int i10, ej.a aVar, ej.a aVar2, ej.c cVar, i0 i0Var, p pVar, o oVar, boolean z2) {
        int i11;
        float f10;
        boolean z10;
        v1.l lVar;
        l.f(cVar, "onOptionClick");
        i0Var.c0(1877889210);
        if ((i10 & 48) == 0) {
            i11 = (i0Var.f(pVar) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.g(z2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var.h(aVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= i0Var.h(aVar2) ? 16384 : 8192;
        }
        int i12 = i11 | (i0Var.h(cVar) ? 131072 : 65536);
        if (i0Var.T(i12 & 1, (74899 & i12) != 74898)) {
            float f11 = 10;
            aa.j jVar = (aa.j) i0Var.j(fa.b.f6654a);
            boolean zF = i0Var.f(jVar);
            Object objQ = i0Var.Q();
            f1.f fVar = m.f6385a;
            if (zF || objQ == fVar) {
                if (jVar instanceof aa.e) {
                    f10 = 54;
                } else {
                    f10 = jVar instanceof aa.d ? 58 : 62;
                }
                objQ = new s3.f(f10);
                i0Var.l0(objQ);
            }
            float f12 = ((s3.f) objQ).f14742a;
            o oVarV = b0.d.v(t1.c(1.0f, oVar), f11, 0.0f, 2);
            q1 q1VarA = o1.a(b0.j.g(8), v1.b.D, i0Var, 54);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            o oVarC = v1.a.c(i0Var, oVarV);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar2);
            } else {
                i0Var.o0();
            }
            v2.e eVar = v2.g.f17649f;
            f1.s.M(eVar, i0Var, q1VarA);
            v2.e eVar2 = v2.g.f17648e;
            f1.s.M(eVar2, i0Var, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            f1.s.w(i0Var, numValueOf, eVar3);
            v2.d dVar = v2.g.f17651h;
            f1.s.I(dVar, i0Var);
            v2.e eVar4 = v2.g.f17647d;
            f1.s.M(eVar4, i0Var, oVarC);
            v1.l lVar2 = v1.l.f17564b;
            o oVarS = t1.s(t1.c(1.0f, lVar2), 2);
            q1 q1VarA2 = o1.a(b0.j.g(30), v1.b.C, i0Var, 6);
            int iHashCode2 = Long.hashCode(i0Var.T);
            n1 n1VarL2 = i0Var.l();
            o oVarC2 = v1.a.c(i0Var, oVarS);
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar2);
            } else {
                i0Var.o0();
            }
            f1.s.M(eVar, i0Var, q1VarA2);
            f1.s.M(eVar2, i0Var, n1VarL2);
            gk.b.t(iHashCode2, i0Var, eVar3, i0Var, dVar);
            f1.s.M(eVar4, i0Var, oVarC2);
            i0Var.b0(2056322477);
            wi.b bVar = sa.w.f14949e;
            bVar.getClass();
            fj.b bVar2 = new fj.b(bVar);
            while (bVar2.hasNext()) {
                sa.w wVar = (sa.w) bVar2.next();
                fj.b bVar3 = bVar2;
                o oVarK = t1.k(f12, lVar2);
                String str = wVar.f14950a;
                ga.c cVar2 = new ga.c(0.5f, 0);
                p1.e eVarD = p1.j.d(-1219273833, new g2(wVar, 27), i0Var);
                boolean zD = i0Var.d(wVar.ordinal()) | ((i12 & 7168) == 2048) | ((57344 & i12) == 16384) | ((458752 & i12) == 131072);
                Object objQ2 = i0Var.Q();
                if (zD || objQ2 == fVar) {
                    z10 = 16384;
                    lVar = lVar2;
                    h3 h3Var = new h3(wVar, aVar, aVar2, cVar, 6);
                    i0Var.l0(h3Var);
                    objQ2 = h3Var;
                } else {
                    lVar = lVar2;
                    z10 = 16384;
                }
                x8.a.e(oVarK, pVar, eVarD, str, cVar2, false, z2, (ej.a) objQ2, i0Var, (i12 & 112) | 1769856 | ((i12 << 15) & 29360128));
                f12 = f12;
                i12 = i12;
                bVar2 = bVar3;
                lVar2 = lVar;
            }
            i0Var.p(false);
            i0Var.p(true);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new c1.m0(oVar, pVar, z2, aVar, aVar2, cVar, i10, 4);
        }
    }

    public static final void a0(g0 g0Var, Object obj) {
        boolean zG;
        long[] jArr = g0Var.f13073a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = g0Var.f13074b[i13];
                        Object obj3 = g0Var.f13075c[i13];
                        if (obj3 instanceof q.h0) {
                            q.h0 h0Var = (q.h0) obj3;
                            h0Var.l(obj);
                            zG = h0Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            g0Var.l(i13);
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r36, int r37, b0.i r38, b0.i1 r39, d0.u r40, ej.c r41, f1.i0 r42, v.i r43, v1.e r44, v1.o r45, x.s0 r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.f.b(int, int, b0.i, b0.i1, d0.u, ej.c, f1.i0, v.i, v1.e, v1.o, x.s0, boolean):void");
    }

    public static int b0(Context context, int i10, int i11) {
        TypedValue typedValueN = uk.c.N(context, i10);
        return (typedValueN == null || typedValueN.type != 16) ? i11 : typedValueN.data;
    }

    public static final long c(long j, long j4) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j4 == 4611686018427387903L || j4 == -4611686018427387903L) ? j4 : cg.b.q(j + j4, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j4 || j4 >= 4611686018427387903L) && (j4 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130 A[Catch: NumberFormatException -> 0x0144, LOOP:3: B:47:0x00ff->B:66:0x0130, LOOP_END, TryCatch #1 {NumberFormatException -> 0x0144, blocks: (B:44:0x00e9, B:47:0x00ff, B:49:0x0105, B:53:0x0111, B:66:0x0130, B:68:0x0136, B:74:0x014b, B:76:0x0150, B:78:0x0153, B:79:0x015f, B:80:0x0164, B:81:0x0165, B:82:0x016a), top: B:107:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136 A[Catch: NumberFormatException -> 0x0144, TryCatch #1 {NumberFormatException -> 0x0144, blocks: (B:44:0x00e9, B:47:0x00ff, B:49:0x0105, B:53:0x0111, B:66:0x0130, B:68:0x0136, B:74:0x014b, B:76:0x0150, B:78:0x0153, B:79:0x015f, B:80:0x0164, B:81:0x0165, B:82:0x016a), top: B:107:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b A[Catch: NumberFormatException -> 0x0144, TryCatch #1 {NumberFormatException -> 0x0144, blocks: (B:44:0x00e9, B:47:0x00ff, B:49:0x0105, B:53:0x0111, B:66:0x0130, B:68:0x0136, B:74:0x014b, B:76:0x0150, B:78:0x0153, B:79:0x015f, B:80:0x0164, B:81:0x0165, B:82:0x016a), top: B:107:0x00e9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.TimeInterpolator c0(android.content.Context r19, int r20, android.animation.TimeInterpolator r21) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.f.c0(android.content.Context, int, android.animation.TimeInterpolator):android.animation.TimeInterpolator");
    }

    public static final void d(g0 g0Var, Object obj, Object obj2) {
        int iF = g0Var.f(obj);
        boolean z2 = iF < 0;
        Object obj3 = z2 ? null : g0Var.f13075c[iF];
        if (obj3 != null) {
            if (obj3 instanceof q.h0) {
                ((q.h0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                q.h0 h0Var = new q.h0();
                h0Var.a(obj3);
                h0Var.a(obj2);
                obj2 = h0Var;
            }
            obj2 = obj3;
        }
        if (!z2) {
            g0Var.f13075c[iF] = obj2;
            return;
        }
        int i10 = ~iF;
        g0Var.f13074b[i10] = obj;
        g0Var.f13075c[i10] = obj2;
    }

    public static final long d0(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final void e(p7.k kVar, p2.w wVar, long j) {
        q2.b bVar = (q2.b) kVar.f12813b;
        bVar.getClass();
        q2.d dVar = (q2.d) bVar.f13184c;
        q2.d dVar2 = (q2.d) bVar.f13183b;
        boolean zB = v.b(wVar);
        long j4 = wVar.f12761b;
        if (zB) {
            q2.a[] aVarArr = (q2.a[]) dVar2.f13192e;
            k.m0(0, aVarArr.length, null, aVarArr);
            dVar2.f13189b = 0;
            q2.a[] aVarArr2 = (q2.a[]) dVar.f13192e;
            k.m0(0, aVarArr2.length, null, aVarArr2);
            dVar.f13189b = 0;
            bVar.f13182a = 0L;
        }
        if (!v.d(wVar)) {
            List list = wVar.f12771m;
            if (list == null) {
                list = s.f13520a;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                p2.c cVar = (p2.c) list.get(i10);
                bVar.a(cVar.f12673a, b2.b.f(cVar.f12677e, j));
            }
            bVar.a(j4, b2.b.f(wVar.f12772n, j));
        }
        if (v.d(wVar) && j4 - bVar.f13182a > 40) {
            q2.a[] aVarArr3 = (q2.a[]) dVar2.f13192e;
            k.m0(0, aVarArr3.length, null, aVarArr3);
            dVar2.f13189b = 0;
            q2.a[] aVarArr4 = (q2.a[]) dVar.f13192e;
            k.m0(0, aVarArr4.length, null, aVarArr4);
            dVar.f13189b = 0;
            bVar.f13182a = 0L;
        }
        bVar.f13182a = j4;
    }

    public static void f(StringBuilder sb2, Object obj, ej.c cVar) {
        if (cVar != null) {
            sb2.append((CharSequence) cVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }

    public static ArrayList g(Object... objArr) {
        l.f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new qi.i(objArr, true));
    }

    public static void g0(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.b()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(e0.m(status));
        }
    }

    public static IOException h(File file, IOException iOException) {
        StringBuilder sb2 = new StringBuilder("Inoperable file:");
        try {
            sb2.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb2.append(" failed to attach additional metadata");
        }
        String string = sb2.toString();
        l.e(string, "toString(...)");
        return new IOException(string, iOException);
    }

    public static void h0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static IOException i(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? h(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? h(file, iOException) : h(file, iOException) : parentFile.canWrite() ? h(file, iOException) : h(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? h(file, iOException) : h(file, iOException) : parentFile.canWrite() ? h(file, iOException) : h(file, iOException) : h(file, iOException);
    }

    public static void i0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void j(String str) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            k7.a.a(l0(str));
            return;
        }
        String strL0 = l0(str);
        try {
            if (f20299f == null) {
                f20299f = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = f20299f;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(f20297d), strL0, 0);
        } catch (Exception e10) {
            G("asyncTraceBegin", e10);
        }
    }

    public static final long j0(int i10, oj.c cVar) {
        l.f(cVar, "unit");
        if (cVar.compareTo(oj.c.f12539e) > 0) {
            return k0(i10, cVar);
        }
        long jL = a.a.l(i10, cVar, oj.c.f12536b);
        oj.f fVar = oj.a.f12531b;
        long j = jL << 1;
        int i11 = oj.b.f12535a;
        return j;
    }

    public static int k(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        l.f(arrayList, "<this>");
        int size2 = arrayList.size();
        if (size < 0) {
            throw new IllegalArgumentException(m6.a.e(size, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException(m6.a.f("toIndex (", size, ") is greater than size (", size2, ")."));
        }
        int i10 = size - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int iL = mk.b.l((Comparable) arrayList.get(i12), comparable);
            if (iL < 0) {
                i11 = i12 + 1;
            } else {
                if (iL <= 0) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[PHI: r6
      0x0082: PHI (r6v2 long) = (r6v0 long), (r6v1 long), (r6v1 long), (r6v1 long), (r6v1 long) binds: [B:31:0x0080, B:47:0x00ae, B:50:0x00b4, B:42:0x009a, B:36:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long k0(long r8, oj.c r10) {
        /*
            java.lang.String r0 = "unit"
            fj.l.f(r10, r0)
            oj.c r0 = oj.c.f12536b
            r1 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            long r1 = a.a.l(r1, r0, r10)
            long r3 = -r1
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 > 0) goto L24
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 > 0) goto L24
            long r8 = a.a.l(r8, r10, r0)
            oj.f r10 = oj.a.f12531b
            r10 = 1
            long r8 = r8 << r10
            int r10 = oj.b.f12535a
            return r8
        L24:
            oj.c r0 = oj.c.f12538d
            int r1 = r10.compareTo(r0)
            if (r1 < 0) goto Lbd
            int r0 = java.lang.Long.signum(r8)
            long r0 = (long) r0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 >= 0) goto L3b
            r8 = r2
        L3b:
            long r8 = java.lang.Math.abs(r8)
            int r2 = r10.ordinal()
            r3 = 2
            r4 = 1
            if (r2 == r3) goto L7b
            r3 = 3
            if (r2 == r3) goto L78
            r3 = 4
            if (r2 == r3) goto L74
            r3 = 5
            if (r2 == r3) goto L70
            r3 = 6
            if (r2 != r3) goto L58
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L7c
        L58:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Wrong unit for millisMultiplier: "
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L70:
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            goto L7c
        L74:
            r2 = 60000(0xea60, double:2.9644E-319)
            goto L7c
        L78:
            r2 = 1000(0x3e8, double:4.94E-321)
            goto L7c
        L7b:
            r2 = r4
        L7c:
            r6 = 0
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L84
        L82:
            r8 = r6
            goto Lb7
        L84:
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r6 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r10 != 0) goto L94
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L92
            goto Lb6
        L92:
            r8 = r2
            goto Lb7
        L94:
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 != 0) goto L9d
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto Lb7
            goto Lb6
        L9d:
            int r10 = java.lang.Long.numberOfLeadingZeros(r8)
            int r10 = 128 - r10
            int r4 = java.lang.Long.numberOfLeadingZeros(r2)
            int r10 = r10 - r4
            r4 = 63
            if (r10 >= r4) goto Lae
            long r8 = r8 * r2
            goto Lb7
        Lae:
            if (r10 <= r4) goto Lb1
            goto Lb6
        Lb1:
            long r8 = r8 * r2
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto Lb7
        Lb6:
            goto L82
        Lb7:
            long r0 = r0 * r8
            long r8 = u(r0)
            return r8
        Lbd:
            long r0 = a.a.k(r8, r10, r0)
            r2 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r8 = cg.b.q(r0, r2, r4)
            long r8 = u(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.f.k0(long, oj.c):long");
    }

    public static void l(fi.e eVar, float f10) {
        l.f(eVar, "$this$blur");
        if (Build.VERSION.SDK_INT >= 31 && f10 > 0.0f) {
            if (eVar.f6759f != null && f10 > eVar.f6758e) {
                eVar.f6758e = f10;
            }
            RenderEffect renderEffect = eVar.f6759f;
            eVar.f6759f = renderEffect != null ? RenderEffect.createBlurEffect(f10, f10, renderEffect, c2.e0.D(0)) : RenderEffect.createBlurEffect(f10, f10, c2.e0.D(0));
        }
    }

    public static String l0(String str) {
        String str2 = str.length() <= 127 ? str : null;
        if (str2 != null) {
            return str2;
        }
        String strSubstring = str.substring(0, 127);
        l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static ri.c m(ri.c cVar) {
        cVar.y();
        cVar.f14530c = true;
        return cVar.f14529b > 0 ? cVar : ri.c.f14527d;
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final long n0(long j, long j4) {
        int iD;
        int iF = g3.m0.f(j);
        int iE = g3.m0.e(j);
        if ((g3.m0.f(j4) < g3.m0.e(j)) && (g3.m0.f(j) < g3.m0.e(j4))) {
            if ((g3.m0.f(j4) <= g3.m0.f(j)) && (g3.m0.e(j) <= g3.m0.e(j4))) {
                iF = g3.m0.f(j4);
                iE = iF;
            } else {
                if ((g3.m0.f(j) <= g3.m0.f(j4)) && (g3.m0.e(j4) <= g3.m0.e(j))) {
                    iD = g3.m0.d(j4);
                } else {
                    int iF2 = g3.m0.f(j4);
                    if (iF >= g3.m0.e(j4) || iF2 > iF) {
                        iE = g3.m0.f(j4);
                    } else {
                        iF = g3.m0.f(j4);
                        iD = g3.m0.d(j4);
                    }
                }
                iE -= iD;
            }
        } else if (iE > g3.m0.f(j4)) {
            iF -= g3.m0.d(j4);
            iD = g3.m0.d(j4);
            iE -= iD;
        }
        return g3.e0.b(iF, iE);
    }

    public static g0 q() {
        long[] jArr = q.n0.f13108a;
        return new g0();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab A[Catch: all -> 0x00a7, PHI: r1
      0x00ab: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:47:0x00a4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x00a2, B:61:0x00d1, B:12:0x001f, B:52:0x00aa, B:53:0x00ab, B:64:0x00d5, B:65:0x00d6, B:54:0x00ac, B:60:0x00d0, B:59:0x00b6, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:43:0x0086, B:44:0x00a0, B:18:0x003c), top: B:77:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader q0() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.f.q0():java.lang.ClassLoader");
    }

    public static ri.c r() {
        return new ri.c(10);
    }

    public static boolean r0(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !r0((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i10 = 0; i10 < length; i10++) {
                        if (!e0.l(Array.get(obj, i10), Array.get(obj2, i10))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }

    public static final d6.b s(b1 b1Var) {
        return b1Var instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) b1Var).c() : d6.a.f4976b;
    }

    public static final float t(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    public static final long u(long j) {
        long j4 = (j << 1) + 1;
        oj.a.f12531b.getClass();
        int i10 = oj.b.f12535a;
        return j4;
    }

    public static final void v(int i10, String str) throws Throwable {
        l.f(str, "methodName");
        if (Build.VERSION.SDK_INT >= 29) {
            k7.a.b(i10, l0(str));
            return;
        }
        String strL0 = l0(str);
        try {
            if (f20300g == null) {
                f20300g = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = f20300g;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(f20297d), strL0, Integer.valueOf(i10));
        } catch (Exception e10) {
            G("asyncTraceEnd", e10);
        }
    }

    public static ti.f w(ti.f fVar, ti.g gVar) {
        l.f(gVar, "key");
        if (l.b(fVar.getKey(), gVar)) {
            return fVar;
        }
        return null;
    }

    public static final float x(Layout layout, int i10, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i10);
        ThreadLocal threadLocal = h3.k.f7618a;
        if (layout.getEllipsisCount(i10) <= 0 || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("\u2026") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment == null ? -1 : j3.d.f8675a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float y(Layout layout, int i10, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = h3.k.f7618a;
        if (layout.getEllipsisCount(i10) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i10) != -1 || layout.getWidth() >= layout.getLineRight(i10)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("\u2026") + (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment != null ? j3.d.f8675a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final float z(i0 i0Var) {
        aa.j jVar = (aa.j) i0Var.j(fa.b.f6654a);
        boolean zF = i0Var.f(jVar);
        Object objQ = i0Var.Q();
        if (zF || objQ == m.f6385a) {
            objQ = new s3.f(jVar instanceof aa.e ? 28 : jVar instanceof aa.d ? 32 : 36);
            i0Var.l0(objQ);
        }
        return ((s3.f) objQ).f14742a;
    }

    public int E(View view) {
        return 0;
    }

    public int F() {
        return 0;
    }

    public abstract void Q(int i10);

    public abstract void R(View view, int i10, int i11);

    public abstract void S(View view, float f10, float f11);

    public abstract void e0(boolean z2);

    public abstract void f0(boolean z2);

    public abstract boolean m0(View view, int i10);

    public abstract int o(View view, int i10);

    public Task o0(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        ak.v vVar;
        zzafn zzafnVar;
        yh.c cVar = new yh.c(7, false);
        cVar.f20314b = this;
        synchronized (firebaseAuth) {
            vVar = firebaseAuth.j;
        }
        if (vVar != null && (zzafnVar = (zzafn) vVar.f731b) != null && zzafnVar.zzb("EMAIL_PASSWORD_PROVIDER")) {
            return vVar.H(str, Boolean.FALSE, recaptchaAction).continueWithTask(cVar).continueWithTask(new wh.s(str, vVar, recaptchaAction, cVar));
        }
        Task taskP0 = p0(null);
        a8.j jVar = new a8.j();
        jVar.f215a = recaptchaAction;
        jVar.f216b = firebaseAuth;
        jVar.f217c = str;
        jVar.f218d = cVar;
        return taskP0.continueWithTask(jVar);
    }

    public abstract int p(View view, int i10);

    public abstract Task p0(String str);

    public void P(View view, int i10) {
    }
}
