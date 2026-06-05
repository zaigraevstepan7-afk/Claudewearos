package ag;

import android.R;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import c1.u1;
import com.anonlab.voidlauncher.feature.home.presentation.HomeActivity;
import com.google.android.gms.internal.ads.zzcfe;
import com.google.android.gms.internal.ads.zzcgu;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.security.Provider;
import java.security.Security;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import m.d0;
import p2.w;
import p2.x;
import q.o0;
import qj.e1;
import qj.z;
import rg.a0;
import rg.h0;
import rg.y;
import t.c0;
import t.m1;
import t.r1;
import t.t1;
import t4.s;
import t6.d1;
import t6.e0;
import t6.f0;
import t6.t0;
import tj.r0;
import w2.t;
import w5.v;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class i implements j, wb.b, e7.b, kh.b, d0, zzcgu, pg.b, mg.l, ug.d, y, se.b, t1, d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f448a;

    /* renamed from: b, reason: collision with root package name */
    public Object f449b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f448a = i10;
        this.f449b = obj;
    }

    public static i B(Object obj) {
        if (obj != null) {
            return new i(obj, 10);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public ef.d A(ef.d dVar) {
        return dVar instanceof ef.j ? dVar : new ef.b(-((ef.i) this.f449b).i(), dVar);
    }

    public void C() {
        View view = (View) this.f449b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void D() {
        ((v) this.f449b).f18779z.P();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(t6.t0 r9, c1.u1 r10, c1.u1 r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f449b
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.getClass()
            r1 = 0
            r9.n(r1)
            t6.b0 r1 = r0.f1182e0
            r2 = r1
            t6.h r2 = (t6.h) r2
            if (r10 == 0) goto L22
            r2.getClass()
            int r4 = r10.f2736a
            int r6 = r11.f2736a
            if (r4 != r6) goto L24
            int r1 = r10.f2737b
            int r3 = r11.f2737b
            if (r1 == r3) goto L22
            goto L24
        L22:
            r3 = r9
            goto L2e
        L24:
            int r5 = r10.f2737b
            int r7 = r11.f2737b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L3d
        L2e:
            r2.l(r3)
            android.view.View r9 = r3.f16046a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.f15905i
            r9.add(r3)
            r9 = 1
        L3d:
            if (r9 == 0) goto L42
            r0.R()
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.i.E(t6.t0, c1.u1, c1.u1):void");
    }

    public void F(t0 t0Var, u1 u1Var, u1 u1Var2) {
        boolean zG;
        RecyclerView recyclerView = (RecyclerView) this.f449b;
        recyclerView.f1175b.k(t0Var);
        recyclerView.e(t0Var);
        t0Var.n(false);
        t6.h hVar = (t6.h) recyclerView.f1182e0;
        hVar.getClass();
        int i10 = u1Var.f2736a;
        int i11 = u1Var.f2737b;
        View view = t0Var.f16046a;
        int left = u1Var2 == null ? view.getLeft() : u1Var2.f2736a;
        int top = u1Var2 == null ? view.getTop() : u1Var2.f2737b;
        if (t0Var.h() || (i10 == left && i11 == top)) {
            hVar.l(t0Var);
            hVar.f15904h.add(t0Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = hVar.g(t0Var, i10, i11, left, top);
        }
        if (zG) {
            recyclerView.R();
        }
    }

    public p2.h G(mh.g gVar, t tVar) {
        int i10;
        long jK;
        long j;
        boolean z2;
        q.p pVar = (q.p) this.f449b;
        List list = (List) gVar.f11707b;
        q.p pVar2 = new q.p(list.size());
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            p2.y yVar = (p2.y) list.get(i11);
            long j4 = yVar.f12779a;
            x xVar = (x) pVar.b(j4);
            if (xVar == null) {
                i10 = i11;
                j = yVar.f12780b;
                jK = yVar.f12782d;
                z2 = false;
            } else {
                long j10 = xVar.f12776a;
                boolean z10 = xVar.f12778c;
                i10 = i11;
                jK = tVar.K(xVar.f12777b);
                j = j10;
                z2 = z10;
            }
            long j11 = yVar.f12779a;
            List list2 = list;
            int i12 = size;
            pVar2.e(j11, new w(j11, yVar.f12780b, yVar.f12782d, yVar.f12783e, yVar.f12784f, j, jK, z2, yVar.f12785g, yVar.f12787i, yVar.j, yVar.f12788k, yVar.f12789l, yVar.f12790m));
            boolean z11 = yVar.f12783e;
            if (z11) {
                pVar.e(j4, new x(yVar.f12780b, yVar.f12781c, z11));
            } else {
                pVar.f(j4);
            }
            i11 = i10 + 1;
            list = list2;
            size = i12;
        }
        return new p2.h(pVar2, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(sj.g r21, ej.a r22) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.i.H(sj.g, ej.a):java.lang.Object");
    }

    public void I() {
        View viewFindViewById;
        View view = (View) this.f449b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new s(viewFindViewById, 0));
    }

    @Override // t.t1, t.q1
    public boolean a() {
        ((a8.j) this.f449b).getClass();
        return false;
    }

    @Override // t.q1
    public long b(t.p pVar, t.p pVar2, t.p pVar3) {
        return ((a8.j) this.f449b).b(pVar, pVar2, pVar3);
    }

    @Override // mg.l
    public void c(mg.b bVar) {
        fj.l.f(bVar, "error");
        Log.e("HomeActivity", "Firebase cancelled: " + bVar.f11672b);
    }

    @Override // t.q1
    public t.p d(long j, t.p pVar, t.p pVar2, t.p pVar3) {
        return ((a8.j) this.f449b).d(j, pVar, pVar2, pVar3);
    }

    @Override // t6.d1
    public int e(View view) {
        return (view.getTop() - ((f0) view.getLayoutParams()).f15894b.top) - ((ViewGroup.MarginLayoutParams) ((f0) view.getLayoutParams())).topMargin;
    }

    @Override // e7.b
    public e7.a f(String str) {
        fj.l.f(str, "fileName");
        f7.e eVar = (f7.e) this.f449b;
        String databaseName = eVar.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                throw new IllegalArgumentException(m1.j("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested.").toString());
            }
        } else if (!databaseName.equals(str) && !nj.e.W0('/', databaseName, databaseName).equals(nj.e.W0('/', str, str))) {
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + eVar.getDatabaseName() + "' but '" + str + "' was requested.").toString());
        }
        return new h7.a(eVar.H());
    }

    @Override // oi.a
    public Object get() {
        switch (this.f448a) {
            case 2:
                String packageName = ((Context) ((oi.a) this.f449b).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 9:
                return new jh.f((jh.g) ((i) this.f449b).f449b);
            default:
                return this.f449b;
        }
    }

    @Override // t6.d1
    public int h() {
        return ((e0) this.f449b).G();
    }

    @Override // ug.d
    public Object i(rg.h hVar, Object obj, Object obj2) {
        switch (this.f448a) {
            case 20:
                return ((rg.b) obj2).b(((rg.h) this.f449b).e(hVar), (r) obj);
            default:
                ((ArrayList) this.f449b).add(new AbstractMap.SimpleImmutableEntry(hVar, obj));
                return null;
        }
    }

    @Override // t.q1
    public t.p j(t.p pVar, t.p pVar2, t.p pVar3) {
        return ((a8.j) this.f449b).j(pVar, pVar2, pVar3);
    }

    @Override // t.q1
    public t.p k(long j, t.p pVar, t.p pVar2, t.p pVar3) {
        return ((a8.j) this.f449b).k(j, pVar, pVar2, pVar3);
    }

    @Override // t6.d1
    public int l() {
        e0 e0Var = (e0) this.f449b;
        return e0Var.f15882o - e0Var.D();
    }

    @Override // rg.y
    public void m(wg.h hVar, a0 a0Var, h0 h0Var, h0 h0Var2) {
        ((rg.k) this.f449b).j(new rg.i(this, hVar, h0Var2));
    }

    @Override // mg.l
    public void n(mg.a aVar) {
        r0 r0Var = ((HomeActivity) this.f449b).M;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.k(null, bool);
    }

    @Override // pg.b
    public void p(String str) {
        ((TaskCompletionSource) this.f449b).setResult(str);
    }

    @Override // ag.j
    public Object q(String str) {
        l lVar = (l) this.f449b;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            Provider provider = Security.getProvider(strArr[i11]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            try {
                return lVar.b(str, (Provider) obj);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        return lVar.b(str, null);
    }

    @Override // t6.d1
    public View s(int i10) {
        return ((e0) this.f449b).u(i10);
    }

    @Override // t6.d1
    public int v(View view) {
        return view.getBottom() + ((f0) view.getLayoutParams()).f15894b.bottom + ((ViewGroup.MarginLayoutParams) ((f0) view.getLayoutParams())).bottomMargin;
    }

    @Override // e7.b
    public boolean w() {
        return true;
    }

    @Override // pg.b
    public void x(String str) {
        ((TaskCompletionSource) this.f449b).setException(new Exception(str));
    }

    public void z(x6.a aVar) {
        fj.l.f(aVar, "migration");
        int i10 = aVar.f19837a;
        int i11 = aVar.f19838b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f449b;
        Integer numValueOf = Integer.valueOf(i10);
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i11))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + aVar);
        }
        treeMap2.put(Integer.valueOf(i11), aVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public void zza(boolean z2, int i10, String str, String str2) {
        zzcfe zzcfeVar = ((pc.i) this.f449b).f12843c;
        if (zzcfeVar != null) {
            zzcfeVar.zzaa();
        }
    }

    public i(z zVar, ab.k kVar, lb.d dVar, androidx.lifecycle.h0 h0Var) {
        this.f448a = 13;
        this.f449b = u6.v.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 6, null);
        new AtomicInteger(0);
        e1 e1Var = (e1) zVar.Q().C(qj.w.f13632b);
        if (e1Var != null) {
            e1Var.T(new ab.m(kVar, this, dVar, 12));
        }
    }

    public i(f7.e eVar) {
        this.f448a = 7;
        fj.l.f(eVar, "openHelper");
        this.f449b = eVar;
    }

    public i(int i10) {
        this.f448a = i10;
        switch (i10) {
            case 5:
                break;
            case 14:
                q.h0 h0Var = o0.f13110a;
                this.f449b = new q.h0();
                break;
            case 15:
                this.f449b = new q.p((Object) null);
                break;
            case 18:
                this.f449b = new ConcurrentHashMap();
                new AtomicInteger(0);
                break;
            case 27:
                this.f449b = new LinkedHashMap();
                break;
            default:
                this.f449b = f1.s.A(Boolean.FALSE);
                break;
        }
    }

    public i(oh.b bVar) {
        this.f448a = 1;
        Collections.synchronizedMap(new HashMap());
        this.f449b = bVar;
    }

    public i(float f10, float f11, t.p pVar) {
        t.q cVar;
        this.f448a = 23;
        int[] iArr = r1.f15270a;
        if (pVar != null) {
            cVar = new yh.c(f10, f11, pVar);
        } else {
            d8.e eVar = new d8.e();
            eVar.f5001a = new c0(f10, f11, 0.01f);
            cVar = eVar;
        }
        this.f449b = new a8.j(cVar);
    }

    @Override // m.d0
    public void g(int i10) {
    }

    @Override // rg.y
    public void r(wg.h hVar) {
    }

    @Override // m.d0
    public void u(int i10) {
    }

    @Override // m.d0
    public void y(int i10, float f10) {
    }
}
