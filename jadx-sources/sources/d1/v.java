package d1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v extends vi.h implements ej.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4583b;

    /* renamed from: c, reason: collision with root package name */
    public int f4584c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, ti.c cVar, int i10) {
        super(cVar);
        this.f4583b = i10;
        this.f4586e = obj;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f4583b) {
            case 0:
                v vVar = new v((p2.o) this.f4586e, cVar, 0);
                vVar.f4585d = obj;
                return vVar;
            case 1:
                v vVar2 = new v((ej.c) this.f4586e, cVar, 1);
                vVar2.f4585d = obj;
                return vVar2;
            case 2:
                v vVar3 = new v((v.i) this.f4586e, cVar, 2);
                vVar3.f4585d = obj;
                return vVar3;
            default:
                v vVar4 = new v((k0.z) this.f4586e, cVar, 3);
                vVar4.f4585d = obj;
                return vVar4;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        p2.o0 o0Var = (p2.o0) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f4583b) {
            case 0:
                return ((v) create(o0Var, cVar)).invokeSuspend(pi.o.f13011a);
            case 1:
                return ((v) create(o0Var, cVar)).invokeSuspend(pi.o.f13011a);
            case 2:
                return ((v) create(o0Var, cVar)).invokeSuspend(pi.o.f13011a);
            default:
                ((v) create(o0Var, cVar)).invokeSuspend(pi.o.f13011a);
                return ui.a.f17085a;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[RETURN] */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0095 -> B:30:0x0099). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
