package rg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class v implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f14481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14482b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ug.a f14483c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f14484d;

    public v(z zVar, long j, boolean z2, ug.a aVar) {
        this.f14484d = zVar;
        this.f14481a = j;
        this.f14482b = z2;
        this.f14483c = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        d0 d0Var;
        long j;
        d0 d0Var2;
        boolean z2;
        boolean zX;
        z zVar = this.f14484d;
        tg.a aVar = zVar.f14496g;
        aVar.e();
        h0 h0Var = zVar.f14491b;
        ArrayList arrayList = (ArrayList) h0Var.f14420b;
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            d0Var = null;
            j = this.f14481a;
            if (i10 >= size) {
                d0Var2 = null;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            d0Var2 = (d0) obj;
            if (d0Var2.f14391a == j) {
                break;
            }
        }
        ArrayList arrayList2 = (ArrayList) h0Var.f14420b;
        int size2 = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i12);
            i12++;
            d0 d0Var3 = (d0) obj2;
            if (d0Var3.f14391a == j) {
                d0Var = d0Var3;
                break;
            }
            i11++;
        }
        boolean z11 = true;
        ug.l.b("removeWrite called with nonexistent writeId", d0Var != null);
        arrayList2.remove(d0Var);
        d0Var.getClass();
        h hVar = d0Var.f14392b;
        int size3 = arrayList2.size() - 1;
        boolean z12 = true;
        boolean z13 = false;
        while (z12 && size3 >= 0) {
            d0 d0Var4 = (d0) arrayList2.get(size3);
            d0Var4.getClass();
            h hVar2 = d0Var4.f14392b;
            if (size3 >= i11) {
                if (!d0Var4.c()) {
                    Iterator it = d0Var4.a().f14383a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = z11;
                            zX = false;
                            break;
                        }
                        z2 = z11;
                        if (hVar2.e((h) ((Map.Entry) it.next()).getKey()).x(hVar)) {
                            zX = z2;
                            break;
                        }
                        z11 = z2;
                    }
                } else {
                    zX = hVar2.x(hVar);
                    z2 = z11;
                }
                if (zX) {
                    z12 = false;
                }
                size3--;
                z11 = z2;
            } else {
                z2 = z11;
            }
            if (hVar.x(hVar2)) {
                z13 = z2;
            }
            size3--;
            z11 = z2;
        }
        boolean z14 = z11;
        if (z12) {
            if (z13) {
                h0Var.f14419a = h0.b(arrayList2, h0.f14418d, h.f14414d);
                if (arrayList2.size() > 0) {
                    h0Var.f14421c = Long.valueOf(((d0) arrayList2.get(arrayList2.size() - 1)).f14391a);
                } else {
                    h0Var.f14421c = -1L;
                }
            } else if (d0Var.c()) {
                b bVar = (b) h0Var.f14419a;
                bVar.getClass();
                h0Var.f14419a = hVar.isEmpty() ? b.f14382b : new b(bVar.f14383a.z(hVar, ug.e.f17071d));
            } else {
                Iterator it2 = d0Var.a().f14383a.iterator();
                while (it2.hasNext()) {
                    h hVar3 = (h) ((Map.Entry) it2.next()).getKey();
                    b bVar2 = (b) h0Var.f14419a;
                    h hVarE = hVar.e(hVar3);
                    bVar2.getClass();
                    h0Var.f14419a = hVarE.isEmpty() ? b.f14382b : new b(bVar2.f14383a.z(hVarE, ug.e.f17071d));
                }
            }
            z10 = z14;
        }
        d0Var2.getClass();
        h hVar4 = d0Var2.f14392b;
        boolean z15 = this.f14482b;
        if (!z15) {
            HashMap mapC = cg.b.C(this.f14483c);
            if (d0Var2.c()) {
                cg.b.J(d0Var2.b(), new f0(zVar, hVar4), mapC);
                aVar.e();
            } else {
                cg.b.I(d0Var2.a(), zVar, hVar4, mapC);
                aVar.e();
            }
        }
        if (!z10) {
            return Collections.EMPTY_LIST;
        }
        ug.e eVarY = ug.e.f17071d;
        if (d0Var2.c()) {
            eVarY = eVarY.y(h.f14414d, Boolean.TRUE);
        } else {
            Iterator it3 = d0Var2.a().f14383a.iterator();
            while (it3.hasNext()) {
                eVarY = eVarY.y((h) ((Map.Entry) it3.next()).getKey(), Boolean.TRUE);
            }
        }
        return z.a(zVar, new sg.a(hVar4, eVarY, z15));
    }
}
