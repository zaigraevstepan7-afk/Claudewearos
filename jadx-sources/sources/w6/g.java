package w6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends q.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f18808a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(25);
        this.f18808a = hVar;
    }

    @Override // q.r
    public final Object create(Object obj) {
        String str = (String) obj;
        fj.l.f(str, "key");
        return this.f18808a.f18809a.d0(str);
    }

    @Override // q.r
    public final void entryRemoved(boolean z2, Object obj, Object obj2, Object obj3) throws Exception {
        Object obj4 = (String) obj;
        e7.c cVar = (e7.c) obj2;
        fj.l.f(obj4, "key");
        fj.l.f(cVar, "oldValue");
        cVar.close();
        super.entryRemoved(z2, obj4, cVar, (e7.c) obj3);
    }
}
