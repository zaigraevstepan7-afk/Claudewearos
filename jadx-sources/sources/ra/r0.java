package ra;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.anonlab.voidlauncher.R;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r0 extends androidx.lifecycle.x0 {
    public Map A;
    public final LinkedHashMap B;
    public qj.s1 C;

    /* renamed from: b, reason: collision with root package name */
    public final tj.r0 f14145b;

    /* renamed from: c, reason: collision with root package name */
    public final tj.d0 f14146c;

    /* renamed from: d, reason: collision with root package name */
    public final tj.h0 f14147d;

    /* renamed from: e, reason: collision with root package name */
    public final tj.c0 f14148e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f14149f;

    /* renamed from: g, reason: collision with root package name */
    public final qa.c f14150g;

    /* renamed from: h, reason: collision with root package name */
    public final qa.e f14151h;

    /* renamed from: i, reason: collision with root package name */
    public final ja.m f14152i;
    public final ja.l j;

    /* renamed from: k, reason: collision with root package name */
    public final ja.k f14153k;

    /* renamed from: l, reason: collision with root package name */
    public Object f14154l;

    /* renamed from: m, reason: collision with root package name */
    public Object f14155m;

    /* renamed from: n, reason: collision with root package name */
    public List f14156n;

    /* renamed from: o, reason: collision with root package name */
    public List f14157o;

    /* renamed from: p, reason: collision with root package name */
    public Set f14158p;

    /* renamed from: q, reason: collision with root package name */
    public final long f14159q;

    /* renamed from: r, reason: collision with root package name */
    public final tj.r0 f14160r;

    /* renamed from: s, reason: collision with root package name */
    public final tj.r0 f14161s;

    /* renamed from: t, reason: collision with root package name */
    public final tj.d0 f14162t;

    /* renamed from: u, reason: collision with root package name */
    public oa.e f14163u;

    /* renamed from: v, reason: collision with root package name */
    public List f14164v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14165w;

    /* renamed from: x, reason: collision with root package name */
    public final pi.m f14166x;

    /* renamed from: y, reason: collision with root package name */
    public final pi.m f14167y;

    /* renamed from: z, reason: collision with root package name */
    public final pi.m f14168z;

    public r0(Context context, qa.c cVar, qa.e eVar, ja.m mVar, ja.l lVar, ja.k kVar) {
        ib.v0 v0Var = ib.v0.f8461w;
        fj.l.f(v0Var, "initialState");
        tj.r0 r0VarB = tj.i0.b(v0Var);
        this.f14145b = r0VarB;
        this.f14146c = new tj.d0(r0VarB);
        final int i10 = 0;
        ti.c cVar2 = null;
        tj.h0 h0VarA = tj.i0.a(0, 6, null);
        this.f14147d = h0VarA;
        this.f14148e = new tj.c0(h0VarA);
        this.f14149f = context;
        this.f14150g = cVar;
        this.f14151h = eVar;
        this.f14152i = mVar;
        this.j = lVar;
        this.f14153k = kVar;
        qi.t tVar = qi.t.f13521a;
        this.f14154l = tVar;
        this.f14155m = tVar;
        qi.s sVar = qi.s.f13520a;
        this.f14156n = sVar;
        this.f14157o = sVar;
        oj.f fVar = oj.a.f12531b;
        long jJ0 = yd.f.j0(45, oj.c.f12539e);
        this.f14159q = jJ0;
        this.f14160r = tj.i0.b(new oj.a(jJ0));
        tj.r0 r0VarB2 = tj.i0.b(LocalDateTime.now());
        this.f14161s = r0VarB2;
        this.f14162t = new tj.d0(r0VarB2);
        this.f14164v = sVar;
        this.f14166x = u6.v.Q(new ej.a(this) { // from class: ra.j0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f14036b;

            {
                this.f14036b = this;
            }

            @Override // ej.a
            public final Object a() {
                float f10;
                switch (i10) {
                    case 0:
                        Context context2 = this.f14036b.f14149f;
                        fj.l.f(context2, "context");
                        Resources resources = context2.getResources();
                        return new xa.b(r2.m() / 100.0f, r2.q() / 100.0f, resources.getDimensionPixelOffset(R.dimen.app_icon_badge_offset), resources.getBoolean(R.bool.app_icon_label_visible), new lb.g(context2).n());
                    case 1:
                        f10 = ((xa.b) this.f14036b.f14166x.getValue()).f19849a;
                        break;
                    default:
                        f10 = ((xa.b) this.f14036b.f14166x.getValue()).f19850b;
                        break;
                }
                return Float.valueOf(f10);
            }
        });
        final int i11 = 1;
        this.f14167y = u6.v.Q(new ej.a(this) { // from class: ra.j0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f14036b;

            {
                this.f14036b = this;
            }

            @Override // ej.a
            public final Object a() {
                float f10;
                switch (i11) {
                    case 0:
                        Context context2 = this.f14036b.f14149f;
                        fj.l.f(context2, "context");
                        Resources resources = context2.getResources();
                        return new xa.b(r2.m() / 100.0f, r2.q() / 100.0f, resources.getDimensionPixelOffset(R.dimen.app_icon_badge_offset), resources.getBoolean(R.bool.app_icon_label_visible), new lb.g(context2).n());
                    case 1:
                        f10 = ((xa.b) this.f14036b.f14166x.getValue()).f19849a;
                        break;
                    default:
                        f10 = ((xa.b) this.f14036b.f14166x.getValue()).f19850b;
                        break;
                }
                return Float.valueOf(f10);
            }
        });
        final int i12 = 2;
        this.f14168z = u6.v.Q(new ej.a(this) { // from class: ra.j0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f14036b;

            {
                this.f14036b = this;
            }

            @Override // ej.a
            public final Object a() {
                float f10;
                switch (i12) {
                    case 0:
                        Context context2 = this.f14036b.f14149f;
                        fj.l.f(context2, "context");
                        Resources resources = context2.getResources();
                        return new xa.b(r2.m() / 100.0f, r2.q() / 100.0f, resources.getDimensionPixelOffset(R.dimen.app_icon_badge_offset), resources.getBoolean(R.bool.app_icon_label_visible), new lb.g(context2).n());
                    case 1:
                        f10 = ((xa.b) this.f14036b.f14166x.getValue()).f19849a;
                        break;
                    default:
                        f10 = ((xa.b) this.f14036b.f14166x.getValue()).f19850b;
                        break;
                }
                return Float.valueOf(f10);
            }
        });
        this.A = tVar;
        this.B = new LinkedHashMap();
        Map mapA = lVar.a();
        this.A = mapA;
        if (!mapA.isEmpty()) {
            f6.a aVarH = androidx.lifecycle.r0.h(this);
            xj.e eVar2 = qj.m0.f13601a;
            qj.b0.w(aVarH, xj.d.f20094c, new l0(this, cVar2, i10), 2);
        }
        qj.b0.w(androidx.lifecycle.r0.h(this), null, new ab.s(this, cVar2, 18), 3);
        qj.b0.w(androidx.lifecycle.r0.h(this), null, new n0(this, cVar2, 5), 3);
    }

    public static final void e(r0 r0Var, ib.j jVar) {
        qj.b0.w(androidx.lifecycle.r0.h(r0Var), null, new androidx.lifecycle.h0(r0Var, jVar, null, 3), 3);
    }

    public static void i(String str) {
        Log.d("HomeViewModel", "App launch suppressed for Origin-style preview surface: " + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONArray l(org.json.JSONArray r7) {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            int r1 = r7.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L73
            org.json.JSONObject r3 = r7.optJSONObject(r2)
            r4 = 0
            if (r3 == 0) goto L1a
            java.lang.String r5 = "type"
            java.lang.String r5 = r3.optString(r5)
            goto L1b
        L1a:
            r5 = r4
        L1b:
            if (r5 != 0) goto L1f
            java.lang.String r5 = ""
        L1f:
            if (r3 == 0) goto L30
            java.lang.String r6 = "key"
            java.lang.String r3 = r3.optString(r6)
            if (r3 == 0) goto L30
            boolean r6 = nj.e.K0(r3)
            if (r6 != 0) goto L30
            r4 = r3
        L30:
            int r3 = r5.hashCode()
            r6 = -1268966290(0xffffffffb45d1c6e, float:-2.0592572E-7)
            if (r3 == r6) goto L5b
            r6 = 96801(0x17a21, float:1.35647E-40)
            if (r3 == r6) goto L52
            r4 = 96634189(0x5c2854d, float:1.829264E-35)
            if (r3 == r4) goto L44
            goto L63
        L44:
            java.lang.String r3 = "empty"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L63
            java.lang.Object r3 = org.json.JSONObject.NULL
            r0.put(r3)
            goto L70
        L52:
            java.lang.String r3 = "app"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L69
            goto L63
        L5b:
            java.lang.String r3 = "folder"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L69
        L63:
            java.lang.Object r3 = org.json.JSONObject.NULL
            r0.put(r3)
            goto L70
        L69:
            if (r4 != 0) goto L6d
            java.lang.Object r4 = org.json.JSONObject.NULL
        L6d:
            r0.put(r4)
        L70:
            int r2 = r2 + 1
            goto La
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.r0.l(org.json.JSONArray):org.json.JSONArray");
    }

    public static Set m(JSONArray jSONArray) {
        if (jSONArray == null) {
            return qi.u.f13522a;
        }
        ri.i iVar = new ri.i();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String strOptString = jSONArray.optString(i10);
            fj.l.c(strOptString);
            if (nj.e.K0(strOptString)) {
                strOptString = null;
            }
            if (strOptString != null) {
                iVar.add(strOptString);
            }
        }
        return cg.b.i(iVar);
    }

    public final void f() {
        if (this.A.isEmpty()) {
            return;
        }
        List list = this.f14156n;
        ArrayList arrayList = new ArrayList(qi.m.s0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b.z((oa.c) it.next()));
        }
        int iG0 = qi.v.g0(qi.m.s0(arrayList));
        if (iG0 < 16) {
            iG0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            linkedHashMap.put(((xa.f) obj).f19863b, obj);
        }
        qj.b0.w(androidx.lifecycle.r0.h(this), qj.m0.f13601a, new m0(this, (int) (this.f14149f.getResources().getDisplayMetrics().density * 96), linkedHashMap, (ti.c) null), 2);
    }

    public final void g() {
        tj.d0 d0Var = this.f14146c;
        List list = ((ib.v0) d0Var.f16351a.getValue()).f8462a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof wa.q) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            qi.q.u0(arrayList2, ((wa.q) obj2).f19135a);
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj3 = arrayList2.get(i12);
            i12++;
            if (fj.l.b(((wa.o0) obj3).f19130a.f19865d, Boolean.TRUE)) {
                arrayList3.add(obj3);
            }
        }
        Log.d("FolderDebug", "handleCreateFolder: selectedItems=" + arrayList3.size());
        Log.d("FolderDebug", "currentGridSlotPackages size=" + this.f14164v.size() + ", content=" + qi.l.M0(this.f14164v, 10));
        if (arrayList3.size() < 2) {
            Log.d("FolderDebug", "Not enough selected items, returning");
            return;
        }
        ArrayList arrayList4 = new ArrayList(qi.m.s0(arrayList3));
        int size3 = arrayList3.size();
        while (i10 < size3) {
            Object obj4 = arrayList3.get(i10);
            i10++;
            arrayList4.add(((wa.o0) obj4).f19130a.f19863b);
        }
        Log.d("FolderDebug", "selectedPackages=" + arrayList4);
        int i13 = (int) (((ib.v0) d0Var.f16351a.getValue()).f8471k * this.f14149f.getResources().getDisplayMetrics().density);
        qj.b0.w(androidx.lifecycle.r0.h(this), qj.m0.f13601a, new o0(arrayList3, i13 < 96 ? 96 : i13, this, arrayList4, null), 2);
    }

    public final void h(String str, boolean z2) {
        String strR0 = nj.e.R0(str, "folder:");
        ja.j jVar = (ja.j) this.A.get(strR0);
        if (z2 || jVar == null || !jVar.f8787d || !this.f14153k.a()) {
            qj.s1 s1Var = this.C;
            ti.c cVar = null;
            if (s1Var != null) {
                s1Var.e(null);
            }
            this.C = qj.b0.w(androidx.lifecycle.r0.h(this), null, new ab.r(this, str, cVar, 12), 3);
            return;
        }
        while (true) {
            tj.r0 r0Var = this.f14145b;
            Object value = r0Var.getValue();
            ib.v0 v0Var = (ib.v0) value;
            fj.l.f(v0Var, "$this$updateState");
            String str2 = strR0;
            if (r0Var.i(value, ib.v0.a(v0Var, null, null, null, 0, null, null, null, null, null, null, 0.0f, null, 0, null, null, null, null, true, str2, true, false, false, 7471103))) {
                return;
            } else {
                strR0 = str2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x052b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d5  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ja.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v68, types: [java.lang.Object, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(boolean r32) {
        /*
            Method dump skipped, instructions count: 1627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.r0.j(boolean):void");
    }

    public final void k() {
        oj.a aVar = new oj.a(this.f14159q);
        tj.r0 r0Var = this.f14160r;
        r0Var.getClass();
        r0Var.k(null, aVar);
    }

    public final void n(ej.c cVar) {
        tj.r0 r0Var;
        Object value;
        do {
            r0Var = this.f14145b;
            value = r0Var.getValue();
        } while (!r0Var.i(value, cVar.invoke(value)));
    }
}
