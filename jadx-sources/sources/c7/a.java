package c7;

import androidx.lifecycle.n;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import eb.j;
import eb.k;
import java.util.ListIterator;
import t1.q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3099b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f3098a = i10;
        this.f3099b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void e(t tVar, n nVar) {
        int i10 = this.f3098a;
        Object obj = this.f3099b;
        switch (i10) {
            case 0:
                b bVar = (b) obj;
                if (nVar == n.ON_START) {
                    bVar.f3107h = true;
                    break;
                } else if (nVar == n.ON_STOP) {
                    bVar.f3107h = false;
                    break;
                }
                break;
            default:
                q qVar = (q) obj;
                if (nVar == n.ON_RESUME) {
                    for (k kVar : t1.r.h(qVar).f15514c) {
                        boolean z2 = kVar.f5910g;
                        long j = kVar.f5904a;
                        int i11 = -1;
                        if (z2) {
                            ListIterator listIterator = qVar.listIterator();
                            int i12 = 0;
                            while (true) {
                                ri.a aVar = (ri.a) listIterator;
                                if (aVar.hasNext()) {
                                    if (((k) aVar.next()).f5904a == j) {
                                        i11 = i12;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            if (i11 >= 0) {
                                k kVar2 = (k) qVar.get(i11);
                                j jVar = j.f5901a;
                                qVar.set(i11, k.a(kVar2, 111));
                            }
                        } else if (kVar.f5908e == j.f5901a) {
                            ListIterator listIterator2 = qVar.listIterator();
                            int i13 = 0;
                            while (true) {
                                ri.a aVar2 = (ri.a) listIterator2;
                                if (aVar2.hasNext()) {
                                    if (((k) aVar2.next()).f5904a == j) {
                                        i11 = i13;
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            if (i11 >= 0) {
                                k kVar3 = (k) qVar.get(i11);
                                j jVar2 = j.f5901a;
                                qVar.set(i11, k.a(kVar3, 111));
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }
}
