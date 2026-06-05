package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1139a;

    /* renamed from: b, reason: collision with root package name */
    public o.a f1140b;

    /* renamed from: c, reason: collision with root package name */
    public o f1141c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f1142d;

    /* renamed from: e, reason: collision with root package name */
    public int f1143e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1144f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1145g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1146h;

    /* renamed from: i, reason: collision with root package name */
    public final tj.r0 f1147i;

    public v(t tVar, boolean z2) {
        new AtomicReference(null);
        this.f1139a = z2;
        this.f1140b = new o.a();
        o oVar = o.f1112b;
        this.f1141c = oVar;
        this.f1146h = new ArrayList();
        this.f1142d = new WeakReference(tVar);
        this.f1147i = tj.i0.b(oVar);
    }

    public final void a(s sVar) {
        r gVar;
        Object obj;
        t tVar;
        fj.l.f(sVar, "observer");
        c("addObserver");
        o oVar = this.f1141c;
        o oVar2 = o.f1111a;
        if (oVar != oVar2) {
            oVar2 = o.f1112b;
        }
        u uVar = new u();
        HashMap map = x.f1154a;
        boolean z2 = sVar instanceof r;
        boolean z10 = sVar instanceof e;
        int i10 = 1;
        if (z2 && z10) {
            gVar = new g((e) sVar, (r) sVar);
        } else if (z10) {
            gVar = new g((e) sVar, (r) null);
        } else if (z2) {
            gVar = (r) sVar;
        } else {
            Class<?> cls = sVar.getClass();
            if (x.b(cls) == 2) {
                Object obj2 = x.f1155b.get(cls);
                fj.l.c(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    x.a((Constructor) list.get(0), sVar);
                    throw null;
                }
                int size = list.size();
                i[] iVarArr = new i[size];
                if (size > 0) {
                    x.a((Constructor) list.get(0), sVar);
                    throw null;
                }
                gVar = new a7.b(iVarArr, i10);
            } else {
                gVar = new g(sVar);
            }
        }
        uVar.f1133b = gVar;
        uVar.f1132a = oVar2;
        o.a aVar = this.f1140b;
        o.c cVarB = aVar.b(sVar);
        if (cVarB != null) {
            obj = cVarB.f12356b;
        } else {
            HashMap map2 = aVar.f12351e;
            o.c cVar = new o.c(sVar, uVar);
            aVar.f12365d++;
            o.c cVar2 = aVar.f12363b;
            if (cVar2 == null) {
                aVar.f12362a = cVar;
                aVar.f12363b = cVar;
            } else {
                cVar2.f12357c = cVar;
                cVar.f12358d = cVar2;
                aVar.f12363b = cVar;
            }
            map2.put(sVar, cVar);
            obj = null;
        }
        if (((u) obj) == null && (tVar = (t) this.f1142d.get()) != null) {
            boolean z11 = this.f1143e != 0 || this.f1144f;
            o oVarB = b(sVar);
            this.f1143e++;
            while (uVar.f1132a.compareTo(oVarB) < 0 && this.f1140b.f12351e.containsKey(sVar)) {
                o oVar3 = uVar.f1132a;
                ArrayList arrayList = this.f1146h;
                arrayList.add(oVar3);
                l lVar = n.Companion;
                o oVar4 = uVar.f1132a;
                lVar.getClass();
                fj.l.f(oVar4, "state");
                int iOrdinal = oVar4.ordinal();
                n nVar = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : n.ON_RESUME : n.ON_START : n.ON_CREATE;
                if (nVar == null) {
                    throw new IllegalStateException("no event up from " + uVar.f1132a);
                }
                uVar.a(tVar, nVar);
                arrayList.remove(arrayList.size() - 1);
                oVarB = b(sVar);
            }
            if (!z11) {
                h();
            }
            this.f1143e--;
        }
    }

    public final o b(s sVar) {
        HashMap map = this.f1140b.f12351e;
        o.c cVar = map.containsKey(sVar) ? ((o.c) map.get(sVar)).f12358d : null;
        o oVar = cVar != null ? ((u) cVar.f12356b).f1132a : null;
        ArrayList arrayList = this.f1146h;
        o oVar2 = arrayList.isEmpty() ? null : (o) arrayList.get(arrayList.size() - 1);
        o oVar3 = this.f1141c;
        fj.l.f(oVar3, "state1");
        if (oVar == null || oVar.compareTo(oVar3) >= 0) {
            oVar = oVar3;
        }
        return (oVar2 == null || oVar2.compareTo(oVar) >= 0) ? oVar : oVar2;
    }

    public final void c(String str) {
        if (this.f1139a) {
            n.b.p0().f11835b.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(m1.j("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(n nVar) {
        fj.l.f(nVar, "event");
        c("handleLifecycleEvent");
        e(nVar.a());
    }

    public final void e(o oVar) {
        if (this.f1141c == oVar) {
            return;
        }
        t tVar = (t) this.f1142d.get();
        o oVar2 = this.f1141c;
        fj.l.f(oVar2, "current");
        if (oVar2 == o.f1112b && oVar == o.f1111a) {
            throw new IllegalStateException(("State must be at least '" + o.f1113c + "' to be moved to '" + oVar + "' in component " + tVar).toString());
        }
        o oVar3 = o.f1111a;
        if (oVar2 == oVar3 && oVar2 != oVar) {
            throw new IllegalStateException(("State is '" + oVar3 + "' and cannot be moved to `" + oVar + "` in component " + tVar).toString());
        }
        this.f1141c = oVar;
        if (this.f1144f || this.f1143e != 0) {
            this.f1145g = true;
            return;
        }
        this.f1144f = true;
        h();
        this.f1144f = false;
        if (this.f1141c == oVar3) {
            this.f1140b = new o.a();
        }
    }

    public final void f(s sVar) {
        fj.l.f(sVar, "observer");
        c("removeObserver");
        this.f1140b.e(sVar);
    }

    public final void g() {
        o oVar = o.f1113c;
        c("setCurrentState");
        e(oVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r12.f1145g = false;
        r12.f1147i.j(r12.f1141c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.v.h():void");
    }
}
