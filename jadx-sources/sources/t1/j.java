package t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends vi.h implements ej.e {

    /* renamed from: b, reason: collision with root package name */
    public long[] f15455b;

    /* renamed from: c, reason: collision with root package name */
    public int f15456c;

    /* renamed from: d, reason: collision with root package name */
    public int f15457d;

    /* renamed from: e, reason: collision with root package name */
    public int f15458e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f15459f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k f15460z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ti.c cVar) {
        super(cVar);
        this.f15460z = kVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        j jVar = new j(this.f15460z, cVar);
        jVar.f15459f = obj;
        return jVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((mj.g) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:26:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c5 -> B:37:0x00c6). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
