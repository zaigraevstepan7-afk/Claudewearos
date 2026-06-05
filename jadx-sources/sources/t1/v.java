package t1;

import b0.g2;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final ej.c f15504a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15506c;

    /* renamed from: h, reason: collision with root package name */
    public f f15511h;

    /* renamed from: i, reason: collision with root package name */
    public u f15512i;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f15505b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final g2 f15507d = new g2(this, 29);

    /* renamed from: e, reason: collision with root package name */
    public final q0.i f15508e = new q0.i(this, 8);

    /* renamed from: f, reason: collision with root package name */
    public final g1.e f15509f = new g1.e(new u[16]);

    /* renamed from: g, reason: collision with root package name */
    public final Object f15510g = new Object();
    public long j = -1;

    public v(ej.c cVar) {
        this.f15504a = cVar;
    }

    public final void a() {
        synchronized (this.f15510g) {
            g1.e eVar = this.f15509f;
            Object[] objArr = eVar.f7024a;
            int i10 = eVar.f7026c;
            for (int i11 = 0; i11 < i10; i11++) {
                u uVar = (u) objArr[i11];
                uVar.f15496e.a();
                uVar.f15497f.a();
                uVar.f15502l.a();
                uVar.f15503m.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        boolean z2;
        Set set;
        Set set2;
        synchronized (this.f15510g) {
            z2 = this.f15506c;
        }
        if (z2) {
            return false;
        }
        boolean z10 = false;
        while (true) {
            AtomicReference atomicReference = this.f15505b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List listSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        f1.n.b("Unexpected notification");
                        throw new b3.e();
                    }
                    List list2 = (List) obj;
                    Set set3 = (Set) list2.get(0);
                    if (list2.size() == 2) {
                        listSubList = list2.get(1);
                    } else if (list2.size() > 2) {
                        listSubList = list2.subList(1, list2.size());
                    }
                    set2 = set3;
                    list = listSubList;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z10;
            }
            synchronized (this.f15510g) {
                g1.e eVar = this.f15509f;
                Object[] objArr = eVar.f7024a;
                int i10 = eVar.f7026c;
                for (int i11 = 0; i11 < i10; i11++) {
                    z10 = ((u) objArr[i11]).a(set) || z10;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x021d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01da  */
    /* JADX WARN: Type inference failed for: r6v0, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r27, ej.c r28, ej.a r29) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.v.c(java.lang.Object, ej.c, ej.a):void");
    }

    public final void d() {
        g2 g2Var = this.f15507d;
        m.e(m.f15469a);
        synchronized (m.f15471c) {
            m.f15476h = qi.l.J0((List) m.f15476h, g2Var);
        }
        this.f15511h = new f(g2Var, 0);
    }
}
