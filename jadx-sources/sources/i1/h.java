package i1;

import b0.g2;
import f1.n;
import f1.o1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import q.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements u1.e, Iterable, gj.a {
    public int A;
    public HashMap C;
    public v D;

    /* renamed from: b, reason: collision with root package name */
    public int f8127b;

    /* renamed from: d, reason: collision with root package name */
    public int f8129d;

    /* renamed from: e, reason: collision with root package name */
    public int f8130e;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8132z;

    /* renamed from: a, reason: collision with root package name */
    public int[] f8126a = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public Object[] f8128c = new Object[0];

    /* renamed from: f, reason: collision with root package name */
    public final Object f8131f = new Object();
    public ArrayList B = new ArrayList();

    public final int b(b bVar) {
        if (this.f8132z) {
            n.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!bVar.a()) {
            o1.a("Anchor refers to a group that was removed");
        }
        return bVar.f8101a;
    }

    public final void e() {
        this.C = new HashMap();
    }

    public final void i(p1.k kVar) {
        k kVarX = x();
        try {
            kVarX.n(kVarX.f8154t, new g2(kVar, 5));
            kVarX.H();
            kVarX.e(true);
        } catch (Throwable th2) {
            kVarX.e(false);
            throw th2;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this, 0, this.f8127b);
    }

    public final g w() {
        if (this.f8132z) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f8130e++;
        return new g(this);
    }

    public final k x() {
        if (this.f8132z) {
            n.a("Cannot start a writer when another writer is pending");
        }
        if (this.f8130e > 0) {
            n.a("Cannot start a writer when a reader is pending");
        }
        this.f8132z = true;
        this.A++;
        return new k(this);
    }

    public final boolean y(b bVar) {
        int iE;
        return bVar.a() && (iE = j.e(this.B, bVar.f8101a, this.f8127b)) >= 0 && fj.l.b(this.B.get(iE), bVar);
    }

    public final c z(int i10) {
        int i11;
        ArrayList arrayList;
        int iE;
        HashMap map = this.C;
        if (map != null) {
            if (this.f8132z) {
                n.a("use active SlotWriter to crate an anchor for location instead");
            }
            b bVar = (i10 < 0 || i10 >= (i11 = this.f8127b) || (iE = j.e((arrayList = this.B), i10, i11)) < 0) ? null : (b) arrayList.get(iE);
            if (bVar != null) {
                return (c) map.get(bVar);
            }
        }
        return null;
    }
}
