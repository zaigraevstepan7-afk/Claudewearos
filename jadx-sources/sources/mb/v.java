package mb;

import f1.a1;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11529a;

    /* renamed from: b, reason: collision with root package name */
    public int f11530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11531c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(boolean z2, Object obj, Object obj2, ti.c cVar, int i10) {
        super(2, cVar);
        this.f11529a = i10;
        this.f11531c = z2;
        this.f11532d = obj;
        this.f11533e = obj2;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f11529a) {
            case 0:
                return new v(this.f11531c, (t.c) this.f11532d, (t.c) this.f11533e, cVar, 0);
            default:
                return new v(this.f11531c, (a1) this.f11532d, (a1) this.f11533e, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f11529a) {
        }
        return ((v) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        if (r0 != r10) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f7, code lost:
    
        if (r0 != r10) goto L44;
     */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
