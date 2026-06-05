package ab;

import a2.f0;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import b0.f2;
import c1.o2;
import c1.p4;
import c1.v3;
import c1.v7;
import com.anonlab.voidlauncher.R;
import com.anonlab.voidlauncher.core.data.db.displayables.source.DisplayablesDatabase;
import com.google.android.gms.internal.ads.zzbch;
import d1.q0;
import f1.c1;
import java.util.List;
import t.j0;
import v2.e2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284a;

    public /* synthetic */ d(int i10) {
        this.f284a = i10;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        int i10 = this.f284a;
        pi.o oVar = pi.o.f13011a;
        switch (i10) {
            case 0:
                Context context = (Context) obj;
                fj.l.f(context, "context");
                return LayoutInflater.from(context).inflate(R.layout.view_displayable_item, (ViewGroup) null, false);
            case 1:
                return ((f2) obj).f1318g;
            case 2:
                return ((f2) obj).f1317f;
            case 3:
                return ((f2) obj).f1314c;
            case 4:
                return ((f2) obj).f1316e;
            case 5:
                Resources resources = (Resources) obj;
                fj.l.f(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 6:
                fj.l.f((Resources) obj, "<unused var>");
                return Boolean.FALSE;
            case 7:
                fj.l.f((Resources) obj, "<unused var>");
                return Boolean.TRUE;
            case 8:
                d3.x.d((d3.z) obj, 0);
                return oVar;
            case 9:
                d3.x.d((d3.z) obj, 1);
                return oVar;
            case 10:
                d3.x.g((d3.z) obj);
                return oVar;
            case 11:
                float f10 = o2.f2510a;
                return oVar;
            case 12:
                float f11 = v3.f2763a;
                return Boolean.TRUE;
            case 13:
                d3.x.g((d3.z) obj);
                return oVar;
            case 14:
                lj.d[] dVarArr = d3.x.f4803a;
                ((d3.z) obj).b(d3.v.f4799y, oVar);
                return oVar;
            case 15:
                return oVar;
            case 16:
                j0 j0Var = (j0) obj;
                j0Var.f15198a = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                j0Var.a(fValueOf, 300).f15190b = e1.v.f5676b;
                j0Var.a(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                j0Var.a(fValueOf2, 1800);
                j0Var.a(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                j0Var.a(fValueOf3, 3300);
                j0Var.a(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                j0Var.a(fValueOf4, 4800);
                j0Var.a(fValueOf4, 6000);
                return oVar;
            case 17:
                lj.d[] dVarArr2 = d3.x.f4803a;
                d3.y yVar = d3.v.f4787m;
                lj.d dVar = d3.x.f4803a[5];
                ((d3.z) obj).b(yVar, Boolean.TRUE);
                return oVar;
            case 18:
                f1.v vVar = v7.f2781a;
                return oVar;
            case 19:
                wk.a aVar = (wk.a) obj;
                fj.l.f(aVar, "$this$module");
                p4 p4Var = new p4(9);
                sk.b bVar = sk.b.f15087a;
                fj.f fVarA = fj.w.a(d9.a.class);
                zk.b bVar2 = al.a.f764e;
                aVar.a(new uk.d(new sk.a(bVar2, fVarA, null, p4Var, bVar)));
                aVar.a(new uk.d(new sk.a(bVar2, fj.w.a(e9.b.class), null, new p4(10), bVar)));
                aVar.a(new uk.d(new sk.a(bVar2, fj.w.a(DisplayablesDatabase.class), null, new p4(11), bVar)));
                aVar.a(new uk.d(new sk.a(bVar2, fj.w.a(f9.a.class), null, new p4(12), bVar)));
                aVar.a(new uk.d(new sk.a(bVar2, fj.w.a(f9.d.class), null, new p4(13), bVar)));
                aVar.a(new uk.d(new sk.a(bVar2, fj.w.a(f9.c.class), null, new p4(14), bVar)));
                return oVar;
            case 20:
                ((Integer) obj).getClass();
                return null;
            case zzbch.zzt.zzm /* 21 */:
                List list = (List) obj;
                return new d0.u(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 22:
                return oVar;
            case 23:
                float f12 = d1.c.f4478a;
                return oVar;
            case 24:
                e2 e2Var = (e2) obj;
                fj.l.d(e2Var, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                q0 q0Var = (q0) e2Var;
                q0Var.I = false;
                v2.n.o(q0Var);
                return Boolean.FALSE;
            case 25:
                List list2 = (List) obj;
                return new e0.v(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 26:
                ((Integer) obj).getClass();
                e0.l lVar = e0.w.f5348a;
                return qi.s.f13520a;
            case 27:
                ((Integer) obj).getClass();
                e0.l lVar2 = e0.w.f5348a;
                return -1;
            default:
                f0 f0Var = ((c1) obj).f6276a;
                if (f0Var != null) {
                    f0Var.a();
                }
                return oVar;
        }
    }

    public /* synthetic */ d(int i10, d0.o oVar) {
        this.f284a = 22;
    }
}
