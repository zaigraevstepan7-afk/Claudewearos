package lb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.i5;
import c1.v7;
import c1.z4;
import com.anonlab.voidlauncher.R;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class q3 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f10597a = c2.e0.d(4294111991L);

    /* renamed from: b, reason: collision with root package name */
    public static final long f10598b = c2.e0.d(4294967295L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f10599c = c2.e0.d(4278190080L);

    /* renamed from: d, reason: collision with root package name */
    public static final long f10600d = c2.e0.d(4287532691L);

    /* renamed from: e, reason: collision with root package name */
    public static final long f10601e = c2.e0.d(4278221567L);

    /* renamed from: f, reason: collision with root package name */
    public static final long f10602f = c2.e0.d(4293256682L);

    /* renamed from: g, reason: collision with root package name */
    public static final float f10603g = 112;

    public static final boolean A(f1.a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final boolean B(f1.a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final void C(f1.a1 a1Var, boolean z2) {
        a1Var.setValue(Boolean.valueOf(z2));
    }

    public static final void D(f1.a1 a1Var, boolean z2) {
        a1Var.setValue(Boolean.valueOf(z2));
    }

    public static final void E(f1.a1 a1Var, boolean z2) {
        a1Var.setValue(Boolean.valueOf(z2));
    }

    public static final void F(f1.f1 f1Var, float f10) {
        f1Var.h(f10);
    }

    public static final void G(f1.f1 f1Var, float f10) {
        f1Var.h(f10);
    }

    public static final void H(f1.f1 f1Var, float f10) {
        f1Var.h(f10);
    }

    public static final void I(f1.f1 f1Var, float f10) {
        f1Var.h(f10);
    }

    public static final void J(Context context, f1.a1 a1Var, f1.a1 a1Var2, boolean z2) {
        if (((Boolean) a1Var.getValue()).booleanValue()) {
            return;
        }
        if (z2 || ((ad.c) a1Var2.getValue()) == null) {
            a1Var.setValue(Boolean.TRUE);
            ad.c.load(context, "ca-app-pub-5500911405786341/3445626846", new fc.g(new d8.e(7)), new n3(a1Var2, a1Var));
        }
    }

    public static void K(f1.a1 a1Var, f1.a1 a1Var2, f1.a1 a1Var3, f fVar) {
        a1Var.setValue(fVar);
        a1Var2.setValue(false);
        a1Var3.setValue(Boolean.TRUE);
    }

    public static final void L(Drawable drawable, Canvas canvas, float f10, float f11) {
        int iSave = canvas.save();
        if (f10 != 1.0f) {
            float f12 = 512 / 2.0f;
            canvas.scale(f10, f10, f12, f12);
        }
        Rect rect = new Rect(drawable.getBounds());
        int alpha = drawable.getAlpha();
        drawable.setBounds(0, 0, 512, 512);
        drawable.setAlpha(cg.b.p((int) (cg.b.o(f11, 0.0f, 1.0f) * alpha), 0, 255));
        drawable.draw(canvas);
        drawable.setAlpha(alpha);
        drawable.setBounds(rect);
        canvas.restoreToCount(iSave);
    }

    public static final ri.g M(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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

    public static final float N(float f10, float f11, jb.d dVar, int i10, f1.i0 i0Var) {
        Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
        xa.b bVar = (xa.b) i0Var.j(xa.c.f19854a);
        Object obj = f1.m.f6385a;
        if (bVar == null) {
            i0Var.b0(-1892713610);
            boolean zF = i0Var.f(context);
            Object objQ = i0Var.Q();
            if (zF || objQ == obj) {
                fj.l.f(context, "context");
                Resources resources = context.getResources();
                Object bVar2 = new xa.b(r4.m() / 100.0f, r4.q() / 100.0f, resources.getDimensionPixelOffset(R.dimen.app_icon_badge_offset), resources.getBoolean(R.bool.app_icon_label_visible), new g(context).n());
                i0Var.l0(bVar2);
                objQ = bVar2;
            }
            bVar = (xa.b) objQ;
        } else {
            i0Var.b0(1878606008);
        }
        i0Var.p(false);
        boolean zC = i0Var.c(bVar.f19850b) | i0Var.c(f10) | i0Var.c(f11) | i0Var.f(dVar) | i0Var.d(i10);
        Object objQ2 = i0Var.Q();
        if (zC || objQ2 == obj) {
            float f12 = 1.0f;
            if (i10 > 0) {
                float f13 = (dVar.f8815k * 2.0f) + (dVar.f8817m * (i10 - 1 >= 0 ? r14 : 0)) + (f11 * bVar.f19850b * i10);
                if (f13 > 0.0f) {
                    float f14 = f10 / f13;
                    if (f14 <= 1.0f) {
                        f12 = f14;
                    }
                }
            }
            objQ2 = Float.valueOf(f12);
            i0Var.l0(objQ2);
        }
        return ((Number) objQ2).floatValue();
    }

    public static final Bitmap O(Drawable drawable, float f10, float f11, float f12, float f13) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        fj.l.e(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        boolean z2 = drawable instanceof AdaptiveIconDrawable;
        if (z2) {
            AdaptiveIconDrawable adaptiveIconDrawable = (AdaptiveIconDrawable) drawable;
            if (adaptiveIconDrawable.getBackground() != null && adaptiveIconDrawable.getForeground() != null) {
                Drawable background = adaptiveIconDrawable.getBackground();
                fj.l.e(background, "getBackground(...)");
                L(background, canvas, f10, f12);
                Drawable foreground = adaptiveIconDrawable.getForeground();
                fj.l.e(foreground, "getForeground(...)");
                L(foreground, canvas, f11, f13);
                return bitmapCreateBitmap;
            }
        }
        if (!z2) {
            L(drawable, canvas, 1.0f, f12);
            return bitmapCreateBitmap;
        }
        AdaptiveIconDrawable adaptiveIconDrawable2 = (AdaptiveIconDrawable) drawable;
        Drawable foreground2 = adaptiveIconDrawable2.getForeground();
        if (foreground2 == null) {
            foreground2 = adaptiveIconDrawable2.getBackground();
        }
        if (foreground2 != null) {
            L(foreground2, canvas, f11, f12);
        }
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:32|(1:35)|(6:38|(1:41)|(0)(0)|(0)(0)|55|101)|37|97|44|48|(1:50)|51|(0)(0)|55|101) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cf, code lost:
    
        r0 = uk.c.r(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList P(android.content.Context r16, java.util.List r17, float r18, float r19, lb.s r20) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.q3.P(android.content.Context, java.util.List, float, float, lb.s):java.util.ArrayList");
    }

    public static final jb.d Q(jb.d dVar, float f10) {
        return jb.d.a(dVar, dVar.f8808c * f10, dVar.f8813h * f10, false, dVar.f8815k * f10, dVar.f8816l * f10, dVar.f8817m * f10, 25467);
    }

    public static final Bitmap R(Drawable drawable, int i10, float f10) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
        fj.l.e(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rect = new Rect(drawable.getBounds());
        int i11 = (int) (i10 * f10);
        int i12 = (i10 - i11) / 2;
        int i13 = i11 + i12;
        drawable.setBounds(i12, i12, i13, i13);
        drawable.draw(canvas);
        drawable.setBounds(rect);
        return bitmapCreateBitmap;
    }

    public static final void a(b bVar, ej.c cVar, f1.i0 i0Var, int i10) {
        b bVar2 = bVar;
        f1.i0 i0Var2 = i0Var;
        i0Var2.c0(-1051803158);
        int i11 = 32;
        int i12 = i10 | (i0Var2.d(bVar2.ordinal()) ? 4 : 2) | (i0Var2.h(cVar) ? 32 : 16);
        boolean z2 = false;
        boolean z10 = true;
        if (i0Var2.T(i12 & 1, (i12 & 19) != 18)) {
            wi.b bVar3 = b.f10147z;
            Map mapI0 = qi.v.i0(new pi.h(b.f10142b, "Default"), new pi.h(b.f10143c, "Circle"), new pi.h(b.f10145e, "Square"), new pi.h(b.f10144d, "Star"));
            float f10 = 1.0f;
            float f11 = 12;
            v1.o oVarU = b0.d.u(b0.t1.c(1.0f, v1.l.f17564b), f11, f11);
            b0.q1 q1VarA = b0.o1.a(b0.j.g(8), v1.b.C, i0Var2, 6);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarU);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, q1VarA);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC);
            i0Var2.b0(-1608810265);
            bVar3.getClass();
            fj.b bVar4 = new fj.b(bVar3);
            while (bVar4.hasNext()) {
                b bVar5 = (b) bVar4.next();
                boolean z11 = bVar5 == bVar2 ? z10 : z2;
                if (f10 <= 0.0d) {
                    c0.a.a("invalid weight; must be greater than zero");
                }
                v1.o oVarF = v.n.f(y8.f.c(10, b0.t1.e(44, new b0.y0(f10, z10))), z11 ? f10601e : c2.e0.d(4294111991L), c2.e0.f2986b);
                boolean zD = ((i12 & 112) == i11 ? z10 : z2) | i0Var2.d(bVar5.ordinal());
                Object objQ = i0Var2.Q();
                if (zD || objQ == f1.m.f6385a) {
                    objQ = new c1.s3(14, cVar, bVar5);
                    i0Var2.l0(objQ);
                }
                v1.o oVarL = v.n.l(oVarF, z2, null, (ej.a) objQ, 15);
                t2.q0 q0VarD = b0.r.d(v1.b.f17551e, z2);
                int iHashCode2 = Long.hashCode(i0Var2.T);
                f1.n1 n1VarL2 = i0Var2.l();
                v1.o oVarC2 = v1.a.c(i0Var2, oVarL);
                v2.h.f17668w.getClass();
                v2.f fVar2 = v2.g.f17645b;
                i0Var2.e0();
                if (i0Var2.S) {
                    i0Var2.k(fVar2);
                } else {
                    i0Var2.o0();
                }
                f1.s.M(v2.g.f17649f, i0Var2, q0VarD);
                f1.s.M(v2.g.f17648e, i0Var2, n1VarL2);
                f1.s.w(i0Var2, Integer.valueOf(iHashCode2), v2.g.f17650g);
                f1.s.I(v2.g.f17651h, i0Var2);
                f1.s.M(v2.g.f17647d, i0Var2, oVarC2);
                String strName = (String) mapI0.get(bVar5);
                if (strName == null) {
                    strName = bVar5.name();
                }
                boolean z12 = z10;
                v7.a(strName, null, z11 ? c2.w.f3054d : f10599c, hj.a.x(13), z11 ? k3.s.A : k3.s.f9399f, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 24576, 0, 262058);
                i0Var2 = i0Var;
                i0Var2.p(z12);
                z2 = false;
                z10 = z12;
                mapI0 = mapI0;
                i11 = 32;
                bVar4 = bVar4;
                f10 = f10;
                bVar2 = bVar;
            }
            i0Var2.p(z2);
            i0Var2.p(z10);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ab.g(bVar, i10, 13, cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [ej.c] */
    public static final void b(final g gVar, final boolean z2, final boolean z10, final float f10, final jb.d dVar, ra.r0 r0Var, f1.i0 i0Var, final int i10) {
        final ra.r0 r0Var2;
        int i11;
        ra.r0 r0Var3;
        ti.c cVar;
        boolean z11;
        boolean z12;
        f1.i0 i0Var2 = i0Var;
        i0Var2.c0(185942376);
        int i12 = i10 | ((i10 & 8) == 0 ? i0Var2.f(gVar) : i0Var2.h(gVar) ? 4 : 2) | (i0Var2.g(z2) ? 32 : 16) | (i0Var2.g(z10) ? 256 : 128) | (i0Var2.c(f10) ? 2048 : 1024) | (i0Var2.f(dVar) ? 16384 : 8192) | 65536;
        if (i0Var2.T(i12 & 1, (74899 & i12) != 74898)) {
            i0Var2.Y();
            if ((i10 & 1) == 0 || i0Var2.C()) {
                i0Var2.b0(-1614864554);
                androidx.lifecycle.b1 b1VarA = e6.a.a(i0Var2);
                if (b1VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                androidx.lifecycle.x0 x0VarR = a.a.R(fj.w.a(ra.r0.class), b1VarA.e(), yd.f.s(b1VarA), pk.b.a(i0Var2));
                i0Var2.p(false);
                i11 = i12 & (-458753);
                r0Var3 = (ra.r0) x0VarR;
            } else {
                i0Var2.W();
                i11 = i12 & (-458753);
                r0Var3 = r0Var;
            }
            i0Var2.q();
            final f1.a1 a1VarH = a.a.h(r0Var3.f14146c, i0Var2);
            Context context = (Context) i0Var2.j(AndroidCompositionLocals_androidKt.f838b);
            Configuration configuration = (Configuration) i0Var2.j(AndroidCompositionLocals_androidKt.f837a);
            float f11 = configuration.screenWidthDp / configuration.screenHeightDp;
            Object objQ = i0Var2.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = f1.s.A(null);
                i0Var2.l0(objQ);
            }
            f1.a1 a1Var = (f1.a1) objQ;
            c2.g gVar2 = (c2.g) a1Var.getValue();
            Uri uriS = gVar.s();
            String strA = gVar.a();
            boolean zH = i0Var2.h(context) | ((i11 & 14) == 4 || ((i11 & 8) != 0 && i0Var2.h(gVar)));
            Object objQ2 = i0Var2.Q();
            if (zH || objQ2 == obj) {
                cVar = null;
                e3 e3Var = new e3(context, gVar, a1Var, cVar, 0);
                i0Var2.l0(e3Var);
                objQ2 = e3Var;
            } else {
                cVar = null;
            }
            f1.a1 a1VarF = f1.s.F(gVar2, uriS, strA, (ej.e) objQ2, i0Var2, 0);
            final mi.p pVarG = mi.d.g(i0Var2);
            final gi.d dVarD = gi.f.d(cVar, i0Var2, 0, 3);
            final float fP = gVar.p();
            Object objQ3 = i0Var2.Q();
            if (objQ3 == obj) {
                objQ3 = y8.f.a(0.5f, i0Var2);
            }
            final f1.f1 f1Var = (f1.f1) objQ3;
            v1.l lVar = v1.l.f17564b;
            float f12 = 8;
            v1.o oVarC = y8.f.c(14, b0.d.g(1.3043479f, b0.d.u(b0.t1.c(1.0f, lVar), f12, f12)));
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            ra.r0 r0Var4 = r0Var3;
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, oVarC);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC2);
            v1.o oVarA = gi.f.a(a.a.M(b0.w.f1450a.b(b0.d.g(f11, b0.t1.c(1.0f, lVar)), v1.b.A), pVarG), dVarD);
            c2.g gVar3 = (c2.g) a1VarF.getValue();
            t2.w0 w0Var = t2.h.f15563a;
            if (gVar3 != null) {
                i0Var2.b0(-469068993);
                c2.g gVar4 = (c2.g) a1VarF.getValue();
                fj.l.c(gVar4);
                i0Var2 = i0Var2;
                z11 = false;
                z12 = true;
                v.n.c(gVar4, null, oVarA, w0Var, i0Var2, 24624, 232);
                i0Var2.p(false);
            } else {
                z11 = false;
                z12 = true;
                i0Var2.b0(-468846816);
                v.n.b(yd.f.V(R.drawable.img_home_background, i0Var2), null, oVarA, null, w0Var, 0.0f, i0Var, 24632, 104);
                i0Var2 = i0Var;
                i0Var2.p(false);
            }
            f1.r1 r1VarA = jb.f.f8821a.a(new s3.f(fP));
            f1.r1 r1VarA2 = jb.f.f8822b.a(ib.s0.f8456a);
            f1.r1 r1VarA3 = jb.c.f8800a.a(Float.valueOf(0.0f));
            f1.r1 r1VarA4 = jb.c.f8801b.a(Float.valueOf(1.0f));
            f1.r1 r1VarA5 = jb.f.f8823c.a(Float.valueOf(f10));
            f1.r1 r1VarA6 = jb.f.f8824d.a(Boolean.FALSE);
            f1.r1 r1VarA7 = jb.f.f8825e.a(Boolean.valueOf(z10));
            f1.v vVar = jb.f.f8827g;
            if (dVar.f8813h == 0.0f) {
                z11 = z12;
            }
            f1.s.b(new f1.r1[]{r1VarA, r1VarA2, r1VarA3, r1VarA4, r1VarA5, r1VarA6, r1VarA7, vVar.a(jb.d.a(dVar, 0.0f, 0.0f, z11, 0.0f, 0.0f, 0.0f, 32255)), jb.f.f8828h.a(dVarD)}, p1.j.d(1838555234, new ej.e() { // from class: lb.i1
                @Override // ej.e
                public final Object invoke(Object obj2, Object obj3) {
                    f1.i0 i0Var3 = (f1.i0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    boolean z13 = (iIntValue & 3) != 2;
                    v2.f2 f2Var = i0Var3.f6313a;
                    if (i0Var3.T(iIntValue & 1, z13)) {
                        v1.g gVar5 = v1.b.A;
                        b0.w wVar = b0.w.f1450a;
                        v1.l lVar2 = v1.l.f17564b;
                        v1.o oVarX = b0.d.x(b0.t1.c(0.84f, wVar.b(lVar2, gVar5)), 0.0f, 0.0f, 0.0f, 24, 7);
                        b0.b0 b0VarA = b0.z.a(b0.j.g(10), v1.b.F, i0Var3, 54);
                        int iHashCode2 = Long.hashCode(i0Var3.T);
                        f1.n1 n1VarL2 = i0Var3.l();
                        v1.o oVarC3 = v1.a.c(i0Var3, oVarX);
                        v2.h.f17668w.getClass();
                        v2.f fVar2 = v2.g.f17645b;
                        i0Var3.e0();
                        if (i0Var3.S) {
                            i0Var3.k(fVar2);
                        } else {
                            i0Var3.o0();
                        }
                        v2.e eVar = v2.g.f17649f;
                        f1.s.M(eVar, i0Var3, b0VarA);
                        v2.e eVar2 = v2.g.f17648e;
                        f1.s.M(eVar2, i0Var3, n1VarL2);
                        Integer numValueOf = Integer.valueOf(iHashCode2);
                        v2.e eVar3 = v2.g.f17650g;
                        f1.s.w(i0Var3, numValueOf, eVar3);
                        v2.d dVar2 = v2.g.f17651h;
                        f1.s.I(dVar2, i0Var3);
                        v2.e eVar4 = v2.g.f17647d;
                        f1.s.M(eVar4, i0Var3, oVarC3);
                        Object objQ4 = i0Var3.Q();
                        f1.f fVar3 = f1.m.f6385a;
                        if (objQ4 == fVar3) {
                            objQ4 = new jb.e(14);
                            i0Var3.l0(objQ4);
                        }
                        ej.a aVar = (ej.a) objQ4;
                        Object objQ5 = i0Var3.Q();
                        if (objQ5 == fVar3) {
                            objQ5 = new la.a(6);
                            i0Var3.l0(objQ5);
                        }
                        ej.c cVar2 = (ej.c) objQ5;
                        v1.o oVarE = b0.t1.e(50, b0.t1.c(1.0f, lVar2));
                        jb.d dVar3 = dVar;
                        boolean z14 = dVar3.f8814i;
                        boolean z15 = dVar3.f8806a;
                        boolean z16 = dVar3.f8813h > 0.0f;
                        float f13 = dVar3.f8819o;
                        gi.d dVar4 = dVarD;
                        hj.a.c(aVar, cVar2, null, dVar4, oVarE, 0.0f, z14, z15, z16, false, f13, i0Var3, 221238);
                        v1.o oVarC4 = b0.t1.c(1.0f, lVar2);
                        b0.q1 q1VarA = b0.o1.a(b0.j.g(12), v1.b.D, i0Var3, 54);
                        int iHashCode3 = Long.hashCode(i0Var3.T);
                        f1.n1 n1VarL3 = i0Var3.l();
                        v1.o oVarC5 = v1.a.c(i0Var3, oVarC4);
                        i0Var3.e0();
                        if (i0Var3.S) {
                            i0Var3.k(fVar2);
                        } else {
                            i0Var3.o0();
                        }
                        f1.s.M(eVar, i0Var3, q1VarA);
                        f1.s.M(eVar2, i0Var3, n1VarL3);
                        gk.b.u(iHashCode3, i0Var3, eVar3, i0Var3, dVar2);
                        f1.s.M(eVar4, i0Var3, oVarC5);
                        v1.o oVarK = b0.t1.k(44, lVar2);
                        p1.e eVar5 = c.f10182t;
                        boolean z17 = z2;
                        mi.p pVar = pVarG;
                        x8.a.d(oVarK, eVar5, null, 0.0f, z17, z17, pVar, null, i0Var3, 12582966, 12);
                        if (1.0f <= 0.0d) {
                            c0.a.a("invalid weight; must be greater than zero");
                        }
                        b0.y0 y0Var = new b0.y0(1.0f, true);
                        kj.d dVar5 = new kj.d(0.0f, 1.0f);
                        Object objQ6 = i0Var3.Q();
                        f1.f1 f1Var2 = f1Var;
                        if (objQ6 == fVar3) {
                            objQ6 = new fb.c(f1Var2, 16);
                            i0Var3.l0(objQ6);
                        }
                        ej.a aVar2 = (ej.a) objQ6;
                        Object objQ7 = i0Var3.Q();
                        if (objQ7 == fVar3) {
                            objQ7 = new bb.b(f1Var2, 23);
                            i0Var3.l0(objQ7);
                        }
                        mk.b.b(aVar2, (ej.c) objQ7, dVar5, 0.001f, dVar4, y0Var, null, null, i0Var3, 3126, 192);
                        i0Var3.p(true);
                        f1.q2 q2Var = a1VarH;
                        int i13 = ((ib.v0) q2Var.getValue()).f8473m;
                        int size = ((ib.v0) q2Var.getValue()).f8462a.size();
                        if (size < 1) {
                            size = 1;
                        }
                        wd.a.j(null, null, i13, size, false, false, false, 0.0f, false, 0.0f, pVar, z17, 0L, null, null, false, null, i0Var3, 24576, 0, 127971);
                        b0.d.a(b0.t1.c(1.0f, lVar2), null, p1.j.d(-1168667626, new s1(fP, dVar3, q2Var, pVar, z17, 1), i0Var3), i0Var3, 3078, 6);
                        i0Var3.p(true);
                    } else {
                        i0Var3.W();
                    }
                    return pi.o.f13011a;
                }
            }, i0Var2), i0Var2, 56);
            i0Var2.p(z12);
            r0Var2 = r0Var4;
        } else {
            i0Var2.W();
            r0Var2 = r0Var;
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: lb.j1
                @Override // ej.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    q3.b(gVar, z2, z10, f10, dVar, r0Var2, (f1.i0) obj2, f1.s.O(i10 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void c(String str, boolean z2, ej.a aVar, f1.i0 i0Var, int i10) {
        f1.i0 i0Var2 = i0Var;
        i0Var2.c0(708985240);
        int i11 = i10 | (i0Var2.g(z2) ? 32 : 16);
        if (i0Var2.T(i11 & 1, (i11 & 147) != 146)) {
            v1.l lVar = v1.l.f17564b;
            v1.o oVarC = b0.t1.c(1.0f, lVar);
            Object objQ = i0Var2.Q();
            if (objQ == f1.m.f6385a) {
                objQ = t.m1.p(i0Var2);
            }
            v1.o oVarU = b0.d.u(v.n.k(oVarC, (z.k) objQ, null, false, null, aVar, 28), 16, 14);
            b0.q1 q1VarA = b0.o1.a(b0.j.f1365g, v1.b.D, i0Var2, 54);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, oVarU);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, q1VarA);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC2);
            v7.a(str, null, f10599c, hj.a.x(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 24966, 0, 262122);
            i0Var2 = i0Var2;
            if (z2) {
                i0Var2.b0(-1357425311);
                c1.a2.b(u0.c.l(), null, b0.t1.k(20, lVar), f10601e, i0Var2, 3504, 0);
                i0Var2.p(false);
            } else {
                i0Var2.b0(-1357226074);
                i0Var2.p(false);
            }
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new u0(str, z2, aVar, i10, 0);
        }
    }

    public static final void d(final float f10, final ej.c cVar, final v1.o oVar, f1.i0 i0Var, final int i10) {
        i0Var.c0(392189624);
        int i11 = (i0Var.c(f10) ? 4 : 2) | i10 | (i0Var.h(cVar) ? 32 : 16) | 384;
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            v1.l lVar = v1.l.f17564b;
            v1.o oVarK = b0.t1.k(88, lVar);
            boolean z2 = (i11 & 112) == 32;
            Object objQ = i0Var.Q();
            f1.f fVar = f1.m.f6385a;
            if (z2 || objQ == fVar) {
                objQ = new f3(cVar, 0);
                i0Var.l0(objQ);
            }
            v1.o oVarA = p2.k0.a(oVarK, pi.o.f13011a, (PointerInputEventHandler) objQ);
            t2.q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var.T);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarA);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar2);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            b0.i0 i0Var2 = b0.t1.f1433c;
            boolean z10 = (i11 & 14) == 4;
            Object objQ2 = i0Var.Q();
            if (z10 || objQ2 == fVar) {
                objQ2 = new d3(f10, 0);
                i0Var.l0(objQ2);
            }
            v.n.a(i0Var2, (ej.c) objQ2, i0Var, 6);
            i0Var.p(true);
            oVar = lVar;
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(f10, cVar, oVar, i10) { // from class: lb.a1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f10102a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ej.c f10103b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ v1.o f10104c;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(1);
                    q3.d(this.f10102a, this.f10103b, this.f10104c, (f1.i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r44v0, types: [f1.i0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [ej.c] */
    public static final void e(final g gVar, final boolean z2, final boolean z10, final boolean z11, final float f10, b bVar, final float f11, final float f12, final float f13, final boolean z12, final jb.d dVar, ra.r0 r0Var, f1.i0 i0Var, final int i10) {
        b bVar2;
        f1.i0 i0Var2;
        final ra.r0 r0Var2;
        ra.r0 r0Var3;
        Object obj;
        ti.c cVar;
        f1.a1 a1Var;
        Object h3Var;
        f1.a1 a1Var2;
        ra.r0 r0Var4;
        mi.p pVar;
        ra.r0 r0Var5;
        float f14;
        float f15;
        i0Var.c0(24631744);
        int i11 = i10 | (i0Var.h(gVar) ? 4 : 2) | (i0Var.g(z2) ? 32 : 16) | (i0Var.g(z10) ? 256 : 128) | (i0Var.g(z11) ? 2048 : 1024) | (i0Var.c(f10) ? 16384 : 8192) | (i0Var.d(bVar.ordinal()) ? 131072 : 65536) | (i0Var.c(f11) ? 1048576 : 524288) | (i0Var.c(f12) ? 8388608 : 4194304) | (i0Var.c(f13) ? 67108864 : 33554432) | (i0Var.g(z12) ? 536870912 : 268435456);
        if (i0Var.T(i11 & 1, ((i11 & 306783379) == 306783378 && (((i0Var.f(dVar) ? (char) 4 : (char) 2) | 16) & 19) == 18) ? false : true)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                i0Var.b0(-1614864554);
                androidx.lifecycle.b1 b1VarA = e6.a.a(i0Var);
                if (b1VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                androidx.lifecycle.x0 x0VarR = a.a.R(fj.w.a(ra.r0.class), b1VarA.e(), yd.f.s(b1VarA), pk.b.a(i0Var));
                i0Var.p(false);
                r0Var3 = (ra.r0) x0VarR;
            } else {
                i0Var.W();
                r0Var3 = r0Var;
            }
            i0Var.q();
            f1.a1 a1VarH = a.a.h(r0Var3.f14146c, i0Var);
            Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
            Configuration configuration = (Configuration) i0Var.j(AndroidCompositionLocals_androidKt.f837a);
            float f16 = configuration.screenWidthDp / configuration.screenHeightDp;
            Object objQ = i0Var.Q();
            Object obj2 = f1.m.f6385a;
            if (objQ == obj2) {
                objQ = f1.s.A(null);
                i0Var.l0(objQ);
            }
            f1.a1 a1Var3 = (f1.a1) objQ;
            c2.g gVar2 = (c2.g) a1Var3.getValue();
            Uri uriS = gVar.s();
            String strA = gVar.a();
            boolean zH = i0Var.h(context) | ((i11 & 14) == 4 || i0Var.h(gVar));
            Object objQ2 = i0Var.Q();
            if (zH || objQ2 == obj2) {
                obj = obj2;
                cVar = null;
                a1Var = a1VarH;
                e3 e3Var = new e3(context, gVar, a1Var3, cVar, 1);
                i0Var.l0(e3Var);
                objQ2 = e3Var;
            } else {
                obj = obj2;
                cVar = null;
                a1Var = a1VarH;
            }
            f1.a1 a1VarF = f1.s.F(gVar2, uriS, strA, (ej.e) objQ2, i0Var, 0);
            mi.p pVarG = mi.d.g(i0Var);
            gi.d dVarD = gi.f.d(cVar, i0Var, 0, 3);
            float fP = gVar.p();
            List list = ((ib.v0) a1Var.getValue()).f8466e;
            Object[] objArr = {((ib.v0) a1Var.getValue()).f8466e, Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13), Boolean.valueOf(z12)};
            f1.a1 a1Var4 = a1Var;
            boolean zH2 = ((i11 & 1879048192) == 536870912) | ((i11 & 29360128) == 8388608) | ((i11 & 3670016) == 1048576) | ((i11 & 234881024) == 67108864) | i0Var.h(context) | i0Var.f(a1Var4);
            Object objQ3 = i0Var.Q();
            if (zH2 || objQ3 == obj) {
                a1Var2 = a1Var4;
                r0Var4 = r0Var3;
                h3Var = new h3(z12, f12, f11, f13, context, a1Var2, null);
                i0Var.l0(h3Var);
            } else {
                a1Var2 = a1Var4;
                h3Var = objQ3;
                r0Var4 = r0Var3;
            }
            final f1.a1 a1VarG = f1.s.G(list, objArr, (ej.e) h3Var, i0Var);
            v1.l lVar = v1.l.f17564b;
            float f17 = 8;
            v1.o oVarC = y8.f.c(14, b0.d.g(1.4634147f, b0.d.u(b0.t1.c(1.0f, lVar), f17, f17)));
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var.T);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC2 = v1.a.c(i0Var, oVarC);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC2);
            v1.o oVarA = gi.f.a(a.a.M(b0.w.f1450a.b(b0.d.g(f16, b0.t1.c(1.0f, lVar)), v1.b.A), pVarG), dVarD);
            c2.g gVar3 = (c2.g) a1VarF.getValue();
            t2.w0 w0Var = t2.h.f15563a;
            if (gVar3 != null) {
                i0Var.b0(-2085042873);
                c2.g gVar4 = (c2.g) a1VarF.getValue();
                fj.l.c(gVar4);
                pVar = pVarG;
                v.n.c(gVar4, null, oVarA, w0Var, i0Var, 24624, 232);
                i0Var.p(false);
                i0Var2 = i0Var;
                r0Var5 = r0Var4;
                f14 = 1.0f;
                f15 = fP;
            } else {
                pVar = pVarG;
                i0Var.b0(-2084820696);
                r0Var5 = r0Var4;
                f14 = 1.0f;
                f15 = fP;
                v.n.b(yd.f.V(R.drawable.img_home_background, i0Var), null, oVarA, null, w0Var, 0.0f, i0Var, 24632, 104);
                i0Var2 = i0Var;
                i0Var2.p(false);
            }
            bVar2 = bVar;
            final float f18 = f15;
            final mi.p pVar2 = pVar;
            final f1.a1 a1Var5 = a1Var2;
            f1.s.b(new f1.r1[]{jb.f.f8821a.a(new s3.f(f15)), jb.f.f8822b.a(ib.s0.f8456a), jb.c.f8800a.a(Float.valueOf(0.0f)), jb.c.f8801b.a(Float.valueOf(f14)), jb.f.f8823c.a(Float.valueOf(f10)), jb.f.f8824d.a(Boolean.valueOf(z10)), jb.f.f8825e.a(Boolean.valueOf(z11)), jb.f.f8826f.a(bVar2), jb.f.f8827g.a(dVar), jb.f.f8828h.a(dVarD)}, p1.j.d(1570784826, new ej.e() { // from class: lb.t1
                @Override // ej.e
                public final Object invoke(Object obj3, Object obj4) {
                    f1.i0 i0Var3 = (f1.i0) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (i0Var3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        v1.g gVar5 = v1.b.A;
                        b0.w wVar = b0.w.f1450a;
                        v1.l lVar2 = v1.l.f17564b;
                        v1.o oVarX = b0.d.x(b0.t1.c(0.84f, wVar.b(lVar2, gVar5)), 0.0f, 0.0f, 0.0f, 24, 7);
                        b0.b0 b0VarA = b0.z.a(b0.j.g(10), v1.b.F, i0Var3, 54);
                        int iHashCode2 = Long.hashCode(i0Var3.T);
                        f1.n1 n1VarL2 = i0Var3.l();
                        v1.o oVarC3 = v1.a.c(i0Var3, oVarX);
                        v2.h.f17668w.getClass();
                        v2.f fVar2 = v2.g.f17645b;
                        i0Var3.e0();
                        if (i0Var3.S) {
                            i0Var3.k(fVar2);
                        } else {
                            i0Var3.o0();
                        }
                        f1.s.M(v2.g.f17649f, i0Var3, b0VarA);
                        f1.s.M(v2.g.f17648e, i0Var3, n1VarL2);
                        f1.s.w(i0Var3, Integer.valueOf(iHashCode2), v2.g.f17650g);
                        f1.s.I(v2.g.f17651h, i0Var3);
                        f1.s.M(v2.g.f17647d, i0Var3, oVarC3);
                        f1.a1 a1Var6 = a1Var5;
                        int i12 = ((ib.v0) a1Var6.getValue()).f8473m;
                        int size = ((ib.v0) a1Var6.getValue()).f8462a.size();
                        if (size < 1) {
                            size = 1;
                        }
                        mi.p pVar3 = pVar2;
                        boolean z13 = z2;
                        wd.a.j(null, null, i12, size, false, false, false, 0.0f, false, 0.0f, pVar3, z13, 0L, null, null, false, null, i0Var3, 24576, 0, 127971);
                        b0.d.a(b0.t1.c(1.0f, lVar2), null, p1.j.d(-1151214354, new s1(f18, dVar, a1VarG, pVar3, z13, 0), i0Var3), i0Var3, 3078, 6);
                        i0Var3.p(true);
                    } else {
                        i0Var3.W();
                    }
                    return pi.o.f13011a;
                }
            }, i0Var2), i0Var2, 56);
            i0Var2.p(true);
            r0Var2 = r0Var5;
        } else {
            bVar2 = bVar;
            i0Var2 = i0Var;
            i0Var2.W();
            r0Var2 = r0Var;
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            final b bVar3 = bVar2;
            t1VarU.f6456d = new ej.e(z2, z10, z11, f10, bVar3, f11, f12, f13, z12, dVar, r0Var2, i10) { // from class: lb.z1
                public final /* synthetic */ float A;
                public final /* synthetic */ float B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ jb.d D;
                public final /* synthetic */ ra.r0 E;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f10887b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f10888c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f10889d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f10890e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ b f10891f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ float f10892z;

                @Override // ej.e
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    q3.e(this.f10886a, this.f10887b, this.f10888c, this.f10889d, this.f10890e, this.f10891f, this.f10892z, this.A, this.B, this.C, this.D, this.E, (f1.i0) obj3, f1.s.O(9));
                    return pi.o.f13011a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r2v80 */
    public static final void f(final g gVar, final s sVar, final int i10, final int i11, final boolean z2, final float f10, final float f11, final float f12, final boolean z10, final float f13, final boolean z11, final boolean z12, final b bVar, final boolean z13, final float f14, final float f15, final float f16, final float f17, final float f18, boolean z14, float f19, float f20, float f21, float f22, boolean z15, float f23, ra.r0 r0Var, f1.i0 i0Var, final int i12, final int i13) {
        int i14;
        float f24;
        char c6;
        float f25;
        int i15;
        int i16;
        char c10;
        int i17;
        int i18;
        final boolean z16;
        final float f26;
        final float f27;
        final boolean z17;
        final float f28;
        final ra.r0 r0Var2;
        final float f29;
        final float f30;
        float f31;
        float f32;
        float f33;
        float f34;
        boolean z18;
        float f35;
        ra.r0 r0Var3;
        ej.c cVar;
        Object[] objArr;
        List list;
        boolean z19;
        xa.b bVar2;
        mi.p pVar;
        boolean z20;
        float f36;
        f1.i0 i0Var2;
        ra.r0 r0Var4;
        gi.d dVar;
        f1.i0 i0Var3 = i0Var;
        i0Var3.c0(1594247268);
        int i19 = i12 | (i0Var3.h(gVar) ? 4 : 2) | (i0Var3.h(sVar) ? 32 : 16) | (i0Var3.d(i10) ? 256 : 128) | (i0Var3.d(i11) ? 2048 : 1024) | (i0Var3.g(z2) ? 16384 : 8192) | (i0Var3.c(f10) ? 131072 : 65536) | (i0Var3.c(f11) ? 1048576 : 524288) | (i0Var3.c(f12) ? 8388608 : 4194304) | (i0Var3.g(z10) ? 67108864 : 33554432) | (i0Var3.c(f13) ? 536870912 : 268435456);
        int i20 = (i0Var3.g(z11) ? (char) 4 : (char) 2) | (i0Var3.g(z12) ? ' ' : (char) 16) | (i0Var3.d(bVar.ordinal()) ? 256 : 128) | (i0Var3.g(z13) ? 2048 : 1024) | (i0Var3.c(f14) ? 16384 : 8192) | (i0Var3.c(f15) ? 131072 : 65536) | (i0Var3.c(f16) ? 1048576 : 524288) | (i0Var3.c(f17) ? 8388608 : 4194304) | (i0Var3.c(f18) ? 67108864 : 33554432);
        int i21 = i13 & 524288;
        if (i21 != 0) {
            i14 = i20 | 805306368;
        } else {
            i14 = i20 | (i0Var3.g(z14) ? (char) 0 : (char) 0);
        }
        int i22 = i13 & 1048576;
        if (i22 != 0) {
            c6 = 6;
            f24 = f19;
        } else {
            f24 = f19;
            c6 = i0Var3.c(f24) ? (char) 4 : (char) 2;
        }
        int i23 = i13 & 2097152;
        if (i23 != 0) {
            i15 = c6 | '0';
            f25 = f20;
        } else {
            f25 = f20;
            i15 = c6 | (i0Var3.c(f25) ? ' ' : (char) 16);
        }
        int i24 = i15;
        int i25 = i13 & 4194304;
        if (i25 != 0) {
            i16 = i24 | 384;
        } else {
            i16 = i24 | (i0Var3.c(f21) ? 256 : 128);
        }
        int i26 = i13 & 8388608;
        if (i26 != 0) {
            c10 = i16 | 3072;
        } else {
            c10 = i16 | (i0Var3.c(f22) ? 2048 : 1024);
        }
        int i27 = i13 & 16777216;
        if (i27 != 0) {
            i17 = c10 | '\u6000';
        } else {
            i17 = c10 | (i0Var3.g(z15) ? '\u4000' : '\u2000');
        }
        int i28 = i13 & 33554432;
        if (i28 != 0) {
            i18 = i17 | 196608;
        } else {
            i18 = i17 | (i0Var3.c(f23) ? (char) 0 : (char) 0);
        }
        if (i0Var3.T(i19 & 1, ((i19 & 306783379) == 306783378 && (i14 & 306783379) == 306783378 && ((i18 | 524288) & 599187) == 599186) ? false : true)) {
            i0Var3.Y();
            if ((i12 & 1) == 0 || i0Var3.C()) {
                boolean z21 = i21 != 0 ? false : z14;
                float f37 = i22 != 0 ? 18.0f : f24;
                float f38 = i23 != 0 ? 17.0f : f25;
                float f39 = i25 != 0 ? 13.0f : f21;
                float f40 = i26 != 0 ? 31.0f : f22;
                boolean z22 = i27 != 0 ? true : z15;
                float f41 = i28 != 0 ? 0.2f : f23;
                i0Var3.b0(-1614864554);
                androidx.lifecycle.b1 b1VarA = e6.a.a(i0Var3);
                if (b1VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                z14 = z21;
                androidx.lifecycle.x0 x0VarR = a.a.R(fj.w.a(ra.r0.class), b1VarA.e(), yd.f.s(b1VarA), pk.b.a(i0Var3));
                i0Var3.p(false);
                f31 = f37;
                f32 = f38;
                f33 = f39;
                f34 = f40;
                z18 = z22;
                f35 = f41;
                r0Var3 = (ra.r0) x0VarR;
            } else {
                i0Var3.W();
                f33 = f21;
                f34 = f22;
                f35 = f23;
                f31 = f24;
                f32 = f25;
                z18 = z15;
                r0Var3 = r0Var;
            }
            final boolean z23 = z14;
            i0Var3.q();
            f1.a1 a1VarH = a.a.h(r0Var3.f14146c, i0Var3);
            Context context = (Context) i0Var3.j(AndroidCompositionLocals_androidKt.f838b);
            boolean zF = i0Var3.f(context);
            Object objQ = i0Var3.Q();
            f1.f fVar = f1.m.f6385a;
            if (zF || objQ == fVar) {
                fj.l.f(context, "context");
                Resources resources = context.getResources();
                objQ = new xa.b(r5.m() / 100.0f, r5.q() / 100.0f, resources.getDimensionPixelOffset(R.dimen.app_icon_badge_offset), resources.getBoolean(R.bool.app_icon_label_visible), new g(context).n());
                i0Var3.l0(objQ);
            }
            xa.b bVar3 = (xa.b) objQ;
            boolean zF2 = i0Var3.f(bVar3) | ((i19 & 7168) == 2048) | ((i14 & 896) == 256);
            Object objQ2 = i0Var3.Q();
            if (zF2 || objQ2 == fVar) {
                objQ2 = xa.b.a(bVar3, i11 / 100.0f, bVar);
                i0Var3.l0(objQ2);
            }
            xa.b bVar4 = (xa.b) objQ2;
            mi.p pVarG = mi.d.g(i0Var3);
            Configuration configuration = (Configuration) i0Var3.j(AndroidCompositionLocals_androidKt.f837a);
            float f42 = configuration.screenWidthDp / configuration.screenHeightDp;
            Object objQ3 = i0Var3.Q();
            if (objQ3 == fVar) {
                objQ3 = f1.s.A(null);
                i0Var3.l0(objQ3);
            }
            f1.a1 a1Var = (f1.a1) objQ3;
            c2.g gVar2 = (c2.g) a1Var.getValue();
            Uri uriS = gVar.s();
            String strA = gVar.a();
            boolean zH = i0Var3.h(context) | ((i19 & 14) == 4 || i0Var3.h(gVar));
            Object objQ4 = i0Var3.Q();
            if (zH || objQ4 == fVar) {
                objQ4 = new e3(context, gVar, a1Var, null, 2);
                cVar = null;
                i0Var3.l0(objQ4);
            } else {
                cVar = null;
            }
            f1.a1 a1VarF = f1.s.F(gVar2, uriS, strA, (ej.e) objQ4, i0Var3, 0);
            gi.d dVarD = gi.f.d(cVar, i0Var3, 0, 3);
            List listM0 = qi.l.M0(((ib.v0) a1VarH.getValue()).f8466e, 4);
            Object[] objArr2 = {((ib.v0) a1VarH.getValue()).f8466e, sVar, Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Boolean.valueOf(z10)};
            boolean zF3 = i0Var3.f(a1VarH) | ((i19 & 234881024) == 67108864) | ((i19 & 3670016) == 1048576) | ((i19 & 458752) == 131072) | ((i19 & 29360128) == 8388608) | i0Var3.h(context) | i0Var3.h(sVar);
            Object objQ5 = i0Var3.Q();
            if (zF3 || objQ5 == fVar) {
                objArr = objArr2;
                list = listM0;
                z19 = z18;
                bVar2 = bVar4;
                pVar = pVarG;
                z20 = false;
                f36 = f42;
                i0Var2 = i0Var3;
                r0Var4 = r0Var3;
                dVar = dVarD;
                j3 j3Var = new j3(z10, f11, f10, f12, a1VarH, context, sVar, null);
                i0Var2.l0(j3Var);
                objQ5 = j3Var;
            } else {
                i0Var2 = i0Var3;
                list = listM0;
                objArr = objArr2;
                z19 = z18;
                bVar2 = bVar4;
                pVar = pVarG;
                z20 = false;
                f36 = f42;
                r0Var4 = r0Var3;
                dVar = dVarD;
            }
            final f1.a1 a1VarG = f1.s.G(list, objArr, (ej.e) objQ5, i0Var2);
            v1.l lVar = v1.l.f17564b;
            v1.o oVarG = b0.d.g(1.4634147f, z1.h.c(b0.d.u(b0.t1.c(1.0f, lVar), 16, 8), new ga.c(20, 1)));
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, z20);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarG);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC);
            v1.o oVarA = gi.f.a(a.a.M(b0.w.f1450a.b(b0.d.g(f36, b0.t1.c(1.0f, lVar)), v1.b.A), pVar), dVar);
            c2.g gVar3 = (c2.g) a1VarF.getValue();
            t2.w0 w0Var = t2.h.f15563a;
            if (gVar3 != null) {
                i0Var2.b0(1928788843);
                c2.g gVar4 = (c2.g) a1VarF.getValue();
                fj.l.c(gVar4);
                f1.i0 i0Var4 = i0Var2;
                v.n.c(gVar4, null, oVarA, w0Var, i0Var4, 24624, 232);
                i0Var4.p(z20);
            } else {
                f1.i0 i0Var5 = i0Var2;
                i0Var5.b0(1929011020);
                v.n.b(yd.f.V(R.drawable.img_home_background, i0Var5), null, oVarA, null, w0Var, 0.0f, i0Var5, 24632, 104);
                i0Var5.p(z20);
            }
            final float f43 = f34;
            final float f44 = f35;
            ra.r0 r0Var5 = r0Var4;
            final float f45 = f31;
            final float f46 = f33;
            final boolean z24 = z19;
            final mi.p pVar2 = pVar;
            final float f47 = f32;
            i0Var3 = i0Var;
            f1.s.b(new f1.r1[]{xa.c.f19854a.a(bVar2), jb.f.f8821a.a(new s3.f(i10)), jb.f.f8822b.a(ib.s0.f8456a), jb.c.f8800a.a(Float.valueOf(0.0f)), jb.c.f8801b.a(Float.valueOf(1.0f)), jb.f.f8823c.a(Float.valueOf(f13)), jb.f.f8824d.a(Boolean.valueOf(z11)), jb.f.f8825e.a(Boolean.valueOf(z12)), jb.f.f8826f.a(bVar), jb.f.f8827g.a(new jb.d(z13, f14, f15, f16, f17, f18, z23, f31, false, false, f32, f33, f34, z19, f35, 768)), jb.f.f8828h.a(dVar)}, p1.j.d(-1715186850, new ej.e() { // from class: lb.x2
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    f1.i0 i0Var6 = (f1.i0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (i0Var6.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        v1.o oVarU = b0.d.u(b0.t1.c(1.0f, b0.w.f1450a.b(v1.l.f17564b, v1.b.A)), 28, 26);
                        final int i29 = i10;
                        final boolean z25 = z13;
                        final float f48 = f14;
                        final float f49 = f15;
                        final float f50 = f16;
                        final float f51 = f17;
                        final float f52 = f18;
                        final boolean z26 = z23;
                        final float f53 = f45;
                        final float f54 = f47;
                        final float f55 = f46;
                        final float f56 = f43;
                        final boolean z27 = z24;
                        final float f57 = f44;
                        final f1.q2 q2Var = a1VarG;
                        final mi.p pVar3 = pVar2;
                        final boolean z28 = z2;
                        b0.d.a(oVarU, null, p1.j.d(-1733214008, new ej.f() { // from class: lb.a3
                            @Override // ej.f
                            public final Object c(Object obj3, Object obj4, Object obj5) {
                                b0.y yVar = (b0.y) obj3;
                                f1.i0 i0Var7 = (f1.i0) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                fj.l.f(yVar, "$this$BoxWithConstraints");
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= i0Var7.f(yVar) ? 4 : 2;
                                }
                                if (i0Var7.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    float fC = yVar.c();
                                    float f58 = i29;
                                    boolean z29 = z25;
                                    float f59 = f48;
                                    float f60 = f49;
                                    float f61 = f50;
                                    float f62 = f51;
                                    float f63 = f52;
                                    boolean z30 = z26;
                                    float f64 = f53;
                                    float f65 = f54;
                                    float f66 = f55;
                                    float f67 = f56;
                                    boolean z31 = z27;
                                    float f68 = f57;
                                    jb.d dVar2 = new jb.d(z29, f59, f60, f61, f62, f63, z30, f64, false, false, f65, f66, f67, z31, f68, 768);
                                    f1.q2 q2Var2 = q2Var;
                                    float fN = q3.N(fC, f58, dVar2, ((List) q2Var2.getValue()).size(), i0Var7);
                                    f1.s.b(new f1.r1[]{jb.f.f8821a.a(new s3.f(f58 * fN)), jb.f.f8827g.a(q3.Q(new jb.d(z29, f59, f60, f61, f62, f63, z30, f64, false, false, f65, f66, f67, z31, f68, 768), fN))}, p1.j.d(1161774088, new m1(pVar3, z28, q2Var2, 0), i0Var7), i0Var7, 56);
                                } else {
                                    i0Var7.W();
                                }
                                return pi.o.f13011a;
                            }
                        }, i0Var6), i0Var6, 3072, 6);
                    } else {
                        i0Var6.W();
                    }
                    return pi.o.f13011a;
                }
            }, i0Var3), i0Var3, 56);
            i0Var3.p(true);
            z16 = z23;
            f27 = f43;
            f28 = f44;
            r0Var2 = r0Var5;
            f29 = f31;
            f30 = f32;
            f26 = f33;
            z17 = z19;
        } else {
            i0Var3.W();
            z16 = z14;
            f26 = f21;
            f27 = f22;
            z17 = z15;
            f28 = f23;
            r0Var2 = r0Var;
            f29 = f24;
            f30 = f25;
        }
        f1.t1 t1VarU = i0Var3.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(sVar, i10, i11, z2, f10, f11, f12, z10, f13, z11, z12, bVar, z13, f14, f15, f16, f17, f18, z16, f29, f30, f26, f27, z17, f28, r0Var2, i12, i13) { // from class: lb.y2
                public final /* synthetic */ float A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ float C;
                public final /* synthetic */ boolean D;
                public final /* synthetic */ boolean E;
                public final /* synthetic */ b F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ float H;
                public final /* synthetic */ float I;
                public final /* synthetic */ float J;
                public final /* synthetic */ float K;
                public final /* synthetic */ float L;
                public final /* synthetic */ boolean M;
                public final /* synthetic */ float N;
                public final /* synthetic */ float O;
                public final /* synthetic */ float P;
                public final /* synthetic */ float Q;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ float S;
                public final /* synthetic */ ra.r0 T;
                public final /* synthetic */ int U;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s f10864b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f10865c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f10866d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f10867e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f10868f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ float f10869z;

                {
                    this.U = i13;
                }

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(9);
                    q3.f(this.f10863a, this.f10864b, this.f10865c, this.f10866d, this.f10867e, this.f10868f, this.f10869z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, (f1.i0) obj, iO, this.U);
                    return pi.o.f13011a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final void g(String str, String str2, Bitmap bitmap, boolean z2, ej.a aVar, f1.i0 i0Var, int i10) {
        int i11;
        f1.i0 i0Var2;
        v1.l lVar;
        v2.e eVar;
        int i12;
        v2.e eVar2;
        ?? r2;
        v2.f fVar;
        v2.e eVar3;
        float f10;
        int i13;
        v2.d dVar;
        v2.e eVar4;
        f1.i0 i0Var3;
        f1.i0 i0Var4;
        f1.i0 i0Var5 = i0Var;
        i0Var5.c0(-619295754);
        if ((i10 & 6) == 0) {
            i11 = (i0Var5.f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var5.f(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var5.h(bitmap) ? 256 : 128;
        }
        int i14 = i11 | (i0Var5.g(z2) ? 2048 : 1024) | (i0Var5.h(aVar) ? 16384 : 8192);
        if (i0Var5.T(i14 & 1, (i14 & 9363) != 9362)) {
            v1.l lVar2 = v1.l.f17564b;
            v1.o oVarC = b0.t1.c(1.0f, lVar2);
            Object objQ = i0Var5.Q();
            if (objQ == f1.m.f6385a) {
                objQ = t.m1.p(i0Var5);
            }
            float f11 = 12;
            v1.o oVarU = b0.d.u(v.n.k(oVarC, (z.k) objQ, null, false, null, aVar, 28), 16, f11);
            b0.q1 q1VarA = b0.o1.a(b0.j.f1359a, v1.b.D, i0Var5, 48);
            int iHashCode = Long.hashCode(i0Var5.T);
            f1.n1 n1VarL = i0Var5.l();
            v1.o oVarC2 = v1.a.c(i0Var5, oVarU);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var5.e0();
            if (i0Var5.S) {
                i0Var5.k(fVar2);
            } else {
                i0Var5.o0();
            }
            v2.e eVar5 = v2.g.f17649f;
            f1.s.M(eVar5, i0Var5, q1VarA);
            v2.e eVar6 = v2.g.f17648e;
            f1.s.M(eVar6, i0Var5, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar7 = v2.g.f17650g;
            f1.s.w(i0Var5, numValueOf, eVar7);
            v2.d dVar2 = v2.g.f17651h;
            f1.s.I(dVar2, i0Var5);
            v2.e eVar8 = v2.g.f17647d;
            f1.s.M(eVar8, i0Var5, oVarC2);
            v1.o oVarF = v.n.f(y8.f.c(10, b0.t1.k(40, lVar2)), c2.e0.d(4294111991L), c2.e0.f2986b);
            t2.q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode2 = Long.hashCode(i0Var5.T);
            f1.n1 n1VarL2 = i0Var5.l();
            v1.o oVarC3 = v1.a.c(i0Var5, oVarF);
            i0Var5.e0();
            if (i0Var5.S) {
                i0Var5.k(fVar2);
            } else {
                i0Var5.o0();
            }
            f1.s.M(eVar5, i0Var5, q0VarD);
            f1.s.M(eVar6, i0Var5, n1VarL2);
            gk.b.t(iHashCode2, i0Var5, eVar7, i0Var5, dVar2);
            f1.s.M(eVar8, i0Var5, oVarC3);
            if (bitmap != null) {
                i0Var5.b0(1291683302);
                lVar = lVar2;
                eVar = eVar6;
                v.n.c(new c2.g(bitmap), null, b0.t1.f1433c, null, i0Var5, 432, 248);
                i0Var5.p(false);
                dVar = dVar2;
                eVar2 = eVar7;
                eVar4 = eVar5;
                r2 = 0;
                eVar3 = eVar8;
                f10 = f11;
                fVar = fVar2;
                i12 = 12;
                i13 = 16;
                i0Var3 = i0Var5;
            } else {
                lVar = lVar2;
                eVar = eVar6;
                i0Var5.b0(1291913725);
                i12 = 12;
                eVar2 = eVar7;
                r2 = 0;
                fVar = fVar2;
                eVar3 = eVar8;
                f10 = f11;
                i13 = 16;
                dVar = dVar2;
                eVar4 = eVar5;
                v7.a(String.valueOf('\uec04'), null, f10600d, hj.a.x(20), null, ha.e.f7772d, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 24960, 0, 261994);
                f1.i0 i0Var6 = i0Var;
                i0Var6.p(false);
                i0Var3 = i0Var6;
            }
            i0Var3.p(true);
            v1.l lVar3 = lVar;
            b0.d.e(i0Var3, b0.t1.o(f10, lVar3));
            if (1.0f <= 0.0d) {
                c0.a.a("invalid weight; must be greater than zero");
            }
            b0.y0 y0Var = new b0.y0(1.0f, true);
            b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var3, r2);
            int iHashCode3 = Long.hashCode(i0Var3.T);
            f1.n1 n1VarL3 = i0Var3.l();
            v1.o oVarC4 = v1.a.c(i0Var3, y0Var);
            i0Var3.e0();
            if (i0Var3.S) {
                i0Var3.k(fVar);
            } else {
                i0Var3.o0();
            }
            f1.s.M(eVar4, i0Var3, b0VarA);
            f1.s.M(eVar, i0Var3, n1VarL3);
            gk.b.t(iHashCode3, i0Var3, eVar2, i0Var3, dVar);
            f1.s.M(eVar3, i0Var3, oVarC4);
            v7.a(str, null, f10599c, hj.a.x(i13), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, (i14 & 14) | 24960, 0, 262122);
            v7.a(str2, null, f10600d, hj.a.x(i12), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, ((i14 >> 3) & 14) | 24960, 0, 262122);
            f1.i0 i0Var7 = i0Var;
            i0Var7.p(true);
            if (z2) {
                i0Var7.b0(-1945295989);
                c1.a2.b(u0.c.l(), null, b0.t1.k(22, lVar3), f10601e, i0Var, 3504, 0);
                f1.i0 i0Var8 = i0Var;
                i0Var8.p(r2);
                i0Var4 = i0Var8;
            } else {
                i0Var7.b0(-1945096752);
                i0Var7.p(r2);
                i0Var4 = i0Var7;
            }
            i0Var4.p(true);
            i0Var2 = i0Var4;
        } else {
            i0Var5.W();
            i0Var2 = i0Var5;
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new c1.x1(str, str2, bitmap, z2, aVar, i10);
        }
    }

    public static final void h(final g gVar, final List list, final String str, final ej.c cVar, final ej.a aVar, final int i10, final float f10, final boolean z2, final boolean z10, final b bVar, final boolean z11, final float f11, final float f12, final float f13, final float f14, final float f15, f1.i0 i0Var, final int i11) {
        int i12;
        String str2;
        ej.c cVar2;
        int i13;
        i0Var.c0(428595006);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? i0Var.f(gVar) : i0Var.h(gVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= i0Var.h(list) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            str2 = str;
            i12 |= i0Var.f(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i11 & 3072) == 0) {
            cVar2 = cVar;
            i12 |= i0Var.h(cVar2) ? 2048 : 1024;
        } else {
            cVar2 = cVar;
        }
        if ((i11 & 24576) == 0) {
            i12 |= i0Var.h(aVar) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 = i10;
            i12 |= i0Var.d(i13) ? 131072 : 65536;
        } else {
            i13 = i10;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= i0Var.c(f10) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= i0Var.g(z2) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i12 |= i0Var.g(z10) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i12 |= i0Var.d(bVar.ordinal()) ? 536870912 : 268435456;
        }
        int i14 = i12;
        if (i0Var.T(i14 & 1, ((i12 & 306783379) == 306783378 && (((((((i0Var.g(z11) ? (char) 4 : (char) 2) | (i0Var.c(f11) ? ' ' : (char) 16)) | (i0Var.c(f12) ? 256 : 128)) | (i0Var.c(f13) ? 2048 : 1024)) | (i0Var.c(f14) ? '\u4000' : '\u2000')) | (i0Var.c(f15) ? (char) 0 : (char) 0)) & 74899) == 74898) ? false : true)) {
            boolean z12 = (i14 & 57344) == 16384;
            Object objQ = i0Var.Q();
            if (z12 || objQ == f1.m.f6385a) {
                objQ = new c1.d3(6, aVar);
                i0Var.l0(objQ);
            }
            wd.a.a(false, (ej.a) objQ, i0Var, 0, 1);
            final String str3 = str2;
            final int i15 = i13;
            final ej.c cVar3 = cVar2;
            i5.a(null, null, c.f10177o, null, null, 0, f10597a, 0L, b0.d.f(0, 14), p1.j.d(-684403185, new ej.f() { // from class: lb.g2
                @Override // ej.f
                public final Object c(Object obj, Object obj2, Object obj3) {
                    b0.i1 i1Var = (b0.i1) obj;
                    f1.i0 i0Var2 = (f1.i0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    fj.l.f(i1Var, "innerPadding");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= i0Var2.f(i1Var) ? 4 : 2;
                    }
                    if (i0Var2.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                        v1.o oVarC = b0.d.C(b0.d.s(b0.t1.f1433c, i1Var), b0.d.f1295e);
                        b0.k1 k1VarD = b0.d.d(0.0f, 0.0f, q3.f10603g, 7);
                        final ej.a aVar2 = aVar;
                        boolean zF = i0Var2.f(aVar2);
                        final g gVar2 = gVar;
                        boolean zH = zF | i0Var2.h(gVar2);
                        final List list2 = list;
                        boolean zH2 = zH | i0Var2.h(list2);
                        final String str4 = str3;
                        boolean zF2 = zH2 | i0Var2.f(str4);
                        final int i16 = i15;
                        boolean zD = zF2 | i0Var2.d(i16);
                        final float f16 = f10;
                        boolean zC = zD | i0Var2.c(f16);
                        final boolean z13 = z2;
                        boolean zG = zC | i0Var2.g(z13);
                        final boolean z14 = z10;
                        boolean zG2 = zG | i0Var2.g(z14);
                        final b bVar2 = bVar;
                        boolean zD2 = zG2 | i0Var2.d(bVar2.ordinal());
                        final boolean z15 = z11;
                        boolean zG3 = zD2 | i0Var2.g(z15);
                        final float f17 = f11;
                        boolean zC2 = zG3 | i0Var2.c(f17);
                        final float f18 = f12;
                        boolean zC3 = zC2 | i0Var2.c(f18);
                        final float f19 = f13;
                        boolean zC4 = zC3 | i0Var2.c(f19);
                        final float f20 = f14;
                        boolean zC5 = zC4 | i0Var2.c(f20);
                        final float f21 = f15;
                        boolean zC6 = zC5 | i0Var2.c(f21);
                        final ej.c cVar4 = cVar3;
                        boolean zF3 = zC6 | i0Var2.f(cVar4);
                        Object objQ2 = i0Var2.Q();
                        if (zF3 || objQ2 == f1.m.f6385a) {
                            ej.c cVar5 = new ej.c() { // from class: lb.i2
                                @Override // ej.c
                                public final Object invoke(Object obj4) {
                                    d0.h hVar = (d0.h) obj4;
                                    fj.l.f(hVar, "$this$LazyColumn");
                                    d0.h.p(hVar, new p1.e(new d1.u0(1, aVar2), true, -791663644));
                                    final g gVar3 = gVar2;
                                    final List list3 = list2;
                                    final int i17 = i16;
                                    final float f22 = f16;
                                    final boolean z16 = z13;
                                    final boolean z17 = z14;
                                    final b bVar3 = bVar2;
                                    final boolean z18 = z15;
                                    final float f23 = f17;
                                    final float f24 = f18;
                                    final float f25 = f19;
                                    final float f26 = f20;
                                    final float f27 = f21;
                                    final String str5 = str4;
                                    d0.h.p(hVar, new p1.e(new ej.f() { // from class: lb.l2
                                        @Override // ej.f
                                        public final Object c(Object obj5, Object obj6, Object obj7) {
                                            Object next;
                                            g gVar4 = gVar3;
                                            SharedPreferences sharedPreferences = gVar4.f10289a;
                                            f1.i0 i0Var3 = (f1.i0) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            fj.l.f((d0.c) obj5, "$this$item");
                                            if (i0Var3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                Iterator it = list3.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        next = null;
                                                        break;
                                                    }
                                                    next = it.next();
                                                    if (((s) next).f10634a.equals(str5)) {
                                                        break;
                                                    }
                                                }
                                                q3.f(gVar4, (s) next, i17, gVar4.m(), gVar4.o(), sharedPreferences.getFloat("icon_opacity", 1.0f), sharedPreferences.getFloat("icon_bg_opacity", 1.0f), sharedPreferences.getFloat("icon_fg_opacity", 1.0f), sharedPreferences.getBoolean("icon_opacity_customize_expanded", false), f22, z16, z17, bVar3, z18, f23, f24, f25, f26, f27, false, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, null, i0Var3, 8, 133693440);
                                                b0.d.e(i0Var3, b0.t1.e(18, v1.l.f17564b));
                                            } else {
                                                i0Var3.W();
                                            }
                                            return pi.o.f13011a;
                                        }
                                    }, true, 2084881691));
                                    d0.h.p(hVar, new p1.e(new m2(str5, cVar4, list3, 0), true, -772032740));
                                    return pi.o.f13011a;
                                }
                            };
                            i0Var2.l0(cVar5);
                            objQ2 = cVar5;
                        }
                        x8.a.g(384, 506, null, k1VarD, null, (ej.c) objQ2, i0Var2, null, null, oVarC, null, false);
                    } else {
                        i0Var2.W();
                    }
                    return pi.o.f13011a;
                }
            }, i0Var), i0Var, 806879616, 187);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: lb.h2
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(i11 | 1);
                    q3.h(gVar, list, str, cVar, aVar, i10, f10, z2, z10, bVar, z11, f11, f12, f13, f14, f15, (f1.i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final java.lang.String r32, final java.lang.String r33, long r34, long r36, ej.a r38, f1.i0 r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.q3.i(java.lang.String, java.lang.String, long, long, ej.a, f1.i0, int, int):void");
    }

    public static final void j(long j, p1.e eVar, f1.i0 i0Var, int i10) {
        i0Var.c0(-1612854576);
        int i11 = i10 | 6;
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            float f10 = 16;
            v1.o oVarC = y8.f.c(f10, b0.d.v(b0.t1.c(1.0f, v1.l.f17564b), f10, 0.0f, 2));
            c2.q0 q0Var = c2.e0.f2986b;
            long j4 = f10598b;
            v1.o oVarF = v.n.f(oVarC, j4, q0Var);
            b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var, 0);
            int iHashCode = Long.hashCode(i0Var.T);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC2 = v1.a.c(i0Var, oVarF);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, b0VarA);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC2);
            eVar.c(b0.c0.f1285a, i0Var, 54);
            i0Var.p(true);
            j = j4;
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b3(j, eVar, i10);
        }
    }

    public static final void k(int i10, f1.i0 i0Var) {
        f1.i0 i0Var2;
        i0Var.c0(-1673199532);
        if (i0Var.T(i10 & 1, i10 != 0)) {
            i0Var2 = i0Var;
            z4.d(b0.d.x(v1.l.f17564b, 16, 0.0f, 0.0f, 0.0f, 14), (float) 0.5d, f10602f, i0Var2, 438);
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d(i10, 7);
        }
    }

    public static final void l(String str, f1.i0 i0Var, int i10) {
        i0Var.c0(399571177);
        if (i0Var.T(i10 & 1, (i10 & 3) != 2)) {
            v7.a(str, b0.d.u(v1.l.f17564b, 28, 6), f10600d, hj.a.x(12), k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597878, 0, 262056);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new z0(str, i10, 0);
        }
    }

    public static final void m(String str, String str2, float f10, kj.d dVar, ej.c cVar, f1.i0 i0Var, int i10) {
        f1.i0 i0Var2 = i0Var;
        i0Var2.c0(291291260);
        int i11 = i10 | (i0Var2.f(str2) ? 32 : 16) | (i0Var2.c(f10) ? 256 : 128) | (i0Var2.f(dVar) ? 2048 : 1024) | (i0Var2.h(cVar) ? 16384 : 8192) | 196608;
        if (i0Var2.T(i11 & 1, (74899 & i11) != 74898)) {
            v1.l lVar = v1.l.f17564b;
            v1.o oVarU = b0.d.u(lVar, 16, 12);
            b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var2, 0);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarU);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            v2.e eVar = v2.g.f17649f;
            f1.s.M(eVar, i0Var2, b0VarA);
            v2.e eVar2 = v2.g.f17648e;
            f1.s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            f1.s.w(i0Var2, numValueOf, eVar3);
            v2.d dVar2 = v2.g.f17651h;
            f1.s.I(dVar2, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            f1.s.M(eVar4, i0Var2, oVarC);
            v1.o oVarC2 = b0.t1.c(1.0f, lVar);
            b0.q1 q1VarA = b0.o1.a(b0.j.f1365g, v1.b.D, i0Var2, 54);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL2 = i0Var2.l();
            v1.o oVarC3 = v1.a.c(i0Var2, oVarC2);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar, i0Var2, q1VarA);
            f1.s.M(eVar2, i0Var2, n1VarL2);
            gk.b.t(iHashCode2, i0Var2, eVar3, i0Var2, dVar2);
            f1.s.M(eVar4, i0Var2, oVarC3);
            v7.a(str, null, f10599c, hj.a.x(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 24966, 0, 262122);
            int i12 = i11 >> 3;
            v7.a(str2, null, f10600d, hj.a.x(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, (i12 & 14) | 24960, 0, 262122);
            i0Var2 = i0Var;
            i0Var2.p(true);
            b0.d.e(i0Var2, b0.t1.e(8, lVar));
            boolean z2 = (i11 & 896) == 256;
            Object objQ = i0Var2.Q();
            f1.f fVar2 = f1.m.f6385a;
            if (z2 || objQ == fVar2) {
                objQ = new n1(f10, 0);
                i0Var2.l0(objQ);
            }
            ej.a aVar = (ej.a) objQ;
            Object objQ2 = i0Var2.Q();
            if (objQ2 == fVar2) {
                objQ2 = new la.a(4);
                i0Var2.l0(objQ2);
            }
            mk.b.b(aVar, cVar, dVar, 0.01f, gi.f.b((ej.c) objQ2, i0Var2), null, null, null, i0Var2, ((i11 >> 9) & 112) | 3072 | (i12 & 896) | 12582912, 96);
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new q1(str, str2, f10, dVar, cVar, i10, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(java.lang.String r26, java.lang.String r27, boolean r28, boolean r29, ej.c r30, f1.i0 r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.q3.n(java.lang.String, java.lang.String, boolean, boolean, ej.c, f1.i0, int, int):void");
    }

    public static final void o(int i10, f1.i0 i0Var) {
        f1.i0 i0Var2;
        i0Var.c0(-97212541);
        if (i0Var.T(i10 & 1, i10 != 0)) {
            Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                fc.g gVar = new fc.g(new d8.e(7));
                i0Var.l0(gVar);
                objQ = gVar;
            }
            fc.g gVar2 = (fc.g) objQ;
            fj.l.c(gVar2);
            v1.l lVar = v1.l.f17564b;
            v1.o oVarU = b0.d.u(b0.d.C(v.n.f(b0.t1.c(1.0f, lVar), f10597a, c2.e0.f2986b), b0.d.f1297g), 16, 8);
            t2.q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var.T);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarU);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            i0Var2 = i0Var;
            b0.d.a(b0.t1.c(1.0f, lVar), null, p1.j.d(-1527477977, new ba.b(2, context, gVar2), i0Var), i0Var2, 3078, 6);
            i0Var2.p(true);
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d(i10, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x09e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0a43  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0a53  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0b6e  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0b9d  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0bb0  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0be7  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0c11  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0cbe  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x03b6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final lb.g r123, final ej.a r124, final lb.r3 r125, f1.i0 r126, final int r127) {
        /*
            Method dump skipped, instructions count: 3618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.q3.p(lb.g, ej.a, lb.r3, f1.i0, int):void");
    }

    public static final void q(f1.a1 a1Var, f1.a1 a1Var2, f1.f1 f1Var, f1.f1 f1Var2, f1.f1 f1Var3, f1.f1 f1Var4, f1.a1 a1Var3, f1.a1 a1Var4, f1.a1 a1Var5, g gVar, f1.g1 g1Var, f1.g1 g1Var2, f1.g1 g1Var3, f1.a1 a1Var6, f1.a1 a1Var7, f1.a1 a1Var8, f1.f1 f1Var5, f1.f1 f1Var6, f1.f1 f1Var7, f1.f1 f1Var8, f1.a1 a1Var9, f1.f1 f1Var9, f1.a1 a1Var10, f1.a1 a1Var11, f1.f1 f1Var10, f1.a1 a1Var12, f1.a1 a1Var13, f1.a1 a1Var14, f1.f1 f1Var11, f1.f1 f1Var12, f1.f1 f1Var13, f1.a1 a1Var15, f1.a1 a1Var16, f fVar) {
        f1.a1 a1Var17;
        f1.f1 f1Var14;
        f1.f1 f1Var15;
        f1.f1 f1Var16;
        f1.f1 f1Var17;
        f1.a1 a1Var18;
        f1.a1 a1Var19;
        Float fValueOf = Float.valueOf(18.0f);
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            a1Var17 = a1Var2;
            f1Var14 = f1Var;
            f1Var15 = f1Var2;
            f1Var16 = f1Var3;
            f1Var17 = f1Var4;
            a1Var18 = a1Var3;
            a1Var19 = a1Var4;
            if (((Boolean) a1Var.getValue()).booleanValue()) {
                a1Var17.setValue(Boolean.TRUE);
            }
            F(f1Var14, 6.0f);
            G(f1Var15, 0.5f);
            H(f1Var16, 0.4f);
            I(f1Var17, 0.0f);
            a1Var18.setValue(fValueOf);
            a1Var19.setValue(Boolean.TRUE);
        } else if (iOrdinal == 1) {
            a1Var17 = a1Var2;
            f1Var14 = f1Var;
            f1Var15 = f1Var2;
            f1Var16 = f1Var3;
            f1Var17 = f1Var4;
            a1Var18 = a1Var3;
            a1Var19 = a1Var4;
            if (((Boolean) a1Var.getValue()).booleanValue()) {
                a1Var17.setValue(Boolean.TRUE);
            }
            F(f1Var14, 6.0f);
            G(f1Var15, 0.5f);
            H(f1Var16, 0.4f);
            I(f1Var17, 0.0f);
            a1Var18.setValue(fValueOf);
            a1Var19.setValue(Boolean.FALSE);
        } else if (iOrdinal == 2) {
            a1Var17 = a1Var2;
            f1Var14 = f1Var;
            f1Var15 = f1Var2;
            f1Var16 = f1Var3;
            f1Var17 = f1Var4;
            a1Var18 = a1Var3;
            a1Var19 = a1Var4;
            Boolean bool = Boolean.FALSE;
            a1Var17.setValue(bool);
            F(f1Var14, 6.0f);
            G(f1Var15, 0.5f);
            H(f1Var16, 0.4f);
            I(f1Var17, 0.5f);
            a1Var18.setValue(fValueOf);
            a1Var19.setValue(bool);
        } else {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new b3.e();
                }
                q(a1Var, a1Var2, f1Var, f1Var2, f1Var3, f1Var4, a1Var3, a1Var4, a1Var5, gVar, g1Var, g1Var2, g1Var3, a1Var6, a1Var7, a1Var8, f1Var5, f1Var6, f1Var7, f1Var8, a1Var9, f1Var9, a1Var10, a1Var11, f1Var10, a1Var12, a1Var13, a1Var14, f1Var11, f1Var12, f1Var13, a1Var15, a1Var16, f.f10265b);
                return;
            }
            a1Var17 = a1Var2;
            f1Var14 = f1Var;
            f1Var15 = f1Var2;
            f1Var16 = f1Var3;
            f1Var17 = f1Var4;
            a1Var18 = a1Var3;
            a1Var19 = a1Var4;
            Boolean bool2 = Boolean.FALSE;
            a1Var17.setValue(bool2);
            F(f1Var14, 0.0f);
            G(f1Var15, 0.5f);
            H(f1Var16, 0.4f);
            I(f1Var17, 0.5f);
            a1Var18.setValue(Float.valueOf(0.0f));
            a1Var19.setValue(bool2);
        }
        a1Var5.setValue(fVar);
        r(a1Var6, gVar, g1Var, g1Var2, g1Var3, a1Var7, a1Var8, a1Var9, f1Var5, f1Var6, f1Var7, f1Var8, a1Var10, f1Var9, a1Var11, a1Var17, a1Var12, f1Var10, f1Var14, f1Var15, f1Var16, f1Var17, a1Var18, a1Var13, a1Var14, a1Var19, f1Var11, f1Var12, f1Var13, a1Var15, a1Var16, a1Var5);
    }

    public static final void r(f1.a1 a1Var, g gVar, f1.g1 g1Var, f1.g1 g1Var2, f1.g1 g1Var3, f1.a1 a1Var2, f1.a1 a1Var3, f1.a1 a1Var4, f1.f1 f1Var, f1.f1 f1Var2, f1.f1 f1Var3, f1.f1 f1Var4, f1.a1 a1Var5, f1.f1 f1Var5, f1.a1 a1Var6, f1.a1 a1Var7, f1.a1 a1Var8, f1.f1 f1Var6, f1.f1 f1Var7, f1.f1 f1Var8, f1.f1 f1Var9, f1.f1 f1Var10, f1.a1 a1Var9, f1.a1 a1Var10, f1.a1 a1Var11, f1.a1 a1Var12, f1.f1 f1Var11, f1.f1 f1Var12, f1.f1 f1Var13, f1.a1 a1Var13, f1.a1 a1Var14, f1.a1 a1Var15) {
        gVar.f10289a.edit().putInt("icon_size_dp", g1Var.g()).putInt("icon_corner_radius_percent", g1Var2.g()).putInt("icon_view_size_percent", g1Var3.g()).putBoolean("icon_show_outline", w(a1Var)).putBoolean("app_icon_highlights", y(a1Var2)).putBoolean("origin_os_highlights", z(a1Var3)).putFloat("icon_opacity", f1Var.g()).putFloat("icon_bg_opacity", f1Var2.g()).putFloat("icon_fg_opacity", f1Var3.g()).putFloat("icon_color_boost", f1Var4.g()).putBoolean("icon_opacity_customize_expanded", A(a1Var4)).putFloat("icon_highlight_angle", f1Var5.g()).putString("icon_shape", ((b) a1Var5.getValue()).name()).putString("icon_pack_package", (String) a1Var6.getValue()).putBoolean("dock_liquid_glass", B(a1Var7)).putFloat("dock_corner_radius", f1Var6.g()).putFloat("dock_blur_radius", f1Var7.g()).putFloat("dock_refraction_height", f1Var8.g()).putFloat("dock_refraction_amount", f1Var9.g()).putFloat("dock_chromatic_aberration", f1Var10.g()).putBoolean("app_icon_liquid_glass", ((Boolean) a1Var8.getValue()).booleanValue()).putFloat("dock_haze_blur_radius", s(a1Var9)).putBoolean("dock_no_glass_effect", t(a1Var10)).putBoolean("dock_no_glass_thumb", ((Boolean) a1Var11.getValue()).booleanValue()).putBoolean("dock_velocity_squish", u(a1Var12)).putFloat("dock_horizontal_padding", f1Var11.g()).putFloat("dock_vertical_padding", f1Var12.g()).putFloat("dock_icon_gap", f1Var13.g()).putBoolean("dock_show_background", v(a1Var13)).putBoolean("switch_haptics_enabled", ((Boolean) a1Var14.getValue()).booleanValue()).putString("graphic_quality", ((f) a1Var15.getValue()).name()).apply();
    }

    public static final float s(f1.a1 a1Var) {
        return ((Number) a1Var.getValue()).floatValue();
    }

    public static final boolean t(f1.a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final boolean u(f1.a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final boolean v(f1.a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final boolean w(f1.a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final String x(f1.a1 a1Var, String str) {
        Object next;
        if (str == null) {
            return "Default";
        }
        Iterator it = ((List) a1Var.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((s) next).f10634a.equals(str)) {
                break;
            }
        }
        s sVar = (s) next;
        return sVar != null ? sVar.f10635b : str;
    }

    public static final boolean y(f1.a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final boolean z(f1.a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }
}
