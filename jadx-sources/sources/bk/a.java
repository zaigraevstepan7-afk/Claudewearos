package bk;

import ac.n;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import t0.j;
import t7.m;
import t7.o;
import t7.r;
import u7.k;
import u7.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1780a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1781b;

    public a(String str, Object[] objArr) {
        this.f1780a = 0;
        byte[] bArr = d.f1785a;
        this.f1781b = String.format(Locale.US, str, objArr);
    }

    public static void a(k kVar, String str) {
        WorkDatabase workDatabase = kVar.f16842d;
        n nVarW = workDatabase.w();
        j jVarR = workDatabase.r();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iE = nVarW.e(str2);
            if (iE != 3 && iE != 4) {
                nVarW.m(6, str2);
            }
            linkedList.addAll(jVarR.l(str2));
        }
        u7.b bVar = kVar.f16845g;
        synchronized (bVar.D) {
            try {
                m.g().c(u7.b.E, "Processor cancelling " + str, new Throwable[0]);
                bVar.B.add(str);
                l lVar = (l) bVar.f16816f.remove(str);
                boolean z2 = lVar != null;
                if (lVar == null) {
                    lVar = (l) bVar.f16817z.remove(str);
                }
                u7.b.c(str, lVar);
                if (z2) {
                    bVar.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = kVar.f16844f.iterator();
        while (it.hasNext()) {
            ((u7.c) it.next()).c(str);
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1780a) {
            case 0:
                String name = Thread.currentThread().getName();
                Thread.currentThread().setName((String) this.f1781b);
                try {
                    b();
                    return;
                } finally {
                    Thread.currentThread().setName(name);
                }
            default:
                q5.b bVar = (q5.b) this.f1781b;
                try {
                    c();
                    bVar.w(r.f16128r);
                    return;
                } catch (Throwable th2) {
                    bVar.w(new o(th2));
                    return;
                }
        }
    }

    public a() {
        this.f1780a = 1;
        this.f1781b = new q5.b(11);
    }
}
