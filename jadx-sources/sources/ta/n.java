package ta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.internal.ads.zzbch;
import f1.n1;
import f1.r2;
import s.a1;
import s.f0;
import s.n0;
import s.s0;
import s.t0;
import v.k1;
import v.l1;
import v2.h0;
import w2.f1;
import x.g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16169a;

    public /* synthetic */ n(int i10) {
        this.f16169a = i10;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        f0 f0Var;
        int i10 = this.f16169a;
        int i11 = 11;
        boolean z2 = false;
        pi.o oVar = pi.o.f13011a;
        switch (i10) {
            case 0:
                ((Float) obj).getClass();
                float f10 = u.f16202a;
                break;
            case 1:
                fj.l.f((s.r) obj, "$this$AnimatedContent");
                s0 s0VarC = n0.c(t.d.t(180, 0, null, 6), 2);
                t0 t0VarD = n0.d(t.d.t(120, 0, null, 6), 2);
                int i12 = s.j.f14633b;
                break;
            case 2:
                fj.l.f((m) obj, "it");
                break;
            case 3:
                fj.l.f((String) obj, "it");
                break;
            case 4:
                break;
            case 5:
                e7.c cVar = (e7.c) obj;
                fj.l.f(cVar, "it");
                break;
            case 6:
                e7.c cVar2 = (e7.c) obj;
                fj.l.f(cVar2, "statement");
                ri.i iVar = new ri.i();
                while (cVar2.a0()) {
                    iVar.add(Integer.valueOf((int) cVar2.getLong(0)));
                }
                break;
            case 7:
                xa.f fVar = (xa.f) obj;
                fj.l.f(fVar, "it");
                break;
            case 8:
                Context context = (Context) obj;
                fj.l.f(context, "ctx");
                break;
            case 9:
                s.r rVar = (s.r) obj;
                fj.l.f(rVar, "$this$AnimatedContent");
                int i13 = 10;
                if (rVar.c() != ua.c.f16895c) {
                    if (rVar.c() == ua.c.f16894b) {
                        s0 s0VarA = n0.f(new n(i13), t.d.t(260, 0, null, 6)).a(n0.c(null, 3));
                        t0 t0VarA = n0.g(new n(12), t.d.t(260, 0, null, 6)).a(n0.d(null, 3));
                        int i14 = s.j.f14633b;
                        f0Var = new f0(s0VarA, t0VarA);
                    } else {
                        s0 s0VarA2 = n0.f(new n(13), t.d.t(260, 0, null, 6)).a(n0.c(null, 3));
                        t0 t0VarA2 = n0.g(new n(i13), t.d.t(260, 0, null, 6)).a(n0.d(null, 3));
                        int i15 = s.j.f14633b;
                        f0Var = new f0(s0VarA2, t0VarA2);
                    }
                    f0Var.f14597d = new a1(false);
                    break;
                } else {
                    s0 s0VarA3 = n0.c(null, 3).a(n0.f(new n(i13), t.d.t(260, 0, null, 6)));
                    t0 t0VarA3 = n0.d(null, 3).a(n0.g(new n(i11), t.d.t(260, 0, null, 6)));
                    int i16 = s.j.f14633b;
                    break;
                }
            case 10:
                Integer num = (Integer) obj;
                num.intValue();
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                ((h0) obj).f();
                break;
            case 15:
                break;
            case 16:
                ((Long) obj).getClass();
                break;
            case 17:
                int i17 = v.k.f17240a;
                r2 r2Var = AndroidCompositionLocals_androidKt.f838b;
                n1 n1Var = (n1) obj;
                n1Var.getClass();
                Context context2 = (Context) f1.s.H(n1Var, r2Var);
                s3.c cVar3 = (s3.c) f1.s.H(n1Var, f1.f18262h);
                k1 k1Var = (k1) f1.s.H(n1Var, l1.f17243a);
                if (k1Var != null) {
                    break;
                }
                break;
            case 18:
                d3.i iVar2 = d3.i.f4720c;
                lj.d[] dVarArr = d3.x.f4803a;
                d3.y yVar = d3.v.f4778c;
                lj.d dVar = d3.x.f4803a[1];
                ((d3.z) obj).b(yVar, iVar2);
                break;
            case 19:
                break;
            case 20:
                b2.b bVar = (b2.b) obj;
                long j = bVar.f1500a;
                if ((9223372034707292159L & j) == 9205357640488583168L) {
                    break;
                } else {
                    break;
                }
            case zzbch.zzt.zzm /* 21 */:
                t.m mVar = (t.m) obj;
                float f11 = mVar.f15229a;
                float f12 = mVar.f15230b;
                break;
            case 22:
                Context context3 = (Context) obj;
                fj.l.f(context3, "ctx");
                View viewInflate = LayoutInflater.from(context3).inflate(R.layout.view_app_icon_helper, (ViewGroup) null, false);
                fj.l.e(viewInflate, "inflate(...)");
                break;
            case 23:
                Context context4 = (Context) obj;
                fj.l.f(context4, "context");
                View viewInflate2 = LayoutInflater.from(context4).inflate(R.layout.view_displayable_item, (ViewGroup) null, false);
                fj.l.e(viewInflate2, "inflate(...)");
                break;
            case 24:
                r2 r2Var2 = AndroidCompositionLocals_androidKt.f838b;
                n1 n1Var2 = (n1) obj;
                n1Var2.getClass();
                if (!((Context) f1.s.H(n1Var2, r2Var2)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    x.d.f19482a.getClass();
                    break;
                } else {
                    break;
                }
            case 25:
                float f13 = g0.f19530a;
                break;
            case 26:
                break;
            case 27:
                p2.g0 g0Var = (p2.g0) obj;
                if (g0Var != null && g0Var.f12697a == 2) {
                    z2 = true;
                }
                break;
            case 28:
                ((Float) obj).getClass();
                break;
            default:
                wk.a aVar = (wk.a) obj;
                fj.l.f(aVar, "$this$module");
                aVar.a(new uk.d(new sk.a(al.a.f764e, fj.w.a(qj.z.class), new zk.b("globalScope"), new ua.a(i11), sk.b.f15087a)));
                break;
        }
        return oVar;
    }
}
