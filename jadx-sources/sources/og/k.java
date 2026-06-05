package og;

import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12519a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12520b;

    /* renamed from: c, reason: collision with root package name */
    public i f12521c;

    /* renamed from: d, reason: collision with root package name */
    public final i f12522d;

    public k(Object obj, Object obj2, i iVar, i iVar2) {
        this.f12519a = obj;
        this.f12520b = obj2;
        h hVar = h.f12518a;
        this.f12521c = iVar == null ? hVar : iVar;
        this.f12522d = iVar2 == null ? hVar : iVar2;
    }

    @Override // og.i
    public final i a() {
        return this.f12521c;
    }

    @Override // og.i
    public final i b(Object obj, Object obj2, Comparator comparator) {
        int iCompare = comparator.compare(obj, this.f12519a);
        return (iCompare < 0 ? l(null, null, this.f12521c.b(obj, obj2, comparator), null) : iCompare == 0 ? l(obj, obj2, null, null) : l(null, null, null, this.f12522d.b(obj, obj2, comparator))).m();
    }

    @Override // og.i
    public final i d(Object obj, Comparator comparator) {
        k kVarL;
        if (comparator.compare(obj, this.f12519a) < 0) {
            k kVarO = (this.f12521c.isEmpty() || this.f12521c.f() || ((k) this.f12521c).f12521c.f()) ? this : o();
            kVarL = kVarO.l(null, null, kVarO.f12521c.d(obj, comparator), null);
        } else {
            k kVarQ = this.f12521c.f() ? q() : this;
            i iVar = kVarQ.f12522d;
            if (!iVar.isEmpty() && !iVar.f() && !((k) iVar).f12521c.f()) {
                kVarQ = kVarQ.j();
                if (kVarQ.f12521c.a().f()) {
                    kVarQ = kVarQ.q().j();
                }
            }
            i iVar2 = kVarQ.f12522d;
            if (comparator.compare(obj, kVarQ.f12519a) == 0) {
                if (iVar2.isEmpty()) {
                    return h.f12518a;
                }
                i iVarH = iVar2.h();
                kVarQ = kVarQ.l(iVarH.getKey(), iVarH.getValue(), null, ((k) iVar2).p());
            }
            kVarL = kVarQ.l(null, null, null, kVarQ.f12522d.d(obj, comparator));
        }
        return kVarL.m();
    }

    @Override // og.i
    public final void e(x8.a aVar) {
        this.f12521c.e(aVar);
        aVar.Y(this.f12519a, this.f12520b);
        this.f12522d.e(aVar);
    }

    @Override // og.i
    public final i g() {
        return this.f12522d;
    }

    @Override // og.i
    public final Object getKey() {
        return this.f12519a;
    }

    @Override // og.i
    public final Object getValue() {
        return this.f12520b;
    }

    @Override // og.i
    public final i h() {
        return this.f12521c.isEmpty() ? this : this.f12521c.h();
    }

    @Override // og.i
    public final i i() {
        i iVar = this.f12522d;
        return iVar.isEmpty() ? this : iVar.i();
    }

    @Override // og.i
    public final boolean isEmpty() {
        return false;
    }

    public final k j() {
        i iVar = this.f12521c;
        i iVarC = iVar.c(iVar.f() ? 2 : 1, null, null);
        i iVar2 = this.f12522d;
        return c(f() ? 2 : 1, iVarC, iVar2.c(iVar2.f() ? 2 : 1, null, null));
    }

    @Override // og.i
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final k c(int i10, i iVar, i iVar2) {
        if (iVar == null) {
            iVar = this.f12521c;
        }
        if (iVar2 == null) {
            iVar2 = this.f12522d;
        }
        Object obj = this.f12519a;
        Object obj2 = this.f12520b;
        return i10 == 1 ? new j(obj, obj2, iVar, iVar2) : new g(obj, obj2, iVar, iVar2);
    }

    public abstract k l(Object obj, Object obj2, i iVar, i iVar2);

    public final k m() {
        i iVar = this.f12522d;
        k kVarQ = (!iVar.f() || this.f12521c.f()) ? this : (k) iVar.c(n(), c(1, null, ((k) iVar).f12521c), null);
        if (kVarQ.f12521c.f() && ((k) kVarQ.f12521c).f12521c.f()) {
            kVarQ = kVarQ.q();
        }
        return (kVarQ.f12521c.f() && kVarQ.f12522d.f()) ? kVarQ.j() : kVarQ;
    }

    public abstract int n();

    public final k o() {
        k kVarJ = j();
        i iVar = kVarJ.f12522d;
        if (!iVar.a().f()) {
            return kVarJ;
        }
        k kVarL = kVarJ.l(null, null, null, ((k) iVar).q());
        i iVar2 = kVarL.f12522d;
        return ((k) iVar2.c(kVarL.n(), kVarL.c(1, null, ((k) iVar2).f12521c), null)).j();
    }

    public final i p() {
        if (this.f12521c.isEmpty()) {
            return h.f12518a;
        }
        k kVarO = (this.f12521c.f() || this.f12521c.a().f()) ? this : o();
        return kVarO.l(null, null, ((k) kVarO.f12521c).p(), null).m();
    }

    public final k q() {
        return (k) this.f12521c.c(n(), null, c(1, ((k) this.f12521c).f12522d, null));
    }

    public void r(k kVar) {
        this.f12521c = kVar;
    }
}
