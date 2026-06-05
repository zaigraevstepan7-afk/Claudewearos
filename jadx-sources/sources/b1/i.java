package b1;

import android.content.Context;
import java.lang.ref.WeakReference;
import p2.v;
import p2.w;
import q.p;
import v2.f0;
import v2.q;
import w2.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1487a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1488b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1489c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1490d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1491e;

    /* JADX WARN: Multi-variable type inference failed */
    public int a(mh.g gVar, t tVar, boolean z2) {
        Object[] objArr;
        int i10;
        int i11;
        p2.d dVar = (p2.d) this.f1489c;
        q qVar = (q) this.f1491e;
        if (this.f1487a) {
            return 0;
        }
        try {
            this.f1487a = true;
            p2.h hVarG = ((ag.i) this.f1490d).G(gVar, tVar);
            p pVar = (p) hVarG.f12700c;
            int iG = pVar.g();
            for (int i12 = 0; i12 < iG; i12++) {
                w wVar = (w) pVar.h(i12);
                if (!wVar.f12763d && !wVar.f12767h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iG2 = pVar.g();
            for (int i13 = 0; i13 < iG2; i13++) {
                w wVar2 = (w) pVar.h(i13);
                if (objArr != false || v.b(wVar2)) {
                    ((f0) this.f1488b).z(wVar2.f12762c, (q) this.f1491e, wVar2.f12768i, true);
                    if (!qVar.f17743a.h()) {
                        dVar.a(wVar2.f12760a, qVar, v.b(wVar2));
                        qVar.clear();
                    }
                }
            }
            boolean zB = dVar.b(hVarG, z2);
            if (hVarG.f12699b) {
                i10 = 0;
            } else {
                int iG3 = pVar.g();
                for (int i14 = 0; i14 < iG3; i14++) {
                    w wVar3 = (w) pVar.h(i14);
                    if (!b2.b.c(v.h(wVar3, true), 0L) && wVar3.b()) {
                        i10 = 1;
                        break;
                    }
                }
                i10 = 0;
            }
            int iG4 = pVar.g();
            int i15 = 0;
            while (true) {
                if (i15 >= iG4) {
                    i11 = 0;
                    break;
                }
                if (((w) pVar.h(i15)).b()) {
                    i11 = 1;
                    break;
                }
                i15++;
            }
            int i16 = (zB ? 1 : 0) | (i10 << 1) | (i11 << 2);
            this.f1487a = false;
            return i16;
        } catch (Throwable th2) {
            this.f1487a = false;
            throw th2;
        }
    }

    public synchronized void b() {
        try {
            if (this.f1487a) {
                return;
            }
            this.f1487a = true;
            Context context = (Context) this.f1491e;
            if (context != null) {
                ((v8.a) this.f1489c).b(context);
                context.unregisterComponentCallbacks((c2.d) this.f1490d);
            }
            ((WeakReference) this.f1488b).clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
