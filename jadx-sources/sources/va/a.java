package va;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.y;
import c1.p3;
import c1.v3;
import c2.e0;
import com.anonlab.voidlauncher.R;
import d1.u0;
import f1.i0;
import f1.t1;
import java.util.List;
import k0.x;
import ra.i1;
import v0.g0;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final p1.e f17900a = new p1.e(new d1.a(26), false, -15662992);

    /* renamed from: b, reason: collision with root package name */
    public static final p1.e f17901b = new p1.e(new d1.a(27), false, 1842657198);

    /* renamed from: c, reason: collision with root package name */
    public static final p1.e f17902c = new p1.e(new ua.a(4), false, -1839471287);

    /* renamed from: d, reason: collision with root package name */
    public static final p1.e f17903d = new p1.e(new ua.a(5), false, -910311192);

    public static final void a(mi.p pVar, ej.a aVar, ej.a aVar2, i0 i0Var, int i10) {
        fj.l.f(aVar, "onDismiss");
        fj.l.f(aVar2, "onConfirm");
        i0Var.c0(1835382548);
        int i11 = i10 | (i0Var.h(aVar2) ? 256 : 128);
        if (i0Var.T(i11 & 1, (i11 & 145) != 144)) {
            v3.a(aVar, null, v3.f(null, i0Var, 0, 3), 0.0f, false, null, e0.d(4280032286L), 0L, 0.0f, 0L, null, null, null, p1.j.d(-417742350, new u0(3, aVar2), i0Var), i0Var, 1572870, 3072, 8122);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new x(pVar, aVar, aVar2, i10, 6);
        }
    }

    public static final void b(final int i10, final boolean z2, final float f10, final float f11, final float f12, final float f13, final float f14, final float f15, final int i11, final float f16, final xa.b bVar, final boolean z10, final float f17, final Bitmap bitmap, i0 i0Var, final int i12) {
        int i13;
        i0Var.c0(2084326697);
        if ((i12 & 6) == 0) {
            i13 = (i0Var.d(i10) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 3072) == 0) {
            i13 |= i0Var.c(f11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= i0Var.c(f12) ? 16384 : 8192;
        }
        if ((100663296 & i12) == 0) {
            i13 |= i0Var.c(72.0f) ? 67108864 : 33554432;
        }
        if ((805306368 & i12) == 0) {
            i13 |= i0Var.d(i11) ? 536870912 : 268435456;
        }
        char c6 = '\u4000';
        int i14 = (i0Var.c(f16) ? (char) 4 : (char) 2) | (i0Var.f(bVar) ? ' ' : (char) 16) | (i0Var.g(z10) ? 256 : 128) | (i0Var.c(f17) ? 2048 : 1024);
        if (!i0Var.h(bitmap)) {
            c6 = '\u2000';
        }
        int i15 = i14 | c6;
        if (i0Var.T(i13 & 1, ((i13 & 301999107) == 301999106 && (i15 & 9363) == 9362) ? false : true)) {
            float fSqrt = (float) Math.sqrt(2.0d);
            long j = (long) ((1.0f - ((((((i10 / 3) - 1) * f12) + (((i10 % 3) - 1) * f11)) + fSqrt) / (fSqrt * 2.0f))) * 110.0f);
            boolean z11 = (i13 & 14) == 4;
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (z11 || objQ == obj) {
                objQ = t.d.a(1.0f, 0.01f);
                i0Var.l0(objQ);
            }
            t.c cVar = (t.c) objQ;
            boolean zH = i0Var.h(cVar) | i0Var.e(j);
            Object objQ2 = i0Var.Q();
            if (zH || objQ2 == obj) {
                objQ2 = new g0(cVar, j, null, 1);
                i0Var.l0(objQ2);
            }
            f1.s.f((ej.e) objQ2, i0Var, pi.o.f13011a);
            v1.o oVarK = b0.t1.k(72.0f * f16, v1.l.f17564b);
            boolean zH2 = i0Var.h(cVar);
            Object objQ3 = i0Var.Q();
            if (zH2 || objQ3 == obj) {
                objQ3 = new p3(cVar, 3);
                i0Var.l0(objQ3);
            }
            v1.o oVarQ = e0.q(oVarK, (ej.c) objQ3);
            Object objQ4 = i0Var.Q();
            if (objQ4 == obj) {
                objQ4 = new ta.n(22);
                i0Var.l0(objQ4);
            }
            ej.c cVar2 = (ej.c) objQ4;
            boolean zH3 = ((i13 & 1879048192) == 536870912) | ((i15 & 112) == 32) | ((i15 & 896) == 256) | ((i15 & 7168) == 2048) | i0Var.h(bitmap);
            Object objQ5 = i0Var.Q();
            if (zH3 || objQ5 == obj) {
                Object obj2 = new ej.c() { // from class: va.r
                    @Override // ej.c
                    public final Object invoke(Object obj3) {
                        View view = (View) obj3;
                        fj.l.f(view, "view");
                        ImageView imageView = (ImageView) view.findViewById(R.id.app_icon_image);
                        fj.l.c(imageView);
                        xa.a.a(imageView, i11, bVar, Boolean.valueOf(z10), Float.valueOf(f17), 32);
                        imageView.setImageBitmap(bitmap);
                        view.findViewById(R.id.app_icon_selection_badge).setVisibility(8);
                        return pi.o.f13011a;
                    }
                };
                i0Var.l0(obj2);
                objQ5 = obj2;
            }
            v3.j.a(6, 0, cVar2, (ej.c) objQ5, i0Var, oVarQ);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: va.s
                @Override // ej.e
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iO = f1.s.O(i12 | 1);
                    a.b(i10, z2, f10, f11, f12, f13, f14, f15, i11, f16, bVar, z10, f17, bitmap, (i0) obj3, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void c(final v1.o oVar, final List list, final ga.c cVar, final boolean z2, final float f10, final float f11, final float f12, final float f13, final float f14, final float f15, final ej.c cVar2, i0 i0Var, final int i10) {
        i0 i0Var2;
        final xa.b bVar;
        fj.l.f(oVar, "modifier");
        fj.l.f(list, "items");
        fj.l.f(cVar2, "onDisplayableItemClick");
        i0Var.c0(-1611630304);
        int i11 = i10 | (i0Var.h(list) ? 32 : 16) | (i0Var.f(cVar) ? 131072 : 65536) | (i0Var.g(z2) ? 1048576 : 524288) | (i0Var.c(f10) ? 8388608 : 4194304) | (i0Var.c(f11) ? 67108864 : 33554432) | (i0Var.c(f12) ? 536870912 : 268435456);
        if (i0Var.T(i11 & 1, ((306783251 & i11) == 306783250 && (((((i0Var.c(f14) ? ' ' : (char) 16) | (i0Var.c(f13) ? (char) 4 : (char) 2)) | (i0Var.c(f15) ? 256 : 128)) | (i0Var.h(cVar2) ? 2048 : 1024)) & 1171) == 1170) ? false : true)) {
            final s3.c cVar3 = (s3.c) i0Var.j(f1.f18262h);
            xa.b bVar2 = (xa.b) i0Var.j(xa.c.f19854a);
            if (bVar2 == null) {
                i0Var.b0(-1777176714);
                Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
                fj.l.f(context, "context");
                Resources resources = context.getResources();
                xa.b bVar3 = new xa.b(r14.m() / 100.0f, r14.q() / 100.0f, resources.getDimensionPixelOffset(R.dimen.app_icon_badge_offset), resources.getBoolean(R.bool.app_icon_label_visible), new lb.g(context).n());
                i0Var.p(false);
                bVar = bVar3;
            } else {
                i0Var.b0(-1777178760);
                i0Var.p(false);
                bVar = bVar2;
            }
            float f16 = bVar.f19850b;
            boolean zF = i0Var.f(cVar3) | i0Var.c(f16);
            Object objQ = i0Var.Q();
            if (zF || objQ == f1.m.f6385a) {
                objQ = Integer.valueOf(cVar3.I0(72.0f * f16));
                i0Var.l0(objQ);
            }
            final int iIntValue = ((Number) objQ).intValue();
            final boolean zBooleanValue = ((Boolean) i0Var.j(jb.f.f8824d)).booleanValue();
            final float fFloatValue = ((Number) i0Var.j(jb.f.f8823c)).floatValue();
            i0Var2 = i0Var;
            f1.s.a(jb.f.f8821a.a(new s3.f(72.0f)), p1.j.d(1885695072, new ej.e() { // from class: va.n
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    i0 i0Var3 = (i0) obj;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    if (i0Var3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        v1.o oVarC = z1.h.c(oVar, cVar);
                        final s3.c cVar4 = cVar3;
                        final List list2 = list;
                        final ej.c cVar5 = cVar2;
                        final boolean z10 = z2;
                        final float f17 = f10;
                        final float f18 = f11;
                        final float f19 = f12;
                        final float f20 = f13;
                        final float f21 = f14;
                        final float f22 = f15;
                        final int i12 = iIntValue;
                        final xa.b bVar4 = bVar;
                        final boolean z11 = zBooleanValue;
                        final float f23 = fFloatValue;
                        b0.d.a(oVarC, null, p1.j.d(86980042, new ej.f() { // from class: va.p
                            @Override // ej.f
                            public final Object c(Object obj3, Object obj4, Object obj5) {
                                y yVar = (y) obj3;
                                i0 i0Var4 = (i0) obj4;
                                int iIntValue3 = ((Integer) obj5).intValue();
                                fj.l.f(yVar, "$this$BoxWithConstraints");
                                long j = yVar.f1460b;
                                if ((iIntValue3 & 6) == 0) {
                                    iIntValue3 |= i0Var4.f(yVar) ? 4 : 2;
                                }
                                if (i0Var4.T(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                    float fH0 = s3.a.c(j) ? cVar4.h0(s3.a.g(j)) : (3 * 72.0f) + (2 * 18.0f);
                                    e0.a aVar = new e0.a(3);
                                    v1.o oVarT = b0.d.t(18.0f, b0.t1.f(b0.t1.c(1.0f, v1.l.f17564b), 0.0f, fH0, 1));
                                    final List list3 = list2;
                                    boolean zH = i0Var4.h(list3);
                                    final ej.c cVar6 = cVar5;
                                    boolean zF2 = zH | i0Var4.f(cVar6);
                                    final boolean z12 = z10;
                                    boolean zG = zF2 | i0Var4.g(z12);
                                    final float f24 = f17;
                                    boolean zC = zG | i0Var4.c(f24);
                                    final float f25 = f18;
                                    boolean zC2 = zC | i0Var4.c(f25);
                                    final float f26 = f19;
                                    boolean zC3 = zC2 | i0Var4.c(f26);
                                    final float f27 = f20;
                                    boolean zC4 = zC3 | i0Var4.c(f27);
                                    final float f28 = f21;
                                    boolean zC5 = zC4 | i0Var4.c(f28);
                                    final float f29 = f22;
                                    boolean zC6 = i0Var4.c(72.0f) | zC5 | i0Var4.c(f29);
                                    final int i13 = i12;
                                    boolean zD = zC6 | i0Var4.d(i13);
                                    final xa.b bVar5 = bVar4;
                                    boolean zF3 = zD | i0Var4.f(bVar5);
                                    final boolean z13 = z11;
                                    boolean zG2 = zF3 | i0Var4.g(z13);
                                    final float f30 = f23;
                                    boolean zC7 = zG2 | i0Var4.c(f30);
                                    Object objQ2 = i0Var4.Q();
                                    if (zC7 || objQ2 == f1.m.f6385a) {
                                        ej.c cVar7 = new ej.c() { // from class: va.q
                                            @Override // ej.c
                                            public final Object invoke(Object obj6) {
                                                e0.g gVar = (e0.g) obj6;
                                                fj.l.f(gVar, "$this$LazyVerticalGrid");
                                                List list4 = list3;
                                                gVar.p(list4.size(), null, new i1(4, list4), new p1.e(new t(list4, cVar6, z12, f24, f25, f26, f27, f28, f29, i13, bVar5, z13, f30), true, -1942245546));
                                                return pi.o.f13011a;
                                            }
                                        };
                                        i0Var4.l0(cVar7);
                                        objQ2 = cVar7;
                                    }
                                    hj.a.b(aVar, oVarT, null, null, null, null, null, true, null, (ej.c) objQ2, i0Var4, 100663296, 764);
                                } else {
                                    i0Var4.W();
                                }
                                return pi.o.f13011a;
                            }
                        }, i0Var3), i0Var3, 3072, 6);
                    } else {
                        i0Var3.W();
                    }
                    return pi.o.f13011a;
                }
            }, i0Var2), i0Var2, 56);
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
        }
        t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(list, cVar, z2, f10, f11, f12, f13, f14, f15, cVar2, i10) { // from class: va.o
                public final /* synthetic */ float A;
                public final /* synthetic */ float B;
                public final /* synthetic */ float C;
                public final /* synthetic */ ej.c D;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ List f17964b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ga.c f17965c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f17966d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f17967e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f17968f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ float f17969z;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(28039);
                    a.c(this.f17963a, this.f17964b, this.f17965c, this.f17966d, this.f17967e, this.f17968f, this.f17969z, this.A, this.B, this.C, this.D, (i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final Bitmap d(List list, int i10, float f10, float f11) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
        fj.l.e(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f12 = i10;
        float f13 = 0.06f * f12;
        float f14 = 2.0f;
        float f15 = (f12 - (f13 * 2.0f)) / 3;
        float f16 = 0.24f * f12 * f11;
        float f17 = f16 * f10;
        Path path = new Path();
        cg.b.z(path, f12, f12, f12 * f10);
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(35, 231, 233, 238));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);
        Paint paint2 = new Paint(3);
        Path path2 = new Path();
        Rect rect = new Rect();
        RectF rectF = new RectF();
        int i11 = 0;
        for (Object obj : qi.l.M0(list, 9)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                yd.f.i0();
                throw null;
            }
            float f18 = f14;
            float f19 = (f15 - f16) / f18;
            float f20 = ((i11 % 3) * f15) + f13 + f19;
            float f21 = ((i11 / 3) * f15) + f13 + f19;
            Bitmap bitmap = ((xa.f) obj).f19864c.f19855a;
            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            rectF.set(f20, f21, f20 + f16, f21 + f16);
            path2.reset();
            cg.b.z(path2, f16, f16, f17);
            path2.offset(f20, f21);
            canvas.save();
            canvas.clipPath(path2);
            canvas.drawBitmap(bitmap, rect, rectF, paint2);
            canvas.restore();
            f14 = f18;
            i11 = i12;
            bitmapCreateBitmap = bitmapCreateBitmap;
            f13 = f13;
        }
        return bitmapCreateBitmap;
    }
}
