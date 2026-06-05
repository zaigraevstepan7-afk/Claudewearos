package og;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j extends k {
    @Override // og.i
    public final boolean f() {
        return true;
    }

    @Override // og.k
    public final k l(Object obj, Object obj2, i iVar, i iVar2) {
        if (obj == null) {
            obj = this.f12519a;
        }
        if (obj2 == null) {
            obj2 = this.f12520b;
        }
        if (iVar == null) {
            iVar = this.f12521c;
        }
        if (iVar2 == null) {
            iVar2 = this.f12522d;
        }
        return new j(obj, obj2, iVar, iVar2);
    }

    @Override // og.k
    public final int n() {
        return 1;
    }

    @Override // og.i
    public final int size() {
        return this.f12522d.size() + this.f12521c.size() + 1;
    }
}
