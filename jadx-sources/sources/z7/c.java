package z7;

import a8.f;
import c8.i;
import java.util.ArrayList;
import java.util.Iterator;
import t7.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20461a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f20462b;

    /* renamed from: c, reason: collision with root package name */
    public final f f20463c;

    /* renamed from: d, reason: collision with root package name */
    public b f20464d;

    public c(f fVar) {
        this.f20463c = fVar;
    }

    public abstract boolean a(i iVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.f20461a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (a(iVar)) {
                this.f20461a.add(iVar.f3121a);
            }
        }
        if (this.f20461a.isEmpty()) {
            this.f20463c.b(this);
        } else {
            f fVar = this.f20463c;
            synchronized (fVar.f206c) {
                try {
                    if (fVar.f207d.add(this)) {
                        if (fVar.f207d.size() == 1) {
                            fVar.f208e = fVar.a();
                            m.g().c(f.f203f, String.format("%s: initial state = %s", fVar.getClass().getSimpleName(), fVar.f208e), new Throwable[0]);
                            fVar.d();
                        }
                        Object obj = fVar.f208e;
                        this.f20462b = obj;
                        d(this.f20464d, obj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d(this.f20464d, this.f20462b);
    }

    public final void d(b bVar, Object obj) {
        if (this.f20461a.isEmpty() || bVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.f20461a;
            y7.c cVar = (y7.c) bVar;
            synchronized (cVar.f20235c) {
                try {
                    y7.b bVar2 = cVar.f20233a;
                    if (bVar2 != null) {
                        bVar2.e(arrayList);
                    }
                } finally {
                }
            }
            return;
        }
        ArrayList arrayList2 = this.f20461a;
        y7.c cVar2 = (y7.c) bVar;
        synchronized (cVar2.f20235c) {
            try {
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    String str = (String) obj2;
                    if (cVar2.a(str)) {
                        m.g().c(y7.c.f20232d, "Constraints met for " + str, new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                y7.b bVar3 = cVar2.f20233a;
                if (bVar3 != null) {
                    bVar3.f(arrayList3);
                }
            } finally {
            }
        }
    }
}
