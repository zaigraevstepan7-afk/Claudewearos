package zg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: e, reason: collision with root package name */
    public final int f20588e;

    public b(String str, int i10) {
        super(str);
        this.f20588e = i10;
    }

    @Override // zg.c, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((c) obj);
    }

    @Override // zg.c
    public final int e() {
        return this.f20588e;
    }

    @Override // zg.c
    public final String toString() {
        return m6.a.j(new StringBuilder("IntegerChildName(\""), this.f20592a, "\")");
    }
}
